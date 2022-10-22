package typingsJapgolly.xstate.libTypesMod

import typingsJapgolly.xstate.xstateStrings.`final`
import typingsJapgolly.xstate.xstateStrings.atomic
import typingsJapgolly.xstate.xstateStrings.compound
import typingsJapgolly.xstate.xstateStrings.deep
import typingsJapgolly.xstate.xstateStrings.history
import typingsJapgolly.xstate.xstateStrings.parallel
import typingsJapgolly.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateNodeDefinition[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */] extends StObject {
  
  /**
    * @deprecated
    */
  var activities: js.Array[ActivityDefinition[TContext, TEvent]]
  
  var context: TContext
  
  var data: js.UndefOr[(Mapper[TContext, TEvent, Any]) | (PropertyMapper[TContext, TEvent, Any])] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var entry: js.Array[ActionObject[TContext, TEvent]]
  
  var exit: js.Array[ActionObject[TContext, TEvent]]
  
  var history: js.UndefOr[Boolean | shallow | deep] = js.undefined
  
  var id: String
  
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.undefined
  
  var invoke: js.Array[InvokeDefinition[TContext, TEvent]]
  
  var key: String
  
  var meta: Any
  
  var on: TransitionDefinitionMap[TContext, TEvent]
  
  var order: Double
  
  var states: StatesDefinition[TContext, TStateSchema, TEvent]
  
  var tags: js.Array[String]
  
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  
  var `type`: atomic | compound | parallel | `final` | history
  
  var version: js.UndefOr[String] = js.undefined
}
object StateNodeDefinition {
  
  inline def apply[TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](
    activities: js.Array[ActivityDefinition[TContext, TEvent]],
    context: TContext,
    entry: js.Array[ActionObject[TContext, TEvent]],
    exit: js.Array[ActionObject[TContext, TEvent]],
    id: String,
    invoke: js.Array[InvokeDefinition[TContext, TEvent]],
    key: String,
    meta: Any,
    on: TransitionDefinitionMap[TContext, TEvent],
    order: Double,
    states: StatesDefinition[TContext, TStateSchema, TEvent],
    tags: js.Array[String],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    `type`: atomic | compound | parallel | `final` | history
  ): StateNodeDefinition[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeDefinition[TContext, TStateSchema, TEvent]]
  }
  
  extension [Self <: StateNodeDefinition[?, ?, ?], TContext, TStateSchema /* <: StateSchema[Any] */, TEvent /* <: EventObject */](x: Self & (StateNodeDefinition[TContext, TStateSchema, TEvent])) {
    
    inline def setActivities(value: js.Array[ActivityDefinition[TContext, TEvent]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesVarargs(value: (ActivityDefinition[TContext, TEvent])*): Self = StObject.set(x, "activities", js.Array(value*))
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setData(value: (Mapper[TContext, TEvent, Any]) | (PropertyMapper[TContext, TEvent, Any])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataFunction2(value: (TContext, TEvent) => Any): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "entry", js.Array(value*))
    
    inline def setExit(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "exit", js.Array(value*))
    
    inline def setHistory(value: Boolean | shallow | deep): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setInvoke(value: js.Array[InvokeDefinition[TContext, TEvent]]): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    inline def setInvokeVarargs(value: (InvokeDefinition[TContext, TEvent])*): Self = StObject.set(x, "invoke", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setOn(value: TransitionDefinitionMap[TContext, TEvent]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setStates(value: StatesDefinition[TContext, TStateSchema, TEvent]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = StObject.set(x, "transitions", js.Array(value*))
    
    inline def setType(value: atomic | compound | parallel | `final` | history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
