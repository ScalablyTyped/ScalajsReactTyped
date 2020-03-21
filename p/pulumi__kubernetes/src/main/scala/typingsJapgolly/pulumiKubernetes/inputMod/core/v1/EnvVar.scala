package typingsJapgolly.pulumiKubernetes.inputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvVar represents an environment variable present in a Container.
  */
trait EnvVar extends js.Object {
  /**
    * Name of the environment variable. Must be a C_IDENTIFIER.
    */
  var name: Input[String]
  /**
    * Variable references $(VAR_NAME) are expanded using the previous defined environment
    * variables in the container and any service environment variables. If a variable cannot be
    * resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can
    * be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded,
    * regardless of whether the variable exists or not. Defaults to "".
    */
  var value: js.UndefOr[Input[String]] = js.undefined
  /**
    * Source for the environment variable's value. Cannot be used if value is not empty.
    */
  var valueFrom: js.UndefOr[Input[EnvVarSource]] = js.undefined
}

object EnvVar {
  @scala.inline
  def apply(name: Input[String], value: Input[String] = null, valueFrom: Input[EnvVarSource] = null): EnvVar = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueFrom != null) __obj.updateDynamic("valueFrom")(valueFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvVar]
  }
}

