package typingsJapgolly.ejWebAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Placement extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.Placement")
@js.native
object Placement extends js.Object {
  //string
  @js.native
  sealed trait Far extends Placement
  
  //string
  @js.native
  sealed trait Near extends Placement
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Placement with Double] = js.native
  /* 1 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 0 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

