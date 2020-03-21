package typingsJapgolly.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dockerode.dockerodeStrings.default
  - typingsJapgolly.dockerode.dockerodeStrings.consistent
  - typingsJapgolly.dockerode.dockerodeStrings.cached
  - typingsJapgolly.dockerode.dockerodeStrings.delegated
*/
trait MountConsistency extends js.Object

object MountConsistency {
  @scala.inline
  def cached: typingsJapgolly.dockerode.dockerodeStrings.cached = this.cast("cached")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def consistent: typingsJapgolly.dockerode.dockerodeStrings.consistent = this.cast("consistent")
  @scala.inline
  def default: typingsJapgolly.dockerode.dockerodeStrings.default = this.cast("default")
  @scala.inline
  def delegated: typingsJapgolly.dockerode.dockerodeStrings.delegated = this.cast("delegated")
}

