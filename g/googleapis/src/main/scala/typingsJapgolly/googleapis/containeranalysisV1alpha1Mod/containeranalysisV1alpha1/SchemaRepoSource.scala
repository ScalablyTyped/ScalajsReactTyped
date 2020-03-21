package typingsJapgolly.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RepoSource describes the location of the source in a Google Cloud Source
  * Repository.
  */
@js.native
trait SchemaRepoSource extends js.Object {
  /**
    * Name of the branch to build.
    */
  var branchName: js.UndefOr[String] = js.native
  /**
    * Explicit commit SHA to build.
    */
  var commitSha: js.UndefOr[String] = js.native
  /**
    * ID of the project that owns the repo.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Name of the repo.
    */
  var repoName: js.UndefOr[String] = js.native
  /**
    * Name of the tag to build.
    */
  var tagName: js.UndefOr[String] = js.native
}

object SchemaRepoSource {
  @scala.inline
  def apply(
    branchName: String = null,
    commitSha: String = null,
    projectId: String = null,
    repoName: String = null,
    tagName: String = null
  ): SchemaRepoSource = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (commitSha != null) __obj.updateDynamic("commitSha")(commitSha.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (repoName != null) __obj.updateDynamic("repoName")(repoName.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRepoSource]
  }
}

