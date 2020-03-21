package typingsJapgolly.nodemailer.streamTransportMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.nodemailer.mailerMod.Address
import typingsJapgolly.nodemailer.mailerMod.AmpAttachment
import typingsJapgolly.nodemailer.mailerMod.Attachment
import typingsJapgolly.nodemailer.mailerMod.AttachmentLike
import typingsJapgolly.nodemailer.mailerMod.Envelope
import typingsJapgolly.nodemailer.mailerMod.Headers
import typingsJapgolly.nodemailer.mailerMod.IcalAttachment
import typingsJapgolly.nodemailer.mailerMod.ListHeaders
import typingsJapgolly.nodemailer.mailerMod.TextEncoding
import typingsJapgolly.nodemailer.mod.TransportOptions
import typingsJapgolly.nodemailer.nodemailerBooleans.`true`
import typingsJapgolly.nodemailer.nodemailerStrings.high
import typingsJapgolly.nodemailer.nodemailerStrings.low
import typingsJapgolly.nodemailer.nodemailerStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typingsJapgolly.nodemailer.mailerMod.Options
     with TransportOptions {
  /** if true, then returns the message as a Buffer object instead of a stream */
  var buffer: js.UndefOr[Boolean] = js.undefined
  /** either ‘windows’ or ‘unix’ (default). Forces all newlines in the output to either use Windows syntax <CR><LF> or Unix syntax <LF> */
  var newline: js.UndefOr[String] = js.undefined
  var streamTransport: `true`
}

object Options {
  @scala.inline
  def apply(
    streamTransport: `true`,
    alternatives: js.Array[Attachment] = null,
    amp: String | Buffer | Readable | AmpAttachment = null,
    attachments: js.Array[Attachment] = null,
    bcc: String | Address | (js.Array[String | Address]) = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    cc: String | Address | (js.Array[String | Address]) = null,
    component: String = null,
    date: js.Date | String = null,
    disableFileAccess: js.UndefOr[Boolean] = js.undefined,
    disableUrlAccess: js.UndefOr[Boolean] = js.undefined,
    dkim: typingsJapgolly.nodemailer.dkimMod.Options = null,
    encoding: String = null,
    envelope: Envelope | typingsJapgolly.nodemailer.mimeNodeMod.Envelope = null,
    from: String | Address = null,
    headers: Headers = null,
    html: String | Buffer | Readable | AttachmentLike = null,
    icalEvent: String | Buffer | Readable | IcalAttachment = null,
    inReplyTo: String | Address = null,
    list: ListHeaders = null,
    messageId: String = null,
    newline: String = null,
    normalizeHeaderKey: /* key */ String => CallbackTo[String] = null,
    priority: high | normal | low = null,
    raw: String | Buffer | Readable | AttachmentLike = null,
    references: String | js.Array[String] = null,
    replyTo: String | Address = null,
    sender: String | Address = null,
    subject: String = null,
    text: String | Buffer | Readable | AttachmentLike = null,
    textEncoding: TextEncoding = null,
    to: String | Address | (js.Array[String | Address]) = null,
    watchHtml: String | Buffer | Readable | AttachmentLike = null
  ): Options = {
    val __obj = js.Dynamic.literal(streamTransport = streamTransport.asInstanceOf[js.Any])
    if (alternatives != null) __obj.updateDynamic("alternatives")(alternatives.asInstanceOf[js.Any])
    if (amp != null) __obj.updateDynamic("amp")(amp.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (bcc != null) __obj.updateDynamic("bcc")(bcc.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (cc != null) __obj.updateDynamic("cc")(cc.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFileAccess)) __obj.updateDynamic("disableFileAccess")(disableFileAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(disableUrlAccess)) __obj.updateDynamic("disableUrlAccess")(disableUrlAccess.asInstanceOf[js.Any])
    if (dkim != null) __obj.updateDynamic("dkim")(dkim.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (envelope != null) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (icalEvent != null) __obj.updateDynamic("icalEvent")(icalEvent.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (newline != null) __obj.updateDynamic("newline")(newline.asInstanceOf[js.Any])
    if (normalizeHeaderKey != null) __obj.updateDynamic("normalizeHeaderKey")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => normalizeHeaderKey(t0).runNow()))
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo.asInstanceOf[js.Any])
    if (sender != null) __obj.updateDynamic("sender")(sender.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textEncoding != null) __obj.updateDynamic("textEncoding")(textEncoding.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (watchHtml != null) __obj.updateDynamic("watchHtml")(watchHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

