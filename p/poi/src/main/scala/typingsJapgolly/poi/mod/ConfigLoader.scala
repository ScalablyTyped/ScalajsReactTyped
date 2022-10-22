package typingsJapgolly.poi.mod

import typingsJapgolly.poi.mod.ConfigLoader.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigLoader extends StObject {
  
  def load(): Any = js.native
  def load(files: js.Array[String]): Any = js.native
  def load(files: js.Array[String], cwd: String): Any = js.native
  def load(files: js.Array[String], cwd: String, stopDir: String): Any = js.native
  def load(files: js.Array[String], cwd: Unit, stopDir: String): Any = js.native
  def load(files: Unit, cwd: String): Any = js.native
  def load(files: Unit, cwd: String, stopDir: String): Any = js.native
  def load(files: Unit, cwd: Unit, stopDir: String): Any = js.native
  def load(options: Options): Any = js.native
  
  def resolve(): String | Null = js.native
  def resolve(files: js.Array[String]): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: String, stopDir: String): String | Null = js.native
  def resolve(files: js.Array[String], cwd: Unit, stopDir: String): String | Null = js.native
  def resolve(files: Unit, cwd: String): String | Null = js.native
  def resolve(files: Unit, cwd: String, stopDir: String): String | Null = js.native
  def resolve(files: Unit, cwd: Unit, stopDir: String): String | Null = js.native
  def resolve(options: Options): String | Null = js.native
}
object ConfigLoader {
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[js.Array[String]] = js.undefined
    
    var packageKey: js.UndefOr[String] = js.undefined
    
    var parseJSON: js.UndefOr[js.Function1[/* str */ String, Any]] = js.undefined
    
    var stopDir: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setPackageKey(value: String): Self = StObject.set(x, "packageKey", value.asInstanceOf[js.Any])
      
      inline def setPackageKeyUndefined: Self = StObject.set(x, "packageKey", js.undefined)
      
      inline def setParseJSON(value: /* str */ String => Any): Self = StObject.set(x, "parseJSON", js.Any.fromFunction1(value))
      
      inline def setParseJSONUndefined: Self = StObject.set(x, "parseJSON", js.undefined)
      
      inline def setStopDir(value: String): Self = StObject.set(x, "stopDir", value.asInstanceOf[js.Any])
      
      inline def setStopDirUndefined: Self = StObject.set(x, "stopDir", js.undefined)
    }
  }
}
