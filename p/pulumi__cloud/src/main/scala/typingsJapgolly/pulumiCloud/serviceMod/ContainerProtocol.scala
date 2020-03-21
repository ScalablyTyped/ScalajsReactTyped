package typingsJapgolly.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.tcp
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.udp
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.http
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.https
*/
trait ContainerProtocol extends js.Object

object ContainerProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def http: typingsJapgolly.pulumiCloud.pulumiCloudStrings.http = this.cast("http")
  @scala.inline
  def https: typingsJapgolly.pulumiCloud.pulumiCloudStrings.https = this.cast("https")
  @scala.inline
  def tcp: typingsJapgolly.pulumiCloud.pulumiCloudStrings.tcp = this.cast("tcp")
  @scala.inline
  def udp: typingsJapgolly.pulumiCloud.pulumiCloudStrings.udp = this.cast("udp")
}

