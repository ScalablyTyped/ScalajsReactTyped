package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsInstance extends js.Object {
  def registerFileAttachmentCardViewHandler(handler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit]): js.Function0[Unit]
  def registerMessageViewHandler(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit]
  def registerMessageViewHandlerAll(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit]
  def registerThreadViewHandler(handler: js.Function1[/* threadView */ ThreadView, Unit]): js.Function0[Unit]
}

object ConversationsInstance {
  @scala.inline
  def apply(
    registerFileAttachmentCardViewHandler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => CallbackTo[js.Function0[Unit]],
    registerMessageViewHandler: js.Function1[/* messageView */ MessageView, Unit] => CallbackTo[js.Function0[Unit]],
    registerMessageViewHandlerAll: js.Function1[/* messageView */ MessageView, Unit] => CallbackTo[js.Function0[Unit]],
    registerThreadViewHandler: js.Function1[/* threadView */ ThreadView, Unit] => CallbackTo[js.Function0[Unit]]
  ): ConversationsInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerFileAttachmentCardViewHandler")(js.Any.fromFunction1((t0: js.Function1[
  /* attachmentCardView */ typingsJapgolly.inboxsdk.mod.Conversations.AttachmentCardView, 
  scala.Unit]) => registerFileAttachmentCardViewHandler(t0).runNow()))
    __obj.updateDynamic("registerMessageViewHandler")(js.Any.fromFunction1((t0: js.Function1[
  /* messageView */ typingsJapgolly.inboxsdk.mod.Conversations.MessageView, 
  scala.Unit]) => registerMessageViewHandler(t0).runNow()))
    __obj.updateDynamic("registerMessageViewHandlerAll")(js.Any.fromFunction1((t0: js.Function1[
  /* messageView */ typingsJapgolly.inboxsdk.mod.Conversations.MessageView, 
  scala.Unit]) => registerMessageViewHandlerAll(t0).runNow()))
    __obj.updateDynamic("registerThreadViewHandler")(js.Any.fromFunction1((t0: js.Function1[/* threadView */ typingsJapgolly.inboxsdk.mod.Conversations.ThreadView, scala.Unit]) => registerThreadViewHandler(t0).runNow()))
    __obj.asInstanceOf[ConversationsInstance]
  }
}

