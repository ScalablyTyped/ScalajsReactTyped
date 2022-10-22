package typingsJapgolly.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleRenderEvent
  - typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleStateUpdateEvent
  - typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleForceUpdateEvent
*/
trait SchedulingEvent extends StObject
object SchedulingEvent {
  
  inline def ReactScheduleForceUpdateEvent(lanes: js.Array[ReactLane], timestamp: Milliseconds): typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleForceUpdateEvent = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")("schedule-force-update")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleForceUpdateEvent]
  }
  
  inline def ReactScheduleRenderEvent(lanes: js.Array[ReactLane], timestamp: Milliseconds): typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleRenderEvent = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")("schedule-render")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleRenderEvent]
  }
  
  inline def ReactScheduleStateUpdateEvent(lanes: js.Array[ReactLane], timestamp: Milliseconds): typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleStateUpdateEvent = {
    val __obj = js.Dynamic.literal(lanes = lanes.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], warning = null)
    __obj.updateDynamic("type")("schedule-state-update")
    __obj.asInstanceOf[typingsJapgolly.reactDevtoolsInline.commonsMod.ReactScheduleStateUpdateEvent]
  }
}
