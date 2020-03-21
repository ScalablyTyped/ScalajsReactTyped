package typingsJapgolly.pulumiAws.inputMod.rds

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionGroupOption extends js.Object {
  /**
    * A list of DB Security Groups for which the option is enabled.
    */
  var dbSecurityGroupMemberships: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The Name of the Option (e.g. MEMCACHED).
    */
  var optionName: Input[String] = js.native
  /**
    * A list of option settings to apply.
    */
  var optionSettings: js.UndefOr[Input[js.Array[Input[OptionGroupOptionOptionSetting]]]] = js.native
  /**
    * The Port number when connecting to the Option (e.g. 11211).
    */
  var port: js.UndefOr[Input[Double]] = js.native
  /**
    * The version of the option (e.g. 13.1.0.0).
    */
  var version: js.UndefOr[Input[String]] = js.native
  /**
    * A list of VPC Security Groups for which the option is enabled.
    */
  var vpcSecurityGroupMemberships: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object OptionGroupOption {
  @scala.inline
  def apply(
    optionName: Input[String],
    dbSecurityGroupMemberships: Input[js.Array[Input[String]]] = null,
    optionSettings: Input[js.Array[Input[OptionGroupOptionOptionSetting]]] = null,
    port: Input[Double] = null,
    version: Input[String] = null,
    vpcSecurityGroupMemberships: Input[js.Array[Input[String]]] = null
  ): OptionGroupOption = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any])
    if (dbSecurityGroupMemberships != null) __obj.updateDynamic("dbSecurityGroupMemberships")(dbSecurityGroupMemberships.asInstanceOf[js.Any])
    if (optionSettings != null) __obj.updateDynamic("optionSettings")(optionSettings.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (vpcSecurityGroupMemberships != null) __obj.updateDynamic("vpcSecurityGroupMemberships")(vpcSecurityGroupMemberships.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupOption]
  }
}

