package typingsJapgolly.antDesignPro.loginItemMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginItemProps extends js.Object {
  var buttonText: js.UndefOr[Node] = js.undefined
  var countDown: js.UndefOr[Double] = js.undefined
  var customprops: js.UndefOr[js.Any] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any
  var getCaptchaButtonText: js.UndefOr[String] = js.undefined
  var getCaptchaSecondText: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onGetCaptcha: js.UndefOr[js.Function1[/* event */ js.UndefOr[MouseEvent], Unit]] = js.undefined
  var onPressEnter: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var rules: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: String
  def updateActive(activeItem: js.Any): Unit
}

object LoginItemProps {
  @scala.inline
  def apply(
    form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
    `type`: String,
    updateActive: js.Any => Callback,
    buttonText: VdomNode = null,
    countDown: Int | Double = null,
    customprops: js.Any = null,
    defaultValue: String = null,
    getCaptchaButtonText: String = null,
    getCaptchaSecondText: String = null,
    name: String = null,
    onChange: /* e */ js.Any => Callback = null,
    onGetCaptcha: /* event */ js.UndefOr[MouseEvent] => Callback = null,
    onPressEnter: /* e */ js.Any => Callback = null,
    placeholder: String = null,
    rules: js.Array[_] = null,
    style: CSSProperties = null
  ): LoginItemProps = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("updateActive")(js.Any.fromFunction1((t0: js.Any) => updateActive(t0).runNow()))
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.rawNode.asInstanceOf[js.Any])
    if (countDown != null) __obj.updateDynamic("countDown")(countDown.asInstanceOf[js.Any])
    if (customprops != null) __obj.updateDynamic("customprops")(customprops.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (getCaptchaButtonText != null) __obj.updateDynamic("getCaptchaButtonText")(getCaptchaButtonText.asInstanceOf[js.Any])
    if (getCaptchaSecondText != null) __obj.updateDynamic("getCaptchaSecondText")(getCaptchaSecondText.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ js.Any) => onChange(t0).runNow()))
    if (onGetCaptcha != null) __obj.updateDynamic("onGetCaptcha")(js.Any.fromFunction1((t0: /* event */ js.UndefOr[org.scalajs.dom.raw.MouseEvent]) => onGetCaptcha(t0).runNow()))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1((t0: /* e */ js.Any) => onPressEnter(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginItemProps]
  }
}

