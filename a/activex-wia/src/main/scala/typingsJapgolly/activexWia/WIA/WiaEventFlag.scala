package typingsJapgolly.activexWia.WIA

import typingsJapgolly.activexWia.activexWiaNumbers.`1`
import typingsJapgolly.activexWia.activexWiaNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DeviceEvent's type is composed of bits from the WiaEventFlags enumeration. You can test a DeviceEvent's type by using the AND operation with
  * DeviceEvent.Type and a member from the WiaEventFlags enumeration.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexWia.activexWiaNumbers.`2`
  - typingsJapgolly.activexWia.activexWiaNumbers.`1`
*/
trait WiaEventFlag extends js.Object

object WiaEventFlag {
  @scala.inline
  def ActionEvent: `2` = this.cast(2)
  @scala.inline
  def NotificationEvent: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

