package typingsJapgolly.gitlab.commitsMod

import typingsJapgolly.gitlab.gitlabStrings.create
import typingsJapgolly.gitlab.gitlabStrings.delete
import typingsJapgolly.gitlab.gitlabStrings.move
import typingsJapgolly.gitlab.gitlabStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitAction extends js.Object {
  /** The action to perform */
  var action: create | delete | move | update
  /** File content, required for all except delete. Optional for move */
  var content: js.UndefOr[String] = js.undefined
  /** text or base64. text is default. */
  var encoding: js.UndefOr[String] = js.undefined
  /** Full path to the file. Ex. lib/class.rb */
  var filePath: String
  /** Last known file commit id. Will be only considered in update, move and delete actions. */
  var lastCommitId: js.UndefOr[String] = js.undefined
  /** Original full path to the file being moved.Ex.lib / class1.rb */
  var previousPath: js.UndefOr[String] = js.undefined
}

object CommitAction {
  @scala.inline
  def apply(
    action: create | delete | move | update,
    filePath: String,
    content: String = null,
    encoding: String = null,
    lastCommitId: String = null,
    previousPath: String = null
  ): CommitAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (lastCommitId != null) __obj.updateDynamic("lastCommitId")(lastCommitId.asInstanceOf[js.Any])
    if (previousPath != null) __obj.updateDynamic("previousPath")(previousPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitAction]
  }
}

