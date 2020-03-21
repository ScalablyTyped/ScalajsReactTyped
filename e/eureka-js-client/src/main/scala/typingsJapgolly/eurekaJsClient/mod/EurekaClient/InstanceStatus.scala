package typingsJapgolly.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.UP
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.DOWN
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.STARTING
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.UNKNOWN
*/
trait InstanceStatus extends js.Object

object InstanceStatus {
  @scala.inline
  def DOWN: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.DOWN = this.cast("DOWN")
  @scala.inline
  def OUT_OF_SERVICE: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.OUT_OF_SERVICE = this.cast("OUT_OF_SERVICE")
  @scala.inline
  def STARTING: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.STARTING = this.cast("STARTING")
  @scala.inline
  def UNKNOWN: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def UP: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.UP = this.cast("UP")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

