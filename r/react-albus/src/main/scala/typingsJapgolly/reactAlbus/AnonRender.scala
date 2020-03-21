package typingsJapgolly.reactAlbus

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactAlbus.mod.WizardContext
import typingsJapgolly.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRender extends WizardContextRenderProps {
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, Node]] = js.undefined
}

object AnonRender {
  @scala.inline
  def apply(render: /* wizard */ WizardContext => CallbackTo[Node] = null): AnonRender = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* wizard */ typingsJapgolly.reactAlbus.mod.WizardContext) => render(t0).runNow()))
    __obj.asInstanceOf[AnonRender]
  }
}

