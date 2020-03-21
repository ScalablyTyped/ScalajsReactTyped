package typingsJapgolly.blueprintjsCore.inputGroupMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.propsMod.IControlledProps
import typingsJapgolly.blueprintjsCore.propsMod.IIntentProps
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsCore.propsMod.MaybeElement
import typingsJapgolly.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputGroupProps
  extends IControlledProps
     with IIntentProps
     with IProps {
  /**
    * Whether the input is non-interactive.
    * Note that `rightElement` must be disabled separately; this prop will not affect it.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the component should take up the full width of its container.
    */
  var fill: js.UndefOr[Boolean] = js.undefined
  /** Ref handler that receives HTML `<input>` element backing this component. */
  var inputRef: js.UndefOr[js.Function1[/* ref */ HTMLInputElement | Null, _]] = js.undefined
  /** Whether this input should use large styles. */
  var large: js.UndefOr[Boolean] = js.undefined
  /**
    * Name of a Blueprint UI icon (or an icon element) to render on the left side of the input group,
    * before the user's cursor.
    */
  var leftIcon: js.UndefOr[IconName | MaybeElement] = js.undefined
  /** Placeholder text in the absence of any value. */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Element to render on right side of input.
    * For best results, use a minimal button, tag, or small spinner.
    */
  var rightElement: js.UndefOr[Element] = js.undefined
  /** Whether the input (and any buttons) should appear with rounded caps. */
  var round: js.UndefOr[Boolean] = js.undefined
  /** Whether this input should use small styles. */
  var small: js.UndefOr[Boolean] = js.undefined
  /**
    * HTML `input` type attribute.
    * @default "text"
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IInputGroupProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    inputRef: /* ref */ HTMLInputElement | Null => CallbackTo[js.Any] = null,
    intent: Intent = null,
    large: js.UndefOr[Boolean] = js.undefined,
    leftIcon: IconName | MaybeElement = null,
    onChange: ReactEventFrom[HTMLElement] => Callback = null,
    placeholder: String = null,
    rightElement: VdomElement = null,
    round: js.UndefOr[Boolean] = js.undefined,
    small: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    value: String = null
  ): IInputGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(js.Any.fromFunction1((t0: /* ref */ org.scalajs.dom.raw.HTMLInputElement | scala.Null) => inputRef(t0).runNow()))
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onChange(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (rightElement != null) __obj.updateDynamic("rightElement")(rightElement.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (!js.isUndefined(small)) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputGroupProps]
  }
}

