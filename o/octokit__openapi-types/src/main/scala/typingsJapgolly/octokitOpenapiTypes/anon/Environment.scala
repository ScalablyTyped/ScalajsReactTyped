package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * Format: date-time
    * @example 2012-07-20T01:19:13Z
    */
  var created_at: String
  
  var creator: Avatarurl | Null
  
  /** @example Deploy request from hubot */
  var description: String | Null
  
  /**
    * @description Name for the target deployment environment.
    * @example production
    */
  var environment: String
  
  /**
    * @description Unique identifier of the deployment
    * @example 42
    */
  var id: Double
  
  /** @example MDEwOkRlcGxveW1lbnQx */
  var node_id: String
  
  /** @example staging */
  var original_environment: js.UndefOr[String] = js.undefined
  
  var payload: StringDictionary[Any] | String
  
  var performed_via_github_app: js.UndefOr[Clientsecret | Null] = js.undefined
  
  /**
    * @description Specifies if the given environment is one that end-users directly interact with. Default: false.
    * @example true
    */
  var production_environment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @description The ref to deploy. This can be a branch, tag, or sha.
    * @example topic-branch
    */
  var ref: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example
    */
  var repository_url: String
  
  /** @example a84d88e7554fc1fa21bcbc4efae3c782a70d2b9d */
  var sha: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example/deployments/1/statuses
    */
  var statuses_url: String
  
  /**
    * @description Parameter to specify a task to execute
    * @example deploy
    */
  var task: String
  
  /**
    * @description Specifies if the given environment is will no longer exist at some point in the future. Default: false.
    * @example true
    */
  var transient_environment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Format: date-time
    * @example 2012-07-20T01:19:13Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/example/deployments/1
    */
  var url: String
}
object Environment {
  
  inline def apply(
    created_at: String,
    environment: String,
    id: Double,
    node_id: String,
    payload: StringDictionary[Any] | String,
    ref: String,
    repository_url: String,
    sha: String,
    statuses_url: String,
    task: String,
    updated_at: String,
    url: String
  ): Environment = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], creator = null, description = null)
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Avatarurl): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorNull: Self = StObject.set(x, "creator", null)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setOriginal_environment(value: String): Self = StObject.set(x, "original_environment", value.asInstanceOf[js.Any])
    
    inline def setOriginal_environmentUndefined: Self = StObject.set(x, "original_environment", js.undefined)
    
    inline def setPayload(value: StringDictionary[Any] | String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: Clientsecret): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setProduction_environment(value: Boolean): Self = StObject.set(x, "production_environment", value.asInstanceOf[js.Any])
    
    inline def setProduction_environmentUndefined: Self = StObject.set(x, "production_environment", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTransient_environment(value: Boolean): Self = StObject.set(x, "transient_environment", value.asInstanceOf[js.Any])
    
    inline def setTransient_environmentUndefined: Self = StObject.set(x, "transient_environment", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
