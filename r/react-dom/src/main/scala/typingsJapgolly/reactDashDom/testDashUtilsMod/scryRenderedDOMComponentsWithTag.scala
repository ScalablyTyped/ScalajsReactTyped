package typingsJapgolly.reactDashDom.testDashUtilsMod

import japgolly.scalajs.react.raw.React.Component
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "scryRenderedDOMComponentsWithTag")
@js.native
object scryRenderedDOMComponentsWithTag extends js.Object {
  def apply(root: Component[js.Object, js.Object], tagName: String): js.Array[Element] = js.native
}

