package typingsJapgolly.dynogels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dynogels.dynogelsStrings.create
  - typingsJapgolly.dynogels.dynogelsStrings.update
  - typingsJapgolly.dynogels.dynogelsStrings.destroy
*/
trait LifeCycleAction extends js.Object

object LifeCycleAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsJapgolly.dynogels.dynogelsStrings.create = this.cast("create")
  @scala.inline
  def destroy: typingsJapgolly.dynogels.dynogelsStrings.destroy = this.cast("destroy")
  @scala.inline
  def update: typingsJapgolly.dynogels.dynogelsStrings.update = this.cast("update")
}

