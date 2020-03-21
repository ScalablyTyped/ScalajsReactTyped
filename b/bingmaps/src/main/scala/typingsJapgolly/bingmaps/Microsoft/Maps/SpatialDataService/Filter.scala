package typingsJapgolly.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.SpatialDataService.Filter")
@js.native
class Filter protected () extends IFilter {
  /**
    * @constructor
    * @requires The Microsoft.Maps.SpatialDataService module.
    * @param propertyName The name of the property in the object to test against. Can also provide child properties i.e. 'root.child'.
    * @param operator The operator to use when comparing the specified property to value to the provided value.
    * @param value A value to compare against.
    */
  def this(propertyName: String, operator: String, value: js.Any) = this()
  def this(propertyName: String, operator: FilterCompareOperator, value: js.Any) = this()
  /**
    * Executes the filter logic against a JSON object and returns a boolean indicating if the object meets the requirements of the Filter.
    * @returns A boolean indicating if the specified object meets the requirements of the Filter.
    */
  /* CompleteClass */
  override def execute(`object`: js.Any): Boolean = js.native
}

