package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.EventStream
import typingsJapgolly.baconjs.typesObservableMod.Property
import typingsJapgolly.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHoldwhenMod {
  
  @JSImport("baconjs/types/holdwhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def holdWhen[V](src: default[V], valve: Property[Boolean]): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("holdWhen")(src.asInstanceOf[js.Any], valve.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
}
