package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActionExecutionMode
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherScheduleTriggerEvent
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherSimulatedActions
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherWatch
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actionmodes extends StObject {
  
  var action_modes: js.UndefOr[Record[String, WatcherActionExecutionMode]] = js.undefined
  
  var alternative_input: js.UndefOr[Record[String, Any]] = js.undefined
  
  var ignore_condition: js.UndefOr[Boolean] = js.undefined
  
  var record_execution: js.UndefOr[Boolean] = js.undefined
  
  var simulated_actions: js.UndefOr[WatcherSimulatedActions] = js.undefined
  
  var trigger_data: js.UndefOr[WatcherScheduleTriggerEvent] = js.undefined
  
  var watch: js.UndefOr[WatcherWatch] = js.undefined
}
object Actionmodes {
  
  inline def apply(): Actionmodes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actionmodes]
  }
  
  extension [Self <: Actionmodes](x: Self) {
    
    inline def setAction_modes(value: Record[String, WatcherActionExecutionMode]): Self = StObject.set(x, "action_modes", value.asInstanceOf[js.Any])
    
    inline def setAction_modesUndefined: Self = StObject.set(x, "action_modes", js.undefined)
    
    inline def setAlternative_input(value: Record[String, Any]): Self = StObject.set(x, "alternative_input", value.asInstanceOf[js.Any])
    
    inline def setAlternative_inputUndefined: Self = StObject.set(x, "alternative_input", js.undefined)
    
    inline def setIgnore_condition(value: Boolean): Self = StObject.set(x, "ignore_condition", value.asInstanceOf[js.Any])
    
    inline def setIgnore_conditionUndefined: Self = StObject.set(x, "ignore_condition", js.undefined)
    
    inline def setRecord_execution(value: Boolean): Self = StObject.set(x, "record_execution", value.asInstanceOf[js.Any])
    
    inline def setRecord_executionUndefined: Self = StObject.set(x, "record_execution", js.undefined)
    
    inline def setSimulated_actions(value: WatcherSimulatedActions): Self = StObject.set(x, "simulated_actions", value.asInstanceOf[js.Any])
    
    inline def setSimulated_actionsUndefined: Self = StObject.set(x, "simulated_actions", js.undefined)
    
    inline def setTrigger_data(value: WatcherScheduleTriggerEvent): Self = StObject.set(x, "trigger_data", value.asInstanceOf[js.Any])
    
    inline def setTrigger_dataUndefined: Self = StObject.set(x, "trigger_data", js.undefined)
    
    inline def setWatch(value: WatcherWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
