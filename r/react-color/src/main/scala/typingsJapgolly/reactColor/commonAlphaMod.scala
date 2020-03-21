package typingsJapgolly.reactColor

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactColor.mod.CustomPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/Alpha", JSImport.Namespace)
@js.native
object commonAlphaMod extends js.Object {
  @js.native
  trait Alpha
    extends Component[AlphaProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[AlphaProps, js.Object, js.Any]
  
  type AlphaProps = CustomPickerProps[Alpha]
}

