package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ColorPicker", JSImport.Namespace)
@js.native
object colorPickerMod extends js.Object {
  @js.native
  class ColorPickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.colorPickerBaseMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  
  val ColorPicker: FunctionComponent[IColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerBase extends js.Object {
    var defaultProps: PartialIColorPickerProps = js.native
  }
  
}

