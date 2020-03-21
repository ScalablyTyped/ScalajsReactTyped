package typingsJapgolly.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.create
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stop
  - typingsJapgolly.pollyjsCore.pollyjsCoreStrings.register
*/
trait PollyEvent extends js.Object

object PollyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.create = this.cast("create")
  @scala.inline
  def register: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.register = this.cast("register")
  @scala.inline
  def stop: typingsJapgolly.pollyjsCore.pollyjsCoreStrings.stop = this.cast("stop")
}

