package typingsJapgolly.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterDefinition extends js.Object {
  /**
    * A regular expression that represents the patterns to allow for String types.
    */
  var AllowedPattern: js.UndefOr[string] = js.native
  /**
    * An array containing the list of values allowed for the parameter.
    */
  var AllowedValues: js.UndefOr[listOfString] = js.native
  /**
    * A string that explains a constraint when the constraint is violated. For example, without a constraint description,
    a parameter that has an allowed pattern of [A-Za-z0-9]+ displays the following error message when the user
    specifies an invalid value:
    Malformed input-Parameter MyParameter must match pattern [A-Za-z0-9]+
    By adding a constraint description, such as "must contain only uppercase and lowercase letters and numbers," you can display
    the following customized error message:
    Malformed input-Parameter MyParameter must contain only uppercase and lowercase letters and numbers.
    
    */
  var ConstraintDescription: js.UndefOr[string] = js.native
  /**
    * A value of the appropriate type for the template to use if no value is specified when a stack is created.
    If you define constraints for the parameter, you must specify a value that adheres to those constraints.
    */
  var DefaultValue: js.UndefOr[string] = js.native
  /**
    * A string of up to 4,000 characters that describes the parameter.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * An integer value that determines the largest number of characters that you want to allow for String types.
    */
  var MaxLength: js.UndefOr[integer] = js.native
  /**
    * A numeric value that determines the largest numeric value that you want to allow for Number types.
    */
  var MaxValue: js.UndefOr[integer] = js.native
  /**
    * An integer value that determines the smallest number of characters that you want to allow for String types.
    */
  var MinLength: js.UndefOr[integer] = js.native
  /**
    * A numeric value that determines the smallest numeric value that you want to allow for Number types.
    */
  var MinValue: js.UndefOr[integer] = js.native
  /**
    * The name of the parameter.
    */
  var Name: string = js.native
  /**
    * Whether to mask the parameter value whenever anyone makes a call that describes the stack. If you set the
    value to true, the parameter value is masked with asterisks (*****).
    */
  var NoEcho: js.UndefOr[boolean] = js.native
  /**
    * A list of AWS SAM resources that use this parameter.
    */
  var ReferencedByResources: listOfString = js.native
  /**
    * The type of the parameter.Valid values: String | Number | List&lt;Number> | CommaDelimitedList
    
    String: A literal string.For example, users can specify "MyUserName".
    Number: An integer or float. AWS CloudFormation validates the parameter value as a number. However, when you use the
    parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a string.For example, users might specify "8888".
    List&lt;Number>: An array of integers or floats that are separated by commas. AWS CloudFormation validates the parameter value as numbers. However, when
    you use the parameter elsewhere in your template (for example, by using the Ref intrinsic function), the parameter value becomes a list of strings.For example, users might specify "80,20", and then Ref results in ["80","20"].
    CommaDelimitedList: An array of literal strings that are separated by commas. The total number of strings should be one more than the total number of commas.
    Also, each member string is space-trimmed.For example, users might specify "test,dev,prod", and then Ref results in ["test","dev","prod"].
    */
  var Type: js.UndefOr[string] = js.native
}

object ParameterDefinition {
  @scala.inline
  def apply(
    Name: string,
    ReferencedByResources: listOfString,
    AllowedPattern: string = null,
    AllowedValues: listOfString = null,
    ConstraintDescription: string = null,
    DefaultValue: string = null,
    Description: string = null,
    MaxLength: Int | Double = null,
    MaxValue: Int | Double = null,
    MinLength: Int | Double = null,
    MinValue: Int | Double = null,
    NoEcho: js.UndefOr[Boolean] = js.undefined,
    Type: string = null
  ): ParameterDefinition = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ReferencedByResources = ReferencedByResources.asInstanceOf[js.Any])
    if (AllowedPattern != null) __obj.updateDynamic("AllowedPattern")(AllowedPattern.asInstanceOf[js.Any])
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    if (ConstraintDescription != null) __obj.updateDynamic("ConstraintDescription")(ConstraintDescription.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (MaxLength != null) __obj.updateDynamic("MaxLength")(MaxLength.asInstanceOf[js.Any])
    if (MaxValue != null) __obj.updateDynamic("MaxValue")(MaxValue.asInstanceOf[js.Any])
    if (MinLength != null) __obj.updateDynamic("MinLength")(MinLength.asInstanceOf[js.Any])
    if (MinValue != null) __obj.updateDynamic("MinValue")(MinValue.asInstanceOf[js.Any])
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterDefinition]
  }
}

