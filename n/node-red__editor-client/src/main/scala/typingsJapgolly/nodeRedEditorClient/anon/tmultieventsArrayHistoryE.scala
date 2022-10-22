package typingsJapgolly.nodeRedEditorClient.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeRedEditorClient.mod.HistoryEvent
import typingsJapgolly.nodeRedEditorClient.nodeRedEditorClientStrings.multi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  t :'multi',   events :std.Array<@node-red/editor-client.@node-red/editor-client.HistoryEvent>} & {  dirty :boolean | undefined,   callback :(ev : @node-red/editor-client.@node-red/editor-client.HistoryEvent): void | undefined} */
trait tmultieventsArrayHistoryE
  extends StObject
     with HistoryEvent {
  
  var callback: js.UndefOr[js.Function1[/* ev */ HistoryEvent, Unit]] = js.undefined
  
  var dirty: js.UndefOr[Boolean] = js.undefined
  
  var events: js.Array[HistoryEvent]
  
  var t: multi
}
object tmultieventsArrayHistoryE {
  
  inline def apply(events: js.Array[HistoryEvent]): tmultieventsArrayHistoryE = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], t = "multi")
    __obj.asInstanceOf[tmultieventsArrayHistoryE]
  }
  
  extension [Self <: tmultieventsArrayHistoryE](x: Self) {
    
    inline def setCallback(value: /* ev */ HistoryEvent => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* ev */ HistoryEvent) => value(t0).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setEvents(value: js.Array[HistoryEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: HistoryEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setT(value: multi): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
  }
}
