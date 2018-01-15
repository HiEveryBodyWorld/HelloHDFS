import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


public class HelloHDFS {


	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();  
		conf.set("fs.defaultFS", "hdfs://192.168.3.31:9000");
	    //获取文件系统  
	    FileSystem fs = FileSystem.get(conf);  
////	    boolean success = fs.mkdirs(new Path("/test")) ;
////	    System.out.println(success);
//	    System.out.println(fs.exists(new Path("/hello.txt")));
//	    System.out.println(fs.delete(new Path("/test")));
//	    System.out.println(fs.exists(new Path("/test")));
//	    FSDataOutputStream out = fs.create(new Path("/test.data"),true);
//	    FileInputStream fis = new FileInputStream("F:/core-site.xml");
//	    IOUtils.copyBytes(fis, out, 4096,true);
//	    
//	    FSDataOutputStream out = fs.create(new Path("/test.data"),true);
//	    FileInputStream in = new FileInputStream("F:/core-site.xml");
//	    byte[] buf = new byte[4096];
//	    int len = in.read(buf);
//	    while(len!=-1){
//	    	out.write(buf);
//	    	len = in.read(buf);
//	    }
//	    in.close();
//	    out.close();
	    FileStatus[] statuses = fs.listStatus(new Path("/"));
	    for(FileStatus status:statuses){
	    	System.out.println(status.getPath());
	    	System.out.println(status.getPermission());
	    	System.out.println(status.getReplication());
	    }
	    
	}
}
