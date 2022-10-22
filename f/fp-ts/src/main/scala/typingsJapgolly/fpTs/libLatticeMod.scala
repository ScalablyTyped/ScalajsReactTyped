package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libJoinSemilatticeMod.JoinSemilattice
import typingsJapgolly.fpTs.libMeetSemilatticeMod.MeetSemilattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLatticeMod {
  
  trait Lattice[A]
    extends StObject
       with JoinSemilattice[A]
       with MeetSemilattice[A]
  object Lattice {
    
    inline def apply[A](join: (A, A) => A, meet: (A, A) => A): Lattice[A] = {
      val __obj = js.Dynamic.literal(join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet))
      __obj.asInstanceOf[Lattice[A]]
    }
  }
}
