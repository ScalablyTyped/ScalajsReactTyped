package typingsJapgolly.pulumiAws.inputMod.redshift

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroupParameter extends js.Object {
  /**
    * The name of the Redshift parameter.
    */
  var name: Input[String] = js.native
  /**
    * The value of the Redshift parameter.
    */
  var value: Input[String] = js.native
}

object ParameterGroupParameter {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): ParameterGroupParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParameterGroupParameter]
  }
}

