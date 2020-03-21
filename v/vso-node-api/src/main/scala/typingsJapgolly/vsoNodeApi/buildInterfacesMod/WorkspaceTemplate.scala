package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceTemplate extends js.Object {
  /**
    * Uri of the associated definition
    */
  var definitionUri: String
  /**
    * The identity that last modified this template
    */
  var lastModifiedBy: String
  /**
    * The last time this template was modified
    */
  var lastModifiedDate: js.Date
  /**
    * List of workspace mappings
    */
  var mappings: js.Array[WorkspaceMapping]
  /**
    * Id of the workspace for this template
    */
  var workspaceId: Double
}

object WorkspaceTemplate {
  @scala.inline
  def apply(
    definitionUri: String,
    lastModifiedBy: String,
    lastModifiedDate: js.Date,
    mappings: js.Array[WorkspaceMapping],
    workspaceId: Double
  ): WorkspaceTemplate = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], lastModifiedBy = lastModifiedBy.asInstanceOf[js.Any], lastModifiedDate = lastModifiedDate.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkspaceTemplate]
  }
}

