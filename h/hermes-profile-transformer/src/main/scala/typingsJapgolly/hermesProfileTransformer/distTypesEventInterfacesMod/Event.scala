package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.anon.Issuets
import typingsJapgolly.hermesProfileTransformer.anon.Linkedid
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CLOCK_SYNC_EVENTS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.COMPLETE_EVENTS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.COUNTER_EVENTS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_BEGIN
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_END
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_END
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_START
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_STEP
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.INSTANT_EVENTS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.LINKED_ID_EVENTS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MARK_EVENTS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.METADATA_EVENTS
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_CREATED
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.SAMPLE_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.CompleteEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MetadataEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.SampleEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ClockSyncEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.InstantEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.CounterEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MarkEvent
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.LinkedIDEvent
*/
trait Event extends StObject
object Event {
  
  inline def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventEnd]
  }
  
  inline def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventInstant]
  }
  
  inline def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.AsyncEventStart]
  }
  
  inline def ClockSyncEvent(args: Issuets, ph: CLOCK_SYNC_EVENTS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ClockSyncEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ClockSyncEvent]
  }
  
  inline def CompleteEvent(dur: Double, ph: COMPLETE_EVENTS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.CompleteEvent = {
    val __obj = js.Dynamic.literal(dur = dur.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.CompleteEvent]
  }
  
  inline def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventEnter]
  }
  
  inline def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ContextEventLeave]
  }
  
  inline def CounterEvent(ph: COUNTER_EVENTS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.CounterEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.CounterEvent]
  }
  
  inline def DurationEventBegin(ph: DURATION_EVENTS_BEGIN): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventBegin]
  }
  
  inline def DurationEventEnd(ph: DURATION_EVENTS_END): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.DurationEventEnd]
  }
  
  inline def FlowEventEnd(ph: FLOW_EVENTS_END): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventEnd]
  }
  
  inline def FlowEventStart(ph: FLOW_EVENTS_START): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStart]
  }
  
  inline def FlowEventStep(ph: FLOW_EVENTS_STEP): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.FlowEventStep]
  }
  
  inline def InstantEvent(ph: INSTANT_EVENTS, s: String): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.InstantEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.InstantEvent]
  }
  
  inline def LinkedIDEvent(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.LinkedIDEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.LinkedIDEvent]
  }
  
  inline def MarkEvent(ph: MARK_EVENTS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MarkEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MarkEvent]
  }
  
  inline def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpGlobal]
  }
  
  inline def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpProcess]
  }
  
  inline def MetadataEvent(ph: METADATA_EVENTS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MetadataEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MetadataEvent]
  }
  
  inline def ObjectEventCreated(ph: OBJECT_EVENTS_CREATED): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventCreated]
  }
  
  inline def ObjectEventDestroyed(ph: OBJECT_EVENTS_DESTROYED): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventDestroyed]
  }
  
  inline def ObjectEventSnapshot(ph: OBJECT_EVENTS_SNAPSHOT): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.ObjectEventSnapshot]
  }
  
  inline def SampleEvent(ph: SAMPLE_EVENTS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.SampleEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.SampleEvent]
  }
}
