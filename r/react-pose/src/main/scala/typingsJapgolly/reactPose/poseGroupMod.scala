package typingsJapgolly.reactPose

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactPose.transitionTypesMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/components/Transition/PoseGroup", JSImport.Namespace)
@js.native
object poseGroupMod extends js.Object {
  @js.native
  trait PoseGroup
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class default () extends PoseGroup
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonFlipMove = js.native
  }
  
}

