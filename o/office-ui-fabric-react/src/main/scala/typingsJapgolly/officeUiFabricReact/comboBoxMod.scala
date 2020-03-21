package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.comboBoxTypesMod.IComboBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ComboBox", JSImport.Namespace)
@js.native
object comboBoxMod extends js.Object {
  @js.native
  class ComboBox protected ()
    extends typingsJapgolly.officeUiFabricReact.comboBoxComboBoxMod.ComboBox {
    def this(props: IComboBoxProps) = this()
  }
  
  @js.native
  class VirtualizedComboBox ()
    extends typingsJapgolly.officeUiFabricReact.virtualizedComboBoxMod.VirtualizedComboBox
  
  /* static members */
  @js.native
  object ComboBox extends js.Object {
    var defaultProps: IComboBoxProps = js.native
  }
  
  @js.native
  object SelectableOptionMenuItemType extends js.Object {
    /* 1 */ val Divider: typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType with Double
      ] = js.native
  }
  
}

