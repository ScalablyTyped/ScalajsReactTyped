package typingsJapgolly.angularCommon.anon

import typingsJapgolly.angularCommon.angularCommonStrings.ngSwitch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgSwitch extends StObject {
  
  var ngSwitch: typingsJapgolly.angularCommon.angularCommonStrings.ngSwitch
}
object NgSwitch {
  
  inline def apply(): NgSwitch = {
    val __obj = js.Dynamic.literal(ngSwitch = "ngSwitch")
    __obj.asInstanceOf[NgSwitch]
  }
  
  extension [Self <: NgSwitch](x: Self) {
    
    inline def setNgSwitch(value: ngSwitch): Self = StObject.set(x, "ngSwitch", value.asInstanceOf[js.Any])
  }
}
