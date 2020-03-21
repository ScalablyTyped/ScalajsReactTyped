package typingsJapgolly.ejWebAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstClickAction extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstClickAction")
@js.native
object SunburstClickAction extends js.Object {
  //string
  @js.native
  sealed trait None extends SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentSelection extends SunburstClickAction
  
  //string
  @js.native
  sealed trait ToggleSegmentVisibility extends SunburstClickAction
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstClickAction with Double] = js.native
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object ToggleSegmentSelection extends TopLevel[ToggleSegmentSelection with Double]
  
  /* 1 */ @js.native
  object ToggleSegmentVisibility extends TopLevel[ToggleSegmentVisibility with Double]
  
}

