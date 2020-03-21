package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/ColorPicker", JSImport.Namespace)
@js.native
object libColorPickerMod extends js.Object {
  @js.native
  class ColorPickerBase protected ()
    extends typingsJapgolly.officeUiFabricReact.colorPickerMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  
  val ColorPicker: FunctionComponent[IColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerBase extends js.Object {
    var defaultProps: PartialIColorPickerProps = js.native
  }
  
}

