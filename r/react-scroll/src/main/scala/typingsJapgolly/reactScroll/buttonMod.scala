package typingsJapgolly.reactScroll

import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactScroll.linkMod.ReactScrollLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-scroll/modules/components/Button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class default ()
    extends Component[ButtonProps, js.Object, js.Any]
  
  type Button = japgolly.scalajs.react.raw.React.Component[ButtonProps with js.Object, js.Object]
  type ButtonProps = ReactScrollLinkProps with HTMLProps[HTMLButtonElement]
}

