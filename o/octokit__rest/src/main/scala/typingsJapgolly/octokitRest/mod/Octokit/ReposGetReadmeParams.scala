package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetReadmeParams extends js.Object {
  var owner: String
  /**
    * The name of the commit/branch/tag. Default: the repository’s default branch (usually `master`)
    */
  var ref: js.UndefOr[String] = js.undefined
  var repo: String
}

object ReposGetReadmeParams {
  @scala.inline
  def apply(owner: String, repo: String, ref: String = null): ReposGetReadmeParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetReadmeParams]
  }
}

