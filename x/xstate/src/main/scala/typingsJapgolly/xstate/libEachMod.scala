package typingsJapgolly.xstate

import typingsJapgolly.xstate.libTypesMod.ActionObject
import typingsJapgolly.xstate.libTypesMod.EventObject
import typingsJapgolly.xstate.libTypesMod.SingleOrArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEachMod {
  
  @JSImport("xstate/lib/each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def each[TContext, TEvent /* <: EventObject */](
    collection: /* keyof TContext */ String,
    item: /* keyof TContext */ String,
    actions: SingleOrArray[ActionObject[TContext, TEvent]]
  ): ActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(collection.asInstanceOf[js.Any], item.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[ActionObject[TContext, TEvent]]
  inline def each[TContext, TEvent /* <: EventObject */](
    collection: /* keyof TContext */ String,
    item: /* keyof TContext */ String,
    index: /* keyof TContext */ String,
    actions: SingleOrArray[ActionObject[TContext, TEvent]]
  ): ActionObject[TContext, TEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(collection.asInstanceOf[js.Any], item.asInstanceOf[js.Any], index.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[ActionObject[TContext, TEvent]]
}
