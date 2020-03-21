package typingsJapgolly.vsoNodeApi.gitInterfacesMod

import typingsJapgolly.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TfvcCheckinEventData extends js.Object {
  var changeset: TfvcChangeset
  var project: TeamProjectReference
}

object TfvcCheckinEventData {
  @scala.inline
  def apply(changeset: TfvcChangeset, project: TeamProjectReference): TfvcCheckinEventData = {
    val __obj = js.Dynamic.literal(changeset = changeset.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TfvcCheckinEventData]
  }
}

