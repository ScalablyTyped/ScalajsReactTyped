package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libMeetSemilatticeMod.MeetSemilattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundedMeetSemilatticeMod {
  
  trait BoundedMeetSemilattice[A]
    extends StObject
       with MeetSemilattice[A] {
    
    val one: A
  }
  object BoundedMeetSemilattice {
    
    inline def apply[A](meet: (A, A) => A, one: A): BoundedMeetSemilattice[A] = {
      val __obj = js.Dynamic.literal(meet = js.Any.fromFunction2(meet), one = one.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundedMeetSemilattice[A]]
    }
    
    extension [Self <: BoundedMeetSemilattice[?], A](x: Self & BoundedMeetSemilattice[A]) {
      
      inline def setOne(value: A): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
    }
  }
}
