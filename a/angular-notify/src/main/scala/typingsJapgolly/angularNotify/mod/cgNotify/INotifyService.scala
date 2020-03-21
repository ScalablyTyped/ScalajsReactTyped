package typingsJapgolly.angularNotify.mod.cgNotify

import typingsJapgolly.angularNotify.AnonClasses
import typingsJapgolly.angularNotify.AnonContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotifyService extends js.Object {
  /**
    * The notify function can either be passed a string or an object.
    * This function will return an object with a close() method and a message property.
    * @param message
    */
  def apply(message: String): INotify = js.native
  /**
    * When passing an object, the object parameters can be:
    * @param option
    */
  def apply(option: AnonClasses): INotify = js.native
  /**
    * Closes all currently open notifications.
    */
  def closeAll(): Unit = js.native
  /**
    * Call config to set the default configuration options for angular-notify.
    * The following options may be specified in the given object:
    * @param option
    */
  def config(option: AnonContainer): Unit = js.native
}

