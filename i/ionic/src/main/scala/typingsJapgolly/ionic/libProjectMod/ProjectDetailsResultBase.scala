package typingsJapgolly.ionic.libProjectMod

import typingsJapgolly.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsResultBase extends js.Object {
  val errors: js.Array[ProjectDetailsError]
  val `type`: js.UndefOr[ProjectType] = js.undefined
}

object ProjectDetailsResultBase {
  @scala.inline
  def apply(errors: js.Array[ProjectDetailsError], `type`: ProjectType = null): ProjectDetailsResultBase = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsResultBase]
  }
}

