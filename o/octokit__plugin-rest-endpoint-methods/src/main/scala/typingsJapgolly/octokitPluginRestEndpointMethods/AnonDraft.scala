package typingsJapgolly.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDraft extends js.Object {
  var base: AnonRequired
  var draft: AnonType
  var head: AnonRequired
  var issue: AnonRequired
  var maintainer_can_modify: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonDraft {
  @scala.inline
  def apply(
    base: AnonRequired,
    draft: AnonType,
    head: AnonRequired,
    issue: AnonRequired,
    maintainer_can_modify: AnonType,
    owner: AnonRequired,
    repo: AnonRequired
  ): AnonDraft = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], draft = draft.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], maintainer_can_modify = maintainer_can_modify.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDraft]
  }
}

