package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  /**
    * The source content of the JavaScript asset.
    */
  var code: String
  
  /**
    * The source map of the JavaScript asset, if available.
    * This map is merged with all intermediate source maps during optimization.
    */
  var map: js.Object
  
  /**
    * The name of the JavaScript asset (typically the filename).
    */
  var name: String
}
object Code {
  
  inline def apply(code: String, map: js.Object, name: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  extension [Self <: Code](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
