package typingsJapgolly.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Measure")
@js.native
class Measure protected () extends js.Object {
  /**
    * Create a representation of a measure provided by an analytic query. Do not create your own
    * instances.
    * @param oQueryResult The query result containing this measure
    * @param oProperty The DataJS object object representing the measure
    */
  def this(oQueryResult: QueryResult, oProperty: js.Any) = this()
  /**
    * Get the text property associated to the raw value property holding theformatted value related to
    * this measure
    * @returns The DataJS object representing the property holding the         formatted value text of
    * this measure or null if this measure         does not have a unit
    */
  def getFormattedValueProperty(): js.Any = js.native
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         measure
    */
  def getLabelText(): String = js.native
  /**
    * Get the name of the measure
    * @returns The name of the measure, which is identical to the name         of the measure raw value
    * property in the entity type
    */
  def getName(): String = js.native
  /**
    * Get the raw value property
    * @returns The DataJS object representing the property holding the         raw value of this measure
    */
  def getRawValueProperty(): js.Any = js.native
  /**
    * Get the unit property related to this measure
    * @returns The DataJS object representing the unit property or         null if this measure does not
    * have a unit
    */
  def getUnitProperty(): js.Any = js.native
  /**
    * Get indicator whether or not the measure is updatable
    * @returns True iff the measure is updatable
    */
  def isUpdatable(): Boolean = js.native
}

