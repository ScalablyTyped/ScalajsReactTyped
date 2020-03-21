package typingsJapgolly.pulumiAws.inputMod.ssm

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskParameter extends js.Object {
  /**
    * The parameter name.
    */
  var name: Input[String] = js.native
  /**
    * The array of strings.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object MaintenanceWindowTaskTaskParameter {
  @scala.inline
  def apply(name: Input[String], values: Input[js.Array[Input[String]]]): MaintenanceWindowTaskTaskParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaintenanceWindowTaskTaskParameter]
  }
}

