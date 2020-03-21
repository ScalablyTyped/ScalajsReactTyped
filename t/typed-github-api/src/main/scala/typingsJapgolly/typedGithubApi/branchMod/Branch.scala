package typingsJapgolly.typedGithubApi.branchMod

import typingsJapgolly.typedGithubApi.AnonHtml
import typingsJapgolly.typedGithubApi.commitMod.CommitSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  var _links: AnonHtml
  var commit: CommitSummary
  var name: String
  var `protected`: js.UndefOr[Boolean] = js.undefined
  var protection_url: js.UndefOr[String] = js.undefined
}

object Branch {
  @scala.inline
  def apply(
    _links: AnonHtml,
    commit: CommitSummary,
    name: String,
    `protected`: js.UndefOr[Boolean] = js.undefined,
    protection_url: String = null
  ): Branch = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    if (protection_url != null) __obj.updateDynamic("protection_url")(protection_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
}

