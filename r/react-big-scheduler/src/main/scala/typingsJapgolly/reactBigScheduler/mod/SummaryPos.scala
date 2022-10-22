package typingsJapgolly.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SummaryPos extends StObject
@JSImport("react-big-scheduler", "SummaryPos")
@js.native
object SummaryPos extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryPos & Double] = js.native
  
  @js.native
  sealed trait Bottom
    extends StObject
       with SummaryPos
  /* 3 */ val Bottom: typingsJapgolly.reactBigScheduler.mod.SummaryPos.Bottom & Double = js.native
  
  @js.native
  sealed trait BottomLeft
    extends StObject
       with SummaryPos
  /* 5 */ val BottomLeft: typingsJapgolly.reactBigScheduler.mod.SummaryPos.BottomLeft & Double = js.native
  
  @js.native
  sealed trait BottomRight
    extends StObject
       with SummaryPos
  /* 4 */ val BottomRight: typingsJapgolly.reactBigScheduler.mod.SummaryPos.BottomRight & Double = js.native
  
  @js.native
  sealed trait Top
    extends StObject
       with SummaryPos
  /* 0 */ val Top: typingsJapgolly.reactBigScheduler.mod.SummaryPos.Top & Double = js.native
  
  @js.native
  sealed trait TopLeft
    extends StObject
       with SummaryPos
  /* 2 */ val TopLeft: typingsJapgolly.reactBigScheduler.mod.SummaryPos.TopLeft & Double = js.native
  
  @js.native
  sealed trait TopRight
    extends StObject
       with SummaryPos
  /* 1 */ val TopRight: typingsJapgolly.reactBigScheduler.mod.SummaryPos.TopRight & Double = js.native
}
