package typingsJapgolly.applicationinsightsJs.Microsoft.ApplicationInsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISerializable extends js.Object {
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  var aiDataContract: js.Any
}

object ISerializable {
  @scala.inline
  def apply(aiDataContract: js.Any): ISerializable = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISerializable]
  }
}

