package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the settings for the automatic reply functionality of an email account. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReplySettings")
@js.native
/** Initializes a new instance of an EmailMailboxAutoReplySettings object. */
class EmailMailboxAutoReplySettings () extends js.Object {
  /** Represents the end time for the automated reply period. */
  var endTime: js.Date = js.native
  /** Gets the automatic reply message intended for an email message from an internal sender. */
  var internalReply: EmailMailboxAutoReply = js.native
  /** Gets a Boolean value indicating whether automatic replies are enabled. */
  var isEnabled: Boolean = js.native
  /** Gets the automatic reply message intended for an email message from a known external sender. */
  var knownExternalReply: EmailMailboxAutoReply = js.native
  /** Gets or sets whether the automated response email message is encoded as HTML or plain text. */
  var responseKind: EmailMailboxAutoReplyMessageResponseKind = js.native
  /** Represents the start time for the automated reply period. */
  var startTime: js.Date = js.native
  /** Gets the automatic reply message intended for an email message from an unknown external sender. */
  var unknownExternalReply: EmailMailboxAutoReply = js.native
}

