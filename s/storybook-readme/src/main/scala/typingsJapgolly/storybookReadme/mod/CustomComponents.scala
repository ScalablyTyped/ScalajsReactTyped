package typingsJapgolly.storybookReadme.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.storybookReadme.AnonChildrenElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomComponents extends js.Object {
  var FooterComponent: js.UndefOr[js.Function1[/* props */ AnonChildrenElement, Element]] = js.undefined
  var PreviewComponent: js.UndefOr[js.Function1[/* props */ AnonChildrenElement, Element]] = js.undefined
}

object CustomComponents {
  @scala.inline
  def apply(
    FooterComponent: /* props */ AnonChildrenElement => CallbackTo[Element] = null,
    PreviewComponent: /* props */ AnonChildrenElement => CallbackTo[Element] = null
  ): CustomComponents = {
    val __obj = js.Dynamic.literal()
    if (FooterComponent != null) __obj.updateDynamic("FooterComponent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.storybookReadme.AnonChildrenElement) => FooterComponent(t0).runNow()))
    if (PreviewComponent != null) __obj.updateDynamic("PreviewComponent")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.storybookReadme.AnonChildrenElement) => PreviewComponent(t0).runNow()))
    __obj.asInstanceOf[CustomComponents]
  }
}

