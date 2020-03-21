package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteModelInput extends js.Object {
  /**
    * The name of the model to delete.
    */
  var ModelName: typingsJapgolly.awsSdk.sagemakerMod.ModelName = js.native
}

object DeleteModelInput {
  @scala.inline
  def apply(ModelName: ModelName): DeleteModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteModelInput]
  }
}

