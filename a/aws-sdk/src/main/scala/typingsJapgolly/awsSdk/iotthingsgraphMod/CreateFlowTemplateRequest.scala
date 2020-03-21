package typingsJapgolly.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowTemplateRequest extends js.Object {
  /**
    * The namespace version in which the workflow is to be created. If no value is specified, the latest version is used by default.
    */
  var compatibleNamespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The workflow DefinitionDocument.
    */
  var definition: DefinitionDocument = js.native
}

object CreateFlowTemplateRequest {
  @scala.inline
  def apply(definition: DefinitionDocument, compatibleNamespaceVersion: Int | Double = null): CreateFlowTemplateRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    if (compatibleNamespaceVersion != null) __obj.updateDynamic("compatibleNamespaceVersion")(compatibleNamespaceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowTemplateRequest]
  }
}

