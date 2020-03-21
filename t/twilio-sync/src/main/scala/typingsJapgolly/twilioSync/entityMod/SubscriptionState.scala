package typingsJapgolly.twilioSync.entityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.twilioSync.twilioSyncStrings.none
  - typingsJapgolly.twilioSync.twilioSyncStrings.request_in_flight
  - typingsJapgolly.twilioSync.twilioSyncStrings.response_in_flight
  - typingsJapgolly.twilioSync.twilioSyncStrings.established
*/
trait SubscriptionState extends js.Object

object SubscriptionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def established: typingsJapgolly.twilioSync.twilioSyncStrings.established = this.cast("established")
  @scala.inline
  def none: typingsJapgolly.twilioSync.twilioSyncStrings.none = this.cast("none")
  @scala.inline
  def request_in_flight: typingsJapgolly.twilioSync.twilioSyncStrings.request_in_flight = this.cast("request_in_flight")
  @scala.inline
  def response_in_flight: typingsJapgolly.twilioSync.twilioSyncStrings.response_in_flight = this.cast("response_in_flight")
}

