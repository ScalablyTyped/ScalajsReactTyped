package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesEventMod.Event
import typingsJapgolly.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSequentiallyMod {
  
  @JSImport("baconjs/types/sequentially", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](delay: Double, values: js.Array[V | Event[V]]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(delay.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
