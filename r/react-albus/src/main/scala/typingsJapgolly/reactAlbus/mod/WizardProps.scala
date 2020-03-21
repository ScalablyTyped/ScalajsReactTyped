package typingsJapgolly.reactAlbus.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WizardProps extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var history: js.UndefOr[History[LocationState]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, Node]] = js.undefined
}

object WizardProps {
  @scala.inline
  def apply(
    basename: String = null,
    history: History[LocationState] = null,
    onNext: /* wizard */ WizardContext => Callback = null,
    render: /* wizard */ WizardContext => CallbackTo[Node] = null
  ): WizardProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: /* wizard */ typingsJapgolly.reactAlbus.mod.WizardContext) => onNext(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* wizard */ typingsJapgolly.reactAlbus.mod.WizardContext) => render(t0).runNow()))
    __obj.asInstanceOf[WizardProps]
  }
}

