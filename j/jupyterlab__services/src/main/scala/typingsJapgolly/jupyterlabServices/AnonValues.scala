package typingsJapgolly.jupyterlabServices

import typingsJapgolly.jupyterlabServices.workspaceMod.Workspace.IWorkspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValues extends js.Object {
  var ids: js.Array[String]
  var values: js.Array[IWorkspace]
}

object AnonValues {
  @scala.inline
  def apply(ids: js.Array[String], values: js.Array[IWorkspace]): AnonValues = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonValues]
  }
}

