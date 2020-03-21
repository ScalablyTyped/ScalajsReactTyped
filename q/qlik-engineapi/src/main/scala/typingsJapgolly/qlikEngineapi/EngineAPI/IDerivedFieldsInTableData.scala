package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DerivedFieldsInTableData...
  */
trait IDerivedFieldsInTableData extends js.Object {
  /**
    * Is set to true is the derived field is in use.
    */
  var qActive: Boolean
  /**
    * Name of the derived definition.
    */
  var qDefinitionName: String
  /**
    * List of tags.
    */
  var qTags: js.Array[String]
}

object IDerivedFieldsInTableData {
  @scala.inline
  def apply(qActive: Boolean, qDefinitionName: String, qTags: js.Array[String]): IDerivedFieldsInTableData = {
    val __obj = js.Dynamic.literal(qActive = qActive.asInstanceOf[js.Any], qDefinitionName = qDefinitionName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDerivedFieldsInTableData]
  }
}

