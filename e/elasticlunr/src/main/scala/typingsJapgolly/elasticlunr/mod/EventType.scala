package typingsJapgolly.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticlunr.elasticlunrStrings.add
  - typingsJapgolly.elasticlunr.elasticlunrStrings.update
  - typingsJapgolly.elasticlunr.elasticlunrStrings.remove
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def add: typingsJapgolly.elasticlunr.elasticlunrStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def remove: typingsJapgolly.elasticlunr.elasticlunrStrings.remove = this.cast("remove")
  @scala.inline
  def update: typingsJapgolly.elasticlunr.elasticlunrStrings.update = this.cast("update")
}

