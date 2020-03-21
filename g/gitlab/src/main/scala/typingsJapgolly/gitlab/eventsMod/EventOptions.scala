package typingsJapgolly.gitlab.eventsMod

import typingsJapgolly.gitlab.gitlabStrings.closed
import typingsJapgolly.gitlab.gitlabStrings.commented
import typingsJapgolly.gitlab.gitlabStrings.created
import typingsJapgolly.gitlab.gitlabStrings.destroyed
import typingsJapgolly.gitlab.gitlabStrings.expired
import typingsJapgolly.gitlab.gitlabStrings.issue
import typingsJapgolly.gitlab.gitlabStrings.joined
import typingsJapgolly.gitlab.gitlabStrings.left
import typingsJapgolly.gitlab.gitlabStrings.merge_request
import typingsJapgolly.gitlab.gitlabStrings.merged
import typingsJapgolly.gitlab.gitlabStrings.milestone
import typingsJapgolly.gitlab.gitlabStrings.note
import typingsJapgolly.gitlab.gitlabStrings.project
import typingsJapgolly.gitlab.gitlabStrings.pushed
import typingsJapgolly.gitlab.gitlabStrings.reopened
import typingsJapgolly.gitlab.gitlabStrings.snippet
import typingsJapgolly.gitlab.gitlabStrings.updated
import typingsJapgolly.gitlab.gitlabStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  var action: js.UndefOr[
    created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
  ] = js.undefined
  var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    action: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired = null,
    targetType: issue | milestone | merge_request | note | project | snippet | user = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptions]
  }
}

