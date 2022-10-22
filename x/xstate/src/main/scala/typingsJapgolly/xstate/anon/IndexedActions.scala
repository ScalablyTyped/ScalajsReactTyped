package typingsJapgolly.xstate.anon

import typingsJapgolly.xstate.libTypegenTypesMod.GenerateServiceEvents
import typingsJapgolly.xstate.libTypegenTypesMod.MergeWithInternalEvents
import typingsJapgolly.xstate.libTypegenTypesMod.TypegenConstraint
import typingsJapgolly.xstate.libTypesMod.BaseActionObject
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.IndexByType
import typingsJapgolly.xstate.libTypesMod.Prop
import typingsJapgolly.xstate.libTypesMod.ServiceMap
import typingsJapgolly.xstate.xstateStrings.internalEvents
import typingsJapgolly.xstate.xstateStrings.invokeSrcNameMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexedActions[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */] extends StObject {
  
  var indexedActions: IndexByType[TAction]
  
  var indexedEvents: MergeWithInternalEvents[
    IndexByType[
      (/* import warning: importer.ImportType#apply Failed type conversion: string extends TEvent['type'] ? never : TEvent */ js.Any) | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
    ], 
    Prop[TTypesMeta, internalEvents]
  ]
}
object IndexedActions {
  
  inline def apply[TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](
    indexedActions: IndexByType[TAction],
    indexedEvents: MergeWithInternalEvents[
      IndexByType[
        (/* import warning: importer.ImportType#apply Failed type conversion: string extends TEvent['type'] ? never : TEvent */ js.Any) | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
      ], 
      Prop[TTypesMeta, internalEvents]
    ]
  ): IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta] = {
    val __obj = js.Dynamic.literal(indexedActions = indexedActions.asInstanceOf[js.Any], indexedEvents = indexedEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta]]
  }
  
  extension [Self <: IndexedActions[?, ?, ?, ?], TAction /* <: BaseActionObject */, TEvent /* <: EventObject */, TServiceMap /* <: ServiceMap */, TTypesMeta /* <: TypegenConstraint */](x: Self & (IndexedActions[TAction, TEvent, TServiceMap, TTypesMeta])) {
    
    inline def setIndexedActions(value: IndexByType[TAction]): Self = StObject.set(x, "indexedActions", value.asInstanceOf[js.Any])
    
    inline def setIndexedEvents(
      value: MergeWithInternalEvents[
          IndexByType[
            (/* import warning: importer.ImportType#apply Failed type conversion: string extends TEvent['type'] ? never : TEvent */ js.Any) | (GenerateServiceEvents[TServiceMap, Prop[TTypesMeta, invokeSrcNameMap]])
          ], 
          Prop[TTypesMeta, internalEvents]
        ]
    ): Self = StObject.set(x, "indexedEvents", value.asInstanceOf[js.Any])
  }
}
