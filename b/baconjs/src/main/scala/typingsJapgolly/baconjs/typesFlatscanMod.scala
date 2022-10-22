package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.Observable
import typingsJapgolly.baconjs.typesObservableMod.Property
import typingsJapgolly.baconjs.typesTypesMod.Function2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFlatscanMod {
  
  @JSImport("baconjs/types/flatscan", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatScan[In, Out](src: Observable[In], seed: Out, f: Function2[Out, In, Observable[Out] | Out]): Property[Out] = (^.asInstanceOf[js.Dynamic].applyDynamic("flatScan")(src.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Property[Out]]
}
