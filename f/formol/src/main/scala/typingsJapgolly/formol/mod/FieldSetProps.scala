package typingsJapgolly.formol.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSetProps[V] extends js.Object {
  var choices: js.UndefOr[js.Array[_]] = js.undefined
  var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined
  var elementRef: js.UndefOr[Ref] = js.undefined
  var isChecked: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[V] = js.undefined
}

object FieldSetProps {
  @scala.inline
  def apply[V](
    choices: js.Array[_] = null,
    dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined,
    elementRef: Ref = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    `type`: String = null,
    value: V = null
  ): FieldSetProps[V] = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousRawHTMLLabels)) __obj.updateDynamic("dangerousRawHTMLLabels")(dangerousRawHTMLLabels.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(elementRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    onChange.foreach(p => __obj.updateDynamic("onChange")(p.toJsFn))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSetProps[V]]
  }
}

