package typingsJapgolly.reactAlbus

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactAlbus.mod.WizardContext
import typingsJapgolly.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends WizardContextRenderProps {
  def children(wizard: WizardContext): Node
}

object AnonChildren {
  @scala.inline
  def apply(children: WizardContext => CallbackTo[Node]): AnonChildren = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactAlbus.mod.WizardContext) => children(t0).runNow()))
    __obj.asInstanceOf[AnonChildren]
  }
}

