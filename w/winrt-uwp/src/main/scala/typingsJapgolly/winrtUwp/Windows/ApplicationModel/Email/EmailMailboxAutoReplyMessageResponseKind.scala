package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxAutoReplyMessageResponseKind extends js.Object

/** Defines the encoding schema used for automatic replies. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAutoReplyMessageResponseKind")
@js.native
object EmailMailboxAutoReplyMessageResponseKind extends js.Object {
  /** The autoreply message is encoded as HTML. */
  @js.native
  sealed trait html extends EmailMailboxAutoReplyMessageResponseKind
  
  /** The autoreply message is encoded as plain text. */
  @js.native
  sealed trait plainText extends EmailMailboxAutoReplyMessageResponseKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxAutoReplyMessageResponseKind with Double] = js.native
  /* 0 */ @js.native
  object html extends TopLevel[html with Double]
  
  /* 1 */ @js.native
  object plainText extends TopLevel[plainText with Double]
  
}

