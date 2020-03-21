package typingsJapgolly.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelAlignment extends js.Object

@JSGlobal("ej.datavisualization.Chart.LabelAlignment")
@js.native
object LabelAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center extends LabelAlignment
  
  //string
  @js.native
  sealed trait Far extends LabelAlignment
  
  //string
  @js.native
  sealed trait Near extends LabelAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelAlignment with Double] = js.native
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Far extends TopLevel[Far with Double]
  
  /* 0 */ @js.native
  object Near extends TopLevel[Near with Double]
  
}

