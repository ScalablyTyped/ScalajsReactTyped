package typingsJapgolly.winrt.Windows.UI.Notifications

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileNotificationFactory extends js.Object {
  def createTileNotification(content: XmlDocument): TileNotification
}

object ITileNotificationFactory {
  @scala.inline
  def apply(createTileNotification: XmlDocument => CallbackTo[TileNotification]): ITileNotificationFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createTileNotification")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument) => createTileNotification(t0).runNow()))
    __obj.asInstanceOf[ITileNotificationFactory]
  }
}

