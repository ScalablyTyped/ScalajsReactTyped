package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requestedreviewer extends StObject {
  
  var actor: Avatarurl
  
  var commit_id: String | Null
  
  var commit_url: String | Null
  
  var created_at: String
  
  var event: String
  
  var id: Double
  
  var node_id: String
  
  var performed_via_github_app: Clientsecret | Null
  
  var requested_reviewer: js.UndefOr[Avatarurl] = js.undefined
  
  var requested_team: js.UndefOr[Parent] = js.undefined
  
  var review_requester: Avatarurl
  
  var url: String
}
object Requestedreviewer {
  
  inline def apply(
    actor: Avatarurl,
    created_at: String,
    event: String,
    id: Double,
    node_id: String,
    review_requester: Avatarurl,
    url: String
  ): Requestedreviewer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], review_requester = review_requester.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], commit_id = null, commit_url = null, performed_via_github_app = null)
    __obj.asInstanceOf[Requestedreviewer]
  }
  
  extension [Self <: Requestedreviewer](x: Self) {
    
    inline def setActor(value: Avatarurl): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
    
    inline def setCommit_idNull: Self = StObject.set(x, "commit_id", null)
    
    inline def setCommit_url(value: String): Self = StObject.set(x, "commit_url", value.asInstanceOf[js.Any])
    
    inline def setCommit_urlNull: Self = StObject.set(x, "commit_url", null)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: Clientsecret): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setRequested_reviewer(value: Avatarurl): Self = StObject.set(x, "requested_reviewer", value.asInstanceOf[js.Any])
    
    inline def setRequested_reviewerUndefined: Self = StObject.set(x, "requested_reviewer", js.undefined)
    
    inline def setRequested_team(value: Parent): Self = StObject.set(x, "requested_team", value.asInstanceOf[js.Any])
    
    inline def setRequested_teamUndefined: Self = StObject.set(x, "requested_team", js.undefined)
    
    inline def setReview_requester(value: Avatarurl): Self = StObject.set(x, "review_requester", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
