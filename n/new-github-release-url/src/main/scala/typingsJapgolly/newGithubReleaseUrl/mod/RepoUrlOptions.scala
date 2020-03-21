package typingsJapgolly.newGithubReleaseUrl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoUrlOptions extends BaseOptions {
  /**
  		The full URL to the repo.
  		*/
  val repoUrl: String
}

object RepoUrlOptions {
  @scala.inline
  def apply(
    repoUrl: String,
    body: String = null,
    isPrerelease: js.UndefOr[Boolean] = js.undefined,
    tag: String = null,
    target: String = null,
    title: String = null
  ): RepoUrlOptions = {
    val __obj = js.Dynamic.literal(repoUrl = repoUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrerelease)) __obj.updateDynamic("isPrerelease")(isPrerelease.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoUrlOptions]
  }
}

