package typingsJapgolly.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fullcalendarCommon.anon.Type
  - typingsJapgolly.fullcalendarCommon.anon.OptionName
  - typingsJapgolly.fullcalendarCommon.anon.`0`
  - typingsJapgolly.fullcalendarCommon.anon.`1`
  - typingsJapgolly.fullcalendarCommon.anon.DateMarker
  - typingsJapgolly.fullcalendarCommon.anon.ViewType
  - typingsJapgolly.fullcalendarCommon.anon.Selection
  - typingsJapgolly.fullcalendarCommon.anon.`2`
  - typingsJapgolly.fullcalendarCommon.anon.EventInstanceId
  - typingsJapgolly.fullcalendarCommon.anon.`3`
  - typingsJapgolly.fullcalendarCommon.anon.State
  - typingsJapgolly.fullcalendarCommon.anon.`4`
  - typingsJapgolly.fullcalendarCommon.anon.StateType
  - typingsJapgolly.fullcalendarCommon.anon.`5`
  - typingsJapgolly.fullcalendarCommon.anon.Sources
  - typingsJapgolly.fullcalendarCommon.anon.SourceId
  - typingsJapgolly.fullcalendarCommon.anon.`6`
  - typingsJapgolly.fullcalendarCommon.anon.IsRefetch
  - typingsJapgolly.fullcalendarCommon.anon.FetchId
  - typingsJapgolly.fullcalendarCommon.anon.Error
  - typingsJapgolly.fullcalendarCommon.anon.EventStore
  - typingsJapgolly.fullcalendarCommon.anon.EventStoreType
  - typingsJapgolly.fullcalendarCommon.anon.EventStoreEventStore
  - typingsJapgolly.fullcalendarCommon.anon.EventStoreEventStoreType
  - typingsJapgolly.fullcalendarCommon.anon.`7`
*/
trait Action extends StObject
object Action {
  
  inline def `0`(): typingsJapgolly.fullcalendarCommon.anon.`0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PREV")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`0`]
  }
  
  inline def `1`(): typingsJapgolly.fullcalendarCommon.anon.`1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NEXT")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`1`]
  }
  
  inline def `2`(): typingsJapgolly.fullcalendarCommon.anon.`2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_DATES")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`2`]
  }
  
  inline def `3`(): typingsJapgolly.fullcalendarCommon.anon.`3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_EVENT")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`3`]
  }
  
  inline def `4`(): typingsJapgolly.fullcalendarCommon.anon.`4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_DRAG")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`4`]
  }
  
  inline def `5`(): typingsJapgolly.fullcalendarCommon.anon.`5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_RESIZE")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`5`]
  }
  
  inline def `6`(): typingsJapgolly.fullcalendarCommon.anon.`6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENT_SOURCES")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`6`]
  }
  
  inline def `7`(): typingsJapgolly.fullcalendarCommon.anon.`7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENTS")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.`7`]
  }
  
  inline def DateMarker(dateMarker: js.Date): typingsJapgolly.fullcalendarCommon.anon.DateMarker = {
    val __obj = js.Dynamic.literal(dateMarker = dateMarker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_DATE")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.DateMarker]
  }
  
  inline def Error(error: EventSourceError, fetchId: String, sourceId: String): typingsJapgolly.fullcalendarCommon.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fetchId = fetchId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENT_ERROR")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.Error]
  }
  
  inline def EventInstanceId(eventInstanceId: String): typingsJapgolly.fullcalendarCommon.anon.EventInstanceId = {
    val __obj = js.Dynamic.literal(eventInstanceId = eventInstanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_EVENT")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.EventInstanceId]
  }
  
  inline def EventStore(eventStore: typingsJapgolly.fullcalendarCommon.mod.EventStore): typingsJapgolly.fullcalendarCommon.anon.EventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENTS")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.EventStore]
  }
  
  inline def EventStoreEventStore(eventStore: EventStore): typingsJapgolly.fullcalendarCommon.anon.EventStoreEventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MERGE_EVENTS")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.EventStoreEventStore]
  }
  
  inline def EventStoreEventStoreType(eventStore: EventStore): typingsJapgolly.fullcalendarCommon.anon.EventStoreEventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENTS")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.EventStoreEventStoreType]
  }
  
  inline def EventStoreType(eventStore: EventStore): typingsJapgolly.fullcalendarCommon.anon.EventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET_EVENTS")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.EventStoreType]
  }
  
  inline def FetchId(fetchId: String, rawEvents: js.Array[EventInput], sourceId: String): typingsJapgolly.fullcalendarCommon.anon.FetchId = {
    val __obj = js.Dynamic.literal(fetchId = fetchId.asInstanceOf[js.Any], rawEvents = rawEvents.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENTS")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.FetchId]
  }
  
  inline def IsRefetch(): typingsJapgolly.fullcalendarCommon.anon.IsRefetch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FETCH_EVENT_SOURCES")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.IsRefetch]
  }
  
  inline def OptionName(optionName: String, rawOptionValue: Any): typingsJapgolly.fullcalendarCommon.anon.OptionName = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any], rawOptionValue = rawOptionValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_OPTION")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.OptionName]
  }
  
  inline def Selection(selection: DateSpan): typingsJapgolly.fullcalendarCommon.anon.Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_DATES")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.Selection]
  }
  
  inline def SourceId(sourceId: String): typingsJapgolly.fullcalendarCommon.anon.SourceId = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENT_SOURCE")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.SourceId]
  }
  
  inline def Sources(sources: js.Array[EventSource[Any]]): typingsJapgolly.fullcalendarCommon.anon.Sources = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENT_SOURCES")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.Sources]
  }
  
  inline def State(state: EventInteractionState): typingsJapgolly.fullcalendarCommon.anon.State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_DRAG")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.State]
  }
  
  inline def StateType(state: EventInteractionState): typingsJapgolly.fullcalendarCommon.anon.StateType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_RESIZE")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.StateType]
  }
  
  inline def Type(): typingsJapgolly.fullcalendarCommon.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NOTHING")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.Type]
  }
  
  inline def ViewType(viewType: String): typingsJapgolly.fullcalendarCommon.anon.ViewType = {
    val __obj = js.Dynamic.literal(viewType = viewType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_VIEW_TYPE")
    __obj.asInstanceOf[typingsJapgolly.fullcalendarCommon.anon.ViewType]
  }
}
