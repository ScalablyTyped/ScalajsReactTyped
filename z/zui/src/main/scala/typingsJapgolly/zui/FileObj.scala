package typingsJapgolly.zui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileObj extends js.Object {
  var ext: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isImage: js.UndefOr[Boolean] = js.undefined
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  var loaded: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var origSize: js.UndefOr[Double] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var previewImage: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[STATUS] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  def destroy(): Unit
  def getNative(): File
}

object FileObj {
  @scala.inline
  def apply(
    destroy: Callback,
    getNative: CallbackTo[File],
    ext: String = null,
    id: String = null,
    isImage: js.UndefOr[Boolean] = js.undefined,
    lastModifiedDate: js.Date = null,
    loaded: Int | Double = null,
    name: String = null,
    origSize: Int | Double = null,
    percent: Int | Double = null,
    previewImage: String = null,
    size: Int | Double = null,
    status: STATUS = null,
    `type`: String = null
  ): FileObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getNative")(getNative.toJsFn)
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isImage)) __obj.updateDynamic("isImage")(isImage.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (origSize != null) __obj.updateDynamic("origSize")(origSize.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (previewImage != null) __obj.updateDynamic("previewImage")(previewImage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileObj]
  }
}

