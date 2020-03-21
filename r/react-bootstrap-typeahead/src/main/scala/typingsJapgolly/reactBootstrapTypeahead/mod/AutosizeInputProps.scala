package typingsJapgolly.reactBootstrapTypeahead.mod

import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.PickCSSPropertiesboxSizin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react.react.InputHTMLAttributes<'input'>, 'className' | 'style'> */
trait AutosizeInputProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var inputRef: js.UndefOr[LegacyRef[HTMLInputElement]] = js.undefined
  var inputStyle: js.UndefOr[PickCSSPropertiesboxSizin] = js.undefined
  var style: CSSProperties
}

object AutosizeInputProps {
  @scala.inline
  def apply(
    style: CSSProperties,
    className: String = null,
    inputClassName: String = null,
    inputRef: LegacyRef[HTMLInputElement] = null,
    inputStyle: PickCSSPropertiesboxSizin = null
  ): AutosizeInputProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosizeInputProps]
  }
}

