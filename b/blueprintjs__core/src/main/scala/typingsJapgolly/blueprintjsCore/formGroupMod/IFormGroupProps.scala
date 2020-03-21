package typingsJapgolly.blueprintjsCore.formGroupMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.propsMod.IIntentProps
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormGroupProps
  extends IIntentProps
     with IProps {
  /**
    * A space-delimited list of class names to pass along to the
    * `Classes.FORM_CONTENT` element that contains `children`.
    */
  var contentClassName: js.UndefOr[String] = js.undefined
  /**
    * Whether form group should appear as non-interactive.
    * Remember that `input` elements must be disabled separately.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional helper text. The given content will be wrapped in
    * `Classes.FORM_HELPER_TEXT` and displayed beneath `children`.
    * Helper text color is determined by the `intent`.
    */
  var helperText: js.UndefOr[Node] = js.undefined
  /** Whether to render the label and children on a single line. */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /** Label of this form group. */
  var label: js.UndefOr[Node] = js.undefined
  /**
    * `id` attribute of the labelable form element that this `FormGroup` controls,
    * used as `<label for>` attribute.
    */
  var labelFor: js.UndefOr[String] = js.undefined
  /**
    * Optional secondary text that appears after the label.
    */
  var labelInfo: js.UndefOr[Node] = js.undefined
  /** CSS properties to apply to the root element. */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object IFormGroupProps {
  @scala.inline
  def apply(
    className: String = null,
    contentClassName: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    helperText: VdomNode = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    label: VdomNode = null,
    labelFor: String = null,
    labelInfo: VdomNode = null,
    style: CSSProperties = null
  ): IFormGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (helperText != null) __obj.updateDynamic("helperText")(helperText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (labelFor != null) __obj.updateDynamic("labelFor")(labelFor.asInstanceOf[js.Any])
    if (labelInfo != null) __obj.updateDynamic("labelInfo")(labelInfo.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormGroupProps]
  }
}

