package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelInput extends js.Object {
  /**
    * The name of the model.
    */
  var ModelName: typingsJapgolly.awsSdk.sagemakerMod.ModelName = js.native
}

object DescribeModelInput {
  @scala.inline
  def apply(ModelName: ModelName): DescribeModelInput = {
    val __obj = js.Dynamic.literal(ModelName = ModelName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeModelInput]
  }
}

