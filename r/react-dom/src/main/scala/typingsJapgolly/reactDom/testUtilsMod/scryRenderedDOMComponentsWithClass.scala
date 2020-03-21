package typingsJapgolly.reactDom.testUtilsMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "scryRenderedDOMComponentsWithClass")
@js.native
object scryRenderedDOMComponentsWithClass extends js.Object {
  def apply(root: Component[js.Object, js.Object], className: String): js.Array[Element] = js.native
}

