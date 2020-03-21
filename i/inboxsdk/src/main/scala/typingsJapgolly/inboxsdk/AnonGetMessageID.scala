package typingsJapgolly.inboxsdk

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetMessageID extends js.Object {
  def getMessageID(): js.Promise[String]
  def getThreadID(): js.Promise[String]
}

object AnonGetMessageID {
  @scala.inline
  def apply(getMessageID: CallbackTo[js.Promise[String]], getThreadID: CallbackTo[js.Promise[String]]): AnonGetMessageID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMessageID")(getMessageID.toJsFn)
    __obj.updateDynamic("getThreadID")(getThreadID.toJsFn)
    __obj.asInstanceOf[AnonGetMessageID]
  }
}

