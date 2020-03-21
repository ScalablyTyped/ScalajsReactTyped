package typingsJapgolly.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.linux
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.windows
*/
trait HostOperatingSystem extends js.Object

object HostOperatingSystem {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linux: typingsJapgolly.pulumiCloud.pulumiCloudStrings.linux = this.cast("linux")
  @scala.inline
  def windows: typingsJapgolly.pulumiCloud.pulumiCloudStrings.windows = this.cast("windows")
}

