package typingsJapgolly.imap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapMessageAttributes extends js.Object {
  /** The internal server date for the message. */
  var date: js.Date
  /** A list of flags currently set on this message. */
  var flags: js.Array[String]
  /** The RFC822 message size (only set if requested with fetch()). */
  var size: js.UndefOr[Double] = js.undefined
  /** The message's body structure (only set if requested with fetch()). */
  var struct: js.UndefOr[js.Array[_]] = js.undefined
  /** A 32-bit ID that uniquely identifies this message within its mailbox. */
  var uid: Double
}

object ImapMessageAttributes {
  @scala.inline
  def apply(
    date: js.Date,
    flags: js.Array[String],
    uid: Double,
    size: Int | Double = null,
    struct: js.Array[_] = null
  ): ImapMessageAttributes = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (struct != null) __obj.updateDynamic("struct")(struct.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapMessageAttributes]
  }
}

