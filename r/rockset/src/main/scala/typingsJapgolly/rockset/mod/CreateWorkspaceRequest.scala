package typingsJapgolly.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateWorkspaceRequest extends js.Object {
  // longer explanation for the workspace
  var description: js.UndefOr[String] = js.undefined
  // descriptive label and unique identifier
  var name: String
}

object CreateWorkspaceRequest {
  @scala.inline
  def apply(name: String, description: String = null): CreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspaceRequest]
  }
}

