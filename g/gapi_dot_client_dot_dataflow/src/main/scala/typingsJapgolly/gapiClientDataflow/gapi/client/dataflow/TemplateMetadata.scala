package typingsJapgolly.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateMetadata extends js.Object {
  /** Optional. A description of the template. */
  var description: js.UndefOr[String] = js.undefined
  /** Required. The name of the template. */
  var name: js.UndefOr[String] = js.undefined
  /** The parameters for the template. */
  var parameters: js.UndefOr[js.Array[ParameterMetadata]] = js.undefined
}

object TemplateMetadata {
  @scala.inline
  def apply(description: String = null, name: String = null, parameters: js.Array[ParameterMetadata] = null): TemplateMetadata = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateMetadata]
  }
}

