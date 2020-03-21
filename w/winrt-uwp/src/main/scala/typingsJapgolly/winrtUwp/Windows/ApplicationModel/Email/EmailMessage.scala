package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessage")
@js.native
/** Creates an instance of the EmailMessage class. */
class EmailMessage () extends js.Object {
  /** Gets or sets a Boolean value indicating whether images may be embedded in the html encoded email message. */
  var allowInternetImages: Boolean = js.native
  /** Gets the attachments of the email message. */
  var attachments: IVector[EmailAttachment] = js.native
  /** Gets the recipients BCC'd to the email message. */
  var bcc: IVector[EmailRecipient] = js.native
  /** Gets or sets the body of the email message. */
  var body: String = js.native
  /** Gets the recipients CC'd to the email message. */
  var cc: IVector[EmailRecipient] = js.native
  /** Gets the current change number which is incremented for each change made to an email message. */
  var changeNumber: Double = js.native
  /** Gets the identifier for a conversation. */
  var conversationId: String = js.native
  /** Gets or sets the download status of an email message. */
  var downloadState: EmailMessageDownloadState = js.native
  /** Gets or sets the estimated size, in bytes, of an email message download. */
  var estimatedDownloadSizeInBytes: Double = js.native
  /** Represents the flag status of an email message. */
  var flagState: EmailFlagState = js.native
  /** Gets the identifier of a folder in the inbox. */
  var folderId: String = js.native
  /** Gets a Boolean value indicating whether this email message contains partial bodies. */
  var hasPartialBodies: Boolean = js.native
  /** Gets the identifier of an email message. */
  var id: String = js.native
  /** Gets the importance of an email message. */
  var importance: EmailImportance = js.native
  /** Gets the identifier for the email message to which this message is a response. */
  var inResponseToMessageId: String = js.native
  /** Gets or sets the Information Rights Management (IRM) information for this email message. */
  var irmInfo: EmailIrmInfo = js.native
  /** Gets a Boolean value indicating whether this message is a draft. */
  var isDraftMessage: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message has been read. */
  var isRead: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message has been seen. */
  var isSeen: Boolean = js.native
  /** Gets a Boolean value indicating whether the email message is a temporary server search message. */
  var isServerSearchMessage: Boolean = js.native
  /** Gets a Boolean value indicating whether the response email message is allowed to attempt a smart send, only sending that portion of the email message that has changed. */
  var isSmartSendable: Boolean = js.native
  /** Gets the last kind of response sent in reference to this email message. */
  var lastResponseKind: EmailMessageResponseKind = js.native
  /** Gets the identifier of the mailbox. */
  var mailboxId: String = js.native
  /** Gets the information associated with this meeting. */
  var meetingInfo: EmailMeetingInfo = js.native
  /** Gets or sets a string that indicates the class of the message. */
  var messageClass: String = js.native
  /** Gets the subject line of an email message stripped of additional prefixes such as fwd: and re: */
  var normalizedSubject: String = js.native
  /** Gets or sets the integer that identifies the original flavor of the character set used so that when the email message is condensed from wide character format (16-bit) to ASCII or other 8-bit encoding, in cases of later encoding questions, this integer can be used to recreate the original character set. */
  var originalCodePage: Double = js.native
  /** Gets or sets the short preview string that represents the longer email message in the list view of emails. */
  var preview: String = js.native
  /** Gets or sets the identifier that can be used by a service provider to access the email message on the client machine. */
  var remoteId: String = js.native
  /** Gets or sets the mailbox from which the email message was sent. */
  var sender: EmailRecipient = js.native
  /** Gets or sets the time an email was sent. */
  var sentTime: js.Date = js.native
  /** Gets or sets the S/MIME data associated with an email message. For more information, see the Certificate class. */
  var smimeData: IRandomAccessStreamReference = js.native
  /** Gets or sets the type of S/MIME encryption/signature for the email message. */
  var smimeKind: EmailMessageSmimeKind = js.native
  /** Gets or sets the subject of the email message. */
  var subject: String = js.native
  /** Gets the direct recipients of the email message. */
  var to: IVector[EmailRecipient] = js.native
  /**
    * Gets the requested email stream such as plain text or HTML.
    * @param type The kind of message body; plain text or HTML.
    * @return The selected body stream.
    */
  def getBodyStream(`type`: EmailMessageBodyKind): IRandomAccessStreamReference = js.native
  /**
    * Sets the value of the specified body stream in an email message.
    * @param type Indicates which body stream, plain text or HTML.
    * @param stream The message for the specified body stream.
    */
  def setBodyStream(`type`: EmailMessageBodyKind, stream: IRandomAccessStreamReference): Unit = js.native
}

