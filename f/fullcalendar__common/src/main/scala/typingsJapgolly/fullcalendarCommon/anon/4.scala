package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.UNSET_EVENT_DRAG
import typingsJapgolly.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with Action {
  
  var `type`: UNSET_EVENT_DRAG
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_DRAG")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setType(value: UNSET_EVENT_DRAG): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
