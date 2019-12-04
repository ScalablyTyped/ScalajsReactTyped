package typingsJapgolly.antd

import typingsJapgolly.antd.libTableInterfaceMod.SelectionBoxProps
import typingsJapgolly.antd.libTableInterfaceMod.SelectionBoxState
import typingsJapgolly.antd.libTableSelectionBoxMod.SelectionBox
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table/SelectionBox", JSImport.Namespace)
@js.native
object libTableSelectionBoxMod extends js.Object {
  @js.native
  trait SelectionBox
    extends Component[SelectionBoxProps, SelectionBoxState, js.Any] {
    @JSName("componentDidMount")
    def componentDidMount_MSelectionBox(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSelectionBox(): Unit = js.native
    def getCheckState(props: SelectionBoxProps): Boolean = js.native
    def subscribe(): Unit = js.native
    def unsubscribe(): Unit = js.native
  }
  
  @js.native
  class default protected () extends SelectionBox {
    def this(props: SelectionBoxProps) = this()
  }
  
}

