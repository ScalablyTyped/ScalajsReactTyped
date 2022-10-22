package typingsJapgolly.lovefield.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConstraintTiming extends StObject
@JSImport("lovefield", "ConstraintTiming")
@js.native
object ConstraintTiming extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConstraintTiming & Double] = js.native
  
  @js.native
  sealed trait DEFERRABLE
    extends StObject
       with ConstraintTiming
  /* 1 */ val DEFERRABLE: typingsJapgolly.lovefield.mod.ConstraintTiming.DEFERRABLE & Double = js.native
  
  @js.native
  sealed trait IMMEDIATE
    extends StObject
       with ConstraintTiming
  /* 0 */ val IMMEDIATE: typingsJapgolly.lovefield.mod.ConstraintTiming.IMMEDIATE & Double = js.native
}
