package typingsJapgolly.webpack.anon

import typingsJapgolly.webpack.mod.AssetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Info extends StObject {
  
  var info: AssetInfo
  
  var path: String
}
object Info {
  
  inline def apply(info: AssetInfo, path: String): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  extension [Self <: Info](x: Self) {
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
