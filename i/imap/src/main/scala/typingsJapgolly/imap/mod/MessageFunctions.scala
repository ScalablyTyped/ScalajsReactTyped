package typingsJapgolly.imap.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageFunctions extends js.Object {
  /** Adds flag(s) to message(s). */
  def addFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  /** Adds keyword(s) to message(s). keywords is either a single keyword or an array of keywords. */
  def addKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  /** Copies message(s) in the currently open mailbox to another mailbox. */
  def copy(source: js.Any, mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  /** Removes flag(s) from message(s). */
  def delFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  /** Removes keyword(s) from message(s). keywords is either a single keyword or an array of keywords. */
  def delKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  /** Fetches message(s) in the currently open mailbox; source can be a single message identifier, a message identifier range (e.g. '2504:2507' or '*' or '2504:*'), an array of message identifiers, or an array of message identifier ranges. */
  def fetch(source: js.Any, options: FetchOptions): ImapFetch
  /** Moves message(s) in the currently open mailbox to another mailbox. Note: The message(s) in the destination mailbox will have a new message UID. */
  def move(source: js.Any, mailboxName: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  /** Searches the currently open mailbox for messages using given criteria. criteria is a list describing what you want to find. For criteria types that require arguments, use an array instead of just the string criteria type name (e.g. ['FROM', 'foo@bar.com']). Prefix criteria types with an "!" to negate.
    The following message flags are valid types that do not have arguments:
    ALL:            void;    // All messages.
    ANSWERED:       void;    // Messages with the Answered flag set.
    DELETED:        void;    // Messages with the Deleted flag set.
    DRAFT:          void;    // Messages with the Draft flag set.
    FLAGGED:        void;    // Messages with the Flagged flag set.
    NEW:            void;    // Messages that have the Recent flag set but not the Seen flag.
    SEEN:           void;    // Messages that have the Seen flag set.
    RECENT:         void;    // Messages that have the Recent flag set.
    OLD:            void;    // Messages that do not have the Recent flag set. This is functionally equivalent to "!RECENT" (as opposed to "!NEW").
    UNANSWERED:     void;    // Messages that do not have the Answered flag set.
    UNDELETED:      void;    // Messages that do not have the Deleted flag set.
    UNDRAFT:        void;    // Messages that do not have the Draft flag set.
    UNFLAGGED:      void;    // Messages that do not have the Flagged flag set.
    UNSEEN:         void;    // Messages that do not have the Seen flag set.
    The following are valid types that require string value(s):
    BCC:            any;    // Messages that contain the specified string in the BCC field.
    CC:             any;    // Messages that contain the specified string in the CC field.
    FROM:           any;    // Messages that contain the specified string in the FROM field.
    SUBJECT:        any;    // Messages that contain the specified string in the SUBJECT field.
    TO:             any;    // Messages that contain the specified string in the TO field.
    BODY:           any;    // Messages that contain the specified string in the message body.
    TEXT:           any;    // Messages that contain the specified string in the header OR the message body.
    KEYWORD:        any;    // Messages with the specified keyword set.
    HEADER:         any;    // Requires two string values, with the first being the header name and the second being the value to search for. If this second string is empty, all messages that contain the given header name will be returned.
    The following are valid types that require a string parseable by JavaScripts Date object OR a Date instance:
    BEFORE:         any;    // Messages whose internal date (disregarding time and timezone) is earlier than the specified date.
    ON:             any;    // Messages whose internal date (disregarding time and timezone) is within the specified date.
    SINCE:          any;    // Messages whose internal date (disregarding time and timezone) is within or later than the specified date.
    SENTBEFORE:     any;    // Messages whose Date header (disregarding time and timezone) is earlier than the specified date.
    SENTON:         any;    // Messages whose Date header (disregarding time and timezone) is within the specified date.
    SENTSINCE:      any;    // Messages whose Date header (disregarding time and timezone) is within or later than the specified date.
    The following are valid types that require one Integer value:
    LARGER:         number;    // Messages with a size larger than the specified number of bytes.
    SMALLER:        number;    // Messages with a size smaller than the specified number of bytes.
    The following are valid criterion that require one or more Integer values:
    UID:            any;    // Messages with UIDs corresponding to the specified UID set. Ranges are permitted (e.g. '2504:2507' or '*' or '2504:*').
    */
  def search(
    criteria: js.Array[_],
    callback: js.Function2[/* error */ js.Error, /* uids */ js.Array[Double], Unit]
  ): Unit
  /** Checks if the server supports the specified capability. */
  def serverSupports(capability: String): Boolean
  /** Sets the flag(s) for message(s). */
  def setFlags(source: js.Any, flags: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit
  /** Sets keyword(s) for message(s). keywords is either a single keyword or an array of keywords. */
  def setKeywords(source: js.Any, keywords: js.Any, callback: js.Function1[/* error */ js.Error, Unit]): Unit
}

object MessageFunctions {
  @scala.inline
  def apply(
    addFlags: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Callback,
    addKeywords: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Callback,
    copy: (js.Any, String, js.Function1[/* error */ js.Error, Unit]) => Callback,
    delFlags: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Callback,
    delKeywords: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Callback,
    fetch: (js.Any, FetchOptions) => CallbackTo[ImapFetch],
    move: (js.Any, String, js.Function1[/* error */ js.Error, Unit]) => Callback,
    search: (js.Array[js.Any], js.Function2[/* error */ js.Error, /* uids */ js.Array[Double], Unit]) => Callback,
    serverSupports: String => CallbackTo[Boolean],
    setFlags: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Callback,
    setKeywords: (js.Any, js.Any, js.Function1[/* error */ js.Error, Unit]) => Callback
  ): MessageFunctions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFlags")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function1[/* error */ js.Error, scala.Unit]) => addFlags(t0, t1, t2).runNow()))
    __obj.updateDynamic("addKeywords")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function1[/* error */ js.Error, scala.Unit]) => addKeywords(t0, t1, t2).runNow()))
    __obj.updateDynamic("copy")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: js.Function1[/* error */ js.Error, scala.Unit]) => copy(t0, t1, t2).runNow()))
    __obj.updateDynamic("delFlags")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function1[/* error */ js.Error, scala.Unit]) => delFlags(t0, t1, t2).runNow()))
    __obj.updateDynamic("delKeywords")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function1[/* error */ js.Error, scala.Unit]) => delKeywords(t0, t1, t2).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.imap.mod.FetchOptions) => fetch(t0, t1).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: js.Function1[/* error */ js.Error, scala.Unit]) => move(t0, t1, t2).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Function2[/* error */ js.Error, /* uids */ js.Array[scala.Double], scala.Unit]) => search(t0, t1).runNow()))
    __obj.updateDynamic("serverSupports")(js.Any.fromFunction1((t0: java.lang.String) => serverSupports(t0).runNow()))
    __obj.updateDynamic("setFlags")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function1[/* error */ js.Error, scala.Unit]) => setFlags(t0, t1, t2).runNow()))
    __obj.updateDynamic("setKeywords")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Function1[/* error */ js.Error, scala.Unit]) => setKeywords(t0, t1, t2).runNow()))
    __obj.asInstanceOf[MessageFunctions]
  }
}

