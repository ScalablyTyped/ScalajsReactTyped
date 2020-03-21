package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaUrls extends js.Object {
  def getFullMediaUrl(): String
  def getPreviewMediaUrl(): String
  def getShrunkenMediaUrl(): String
  def getVideoThumbnailMediaUrl(): String
}

object MediaUrls {
  @scala.inline
  def apply(
    getFullMediaUrl: CallbackTo[String],
    getPreviewMediaUrl: CallbackTo[String],
    getShrunkenMediaUrl: CallbackTo[String],
    getVideoThumbnailMediaUrl: CallbackTo[String]
  ): MediaUrls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFullMediaUrl")(getFullMediaUrl.toJsFn)
    __obj.updateDynamic("getPreviewMediaUrl")(getPreviewMediaUrl.toJsFn)
    __obj.updateDynamic("getShrunkenMediaUrl")(getShrunkenMediaUrl.toJsFn)
    __obj.updateDynamic("getVideoThumbnailMediaUrl")(getVideoThumbnailMediaUrl.toJsFn)
    __obj.asInstanceOf[MediaUrls]
  }
}

