package typingsJapgolly.xstate.anon

import typingsJapgolly.std.Record
import typingsJapgolly.xstate.libTypesMod.BaseActionObject
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.IndexByType
import typingsJapgolly.xstate.xstateStrings.__XSTATE_ALLOW_ANY_INVOKE_DATA_HACK__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedEvents[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */] extends StObject {
  
  var indexedActions: IndexByType[TAction]
  
  var indexedEvents: (Record[String, TEvent]) & XSTATEALLOWANYINVOKEDATAHACK
  
  var invokeSrcNameMap: Record[String, __XSTATE_ALLOW_ANY_INVOKE_DATA_HACK__]
}
object IndexedEvents {
  
  inline def apply[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */](
    indexedActions: IndexByType[TAction],
    indexedEvents: (Record[String, TEvent]) & XSTATEALLOWANYINVOKEDATAHACK,
    invokeSrcNameMap: Record[String, __XSTATE_ALLOW_ANY_INVOKE_DATA_HACK__]
  ): IndexedEvents[TAction, TEvent] = {
    val __obj = js.Dynamic.literal(indexedActions = indexedActions.asInstanceOf[js.Any], indexedEvents = indexedEvents.asInstanceOf[js.Any], invokeSrcNameMap = invokeSrcNameMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedEvents[TAction, TEvent]]
  }
  
  extension [Self <: IndexedEvents[?, ?], TAction /* <: BaseActionObject */, TEvent /* <: EventObject */](x: Self & (IndexedEvents[TAction, TEvent])) {
    
    inline def setIndexedActions(value: IndexByType[TAction]): Self = StObject.set(x, "indexedActions", value.asInstanceOf[js.Any])
    
    inline def setIndexedEvents(value: (Record[String, TEvent]) & XSTATEALLOWANYINVOKEDATAHACK): Self = StObject.set(x, "indexedEvents", value.asInstanceOf[js.Any])
    
    inline def setInvokeSrcNameMap(value: Record[String, __XSTATE_ALLOW_ANY_INVOKE_DATA_HACK__]): Self = StObject.set(x, "invokeSrcNameMap", value.asInstanceOf[js.Any])
  }
}
