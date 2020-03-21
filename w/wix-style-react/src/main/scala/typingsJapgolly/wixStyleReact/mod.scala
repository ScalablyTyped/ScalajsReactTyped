package typingsJapgolly.wixStyleReact

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.SFC
import typingsJapgolly.wixStyleReact.baseComponentsMod.WixComponentProps
import typingsJapgolly.wixStyleReact.buttonMod.ButtonProps
import typingsJapgolly.wixStyleReact.loaderMod.LoaderProps
import typingsJapgolly.wixStyleReact.textMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wix-style-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Button ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  @js.native
  class Loader ()
    extends Component[LoaderProps, js.Object, js.Any]
  
  @js.native
  class WixComponent[T /* <: WixComponentProps */] ()
    extends Component[T, js.Object, js.Any]
  
  val Text: SFC[TextProps] = js.native
}

