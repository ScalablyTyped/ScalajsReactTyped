package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScanMod {
  
  @JSImport("baconjs/types/scan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[In, Out](src: typingsJapgolly.baconjs.typesObservableMod.default[In], seed: Out, f: Accumulator[In, Out]): Property[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[Out]]
  
  type Accumulator[In, Out] = js.Function2[/* acc */ Out, /* value */ In, Out]
}
