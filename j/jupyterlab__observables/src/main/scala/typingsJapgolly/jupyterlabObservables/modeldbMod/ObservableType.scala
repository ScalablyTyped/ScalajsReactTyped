package typingsJapgolly.jupyterlabObservables.modeldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Map
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.List
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.String
  - typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Value
*/
trait ObservableType extends js.Object

object ObservableType {
  @scala.inline
  def List: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.List = this.cast("List")
  @scala.inline
  def Map: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Map = this.cast("Map")
  @scala.inline
  def String: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.String = this.cast("String")
  @scala.inline
  def Value: typingsJapgolly.jupyterlabObservables.jupyterlabObservablesStrings.Value = this.cast("Value")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

