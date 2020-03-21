package typingsJapgolly.xrm.Xrm.Controls.Grid

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a grid entity.  Use the GridEntity methods to access data about the specific records in the rows.
  * GridEntity is returned by the GridRowData.getEntity method.
  *
  * @deprecated Use GridRow.data.entity instead.
  */
trait GridEntity extends js.Object {
  /**
    * Returns the logical name for the record in the row.
    *
    * @returns The entity name.
    * @deprecated Use GridRow.data.entity.getEntityName() instead.
    */
  def getEntityName(): String
  /**
    * Returns a LookupValue that references this record.
    *
    * @returns The entity reference.
    * @deprecated Use GridRow.data.entity.getEntityReference() instead.
    */
  def getEntityReference(): LookupValue
  /**
    * Returns the id for the record in the row.
    *
    * @returns The identifier of the GridEntity, in GUID format.
    * @example Example return: "{00000000-0000-0000-0000-000000000000}"
    * @deprecated Use GridRow.data.entity.getId() instead.
    */
  def getId(): String
  /**
    * Returns the primary attribute value for the record in the row.  (Commonly the name.)
    *
    * @returns The primary attribute value.
    * @deprecated Use GridRow.data.entity.getPrimaryAttributeValue() instead.
    */
  def getPrimaryAttributeValue(): String
}

object GridEntity {
  @scala.inline
  def apply(
    getEntityName: CallbackTo[String],
    getEntityReference: CallbackTo[LookupValue],
    getId: CallbackTo[String],
    getPrimaryAttributeValue: CallbackTo[String]
  ): GridEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEntityName")(getEntityName.toJsFn)
    __obj.updateDynamic("getEntityReference")(getEntityReference.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getPrimaryAttributeValue")(getPrimaryAttributeValue.toJsFn)
    __obj.asInstanceOf[GridEntity]
  }
}

