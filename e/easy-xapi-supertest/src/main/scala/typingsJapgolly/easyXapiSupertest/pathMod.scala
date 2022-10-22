package typingsJapgolly.easyXapiSupertest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basename(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def basename(p: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("path", "delimiter")
  @js.native
  def delimiter: String = js.native
  inline def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
  
  inline def dirname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(pathObject: ParsedPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(pathObject.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(paths: (Any | String)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  inline def normalize(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(pathString: String): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pathString.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
  
  object posix {
    
    @JSImport("path", "posix")
    @js.native
    val ^ : js.Any = js.native
    
    inline def basename(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def basename(p: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("path", "posix.delimiter")
    @js.native
    def delimiter: String = js.native
    inline def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    inline def dirname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def extname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def format(pP: ParsedPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(pP.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isAbsolute(p: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def join(paths: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    inline def normalize(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(p: String): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(p.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
    
    inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resolve(pathSegments: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pathSegments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    @JSImport("path", "posix.sep")
    @js.native
    def sep: String = js.native
    inline def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  }
  
  inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolve(pathSegments: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pathSegments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  @JSImport("path", "sep")
  @js.native
  def sep: String = js.native
  inline def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  
  object win32 {
    
    @JSImport("path", "win32")
    @js.native
    val ^ : js.Any = js.native
    
    inline def basename(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def basename(p: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("path", "win32.delimiter")
    @js.native
    def delimiter: String = js.native
    inline def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    inline def dirname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def extname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def format(pP: ParsedPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(pP.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isAbsolute(p: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def join(paths: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    inline def normalize(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(p: String): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(p.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
    
    inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resolve(pathSegments: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pathSegments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    @JSImport("path", "win32.sep")
    @js.native
    def sep: String = js.native
    inline def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  }
  
  trait ParsedPath extends StObject {
    
    /**
      * The file name including extension (if any) such as 'index.html'
      */
    var base: String
    
    /**
      * The full directory path such as '/home/user/dir' or 'c:\path\dir'
      */
    var dir: String
    
    /**
      * The file extension (if any) such as '.html'
      */
    var ext: String
    
    /**
      * The file name without extension (if any) such as 'index'
      */
    var name: String
    
    /**
      * The root of the path such as '/' or 'c:\'
      */
    var root: String
  }
  object ParsedPath {
    
    inline def apply(base: String, dir: String, ext: String, name: String, root: String): ParsedPath = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    extension [Self <: ParsedPath](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
