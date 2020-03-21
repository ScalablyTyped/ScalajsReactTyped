package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDimensions extends js.Object {
  def getFullMediaDimensions(): Dimensions
  def getPreviewMediaDimensions(): Dimensions
  def getShrunkenMediaDimensions(): Dimensions
  def getVideoThumbnailDimensions(): Dimensions
}

object MediaDimensions {
  @scala.inline
  def apply(
    getFullMediaDimensions: CallbackTo[Dimensions],
    getPreviewMediaDimensions: CallbackTo[Dimensions],
    getShrunkenMediaDimensions: CallbackTo[Dimensions],
    getVideoThumbnailDimensions: CallbackTo[Dimensions]
  ): MediaDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFullMediaDimensions")(getFullMediaDimensions.toJsFn)
    __obj.updateDynamic("getPreviewMediaDimensions")(getPreviewMediaDimensions.toJsFn)
    __obj.updateDynamic("getShrunkenMediaDimensions")(getShrunkenMediaDimensions.toJsFn)
    __obj.updateDynamic("getVideoThumbnailDimensions")(getVideoThumbnailDimensions.toJsFn)
    __obj.asInstanceOf[MediaDimensions]
  }
}

