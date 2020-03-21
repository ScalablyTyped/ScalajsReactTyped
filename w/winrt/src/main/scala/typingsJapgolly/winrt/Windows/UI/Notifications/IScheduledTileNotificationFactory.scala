package typingsJapgolly.winrt.Windows.UI.Notifications

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduledTileNotificationFactory extends js.Object {
  def createScheduledTileNotification(content: XmlDocument, deliveryTime: js.Date): ScheduledTileNotification
}

object IScheduledTileNotificationFactory {
  @scala.inline
  def apply(createScheduledTileNotification: (XmlDocument, js.Date) => CallbackTo[ScheduledTileNotification]): IScheduledTileNotificationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createScheduledTileNotification")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument, t1: js.Date) => createScheduledTileNotification(t0, t1).runNow()))
    __obj.asInstanceOf[IScheduledTileNotificationFactory]
  }
}

