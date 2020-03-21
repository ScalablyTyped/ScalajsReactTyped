package typingsJapgolly.ejWebAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLabelRotationMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLabelRotationMode")
@js.native
object SunburstLabelRotationMode extends js.Object {
  //string
  @js.native
  sealed trait Angle extends SunburstLabelRotationMode
  
  //string
  @js.native
  sealed trait Normal extends SunburstLabelRotationMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SunburstLabelRotationMode with Double] = js.native
  /* 0 */ @js.native
  object Angle extends TopLevel[Angle with Double]
  
  /* 1 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
}

