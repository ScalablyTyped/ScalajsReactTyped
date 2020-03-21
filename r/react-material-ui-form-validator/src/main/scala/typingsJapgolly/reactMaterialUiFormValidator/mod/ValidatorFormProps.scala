package typingsJapgolly.reactMaterialUiFormValidator.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorFormProps
  extends /* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var debounceTime: js.UndefOr[Double] = js.undefined
  var instantValidate: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], Unit]] = js.undefined
  def onSubmit(event: ReactEventFrom[Element]): Unit
}

object ValidatorFormProps {
  @scala.inline
  def apply(
    onSubmit: ReactEventFrom[Element] => Callback,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    className: String = null,
    debounceTime: Int | Double = null,
    instantValidate: js.UndefOr[Boolean] = js.undefined,
    onError: /* errors */ js.Array[js.Any] => Callback = null
  ): ValidatorFormProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => onSubmit(t0).runNow()))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (debounceTime != null) __obj.updateDynamic("debounceTime")(debounceTime.asInstanceOf[js.Any])
    if (!js.isUndefined(instantValidate)) __obj.updateDynamic("instantValidate")(instantValidate.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* errors */ js.Array[js.Any]) => onError(t0).runNow()))
    __obj.asInstanceOf[ValidatorFormProps]
  }
}

