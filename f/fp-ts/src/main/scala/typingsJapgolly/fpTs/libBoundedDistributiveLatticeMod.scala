package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libBoundedLatticeMod.BoundedLattice
import typingsJapgolly.fpTs.libLatticeMod.Lattice
import typingsJapgolly.fpTs.libOrdMod.Ord_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundedDistributiveLatticeMod {
  
  @JSImport("fp-ts/lib/BoundedDistributiveLattice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMinMaxBoundedDistributiveLattice[A](O: Ord_[A]): js.Function2[/* min */ A, /* max */ A, BoundedDistributiveLattice[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinMaxBoundedDistributiveLattice")(O.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* min */ A, /* max */ A, BoundedDistributiveLattice[A]]]
  
  trait BoundedDistributiveLattice[A]
    extends StObject
       with BoundedLattice[A]
       with Lattice[A]
  object BoundedDistributiveLattice {
    
    inline def apply[A](join: (A, A) => A, meet: (A, A) => A, one: A, zero: A): BoundedDistributiveLattice[A] = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundedDistributiveLattice[A]]
    }
  }
}
