package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.UNSELECT_EVENT
import typingsJapgolly.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with Action {
  
  var `type`: UNSELECT_EVENT
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_EVENT")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setType(value: UNSELECT_EVENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
