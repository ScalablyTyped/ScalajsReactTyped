package typingsJapgolly.exceljs.mod

import typingsJapgolly.exceljs.exceljsStrings.gif
import typingsJapgolly.exceljs.exceljsStrings.jpeg
import typingsJapgolly.exceljs.exceljsStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var base64: js.UndefOr[String] = js.undefined
  var buffer: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  var extension: jpeg | png | gif
  var filename: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    extension: jpeg | png | gif,
    base64: String = null,
    buffer: scala.scalajs.js.typedarray.ArrayBuffer = null,
    filename: String = null
  ): Image = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
    if (base64 != null) __obj.updateDynamic("base64")(base64.asInstanceOf[js.Any])
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

