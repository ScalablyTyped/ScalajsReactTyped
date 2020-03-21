package typingsJapgolly.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Body object, for use in "body.set({ ... })". */
trait BodyUpdateData extends js.Object {
  /**
    *
    * Gets the text format of the body. Use this to get and set font name, size, color and other properties.
    *
    * [Api set: WordApi 1.1]
    */
  var font: js.UndefOr[FontUpdateData] = js.undefined
  /**
    *
    * Gets or sets the style name for the body. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets or sets the built-in style name for the body. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any
  ] = js.undefined
}

object BodyUpdateData {
  @scala.inline
  def apply(
    font: FontUpdateData = null,
    style: String = null,
    styleBuiltIn: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 150 */ js.Any = null
  ): BodyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styleBuiltIn != null) __obj.updateDynamic("styleBuiltIn")(styleBuiltIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyUpdateData]
  }
}

