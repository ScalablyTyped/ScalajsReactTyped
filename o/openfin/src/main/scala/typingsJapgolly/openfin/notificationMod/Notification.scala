package typingsJapgolly.openfin.notificationMod

import typingsJapgolly.openfin.baseMod.EmitterBase
import typingsJapgolly.openfin.notificationsMod.NotificationEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/notification/notification", "_Notification")
@js.native
class Notification protected () extends EmitterBase[NotificationEvents] {
  def this(wire: typingsJapgolly.openfin.transportMod.default, options: NotificationOptions) = this()
  var listenerList: js.Any = js.native
  var message: js.Any = js.native
  var notificationId: Double = js.native
  var options: NotificationOptions = js.native
  var timeout: Double | String = js.native
  var unhookAllListeners: js.Any = js.native
  var url: String = js.native
  /**
    * Closes the notification
    * @return {Promise.<void>}
    * @tutorial Notification.close
    */
  def close(): js.Promise[Unit] = js.native
  /* protected */ def generalListener(msg: js.Any): Unit = js.native
  /**
    * Sends a message to the notification.
    * @param { any } message The message to be sent to the notification.
    * Can be either a primitive data type (string, number, or boolean)
    * or composite data type (object, array) that is composed of other
    * primitive or composite data types
    * @return {Promise.<void>}
    * @tutorial Notification.sendMessage
    */
  def sendMessage(message: js.Any): js.Promise[Unit] = js.native
  /**
    * Invoked when the notification is shown
    * @return {Promise.<void>}
    * @tutorial Notification.show
    */
  def show(): js.Promise[Unit] = js.native
}

