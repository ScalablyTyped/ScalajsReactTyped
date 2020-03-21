package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.basePickerMod.BasePicker
import typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsJapgolly.officeUiFabricReact.tagPickerTypesMod.ITagPickerProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker", JSImport.Namespace)
@js.native
object tagPickerMod extends js.Object {
  @js.native
  class TagPickerBase () extends BasePicker[ITag, ITagPickerProps]
  
  val TagPicker: FunctionComponent[ITagPickerProps] = js.native
  /* static members */
  @js.native
  object TagPickerBase extends js.Object {
    var defaultProps: AnonOnRenderItem = js.native
  }
  
}

