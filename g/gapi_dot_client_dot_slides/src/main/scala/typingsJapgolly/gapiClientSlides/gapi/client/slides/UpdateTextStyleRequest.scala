package typingsJapgolly.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTextStyleRequest extends js.Object {
  /**
    * The location of the cell in the table containing the text to style. If
    * `object_id` refers to a table, `cell_location` must have a value.
    * Otherwise, it must not.
    */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  /**
    * The fields that should be updated.
    *
    * At least one field must be specified. The root `style` is implied and
    * should not be specified. A single `"&#42;"` can be used as short-hand for
    * listing every field.
    *
    * For example, to update the text style to bold, set `fields` to `"bold"`.
    *
    * To reset a property to its default value, include its field name in the
    * field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  /** The object ID of the shape or table with the text to be styled. */
  var objectId: js.UndefOr[String] = js.undefined
  /**
    * The style(s) to set on the text.
    *
    * If the value for a particular style matches that of the parent, that style
    * will be set to inherit.
    *
    * Certain text style changes may cause other changes meant to mirror the
    * behavior of the Slides editor. See the documentation of
    * TextStyle for more information.
    */
  var style: js.UndefOr[TextStyle] = js.undefined
  /**
    * The range of text to style.
    *
    * The range may be extended to include adjacent newlines.
    *
    * If the range fully contains a paragraph belonging to a list, the
    * paragraph's bullet is also updated with the matching text style.
    */
  var textRange: js.UndefOr[Range] = js.undefined
}

object UpdateTextStyleRequest {
  @scala.inline
  def apply(
    cellLocation: TableCellLocation = null,
    fields: String = null,
    objectId: String = null,
    style: TextStyle = null,
    textRange: Range = null
  ): UpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    if (cellLocation != null) __obj.updateDynamic("cellLocation")(cellLocation.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textRange != null) __obj.updateDynamic("textRange")(textRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTextStyleRequest]
  }
}

