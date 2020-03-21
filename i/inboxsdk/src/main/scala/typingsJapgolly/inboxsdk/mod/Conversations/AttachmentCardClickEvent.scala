package typingsJapgolly.inboxsdk.mod.Conversations

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentCardClickEvent extends js.Object {
  def getDownloadURL(): js.Promise[String]
}

object AttachmentCardClickEvent {
  @scala.inline
  def apply(getDownloadURL: CallbackTo[js.Promise[String]]): AttachmentCardClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDownloadURL")(getDownloadURL.toJsFn)
    __obj.asInstanceOf[AttachmentCardClickEvent]
  }
}

