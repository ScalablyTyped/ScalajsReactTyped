package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.EventStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLaterMod {
  
  @JSImport("baconjs/types/later", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](delay: Double, value: V): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(delay.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
