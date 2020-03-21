package typingsJapgolly.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.SharedVolume
  - typingsJapgolly.pulumiCloud.pulumiCloudStrings.HostPathVolume
*/
trait VolumeKind extends js.Object

object VolumeKind {
  @scala.inline
  def HostPathVolume: typingsJapgolly.pulumiCloud.pulumiCloudStrings.HostPathVolume = this.cast("HostPathVolume")
  @scala.inline
  def SharedVolume: typingsJapgolly.pulumiCloud.pulumiCloudStrings.SharedVolume = this.cast("SharedVolume")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

