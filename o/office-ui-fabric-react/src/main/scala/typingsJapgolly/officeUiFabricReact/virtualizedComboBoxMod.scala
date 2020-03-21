package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBox
import typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox/VirtualizedComboBox", JSImport.Namespace)
@js.native
object virtualizedComboBoxMod extends js.Object {
  @js.native
  class VirtualizedComboBox ()
    extends BaseComponent[IComboBoxProps, js.Object]
       with IComboBox {
    /** The combo box element */
    var _comboBox: js.Any = js.native
    /** The virtualized list element */
    var _list: js.Any = js.native
    /* protected */ def _onRenderList(props: IComboBoxProps): Element = js.native
    /* protected */ def _onScrollToItem(itemIndex: Double): Unit = js.native
  }
  
}

