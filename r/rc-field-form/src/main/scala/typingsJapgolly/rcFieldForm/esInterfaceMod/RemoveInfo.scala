package typingsJapgolly.rcFieldForm.esInterfaceMod

import typingsJapgolly.rcFieldForm.rcFieldFormStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveInfo
  extends StObject
     with NotifyInfo {
  
  var `type`: remove
}
object RemoveInfo {
  
  inline def apply(): RemoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[RemoveInfo]
  }
  
  extension [Self <: RemoveInfo](x: Self) {
    
    inline def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
