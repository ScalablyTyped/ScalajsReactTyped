package typingsJapgolly.reactAddonsTestUtils.mod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CElement
import typingsJapgolly.react.mod.DOMElement
import typingsJapgolly.react.mod.ReactElement
import typingsJapgolly.react.mod.SFCElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-addons-test-utils", "renderIntoDocument")
@js.native
object renderIntoDocument extends js.Object {
  def apply(element: SFCElement[_]): Unit = js.native
  def apply[T /* <: Component[js.Object, js.Object] */](element: CElement[_, T]): T = js.native
  def apply[T /* <: Element */](element: DOMElement[_, T]): T = js.native
  def apply[P](element: ReactElement): (Component[P with js.Object, js.Object]) | Element | Unit = js.native
}

