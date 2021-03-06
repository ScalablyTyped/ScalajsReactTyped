package typingsJapgolly.rxJquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Notifications
@JSImport("rx-jquery", "Notification")
@js.native
class Notification[T] ()
  extends typingsJapgolly.rxLite.Rx.Notification[T]

/* static members */
@JSImport("rx-jquery", "Notification")
@js.native
object Notification extends js.Object {
  def createOnCompleted[T](): typingsJapgolly.rxLite.Rx.Notification[T] = js.native
  def createOnError[T](exception: js.Any): typingsJapgolly.rxLite.Rx.Notification[T] = js.native
  def createOnNext[T](value: T): typingsJapgolly.rxLite.Rx.Notification[T] = js.native
}

