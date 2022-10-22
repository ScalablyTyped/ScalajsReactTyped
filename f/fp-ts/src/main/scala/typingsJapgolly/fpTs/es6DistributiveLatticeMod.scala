package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libDistributiveLatticeMod.DistributiveLattice
import typingsJapgolly.fpTs.libOrdMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object es6DistributiveLatticeMod {
  
  @JSImport("fp-ts/es6/DistributiveLattice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMinMaxDistributiveLattice[A](O: Ord_[A]): DistributiveLattice[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinMaxDistributiveLattice")(O.asInstanceOf[js.Any]).asInstanceOf[DistributiveLattice[A]]
}
