package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  def getDimensions(): MediaDimensions
  def getFileSize(): Double
  def getId(): Double
  def getMimeType(): String
  def getName(): String
  def getReferenceId(): String
  def getSourceUrl(): String
  def getType(): MediaType
  def getUrls(): MediaUrls
  def getYouTubeVideoId(): String | Unit
}

object Media {
  @scala.inline
  def apply(
    getDimensions: CallbackTo[MediaDimensions],
    getFileSize: CallbackTo[Double],
    getId: CallbackTo[Double],
    getMimeType: CallbackTo[String],
    getName: CallbackTo[String],
    getReferenceId: CallbackTo[String],
    getSourceUrl: CallbackTo[String],
    getType: CallbackTo[MediaType],
    getUrls: CallbackTo[MediaUrls],
    getYouTubeVideoId: CallbackTo[String | Unit]
  ): Media = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDimensions")(getDimensions.toJsFn)
    __obj.updateDynamic("getFileSize")(getFileSize.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getMimeType")(getMimeType.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getReferenceId")(getReferenceId.toJsFn)
    __obj.updateDynamic("getSourceUrl")(getSourceUrl.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.updateDynamic("getUrls")(getUrls.toJsFn)
    __obj.updateDynamic("getYouTubeVideoId")(getYouTubeVideoId.toJsFn)
    __obj.asInstanceOf[Media]
  }
}

