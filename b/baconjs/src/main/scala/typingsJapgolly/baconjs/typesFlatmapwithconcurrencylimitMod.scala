package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesFlatmapMod_.SpawnerOrObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFlatmapwithconcurrencylimitMod {
  
  @JSImport("baconjs/types/flatmapwithconcurrencylimit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V, V2](
    src: typingsJapgolly.baconjs.typesObservableMod.default[V],
    limit: Double,
    f: SpawnerOrObservable[V, V2]
  ): typingsJapgolly.baconjs.typesObservableMod.default[V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V2]]
}
