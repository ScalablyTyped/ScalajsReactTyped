package typingsJapgolly.baconjs

import typingsJapgolly.baconjs.typesObservableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConstantMod {
  
  @JSImport("baconjs/types/constant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[V](x: V): Property[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any]).asInstanceOf[Property[V]]
}
