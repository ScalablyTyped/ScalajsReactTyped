package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataCardCommentHistoryItem extends js.Object {
  def GetCommentAuthor(): String
  def GetCommentText(): String
  def GetCommentTimestamp(): js.Any
  def GetCommentVersion(): Double
}

object IMetadataCardCommentHistoryItem {
  @scala.inline
  def apply(
    GetCommentAuthor: CallbackTo[String],
    GetCommentText: CallbackTo[String],
    GetCommentTimestamp: CallbackTo[js.Any],
    GetCommentVersion: CallbackTo[Double]
  ): IMetadataCardCommentHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetCommentAuthor")(GetCommentAuthor.toJsFn)
    __obj.updateDynamic("GetCommentText")(GetCommentText.toJsFn)
    __obj.updateDynamic("GetCommentTimestamp")(GetCommentTimestamp.toJsFn)
    __obj.updateDynamic("GetCommentVersion")(GetCommentVersion.toJsFn)
    __obj.asInstanceOf[IMetadataCardCommentHistoryItem]
  }
}

