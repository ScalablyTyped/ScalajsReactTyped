package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesFrombinderMod.EventTransformer
import typingsJapgolly.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFrompromiseMod {
  
  @JSImport("baconjs/types/frompromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](promise: js.Promise[V]): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
  inline def default[V](promise: js.Promise[V], abort: Boolean): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], abort.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  inline def default[V](promise: js.Promise[V], abort: Boolean, eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], abort.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  inline def default[V](promise: js.Promise[V], abort: Unit, eventTransformer: EventTransformer[V]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(promise.asInstanceOf[js.Any], abort.asInstanceOf[js.Any], eventTransformer.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
