package typingsJapgolly.nodeTelegramBotApi.mod

import typingsJapgolly.nodeTelegramBotApi.nodeTelegramBotApiStrings.gif
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineQueryResultGif
  extends InlineQueryResultBase
     with InlineQueryResult {
  var caption: js.UndefOr[String] = js.undefined
  var gif_duration: js.UndefOr[Double] = js.undefined
  var gif_height: js.UndefOr[Double] = js.undefined
  var gif_url: String
  var gif_width: js.UndefOr[Double] = js.undefined
  var input_message_content: js.UndefOr[InputMessageContent] = js.undefined
  var thumb_url: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: gif
}

object InlineQueryResultGif {
  @scala.inline
  def apply(
    gif_url: String,
    id: String,
    `type`: gif,
    caption: String = null,
    gif_duration: Int | Double = null,
    gif_height: Int | Double = null,
    gif_width: Int | Double = null,
    input_message_content: InputMessageContent = null,
    reply_markup: InlineKeyboardMarkup = null,
    thumb_url: String = null,
    title: String = null
  ): InlineQueryResultGif = {
    val __obj = js.Dynamic.literal(gif_url = gif_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (gif_duration != null) __obj.updateDynamic("gif_duration")(gif_duration.asInstanceOf[js.Any])
    if (gif_height != null) __obj.updateDynamic("gif_height")(gif_height.asInstanceOf[js.Any])
    if (gif_width != null) __obj.updateDynamic("gif_width")(gif_width.asInstanceOf[js.Any])
    if (input_message_content != null) __obj.updateDynamic("input_message_content")(input_message_content.asInstanceOf[js.Any])
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup.asInstanceOf[js.Any])
    if (thumb_url != null) __obj.updateDynamic("thumb_url")(thumb_url.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineQueryResultGif]
  }
}

