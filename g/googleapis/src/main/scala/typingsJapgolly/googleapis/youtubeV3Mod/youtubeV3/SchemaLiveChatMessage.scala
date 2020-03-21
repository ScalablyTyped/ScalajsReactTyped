package typingsJapgolly.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A liveChatMessage resource represents a chat message in a YouTube Live
  * Chat.
  */
@js.native
trait SchemaLiveChatMessage extends js.Object {
  /**
    * The authorDetails object contains basic details about the user that
    * posted this message.
    */
  var authorDetails: js.UndefOr[SchemaLiveChatMessageAuthorDetails] = js.native
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube assigns to uniquely identify the message.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveChatMessage&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the message.
    */
  var snippet: js.UndefOr[SchemaLiveChatMessageSnippet] = js.native
}

object SchemaLiveChatMessage {
  @scala.inline
  def apply(
    authorDetails: SchemaLiveChatMessageAuthorDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: SchemaLiveChatMessageSnippet = null
  ): SchemaLiveChatMessage = {
    val __obj = js.Dynamic.literal()
    if (authorDetails != null) __obj.updateDynamic("authorDetails")(authorDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLiveChatMessage]
  }
}

