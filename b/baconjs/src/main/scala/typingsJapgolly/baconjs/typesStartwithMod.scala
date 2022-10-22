package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.EventStream
import typingsJapgolly.baconjs.typesObservableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStartwithMod {
  
  @JSImport("baconjs/types/startwith", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def startWithE[V](src: EventStream[V], seed: V): EventStream[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWithE")(src.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[EventStream[V]]
  
  inline def startWithP[V](src: Property[V], seed: V): Property[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("startWithP")(src.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Property[V]]
}
