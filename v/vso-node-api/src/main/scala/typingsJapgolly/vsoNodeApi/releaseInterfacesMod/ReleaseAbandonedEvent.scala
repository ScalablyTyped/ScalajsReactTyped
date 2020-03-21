package typingsJapgolly.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseAbandonedEvent extends js.Object {
  var project: ProjectReference
  var release: Release
}

object ReleaseAbandonedEvent {
  @scala.inline
  def apply(project: ProjectReference, release: Release): ReleaseAbandonedEvent = {
    val __obj = js.Dynamic.literal(project = project.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseAbandonedEvent]
  }
}

