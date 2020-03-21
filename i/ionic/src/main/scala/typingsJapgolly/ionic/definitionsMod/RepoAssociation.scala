package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.ionicStrings.bitbucket_cloud
import typingsJapgolly.ionic.ionicStrings.bitbucket_server
import typingsJapgolly.ionic.ionicStrings.github
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.GithubRepoAssociation
  - typingsJapgolly.ionic.definitionsMod.BitbucketCloudRepoAssociation
  - typingsJapgolly.ionic.definitionsMod.BitbucketServerRepoAssociation
*/
trait RepoAssociation extends js.Object

object RepoAssociation {
  @scala.inline
  def GithubRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double, `type`: github): RepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoAssociation]
  }
  @scala.inline
  def BitbucketCloudRepoAssociation(clone_url: String, full_name: String, html_url: String, id: String, `type`: bitbucket_cloud): RepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoAssociation]
  }
  @scala.inline
  def BitbucketServerRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double, `type`: bitbucket_server): RepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoAssociation]
  }
}

