package typingsJapgolly.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * A range of values within which the parameter can be set.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The conditions under which changes to this parameter can be applied. For example, requires-reboot indicates that a new value for this parameter will only take effect if a node is rebooted.
    */
  var ChangeType: js.UndefOr[typingsJapgolly.awsSdk.daxMod.ChangeType] = js.native
  /**
    * The data type of the parameter. For example, integer:
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * A description of the parameter
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Whether the customer is allowed to modify the parameter.
    */
  var IsModifiable: js.UndefOr[typingsJapgolly.awsSdk.daxMod.IsModifiable] = js.native
  /**
    * A list of node types, and specific parameter values for each node.
    */
  var NodeTypeSpecificValues: js.UndefOr[NodeTypeSpecificValueList] = js.native
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
    */
  var ParameterType: js.UndefOr[typingsJapgolly.awsSdk.daxMod.ParameterType] = js.native
  /**
    * The value for the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  /**
    * How the parameter is defined. For example, system denotes a system-defined parameter.
    */
  var Source: js.UndefOr[String] = js.native
}

object Parameter {
  @scala.inline
  def apply(
    AllowedValues: String = null,
    ChangeType: ChangeType = null,
    DataType: String = null,
    Description: String = null,
    IsModifiable: IsModifiable = null,
    NodeTypeSpecificValues: NodeTypeSpecificValueList = null,
    ParameterName: String = null,
    ParameterType: ParameterType = null,
    ParameterValue: String = null,
    Source: String = null
  ): Parameter = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    if (ChangeType != null) __obj.updateDynamic("ChangeType")(ChangeType.asInstanceOf[js.Any])
    if (DataType != null) __obj.updateDynamic("DataType")(DataType.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (IsModifiable != null) __obj.updateDynamic("IsModifiable")(IsModifiable.asInstanceOf[js.Any])
    if (NodeTypeSpecificValues != null) __obj.updateDynamic("NodeTypeSpecificValues")(NodeTypeSpecificValues.asInstanceOf[js.Any])
    if (ParameterName != null) __obj.updateDynamic("ParameterName")(ParameterName.asInstanceOf[js.Any])
    if (ParameterType != null) __obj.updateDynamic("ParameterType")(ParameterType.asInstanceOf[js.Any])
    if (ParameterValue != null) __obj.updateDynamic("ParameterValue")(ParameterValue.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameter]
  }
}

