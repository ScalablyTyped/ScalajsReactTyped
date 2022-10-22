package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributions extends StObject {
  
  /** Format: uri */
  var avatar_url: js.UndefOr[String] = js.undefined
  
  var contributions: Double
  
  var email: js.UndefOr[String] = js.undefined
  
  var events_url: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var followers_url: js.UndefOr[String] = js.undefined
  
  var following_url: js.UndefOr[String] = js.undefined
  
  var gists_url: js.UndefOr[String] = js.undefined
  
  var gravatar_id: js.UndefOr[String | Null] = js.undefined
  
  /** Format: uri */
  var html_url: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var login: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var node_id: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var organizations_url: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var received_events_url: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var repos_url: js.UndefOr[String] = js.undefined
  
  var site_admin: js.UndefOr[Boolean] = js.undefined
  
  var starred_url: js.UndefOr[String] = js.undefined
  
  /** Format: uri */
  var subscriptions_url: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  /** Format: uri */
  var url: js.UndefOr[String] = js.undefined
}
object Contributions {
  
  inline def apply(contributions: Double, `type`: String): Contributions = {
    val __obj = js.Dynamic.literal(contributions = contributions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contributions]
  }
  
  extension [Self <: Contributions](x: Self) {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setContributions(value: Double): Self = StObject.set(x, "contributions", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setEvents_urlUndefined: Self = StObject.set(x, "events_url", js.undefined)
    
    inline def setFollowers_url(value: String): Self = StObject.set(x, "followers_url", value.asInstanceOf[js.Any])
    
    inline def setFollowers_urlUndefined: Self = StObject.set(x, "followers_url", js.undefined)
    
    inline def setFollowing_url(value: String): Self = StObject.set(x, "following_url", value.asInstanceOf[js.Any])
    
    inline def setFollowing_urlUndefined: Self = StObject.set(x, "following_url", js.undefined)
    
    inline def setGists_url(value: String): Self = StObject.set(x, "gists_url", value.asInstanceOf[js.Any])
    
    inline def setGists_urlUndefined: Self = StObject.set(x, "gists_url", js.undefined)
    
    inline def setGravatar_id(value: String): Self = StObject.set(x, "gravatar_id", value.asInstanceOf[js.Any])
    
    inline def setGravatar_idNull: Self = StObject.set(x, "gravatar_id", null)
    
    inline def setGravatar_idUndefined: Self = StObject.set(x, "gravatar_id", js.undefined)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_urlUndefined: Self = StObject.set(x, "html_url", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
    
    inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNode_idUndefined: Self = StObject.set(x, "node_id", js.undefined)
    
    inline def setOrganizations_url(value: String): Self = StObject.set(x, "organizations_url", value.asInstanceOf[js.Any])
    
    inline def setOrganizations_urlUndefined: Self = StObject.set(x, "organizations_url", js.undefined)
    
    inline def setReceived_events_url(value: String): Self = StObject.set(x, "received_events_url", value.asInstanceOf[js.Any])
    
    inline def setReceived_events_urlUndefined: Self = StObject.set(x, "received_events_url", js.undefined)
    
    inline def setRepos_url(value: String): Self = StObject.set(x, "repos_url", value.asInstanceOf[js.Any])
    
    inline def setRepos_urlUndefined: Self = StObject.set(x, "repos_url", js.undefined)
    
    inline def setSite_admin(value: Boolean): Self = StObject.set(x, "site_admin", value.asInstanceOf[js.Any])
    
    inline def setSite_adminUndefined: Self = StObject.set(x, "site_admin", js.undefined)
    
    inline def setStarred_url(value: String): Self = StObject.set(x, "starred_url", value.asInstanceOf[js.Any])
    
    inline def setStarred_urlUndefined: Self = StObject.set(x, "starred_url", js.undefined)
    
    inline def setSubscriptions_url(value: String): Self = StObject.set(x, "subscriptions_url", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions_urlUndefined: Self = StObject.set(x, "subscriptions_url", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
