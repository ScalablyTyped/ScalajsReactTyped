package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SelectableOption", JSImport.Namespace)
@js.native
object libSelectableOptionMod extends js.Object {
  def getAllSelectedOptions(options: js.Array[ISelectableOption], selectedIndices: js.Array[Double]): js.Array[ISelectableOption] = js.native
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

