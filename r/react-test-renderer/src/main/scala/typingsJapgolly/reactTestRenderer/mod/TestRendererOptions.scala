package typingsJapgolly.reactTestRenderer.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRendererOptions extends js.Object {
  def createNodeMock(element: Element): js.Any
}

object TestRendererOptions {
  @scala.inline
  def apply(createNodeMock: Element => CallbackTo[js.Any]): TestRendererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createNodeMock")(js.Any.fromFunction1((t0: japgolly.scalajs.react.raw.React.Element) => createNodeMock(t0).runNow()))
    __obj.asInstanceOf[TestRendererOptions]
  }
}

