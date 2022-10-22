package typingsJapgolly.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSupportBLE extends StObject {
  
  /**
    * 是否支持 BLE
    */
  var isSupportBLE: Boolean
}
object IsSupportBLE {
  
  inline def apply(isSupportBLE: Boolean): IsSupportBLE = {
    val __obj = js.Dynamic.literal(isSupportBLE = isSupportBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSupportBLE]
  }
  
  extension [Self <: IsSupportBLE](x: Self) {
    
    inline def setIsSupportBLE(value: Boolean): Self = StObject.set(x, "isSupportBLE", value.asInstanceOf[js.Any])
  }
}
