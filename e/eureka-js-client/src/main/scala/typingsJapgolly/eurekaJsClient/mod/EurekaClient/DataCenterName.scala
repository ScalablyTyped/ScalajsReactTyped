package typingsJapgolly.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.Netflix
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.Amazon
  - typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.MyOwn
*/
trait DataCenterName extends js.Object

object DataCenterName {
  @scala.inline
  def Amazon: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.Amazon = this.cast("Amazon")
  @scala.inline
  def MyOwn: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.MyOwn = this.cast("MyOwn")
  @scala.inline
  def Netflix: typingsJapgolly.eurekaJsClient.eurekaJsClientStrings.Netflix = this.cast("Netflix")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

