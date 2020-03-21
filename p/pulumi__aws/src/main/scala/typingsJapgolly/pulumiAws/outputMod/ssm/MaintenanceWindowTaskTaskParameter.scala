package typingsJapgolly.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskTaskParameter extends js.Object {
  /**
    * The parameter name.
    */
  var name: String = js.native
  /**
    * The array of strings.
    */
  var values: js.Array[String] = js.native
}

object MaintenanceWindowTaskTaskParameter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): MaintenanceWindowTaskTaskParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MaintenanceWindowTaskTaskParameter]
  }
}

