package typingsJapgolly.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitbucketServerTriggerConfig extends StObject {
  
  /** Output only. The BitbucketServerConfig specified in the bitbucket_server_config_resource field. */
  var bitbucketServerConfig: js.UndefOr[BitbucketServerConfig] = js.undefined
  
  /** Required. The Bitbucket server config resource that this trigger config maps to. */
  var bitbucketServerConfigResource: js.UndefOr[String] = js.undefined
  
  /** Required. Key of the project that the repo is in. For example: The key for https://mybitbucket.server/projects/TEST/repos/test-repo is "TEST". */
  var projectKey: js.UndefOr[String] = js.undefined
  
  /** Filter to match changes in pull requests. */
  var pullRequest: js.UndefOr[PullRequestFilter] = js.undefined
  
  /** Filter to match changes in refs like branches, tags. */
  var push: js.UndefOr[PushFilter] = js.undefined
  
  /**
    * Required. Slug of the repository. A repository slug is a URL-friendly version of a repository name, automatically generated by Bitbucket for use in the URL. For example, if the
    * repository name is 'test repo', in the URL it would become 'test-repo' as in https://mybitbucket.server/projects/TEST/repos/test-repo.
    */
  var repoSlug: js.UndefOr[String] = js.undefined
}
object BitbucketServerTriggerConfig {
  
  inline def apply(): BitbucketServerTriggerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BitbucketServerTriggerConfig]
  }
  
  extension [Self <: BitbucketServerTriggerConfig](x: Self) {
    
    inline def setBitbucketServerConfig(value: BitbucketServerConfig): Self = StObject.set(x, "bitbucketServerConfig", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigResource(value: String): Self = StObject.set(x, "bitbucketServerConfigResource", value.asInstanceOf[js.Any])
    
    inline def setBitbucketServerConfigResourceUndefined: Self = StObject.set(x, "bitbucketServerConfigResource", js.undefined)
    
    inline def setBitbucketServerConfigUndefined: Self = StObject.set(x, "bitbucketServerConfig", js.undefined)
    
    inline def setProjectKey(value: String): Self = StObject.set(x, "projectKey", value.asInstanceOf[js.Any])
    
    inline def setProjectKeyUndefined: Self = StObject.set(x, "projectKey", js.undefined)
    
    inline def setPullRequest(value: PullRequestFilter): Self = StObject.set(x, "pullRequest", value.asInstanceOf[js.Any])
    
    inline def setPullRequestUndefined: Self = StObject.set(x, "pullRequest", js.undefined)
    
    inline def setPush(value: PushFilter): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setRepoSlug(value: String): Self = StObject.set(x, "repoSlug", value.asInstanceOf[js.Any])
    
    inline def setRepoSlugUndefined: Self = StObject.set(x, "repoSlug", js.undefined)
  }
}
