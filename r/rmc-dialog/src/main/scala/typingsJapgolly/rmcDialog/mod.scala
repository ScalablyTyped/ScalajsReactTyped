package typingsJapgolly.rmcDialog

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.rmcDialog.idialogproptypesMod.IDialogPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rmc-dialog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait DialogWrap
    extends Component[IDialogPropTypes, js.Any, js.Any] {
    var _component: js.Any = js.native
    var container: js.Any = js.native
    @JSName("componentDidMount")
    def componentDidMount_MDialogWrap(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDialogWrap(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDialogWrap(): Unit = js.native
    def getComponent(visible: js.Any): Element = js.native
    def getContainer(): js.Any = js.native
    def removeContainer(): Unit = js.native
    def renderDialog(visible: js.Any): Unit = js.native
    def saveRef(node: js.Any): Unit = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MDialogWrap(hasVisible: AnonVisible): Boolean = js.native
  }
  
  @js.native
  class default () extends DialogWrap
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonOnClose = js.native
  }
  
}

