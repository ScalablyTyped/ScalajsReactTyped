package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.REMOVE_ALL_EVENT_SOURCES
import typingsJapgolly.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`
  extends StObject
     with Action {
  
  var `type`: REMOVE_ALL_EVENT_SOURCES
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENT_SOURCES")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setType(value: REMOVE_ALL_EVENT_SOURCES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
