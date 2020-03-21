package typingsJapgolly.reactPose

import typingsJapgolly.reactPose.posedMod.Posed
import typingsJapgolly.reactPose.transitionTypesMod.Props
import typingsJapgolly.reactPose.transitionTypesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class PoseGroup ()
    extends typingsJapgolly.reactPose.poseGroupMod.default
  
  @js.native
  class Transition ()
    extends typingsJapgolly.reactPose.transitionMod.default
  
  val default: Posed = js.native
  /* static members */
  @js.native
  object PoseGroup extends js.Object {
    var defaultProps: AnonFlipMove = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    var defaultProps: AnonEnterAfterExit = js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialState = js.native
  }
  
}

