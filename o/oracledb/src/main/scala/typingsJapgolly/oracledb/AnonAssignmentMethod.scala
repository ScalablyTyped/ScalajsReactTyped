package typingsJapgolly.oracledb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssignmentMethod extends js.Object {
  /**
    * Method used to assign keys to objects that are inserted into the collection.
    *
    * @default UUID
    */
  var assignmentMethod: js.UndefOr[String] = js.undefined
  /**
    * Maximum length of the key column in bytes. This component applies only to keys of type VARCHAR2.
    *
    * @default 255
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * Name of the column that stores the document key.
    *
    * @default ID
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Name of the database sequence that generates keys for documents that are inserted into a collection if
    * the key assignment method is SEQUENCE.
    *
    * If you specify the key assignment method as SEQUENCE then you must also specify the name of that sequence.
    * If the specified sequence does not exist then SODA creates it.
    */
  var sequenceName: js.UndefOr[String] = js.undefined
  /**
    * SQL data type of the column that stores the document key.
    *
    * @default VARCHAR2
    */
  var sqlType: js.UndefOr[String] = js.undefined
}

object AnonAssignmentMethod {
  @scala.inline
  def apply(
    assignmentMethod: String = null,
    maxLength: Int | Double = null,
    name: String = null,
    sequenceName: String = null,
    sqlType: String = null
  ): AnonAssignmentMethod = {
    val __obj = js.Dynamic.literal()
    if (assignmentMethod != null) __obj.updateDynamic("assignmentMethod")(assignmentMethod.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sequenceName != null) __obj.updateDynamic("sequenceName")(sequenceName.asInstanceOf[js.Any])
    if (sqlType != null) __obj.updateDynamic("sqlType")(sqlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssignmentMethod]
  }
}

