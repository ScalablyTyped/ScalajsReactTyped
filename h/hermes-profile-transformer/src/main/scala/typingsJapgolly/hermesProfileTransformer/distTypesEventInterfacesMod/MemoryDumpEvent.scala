package typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod

import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_GLOBAL
import typingsJapgolly.hermesProfileTransformer.distTypesPhasesMod.EventsPhase.MEMORY_DUMP_EVENTS_PROCESS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpGlobal
  - typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpProcess
*/
trait MemoryDumpEvent
  extends StObject
     with Event
object MemoryDumpEvent {
  
  inline def MemoryDumpGlobal(id: String, ph: MEMORY_DUMP_EVENTS_GLOBAL): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpGlobal = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpGlobal]
  }
  
  inline def MemoryDumpProcess(id: String, ph: MEMORY_DUMP_EVENTS_PROCESS): typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpProcess = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.hermesProfileTransformer.distTypesEventInterfacesMod.MemoryDumpProcess]
  }
}
