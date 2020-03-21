package typingsJapgolly.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Defined Variable configuration.
  */
@js.native
trait SchemaUserDefinedVariableConfiguration extends js.Object {
  /**
    * Data type for the variable. This is a required field.
    */
  var dataType: js.UndefOr[String] = js.native
  /**
    * User-friendly name for the variable which will appear in reports. This is
    * a required field, must be less than 64 characters long, and cannot
    * contain the following characters: &quot;&quot;&lt;&gt;&quot;.
    */
  var reportName: js.UndefOr[String] = js.native
  /**
    * Variable name in the tag. This is a required field.
    */
  var variableType: js.UndefOr[String] = js.native
}

object SchemaUserDefinedVariableConfiguration {
  @scala.inline
  def apply(dataType: String = null, reportName: String = null, variableType: String = null): SchemaUserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (reportName != null) __obj.updateDynamic("reportName")(reportName.asInstanceOf[js.Any])
    if (variableType != null) __obj.updateDynamic("variableType")(variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUserDefinedVariableConfiguration]
  }
}

