package typingsJapgolly.nouislider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PipsMode extends StObject
@JSImport("nouislider", "PipsMode")
@js.native
object PipsMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PipsMode & String] = js.native
  
  @js.native
  sealed trait Count
    extends StObject
       with PipsMode
  /* "count" */ val Count: typingsJapgolly.nouislider.mod.PipsMode.Count & String = js.native
  
  @js.native
  sealed trait Positions
    extends StObject
       with PipsMode
  /* "positions" */ val Positions: typingsJapgolly.nouislider.mod.PipsMode.Positions & String = js.native
  
  @js.native
  sealed trait Range
    extends StObject
       with PipsMode
  /* "range" */ val Range: typingsJapgolly.nouislider.mod.PipsMode.Range & String = js.native
  
  @js.native
  sealed trait Steps
    extends StObject
       with PipsMode
  /* "steps" */ val Steps: typingsJapgolly.nouislider.mod.PipsMode.Steps & String = js.native
  
  @js.native
  sealed trait Values
    extends StObject
       with PipsMode
  /* "values" */ val Values: typingsJapgolly.nouislider.mod.PipsMode.Values & String = js.native
}
