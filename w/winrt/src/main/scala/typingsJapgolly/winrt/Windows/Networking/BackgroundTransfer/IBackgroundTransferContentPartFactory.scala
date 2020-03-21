package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferContentPartFactory extends js.Object {
  def createWithName(name: String): BackgroundTransferContentPart
  def createWithNameAndFileName(name: String, fileName: String): BackgroundTransferContentPart
}

object IBackgroundTransferContentPartFactory {
  @scala.inline
  def apply(
    createWithName: String => CallbackTo[BackgroundTransferContentPart],
    createWithNameAndFileName: (String, String) => CallbackTo[BackgroundTransferContentPart]
  ): IBackgroundTransferContentPartFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createWithName")(js.Any.fromFunction1((t0: java.lang.String) => createWithName(t0).runNow()))
    __obj.updateDynamic("createWithNameAndFileName")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => createWithNameAndFileName(t0, t1).runNow()))
    __obj.asInstanceOf[IBackgroundTransferContentPartFactory]
  }
}

