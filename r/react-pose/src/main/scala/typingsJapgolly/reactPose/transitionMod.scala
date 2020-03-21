package typingsJapgolly.reactPose

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactPose.transitionTypesMod.Props
import typingsJapgolly.reactPose.transitionTypesMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pose/lib/components/Transition", JSImport.Namespace)
@js.native
object transitionMod extends js.Object {
  @js.native
  trait Transition
    extends Component[Props, State, js.Any] {
    def removeChild(key: String): Unit = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTransition(nextProps: Props, nextState: State): Boolean = js.native
  }
  
  @js.native
  class default () extends Transition
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonEnterAfterExit = js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialState = js.native
  }
  
}

