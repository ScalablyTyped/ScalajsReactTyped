package typingsJapgolly.reactTestRenderer.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-test-renderer", "create")
@js.native
object create extends js.Object {
  def apply(nextElement: Element): ReactTestRenderer = js.native
  def apply(nextElement: Element, options: TestRendererOptions): ReactTestRenderer = js.native
}

