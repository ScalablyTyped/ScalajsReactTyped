package typingsJapgolly.ionic.libProjectMod

import typingsJapgolly.ionic.definitionsMod.ProjectType
import typingsJapgolly.ionic.ionicStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsUnknownResult extends ProjectDetailsResultBase {
  val context: unknown
}

object ProjectDetailsUnknownResult {
  @scala.inline
  def apply(context: unknown, errors: js.Array[ProjectDetailsError], `type`: ProjectType = null): ProjectDetailsUnknownResult = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsUnknownResult]
  }
}

