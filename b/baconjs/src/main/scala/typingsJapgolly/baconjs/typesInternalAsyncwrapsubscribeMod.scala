package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.Observable
import typingsJapgolly.baconjs.typesTypesMod.Subscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInternalAsyncwrapsubscribeMod {
  
  @JSImport("baconjs/types/internal/asyncwrapsubscribe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](obs: Observable[V], subscribe: Subscribe[V]): Subscribe[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(obs.asInstanceOf[js.Any], subscribe.asInstanceOf[js.Any])).asInstanceOf[Subscribe[V]]
}
