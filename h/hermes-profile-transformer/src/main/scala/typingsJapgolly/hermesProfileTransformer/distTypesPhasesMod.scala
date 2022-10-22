package typingsJapgolly.hermesProfileTransformer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPhasesMod {
  
  @js.native
  sealed trait EventsPhase extends StObject
  @JSImport("hermes-profile-transformer/dist/types/Phases", "EventsPhase")
  @js.native
  object EventsPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventsPhase & String] = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_END
      extends StObject
         with EventsPhase
    /* "F" */ val ASYNC_EVENTS_END: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_END & String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_NESTABLE_END
      extends StObject
         with EventsPhase
    /* "e" */ val ASYNC_EVENTS_NESTABLE_END: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END & String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_NESTABLE_INSTANT
      extends StObject
         with EventsPhase
    /* "n" */ val ASYNC_EVENTS_NESTABLE_INSTANT: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT & String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_NESTABLE_START
      extends StObject
         with EventsPhase
    /* "b" */ val ASYNC_EVENTS_NESTABLE_START: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START & String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_START
      extends StObject
         with EventsPhase
    /* "S" */ val ASYNC_EVENTS_START: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_START & String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_STEP_INTO
      extends StObject
         with EventsPhase
    /* "T" */ val ASYNC_EVENTS_STEP_INTO: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_STEP_INTO & String = js.native
    
    @js.native
    sealed trait ASYNC_EVENTS_STEP_PAST
      extends StObject
         with EventsPhase
    /* "p" */ val ASYNC_EVENTS_STEP_PAST: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.ASYNC_EVENTS_STEP_PAST & String = js.native
    
    @js.native
    sealed trait CLOCK_SYNC_EVENTS
      extends StObject
         with EventsPhase
    /* "c" */ val CLOCK_SYNC_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CLOCK_SYNC_EVENTS & String = js.native
    
    @js.native
    sealed trait COMPLETE_EVENTS
      extends StObject
         with EventsPhase
    /* "X" */ val COMPLETE_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.COMPLETE_EVENTS & String = js.native
    
    @js.native
    sealed trait CONTEXT_EVENTS_ENTER
      extends StObject
         with EventsPhase
    /* "(" */ val CONTEXT_EVENTS_ENTER: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_ENTER & String = js.native
    
    @js.native
    sealed trait CONTEXT_EVENTS_LEAVE
      extends StObject
         with EventsPhase
    /* ")" */ val CONTEXT_EVENTS_LEAVE: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE & String = js.native
    
    @js.native
    sealed trait COUNTER_EVENTS
      extends StObject
         with EventsPhase
    /* "C" */ val COUNTER_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.COUNTER_EVENTS & String = js.native
    
    @js.native
    sealed trait DURATION_EVENTS_BEGIN
      extends StObject
         with EventsPhase
    /* "B" */ val DURATION_EVENTS_BEGIN: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_BEGIN & String = js.native
    
    @js.native
    sealed trait DURATION_EVENTS_END
      extends StObject
         with EventsPhase
    /* "E" */ val DURATION_EVENTS_END: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.DURATION_EVENTS_END & String = js.native
    
    @js.native
    sealed trait FLOW_EVENTS_END
      extends StObject
         with EventsPhase
    /* "f" */ val FLOW_EVENTS_END: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_END & String = js.native
    
    @js.native
    sealed trait FLOW_EVENTS_START
      extends StObject
         with EventsPhase
    /* "s" */ val FLOW_EVENTS_START: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_START & String = js.native
    
    @js.native
    sealed trait FLOW_EVENTS_STEP
      extends StObject
         with EventsPhase
    /* "t" */ val FLOW_EVENTS_STEP: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.FLOW_EVENTS_STEP & String = js.native
    
    @js.native
    sealed trait INSTANT_EVENTS
      extends StObject
         with EventsPhase
    /* "I" */ val INSTANT_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.INSTANT_EVENTS & String = js.native
    
    @js.native
    sealed trait LINKED_ID_EVENTS
      extends StObject
         with EventsPhase
    /* "=" */ val LINKED_ID_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.LINKED_ID_EVENTS & String = js.native
    
    @js.native
    sealed trait MARK_EVENTS
      extends StObject
         with EventsPhase
    /* "R" */ val MARK_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MARK_EVENTS & String = js.native
    
    @js.native
    sealed trait MEMORY_DUMP_EVENTS_GLOBAL
      extends StObject
         with EventsPhase
    /* "V" */ val MEMORY_DUMP_EVENTS_GLOBAL: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL & String = js.native
    
    @js.native
    sealed trait MEMORY_DUMP_EVENTS_PROCESS
      extends StObject
         with EventsPhase
    /* "v" */ val MEMORY_DUMP_EVENTS_PROCESS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS & String = js.native
    
    @js.native
    sealed trait METADATA_EVENTS
      extends StObject
         with EventsPhase
    /* "M" */ val METADATA_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.METADATA_EVENTS & String = js.native
    
    @js.native
    sealed trait OBJECT_EVENTS_CREATED
      extends StObject
         with EventsPhase
    /* "N" */ val OBJECT_EVENTS_CREATED: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_CREATED & String = js.native
    
    @js.native
    sealed trait OBJECT_EVENTS_DESTROYED
      extends StObject
         with EventsPhase
    /* "D" */ val OBJECT_EVENTS_DESTROYED: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_DESTROYED & String = js.native
    
    @js.native
    sealed trait OBJECT_EVENTS_SNAPSHOT
      extends StObject
         with EventsPhase
    /* "O" */ val OBJECT_EVENTS_SNAPSHOT: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.OBJECT_EVENTS_SNAPSHOT & String = js.native
    
    @js.native
    sealed trait SAMPLE_EVENTS
      extends StObject
         with EventsPhase
    /* "P" */ val SAMPLE_EVENTS: typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.SAMPLE_EVENTS & String = js.native
  }
}
