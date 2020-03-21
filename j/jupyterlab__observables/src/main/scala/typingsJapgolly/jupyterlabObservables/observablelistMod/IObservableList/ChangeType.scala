package typingsJapgolly.jupyterlabObservables.observablelistMod.IObservableList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable list.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.add
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.move
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  def add: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def move: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.move = this.cast("move")
  @scala.inline
  def remove: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.set = this.cast("set")
}

