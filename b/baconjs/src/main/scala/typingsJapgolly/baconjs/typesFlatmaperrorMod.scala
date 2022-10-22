package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesFlatmapMod_.EventOrValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFlatmaperrorMod {
  
  @JSImport("baconjs/types/flatmaperror", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V, V2](
    src: typingsJapgolly.baconjs.typesObservableMod.default[V],
    f: js.Function1[
      /* error */ Any, 
      typingsJapgolly.baconjs.typesObservableMod.default[V2] | EventOrValue[V2]
    ]
  ): typingsJapgolly.baconjs.typesObservableMod.default[V | V2] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.baconjs.typesObservableMod.default[V | V2]]
}
