package typingsJapgolly.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.GithubRepoAssociation
  - typingsJapgolly.ionic.definitionsMod.BitbucketCloudRepoAssociation
  - typingsJapgolly.ionic.definitionsMod.BitbucketServerRepoAssociation
*/
trait RepoAssociation extends StObject
object RepoAssociation {
  
  inline def BitbucketCloudRepoAssociation(clone_url: String, full_name: String, html_url: String, id: String): typingsJapgolly.ionic.definitionsMod.BitbucketCloudRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bitbucket_cloud")
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.BitbucketCloudRepoAssociation]
  }
  
  inline def BitbucketServerRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double): typingsJapgolly.ionic.definitionsMod.BitbucketServerRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bitbucket_server")
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.BitbucketServerRepoAssociation]
  }
  
  inline def GithubRepoAssociation(clone_url: String, full_name: String, html_url: String, id: Double): typingsJapgolly.ionic.definitionsMod.GithubRepoAssociation = {
    val __obj = js.Dynamic.literal(clone_url = clone_url.asInstanceOf[js.Any], full_name = full_name.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("github")
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.GithubRepoAssociation]
  }
}
