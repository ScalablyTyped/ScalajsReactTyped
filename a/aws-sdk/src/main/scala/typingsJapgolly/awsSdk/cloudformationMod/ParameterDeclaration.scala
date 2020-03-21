package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterDeclaration extends js.Object {
  /**
    * The default value of the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.native
  /**
    * The description that is associate with the parameter.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
    */
  var NoEcho: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.NoEcho] = js.native
  /**
    * The criteria that AWS CloudFormation uses to validate parameter values.
    */
  var ParameterConstraints: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.ParameterConstraints] = js.native
  /**
    * The name that is associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.ParameterKey] = js.native
  /**
    * The type of parameter.
    */
  var ParameterType: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.ParameterType] = js.native
}

object ParameterDeclaration {
  @scala.inline
  def apply(
    DefaultValue: ParameterValue = null,
    Description: Description = null,
    NoEcho: js.UndefOr[Boolean] = js.undefined,
    ParameterConstraints: ParameterConstraints = null,
    ParameterKey: ParameterKey = null,
    ParameterType: ParameterType = null
  ): ParameterDeclaration = {
    val __obj = js.Dynamic.literal()
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho.asInstanceOf[js.Any])
    if (ParameterConstraints != null) __obj.updateDynamic("ParameterConstraints")(ParameterConstraints.asInstanceOf[js.Any])
    if (ParameterKey != null) __obj.updateDynamic("ParameterKey")(ParameterKey.asInstanceOf[js.Any])
    if (ParameterType != null) __obj.updateDynamic("ParameterType")(ParameterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDeclaration]
  }
}

