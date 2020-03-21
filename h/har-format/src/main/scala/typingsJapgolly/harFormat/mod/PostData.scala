package typingsJapgolly.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostData extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  /** Mime type of posted data. */
  var mimeType: String
  /**
    * List of posted parameters (in case of URL encoded parameters).
    *
    * _`text` and `params` fields are mutually exclusive._
    */
  var params: js.Array[Param]
  /**
    * Plain text posted data
    *
    * _`params` and `text` fields are mutually exclusive._
    */
  var text: String
}

object PostData {
  @scala.inline
  def apply(mimeType: String, params: js.Array[Param], text: String, comment: String = null): PostData = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostData]
  }
}

