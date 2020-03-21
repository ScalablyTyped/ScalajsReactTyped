package typingsJapgolly.jupyterlabObservables.observablestringMod.IObservableString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change types which occur on an observable string.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.insert
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.remove
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.set
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def insert: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.insert = this.cast("insert")
  @scala.inline
  def remove: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.remove = this.cast("remove")
  @scala.inline
  def set: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.set = this.cast("set")
}

