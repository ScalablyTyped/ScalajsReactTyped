package typingsJapgolly.pulumiAws.inputMod.cloudwatch

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetRunCommandTarget extends js.Object {
  /**
    * Can be either `tag:tag-key` or `InstanceIds`.
    */
  var key: Input[String] = js.native
  /**
    * If Key is `tag:tag-key`, Values is a list of tag values. If Key is `InstanceIds`, Values is a list of Amazon EC2 instance IDs.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object EventTargetRunCommandTarget {
  @scala.inline
  def apply(key: Input[String], values: Input[js.Array[Input[String]]]): EventTargetRunCommandTarget = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventTargetRunCommandTarget]
  }
}

