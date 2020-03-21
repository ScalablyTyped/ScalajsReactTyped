package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typingsJapgolly.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SwatchColorPicker", JSImport.Namespace)
@js.native
object libSwatchColorPickerMod extends js.Object {
  @js.native
  class ColorPickerGridCellBase ()
    extends typingsJapgolly.officeUiFabricReact.swatchColorPickerMod.ColorPickerGridCellBase
  
  @js.native
  class SwatchColorPickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.swatchColorPickerMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  
  val ColorPickerGridCell: FunctionComponent[IColorPickerGridCellProps] = js.native
  val SwatchColorPicker: FunctionComponent[ISwatchColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    var defaultProps: PartialIColorPickerGridCe = js.native
  }
  
  /* static members */
  @js.native
  object SwatchColorPickerBase extends js.Object {
    var defaultProps: ISwatchColorPickerProps = js.native
  }
  
}

