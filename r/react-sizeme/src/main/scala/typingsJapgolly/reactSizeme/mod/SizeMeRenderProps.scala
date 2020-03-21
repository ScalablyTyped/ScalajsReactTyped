package typingsJapgolly.reactSizeme.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactSizeme.reactSizemeStrings.debounce
import typingsJapgolly.reactSizeme.reactSizemeStrings.throttle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeMeRenderProps extends SizeMeOptions {
  def children(props: SizeMeProps): Element
}

object SizeMeRenderProps {
  @scala.inline
  def apply(
    children: SizeMeProps => CallbackTo[Element],
    monitorHeight: js.UndefOr[Boolean] = js.undefined,
    monitorPosition: js.UndefOr[Boolean] = js.undefined,
    monitorWidth: js.UndefOr[Boolean] = js.undefined,
    noPlaceholder: js.UndefOr[Boolean] = js.undefined,
    refreshMode: throttle | debounce = null,
    refreshRate: Int | Double = null
  ): SizeMeRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactSizeme.mod.SizeMeProps) => children(t0).runNow()))
    if (!js.isUndefined(monitorHeight)) __obj.updateDynamic("monitorHeight")(monitorHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorPosition)) __obj.updateDynamic("monitorPosition")(monitorPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(monitorWidth)) __obj.updateDynamic("monitorWidth")(monitorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlaceholder)) __obj.updateDynamic("noPlaceholder")(noPlaceholder.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeMeRenderProps]
  }
}

