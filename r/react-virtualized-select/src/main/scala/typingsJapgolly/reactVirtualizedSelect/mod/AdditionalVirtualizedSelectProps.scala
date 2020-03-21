package typingsJapgolly.reactVirtualizedSelect.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactVirtualizedSelect.AnonOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalVirtualizedSelectProps[TValue] extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ AnonOption[TValue], Double])] = js.undefined
  var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], Element]] = js.undefined
  var selectComponent: js.UndefOr[ComponentClassP[js.Object] | StatelessComponent[_]] = js.undefined
}

object AdditionalVirtualizedSelectProps {
  @scala.inline
  def apply[TValue](
    maxHeight: Int | Double = null,
    optionHeight: Double | (js.Function1[/* options */ AnonOption[TValue], Double]) = null,
    optionRenderer: /* options */ VirtualizedOptionRenderOptions[TValue] => CallbackTo[Element] = null,
    selectComponent: ComponentClassP[js.Object] | StatelessComponent[_] = null
  ): AdditionalVirtualizedSelectProps[TValue] = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (optionHeight != null) __obj.updateDynamic("optionHeight")(optionHeight.asInstanceOf[js.Any])
    if (optionRenderer != null) __obj.updateDynamic("optionRenderer")(js.Any.fromFunction1((t0: /* options */ typingsJapgolly.reactVirtualizedSelect.mod.VirtualizedOptionRenderOptions[TValue]) => optionRenderer(t0).runNow()))
    if (selectComponent != null) __obj.updateDynamic("selectComponent")(selectComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
  }
}

