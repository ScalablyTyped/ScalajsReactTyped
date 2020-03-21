package typingsJapgolly.reactAlbus.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactAlbus.AnonRender
  - typingsJapgolly.reactAlbus.AnonChildren
*/
trait WizardContextRenderProps extends js.Object

object WizardContextRenderProps {
  @scala.inline
  def AnonRender(render: /* wizard */ WizardContext => CallbackTo[Node] = null): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* wizard */ typingsJapgolly.reactAlbus.mod.WizardContext) => render(t0).runNow()))
    __obj.asInstanceOf[WizardContextRenderProps]
  }
  @scala.inline
  def AnonChildren(children: WizardContext => CallbackTo[Node]): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactAlbus.mod.WizardContext) => children(t0).runNow()))
    __obj.asInstanceOf[WizardContextRenderProps]
  }
}

