package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherScheduleTriggerEvent extends StObject {
  
  var scheduled_time: DateTime
  
  var triggered_time: js.UndefOr[DateTime] = js.undefined
}
object WatcherScheduleTriggerEvent {
  
  inline def apply(scheduled_time: DateTime): WatcherScheduleTriggerEvent = {
    val __obj = js.Dynamic.literal(scheduled_time = scheduled_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherScheduleTriggerEvent]
  }
  
  extension [Self <: WatcherScheduleTriggerEvent](x: Self) {
    
    inline def setScheduled_time(value: DateTime): Self = StObject.set(x, "scheduled_time", value.asInstanceOf[js.Any])
    
    inline def setTriggered_time(value: DateTime): Self = StObject.set(x, "triggered_time", value.asInstanceOf[js.Any])
    
    inline def setTriggered_timeUndefined: Self = StObject.set(x, "triggered_time", js.undefined)
  }
}
