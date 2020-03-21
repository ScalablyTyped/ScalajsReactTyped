package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.attributedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSAttributedString extends js.Object {
  var _class: attributedString
  var archivedAttributedString: js.UndefOr[AnonArchive] = js.undefined
  var attributes: js.Array[SketchMSStringAttribute]
  var string: String
}

object SketchMSAttributedString {
  @scala.inline
  def apply(
    _class: attributedString,
    attributes: js.Array[SketchMSStringAttribute],
    string: String,
    archivedAttributedString: AnonArchive = null
  ): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    if (archivedAttributedString != null) __obj.updateDynamic("archivedAttributedString")(archivedAttributedString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSAttributedString]
  }
}

