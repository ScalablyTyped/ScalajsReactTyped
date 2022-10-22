package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSkipuntilMod {
  
  @JSImport("baconjs/types/skipuntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](
    src: typingsJapgolly.baconjs.typesObservableMod.default[V],
    starter: typingsJapgolly.baconjs.typesObservableMod.default[Any]
  ): typingsJapgolly.baconjs.typesObservableMod.default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], starter.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V]]
  
  inline def skipUntil[V](src: default[V], starter: default[Any]): default[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(src.asInstanceOf[js.Any], starter.asInstanceOf[js.Any])).asInstanceOf[default[V]]
}
