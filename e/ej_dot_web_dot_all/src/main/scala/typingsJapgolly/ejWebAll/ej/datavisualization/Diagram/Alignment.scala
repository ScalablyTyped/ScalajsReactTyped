package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

@JSGlobal("ej.datavisualization.Diagram.Alignment")
@js.native
object Alignment extends js.Object {
  //Used to align the label either bottom or right(after) of the connector segment
  @js.native
  sealed trait After extends Alignment
  
  //Used to align the label either top or left(before) of the connector segment
  @js.native
  sealed trait Before extends Alignment
  
  //Used to align the label at center of the connector segment
  @js.native
  sealed trait Center extends Alignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Alignment with Double] = js.native
  /* 2 */ @js.native
  object After extends TopLevel[After with Double]
  
  /* 0 */ @js.native
  object Before extends TopLevel[Before with Double]
  
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
}

