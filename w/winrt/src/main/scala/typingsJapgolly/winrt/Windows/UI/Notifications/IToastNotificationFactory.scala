package typingsJapgolly.winrt.Windows.UI.Notifications

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotificationFactory extends js.Object {
  def createToastNotification(content: XmlDocument): ToastNotification
}

object IToastNotificationFactory {
  @scala.inline
  def apply(createToastNotification: XmlDocument => CallbackTo[ToastNotification]): IToastNotificationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createToastNotification")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument) => createToastNotification(t0).runNow()))
    __obj.asInstanceOf[IToastNotificationFactory]
  }
}

