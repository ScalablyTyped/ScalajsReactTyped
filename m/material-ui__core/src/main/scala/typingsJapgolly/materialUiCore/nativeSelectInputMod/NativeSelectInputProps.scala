package typingsJapgolly.materialUiCore.nativeSelectInputMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLSelectElement
import typingsJapgolly.materialUiCore.AnonNode
import typingsJapgolly.materialUiCore.materialUiCoreStrings.filled
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.standard
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeSelectInputProps extends js.Object {
  var IconComponent: js.UndefOr[ReactType[_]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLSelectElement | AnonNode, Unit]] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[
    js.Function2[/* event */ ReactEventFrom[HTMLSelectElement], /* child */ Node, Unit]
  ] = js.native
  var value: js.UndefOr[(js.Array[String | Double | Boolean]) | String | Double | Boolean] = js.native
  var variant: js.UndefOr[standard | outlined | filled] = js.native
}

object NativeSelectInputProps {
  @scala.inline
  def apply(
    IconComponent: ReactType[_] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLSelectElement | AnonNode => Callback = null,
    name: String = null,
    onChange: (/* event */ ReactEventFrom[HTMLSelectElement], /* child */ Node) => Callback = null,
    value: (js.Array[String | Double | Boolean]) | String | Double | Boolean = null,
    variant: standard | outlined | filled = null
  ): NativeSelectInputProps = {
    val __obj = js.Dynamic.literal()
    if (IconComponent != null) __obj.updateDynamic("IconComponent")(IconComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLSelectElement | typingsJapgolly.materialUiCore.AnonNode) => inputRef(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLSelectElement], t1: /* child */ japgolly.scalajs.react.raw.React.Node) => onChange(t0, t1).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeSelectInputProps]
  }
}

