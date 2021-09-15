import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class RegexMatches4
{
   private static String REGEX = "a*b";
   private static String INPUT = "aabfooaabfooabfoobkkk";
   private static String REPLACE = "-";
   public static void main(String[] args) {
      Pattern p = Pattern.compile(REGEX);
      // 获取 matcher 对象
      Matcher m = p.matcher(INPUT);;
      StringBuffer sb = new StringBuffer();
      while(m.find()){
         m.appendReplacement(sb,REPLACE);
      }
      m.appendTail(sb);
      System.out.println(sb.toString());
//      -------------
      String s="/babalaautomgr.ejs?method=constr";
      int i=s.split("[?]").length;
      //int i=s.split("\\?").length;
      System.out.println(i);
   }
}