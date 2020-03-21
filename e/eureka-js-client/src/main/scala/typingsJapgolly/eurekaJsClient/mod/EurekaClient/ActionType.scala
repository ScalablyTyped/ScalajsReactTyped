package typingsJapgolly.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.ADDED
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.MODIFIED
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.DELETED
*/
trait ActionType extends js.Object

object ActionType {
  @scala.inline
  def ADDED: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.ADDED = this.cast("ADDED")
  @scala.inline
  def DELETED: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.DELETED = this.cast("DELETED")
  @scala.inline
  def MODIFIED: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.MODIFIED = this.cast("MODIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

