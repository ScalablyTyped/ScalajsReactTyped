package typingsJapgolly.reactCircularProgressbar

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactCircularProgressbar.circularProgressbarMod.default
import typingsJapgolly.reactCircularProgressbar.circularProgressbarWithChildrenMod.CircularProgressbarWithChildrenProps
import typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-circular-progressbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CircularProgressbar () extends default
  
  def CircularProgressbarWithChildren(props: CircularProgressbarWithChildrenProps): Element = js.native
  def buildStyles(
    hasRotationStrokeLinecapTextColorTextSizePathColorPathTransitionPathTransitionDurationTrailColorBackgroundColor: AnonBackgroundColor
  ): CircularProgressbarStyles = js.native
  /* static members */
  @js.native
  object CircularProgressbar extends js.Object {
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
  
}

