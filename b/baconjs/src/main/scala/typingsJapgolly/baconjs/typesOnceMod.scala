package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesEventMod.Event
import typingsJapgolly.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesOnceMod {
  
  @JSImport("baconjs/types/once", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](value: V): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
  inline def default[V](value: Event[V]): EventStream[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[EventStream[V]]
}
