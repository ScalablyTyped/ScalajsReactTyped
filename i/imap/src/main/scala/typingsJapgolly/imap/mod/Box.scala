package typingsJapgolly.imap.mod

import typingsJapgolly.imap.AnonNew
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Box extends js.Object {
  /** array - A list of system-defined flags applicable for this mailbox. Flags in this list but not in permFlags may be stored for the current session only. Additional server implementation-specific flags may also be available. */
  var flags: js.Array[String]
  /** Contains various message counts for this mailbox: */
  var messages: AnonNew
  /** The name of this mailbox. */
  var name: String
  /** True if new keywords can be added to messages in this mailbox. */
  var newKeywords: Boolean
  /** A list of flags that can be permanently added/removed to/from messages in this mailbox. */
  var permFlags: js.Array[String]
  /** Whether or not this mailbox has persistent UIDs. This should almost always be true for modern mailboxes and should only be false for legacy mail stores where supporting persistent UIDs was not technically feasible. */
  var persistentUIDs: Boolean
  /** True if this mailbox was opened in read-only mode. (Only available with openBox() calls) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** The uid that will be assigned to the next message that arrives at this mailbox. */
  var uidnext: Double
  /** A 32-bit number that can be used to determine if UIDs in this mailbox have changed since the last time this mailbox was opened. */
  var uidvalidity: Double
}

object Box {
  @scala.inline
  def apply(
    flags: js.Array[String],
    messages: AnonNew,
    name: String,
    newKeywords: Boolean,
    permFlags: js.Array[String],
    persistentUIDs: Boolean,
    uidnext: Double,
    uidvalidity: Double,
    readOnly: js.UndefOr[Boolean] = js.undefined
  ): Box = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newKeywords = newKeywords.asInstanceOf[js.Any], permFlags = permFlags.asInstanceOf[js.Any], persistentUIDs = persistentUIDs.asInstanceOf[js.Any], uidnext = uidnext.asInstanceOf[js.Any], uidvalidity = uidvalidity.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Box]
  }
}

