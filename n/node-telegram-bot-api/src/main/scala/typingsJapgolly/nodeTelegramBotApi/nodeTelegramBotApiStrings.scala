package typingsJapgolly.nodeTelegramBotApi

import typingsJapgolly.nodeTelegramBotApi.mod.ChatAction
import typingsJapgolly.nodeTelegramBotApi.mod.ChatMemberStatus
import typingsJapgolly.nodeTelegramBotApi.mod.ChatType
import typingsJapgolly.nodeTelegramBotApi.mod.DocumentMimeType
import typingsJapgolly.nodeTelegramBotApi.mod.MessageEntityType
import typingsJapgolly.nodeTelegramBotApi.mod.MessageType
import typingsJapgolly.nodeTelegramBotApi.mod.ParseMode
import typingsJapgolly.nodeTelegramBotApi.mod.PollType
import typingsJapgolly.nodeTelegramBotApi.mod.StickerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTelegramBotApiStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait HTML
    extends StObject
       with ParseMode
  inline def HTML: HTML = "HTML".asInstanceOf[HTML]
  
  @js.native
  sealed trait Markdown
    extends StObject
       with ParseMode
  inline def Markdown: Markdown = "Markdown".asInstanceOf[Markdown]
  
  @js.native
  sealed trait MarkdownV2
    extends StObject
       with ParseMode
  inline def MarkdownV2: MarkdownV2 = "MarkdownV2".asInstanceOf[MarkdownV2]
  
  @js.native
  sealed trait administrator
    extends StObject
       with ChatMemberStatus
  inline def administrator: administrator = "administrator".asInstanceOf[administrator]
  
  @js.native
  sealed trait all_chat_administrators extends StObject
  inline def all_chat_administrators: all_chat_administrators = "all_chat_administrators".asInstanceOf[all_chat_administrators]
  
  @js.native
  sealed trait all_group_chats extends StObject
  inline def all_group_chats: all_group_chats = "all_group_chats".asInstanceOf[all_group_chats]
  
  @js.native
  sealed trait all_private_chats extends StObject
  inline def all_private_chats: all_private_chats = "all_private_chats".asInstanceOf[all_private_chats]
  
  @js.native
  sealed trait animation
    extends StObject
       with MessageType
  inline def animation: animation = "animation".asInstanceOf[animation]
  
  @js.native
  sealed trait applicationSlashpdf
    extends StObject
       with DocumentMimeType
  inline def applicationSlashpdf: applicationSlashpdf = "application/pdf".asInstanceOf[applicationSlashpdf]
  
  @js.native
  sealed trait applicationSlashzip
    extends StObject
       with DocumentMimeType
  inline def applicationSlashzip: applicationSlashzip = "application/zip".asInstanceOf[applicationSlashzip]
  
  @js.native
  sealed trait article extends StObject
  inline def article: article = "article".asInstanceOf[article]
  
  @js.native
  sealed trait audio
    extends StObject
       with MessageType
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait bold
    extends StObject
       with MessageEntityType
  inline def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait bot_command
    extends StObject
       with MessageEntityType
  inline def bot_command: bot_command = "bot_command".asInstanceOf[bot_command]
  
  @js.native
  sealed trait callback_query extends StObject
  inline def callback_query: callback_query = "callback_query".asInstanceOf[callback_query]
  
  @js.native
  sealed trait cashtag
    extends StObject
       with MessageEntityType
  inline def cashtag: cashtag = "cashtag".asInstanceOf[cashtag]
  
  @js.native
  sealed trait channel
    extends StObject
       with ChatType
  inline def channel: channel = "channel".asInstanceOf[channel]
  
  @js.native
  sealed trait channel_chat_created
    extends StObject
       with MessageType
  inline def channel_chat_created: channel_chat_created = "channel_chat_created".asInstanceOf[channel_chat_created]
  
  @js.native
  sealed trait channel_post extends StObject
  inline def channel_post: channel_post = "channel_post".asInstanceOf[channel_post]
  
  @js.native
  sealed trait chat extends StObject
  inline def chat: chat = "chat".asInstanceOf[chat]
  
  @js.native
  sealed trait chat_administrators extends StObject
  inline def chat_administrators: chat_administrators = "chat_administrators".asInstanceOf[chat_administrators]
  
  @js.native
  sealed trait chat_invite_link
    extends StObject
       with MessageType
  inline def chat_invite_link: chat_invite_link = "chat_invite_link".asInstanceOf[chat_invite_link]
  
  @js.native
  sealed trait chat_join_request extends StObject
  inline def chat_join_request: chat_join_request = "chat_join_request".asInstanceOf[chat_join_request]
  
  @js.native
  sealed trait chat_member extends StObject
  inline def chat_member: chat_member = "chat_member".asInstanceOf[chat_member]
  
  @js.native
  sealed trait chat_member_updated
    extends StObject
       with MessageType
  inline def chat_member_updated: chat_member_updated = "chat_member_updated".asInstanceOf[chat_member_updated]
  
  @js.native
  sealed trait chosen_inline_result extends StObject
  inline def chosen_inline_result: chosen_inline_result = "chosen_inline_result".asInstanceOf[chosen_inline_result]
  
  @js.native
  sealed trait code
    extends StObject
       with MessageEntityType
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait commands extends StObject
  inline def commands: commands = "commands".asInstanceOf[commands]
  
  @js.native
  sealed trait contact
    extends StObject
       with MessageType
  inline def contact: contact = "contact".asInstanceOf[contact]
  
  @js.native
  sealed trait creator
    extends StObject
       with ChatMemberStatus
  inline def creator: creator = "creator".asInstanceOf[creator]
  
  @js.native
  sealed trait custom_emoji
    extends StObject
       with MessageEntityType
       with StickerType
  inline def custom_emoji: custom_emoji = "custom_emoji".asInstanceOf[custom_emoji]
  
  @js.native
  sealed trait delete_chat_photo
    extends StObject
       with MessageType
  inline def delete_chat_photo: delete_chat_photo = "delete_chat_photo".asInstanceOf[delete_chat_photo]
  
  @js.native
  sealed trait document
    extends StObject
       with MessageType
  inline def document: document = "document".asInstanceOf[document]
  
  @js.native
  sealed trait edited_channel_post extends StObject
  inline def edited_channel_post: edited_channel_post = "edited_channel_post".asInstanceOf[edited_channel_post]
  
  @js.native
  sealed trait edited_channel_post_caption extends StObject
  inline def edited_channel_post_caption: edited_channel_post_caption = "edited_channel_post_caption".asInstanceOf[edited_channel_post_caption]
  
  @js.native
  sealed trait edited_channel_post_text extends StObject
  inline def edited_channel_post_text: edited_channel_post_text = "edited_channel_post_text".asInstanceOf[edited_channel_post_text]
  
  @js.native
  sealed trait edited_message extends StObject
  inline def edited_message: edited_message = "edited_message".asInstanceOf[edited_message]
  
  @js.native
  sealed trait edited_message_caption extends StObject
  inline def edited_message_caption: edited_message_caption = "edited_message_caption".asInstanceOf[edited_message_caption]
  
  @js.native
  sealed trait edited_message_text extends StObject
  inline def edited_message_text: edited_message_text = "edited_message_text".asInstanceOf[edited_message_text]
  
  @js.native
  sealed trait email
    extends StObject
       with MessageEntityType
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait find_location
    extends StObject
       with ChatAction
  inline def find_location: find_location = "find_location".asInstanceOf[find_location]
  
  @js.native
  sealed trait game
    extends StObject
       with MessageType
  inline def game: game = "game".asInstanceOf[game]
  
  @js.native
  sealed trait gif extends StObject
  inline def gif: gif = "gif".asInstanceOf[gif]
  
  @js.native
  sealed trait group
    extends StObject
       with ChatType
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait group_chat_created
    extends StObject
       with MessageType
  inline def group_chat_created: group_chat_created = "group_chat_created".asInstanceOf[group_chat_created]
  
  @js.native
  sealed trait hashtag
    extends StObject
       with MessageEntityType
  inline def hashtag: hashtag = "hashtag".asInstanceOf[hashtag]
  
  @js.native
  sealed trait inline_query extends StObject
  inline def inline_query: inline_query = "inline_query".asInstanceOf[inline_query]
  
  @js.native
  sealed trait invoice
    extends StObject
       with MessageType
  inline def invoice: invoice = "invoice".asInstanceOf[invoice]
  
  @js.native
  sealed trait italic
    extends StObject
       with MessageEntityType
  inline def italic: italic = "italic".asInstanceOf[italic]
  
  @js.native
  sealed trait kicked
    extends StObject
       with ChatMemberStatus
  inline def kicked: kicked = "kicked".asInstanceOf[kicked]
  
  @js.native
  sealed trait left
    extends StObject
       with ChatMemberStatus
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait left_chat_member
    extends StObject
       with MessageType
  inline def left_chat_member: left_chat_member = "left_chat_member".asInstanceOf[left_chat_member]
  
  @js.native
  sealed trait location
    extends StObject
       with MessageType
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait mask
    extends StObject
       with StickerType
  inline def mask: mask = "mask".asInstanceOf[mask]
  
  @js.native
  sealed trait member
    extends StObject
       with ChatMemberStatus
  inline def member: member = "member".asInstanceOf[member]
  
  @js.native
  sealed trait mention
    extends StObject
       with MessageEntityType
  inline def mention: mention = "mention".asInstanceOf[mention]
  
  @js.native
  sealed trait message extends StObject
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait message_auto_delete_timer_changed
    extends StObject
       with MessageType
  inline def message_auto_delete_timer_changed: message_auto_delete_timer_changed = "message_auto_delete_timer_changed".asInstanceOf[message_auto_delete_timer_changed]
  
  @js.native
  sealed trait migrate_from_chat_id
    extends StObject
       with MessageType
  inline def migrate_from_chat_id: migrate_from_chat_id = "migrate_from_chat_id".asInstanceOf[migrate_from_chat_id]
  
  @js.native
  sealed trait migrate_to_chat_id
    extends StObject
       with MessageType
  inline def migrate_to_chat_id: migrate_to_chat_id = "migrate_to_chat_id".asInstanceOf[migrate_to_chat_id]
  
  @js.native
  sealed trait mpeg4_gif extends StObject
  inline def mpeg4_gif: mpeg4_gif = "mpeg4_gif".asInstanceOf[mpeg4_gif]
  
  @js.native
  sealed trait my_chat_member extends StObject
  inline def my_chat_member: my_chat_member = "my_chat_member".asInstanceOf[my_chat_member]
  
  @js.native
  sealed trait new_chat_members
    extends StObject
       with MessageType
  inline def new_chat_members: new_chat_members = "new_chat_members".asInstanceOf[new_chat_members]
  
  @js.native
  sealed trait new_chat_photo
    extends StObject
       with MessageType
  inline def new_chat_photo: new_chat_photo = "new_chat_photo".asInstanceOf[new_chat_photo]
  
  @js.native
  sealed trait new_chat_title
    extends StObject
       with MessageType
  inline def new_chat_title: new_chat_title = "new_chat_title".asInstanceOf[new_chat_title]
  
  @js.native
  sealed trait passport_data
    extends StObject
       with MessageType
  inline def passport_data: passport_data = "passport_data".asInstanceOf[passport_data]
  
  @js.native
  sealed trait phone_number
    extends StObject
       with MessageEntityType
  inline def phone_number: phone_number = "phone_number".asInstanceOf[phone_number]
  
  @js.native
  sealed trait photo
    extends StObject
       with MessageType
  inline def photo: photo = "photo".asInstanceOf[photo]
  
  @js.native
  sealed trait pinned_message
    extends StObject
       with MessageType
  inline def pinned_message: pinned_message = "pinned_message".asInstanceOf[pinned_message]
  
  @js.native
  sealed trait png_sticker extends StObject
  inline def png_sticker: png_sticker = "png_sticker".asInstanceOf[png_sticker]
  
  @js.native
  sealed trait poll_answer extends StObject
  inline def poll_answer: poll_answer = "poll_answer".asInstanceOf[poll_answer]
  
  @js.native
  sealed trait polling_error extends StObject
  inline def polling_error: polling_error = "polling_error".asInstanceOf[polling_error]
  
  @js.native
  sealed trait pre
    extends StObject
       with MessageEntityType
  inline def pre: pre = "pre".asInstanceOf[pre]
  
  @js.native
  sealed trait pre_checkout_query extends StObject
  inline def pre_checkout_query: pre_checkout_query = "pre_checkout_query".asInstanceOf[pre_checkout_query]
  
  @js.native
  sealed trait `private`
    extends StObject
       with ChatType
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait quiz
    extends StObject
       with PollType
  inline def quiz: quiz = "quiz".asInstanceOf[quiz]
  
  @js.native
  sealed trait record_video
    extends StObject
       with ChatAction
  inline def record_video: record_video = "record_video".asInstanceOf[record_video]
  
  @js.native
  sealed trait record_video_note
    extends StObject
       with ChatAction
  inline def record_video_note: record_video_note = "record_video_note".asInstanceOf[record_video_note]
  
  @js.native
  sealed trait record_voice
    extends StObject
       with ChatAction
  inline def record_voice: record_voice = "record_voice".asInstanceOf[record_voice]
  
  @js.native
  sealed trait regular
    extends StObject
       with PollType
       with StickerType
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait restricted
    extends StObject
       with ChatMemberStatus
  inline def restricted: restricted = "restricted".asInstanceOf[restricted]
  
  @js.native
  sealed trait shipping_query extends StObject
  inline def shipping_query: shipping_query = "shipping_query".asInstanceOf[shipping_query]
  
  @js.native
  sealed trait spoiler
    extends StObject
       with MessageEntityType
  inline def spoiler: spoiler = "spoiler".asInstanceOf[spoiler]
  
  @js.native
  sealed trait sticker
    extends StObject
       with MessageType
  inline def sticker: sticker = "sticker".asInstanceOf[sticker]
  
  @js.native
  sealed trait strikethrough
    extends StObject
       with MessageEntityType
  inline def strikethrough: strikethrough = "strikethrough".asInstanceOf[strikethrough]
  
  @js.native
  sealed trait successful_payment
    extends StObject
       with MessageType
  inline def successful_payment: successful_payment = "successful_payment".asInstanceOf[successful_payment]
  
  @js.native
  sealed trait supergroup
    extends StObject
       with ChatType
  inline def supergroup: supergroup = "supergroup".asInstanceOf[supergroup]
  
  @js.native
  sealed trait supergroup_chat_created
    extends StObject
       with MessageType
  inline def supergroup_chat_created: supergroup_chat_created = "supergroup_chat_created".asInstanceOf[supergroup_chat_created]
  
  @js.native
  sealed trait text
    extends StObject
       with MessageType
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait text_link
    extends StObject
       with MessageEntityType
  inline def text_link: text_link = "text_link".asInstanceOf[text_link]
  
  @js.native
  sealed trait text_mention
    extends StObject
       with MessageEntityType
  inline def text_mention: text_mention = "text_mention".asInstanceOf[text_mention]
  
  @js.native
  sealed trait tgs_sticker extends StObject
  inline def tgs_sticker: tgs_sticker = "tgs_sticker".asInstanceOf[tgs_sticker]
  
  @js.native
  sealed trait typing
    extends StObject
       with ChatAction
  inline def typing: typing = "typing".asInstanceOf[typing]
  
  @js.native
  sealed trait underline
    extends StObject
       with MessageEntityType
  inline def underline: underline = "underline".asInstanceOf[underline]
  
  @js.native
  sealed trait upload_document
    extends StObject
       with ChatAction
  inline def upload_document: upload_document = "upload_document".asInstanceOf[upload_document]
  
  @js.native
  sealed trait upload_photo
    extends StObject
       with ChatAction
  inline def upload_photo: upload_photo = "upload_photo".asInstanceOf[upload_photo]
  
  @js.native
  sealed trait upload_video
    extends StObject
       with ChatAction
  inline def upload_video: upload_video = "upload_video".asInstanceOf[upload_video]
  
  @js.native
  sealed trait upload_video_note
    extends StObject
       with ChatAction
  inline def upload_video_note: upload_video_note = "upload_video_note".asInstanceOf[upload_video_note]
  
  @js.native
  sealed trait upload_voice
    extends StObject
       with ChatAction
  inline def upload_voice: upload_voice = "upload_voice".asInstanceOf[upload_voice]
  
  @js.native
  sealed trait url
    extends StObject
       with MessageEntityType
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait venue extends StObject
  inline def venue: venue = "venue".asInstanceOf[venue]
  
  @js.native
  sealed trait video
    extends StObject
       with MessageType
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait video_chat_ended
    extends StObject
       with MessageType
  inline def video_chat_ended: video_chat_ended = "video_chat_ended".asInstanceOf[video_chat_ended]
  
  @js.native
  sealed trait video_chat_participants_invited
    extends StObject
       with MessageType
  inline def video_chat_participants_invited: video_chat_participants_invited = "video_chat_participants_invited".asInstanceOf[video_chat_participants_invited]
  
  @js.native
  sealed trait video_chat_scheduled
    extends StObject
       with MessageType
  inline def video_chat_scheduled: video_chat_scheduled = "video_chat_scheduled".asInstanceOf[video_chat_scheduled]
  
  @js.native
  sealed trait video_chat_started
    extends StObject
       with MessageType
  inline def video_chat_started: video_chat_started = "video_chat_started".asInstanceOf[video_chat_started]
  
  @js.native
  sealed trait video_note
    extends StObject
       with MessageType
  inline def video_note: video_note = "video_note".asInstanceOf[video_note]
  
  @js.native
  sealed trait voice
    extends StObject
       with MessageType
  inline def voice: voice = "voice".asInstanceOf[voice]
  
  @js.native
  sealed trait web_app extends StObject
  inline def web_app: web_app = "web_app".asInstanceOf[web_app]
  
  @js.native
  sealed trait web_app_data
    extends StObject
       with MessageType
  inline def web_app_data: web_app_data = "web_app_data".asInstanceOf[web_app_data]
  
  @js.native
  sealed trait webhook_error extends StObject
  inline def webhook_error: webhook_error = "webhook_error".asInstanceOf[webhook_error]
  
  @js.native
  sealed trait webm_sticker extends StObject
  inline def webm_sticker: webm_sticker = "webm_sticker".asInstanceOf[webm_sticker]
}
