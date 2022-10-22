package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.EventStream
import typingsJapgolly.baconjs.typesObservableMod.EventStreamOptions
import typingsJapgolly.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGroupsimultaneousMod {
  
  @JSImport("baconjs/types/groupsimultaneous", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](
    streams: (typingsJapgolly.baconjs.typesObservableMod.default[V] | js.Array[typingsJapgolly.baconjs.typesObservableMod.default[V]])*
  ): EventStream[js.Array[js.Array[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
  
  inline def groupSimultaneous[V](streams: js.Array[default[V]]): EventStream[js.Array[js.Array[V]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupSimultaneous_")(streams.asInstanceOf[js.Any]).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
  inline def groupSimultaneous[V](streams: js.Array[default[V]], options: EventStreamOptions): EventStream[js.Array[js.Array[V]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupSimultaneous_")(streams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EventStream[js.Array[js.Array[V]]]]
}
