package typingsJapgolly.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dockerode.dockerodeStrings.bind
  - typingsJapgolly.dockerode.dockerodeStrings.volume
  - typingsJapgolly.dockerode.dockerodeStrings.tmpfs
*/
trait MountType extends js.Object

object MountType {
  @scala.inline
  def bind: typingsJapgolly.dockerode.dockerodeStrings.bind = this.cast("bind")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tmpfs: typingsJapgolly.dockerode.dockerodeStrings.tmpfs = this.cast("tmpfs")
  @scala.inline
  def volume: typingsJapgolly.dockerode.dockerodeStrings.volume = this.cast("volume")
}

