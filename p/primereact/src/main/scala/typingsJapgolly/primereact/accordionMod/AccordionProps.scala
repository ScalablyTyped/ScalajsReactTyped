package typingsJapgolly.primereact.accordionMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.primereact.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var activeIndex: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* e */ AnonIndex, Unit]] = js.undefined
  var onTabClose: js.UndefOr[js.Function1[/* e */ AnonIndex, Unit]] = js.undefined
  var onTabOpen: js.UndefOr[js.Function1[/* e */ AnonIndex, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    activeIndex: js.Any = null,
    className: String = null,
    id: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onTabChange: /* e */ AnonIndex => Callback = null,
    onTabClose: /* e */ AnonIndex => Callback = null,
    onTabOpen: /* e */ AnonIndex => Callback = null,
    style: js.Object = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndex) => onTabChange(t0).runNow()))
    if (onTabClose != null) __obj.updateDynamic("onTabClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndex) => onTabClose(t0).runNow()))
    if (onTabOpen != null) __obj.updateDynamic("onTabOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonIndex) => onTabOpen(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
}

