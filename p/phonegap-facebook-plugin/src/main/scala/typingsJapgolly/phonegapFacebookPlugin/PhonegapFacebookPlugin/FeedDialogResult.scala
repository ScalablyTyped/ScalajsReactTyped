package typingsJapgolly.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response object returned from a success callback for showDialog() of type 'feed'.
  */
trait FeedDialogResult extends BaseDialogResult {
  /**
    * The ID of the posted story, if the person chose to publish.
    */
  var post_id: String
}

object FeedDialogResult {
  @scala.inline
  def apply(error_code: String, error_message: String, post_id: String): FeedDialogResult = {
    val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], post_id = post_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeedDialogResult]
  }
}

