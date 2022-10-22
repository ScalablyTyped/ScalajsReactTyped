package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdbName extends StObject {
  
  var adbName: String
}
object AdbName {
  
  inline def apply(adbName: String): AdbName = {
    val __obj = js.Dynamic.literal(adbName = adbName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdbName]
  }
  
  extension [Self <: AdbName](x: Self) {
    
    inline def setAdbName(value: String): Self = StObject.set(x, "adbName", value.asInstanceOf[js.Any])
  }
}
