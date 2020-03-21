package typingsJapgolly.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.powerappsComponentFramework.ComponentFramework.EntityReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Base interface for dataset record result. Supports value retrival by column name.
			 */
trait EntityRecord extends js.Object {
  /**
  				 * Get the current formatted value of this record column.
  				 * @param columnName Column name of the record
  				 */
  def getFormattedValue(columnName: String): String
  /**
  				 * Get the object that encapsulates an Entity Reference as a plain object
  				 */
  def getNamedReference(): EntityReference
  /**
  				 * Get the record ID
  				 */
  def getRecordId(): String
  /**
  				 * Get the raw value of the record's column
  				 * @param columnName Column name of the record
  				 */
  def getValue(columnName: String): String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
}

object EntityRecord {
  @scala.inline
  def apply(
    getFormattedValue: String => CallbackTo[String],
    getNamedReference: CallbackTo[EntityReference],
    getRecordId: CallbackTo[String],
    getValue: String => CallbackTo[
      String | js.Date | Double | (js.Array[Double | EntityReference]) | Boolean | EntityReference
    ]
  ): EntityRecord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFormattedValue")(js.Any.fromFunction1((t0: java.lang.String) => getFormattedValue(t0).runNow()))
    __obj.updateDynamic("getNamedReference")(getNamedReference.toJsFn)
    __obj.updateDynamic("getRecordId")(getRecordId.toJsFn)
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: java.lang.String) => getValue(t0).runNow()))
    __obj.asInstanceOf[EntityRecord]
  }
}

