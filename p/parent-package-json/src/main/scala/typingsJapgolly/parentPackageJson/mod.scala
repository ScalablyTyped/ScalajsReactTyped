package typingsJapgolly.parentPackageJson

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.parentPackageJson.parentPackageJsonBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ParentPackage | `false` = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ParentPackage | `false`]
  inline def apply(startPath: String): ParentPackage | `false` = ^.asInstanceOf[js.Dynamic].apply(startPath.asInstanceOf[js.Any]).asInstanceOf[ParentPackage | `false`]
  inline def apply(startPath: String, ignore: Double): ParentPackage | `false` = (^.asInstanceOf[js.Dynamic].apply(startPath.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[ParentPackage | `false`]
  inline def apply(startPath: Null, ignore: Double): ParentPackage | `false` = (^.asInstanceOf[js.Dynamic].apply(startPath.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[ParentPackage | `false`]
  inline def apply(startPath: Unit, ignore: Double): ParentPackage | `false` = (^.asInstanceOf[js.Dynamic].apply(startPath.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[ParentPackage | `false`]
  
  @JSImport("parent-package-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ParentPackage extends StObject {
    
    def parse(): StringDictionary[Any]
    
    var path: String
    
    def read(): String
  }
  object ParentPackage {
    
    inline def apply(parse: CallbackTo[StringDictionary[Any]], path: String, read: CallbackTo[String]): ParentPackage = {
      val __obj = js.Dynamic.literal(parse = parse.toJsFn, path = path.asInstanceOf[js.Any], read = read.toJsFn)
      __obj.asInstanceOf[ParentPackage]
    }
    
    extension [Self <: ParentPackage](x: Self) {
      
      inline def setParse(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "parse", value.toJsFn)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRead(value: CallbackTo[String]): Self = StObject.set(x, "read", value.toJsFn)
    }
  }
}
