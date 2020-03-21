package typingsJapgolly.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.FilterEvent")
@js.native
class FilterEvent () extends TableauEvent {
  /** Gets the name of the field. */
  def getFieldName(): String = js.native
  /** Gets the Filter object associated with the event. */
  def getFilterAsync(): js.Promise[ConcreteFilter] = js.native
  /** Gets the Worksheet object associated with the event. */
  def getWorksheet(): Worksheet = js.native
}

