package typingsJapgolly.emojiMart

import typingsJapgolly.emojiMart.categoryMod.Props
import typingsJapgolly.emojiMart.nimblePickerMod.NimblePickerProps
import typingsJapgolly.emojiMart.sharedPropsMod.PickerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("emoji-mart/dist-es/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  @js.native
  class Category ()
    extends Component[Props, js.Object, js.Any]
  
  @js.native
  class NimblePicker ()
    extends Component[NimblePickerProps, js.Object, js.Any]
  
  @js.native
  class Picker ()
    extends Component[PickerProps, js.Object, js.Any]
  
}

