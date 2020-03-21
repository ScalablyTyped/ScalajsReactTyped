package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DataTableEx...
  */
trait IDataTableEx extends js.Object {
  /**
    * List of the fields in the table.
    */
  var qFields: js.Array[IDataField]
  /**
    * List of format specification items, within brackets.
    * Examples of specification items:
    *
    *    - file type
    *    - embedded labels, no labels
    *    - table is <table name>
    */
  var qFormatSpec: String
  /**
    * Name of the table.
    */
  var qName: String
}

object IDataTableEx {
  @scala.inline
  def apply(qFields: js.Array[IDataField], qFormatSpec: String, qName: String): IDataTableEx = {
    val __obj = js.Dynamic.literal(qFields = qFields.asInstanceOf[js.Any], qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDataTableEx]
  }
}

