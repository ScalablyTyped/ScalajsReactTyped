package typingsJapgolly.pulumiAws.inputMod.rds

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOptionOptionSetting extends js.Object {
  /**
    * The Name of the setting.
    */
  var name: Input[String] = js.native
  /**
    * The Value of the setting.
    */
  var value: Input[String] = js.native
}

object OptionGroupOptionOptionSetting {
  @scala.inline
  def apply(name: Input[String], value: Input[String]): OptionGroupOptionOptionSetting = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionGroupOptionOptionSetting]
  }
}

