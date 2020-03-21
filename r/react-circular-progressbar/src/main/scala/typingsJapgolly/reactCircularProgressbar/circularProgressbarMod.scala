package typingsJapgolly.reactCircularProgressbar

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarDefaultProps
import typingsJapgolly.reactCircularProgressbar.typesMod.CircularProgressbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Namespace)
@js.native
object circularProgressbarMod extends js.Object {
  @js.native
  trait CircularProgressbar
    extends Component[CircularProgressbarProps, js.Object, js.Any] {
    def getBackgroundPadding(): Double = js.native
    def getPathRadius(): Double = js.native
    def getPathRatio(): Double = js.native
  }
  
  @js.native
  class default () extends CircularProgressbar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: CircularProgressbarDefaultProps = js.native
  }
  
}

