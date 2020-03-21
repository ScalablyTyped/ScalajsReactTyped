package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterMetadata extends js.Object {
  /** Required. The help text to display for the parameter. */
  var helpText: js.UndefOr[String] = js.undefined
  /** Optional. Whether the parameter is optional. Defaults to false. */
  var isOptional: js.UndefOr[Boolean] = js.undefined
  /** Required. The label to display for the parameter. */
  var label: js.UndefOr[String] = js.undefined
  /** Required. The name of the parameter. */
  var name: js.UndefOr[String] = js.undefined
  /** Optional. Regexes that the parameter must match. */
  var regexes: js.UndefOr[js.Array[String]] = js.undefined
}

object ParameterMetadata {
  @scala.inline
  def apply(
    helpText: String = null,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    regexes: js.Array[String] = null
  ): ParameterMetadata = {
    val __obj = js.Dynamic.literal()
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regexes != null) __obj.updateDynamic("regexes")(regexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterMetadata]
  }
}

