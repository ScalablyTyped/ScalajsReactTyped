package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDebounceMod {
  
  @JSImport("baconjs/types/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](src: typingsJapgolly.baconjs.typesObservableMod.default[V], delay: Double): typingsJapgolly.baconjs.typesObservableMod.default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V]]
  
  inline def debounce[V](src: default[V], delay: Double): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[default[V]]
  
  inline def debounceImmediate[V](src: default[V], delay: Double): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounceImmediate")(src.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[default[V]]
}
