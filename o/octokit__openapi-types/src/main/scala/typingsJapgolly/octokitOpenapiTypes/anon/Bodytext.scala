package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bodytext extends StObject {
  
  var actor: Avatarurl
  
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /**
    * @description Contents of the issue comment
    * @example What version of Safari were you using when you observed this bug?
    */
  var body: js.UndefOr[String] = js.undefined
  
  var body_html: js.UndefOr[String] = js.undefined
  
  var body_text: js.UndefOr[String] = js.undefined
  
  /**
    * Format: date-time
    * @example 2011-04-14T16:00:49Z
    */
  var created_at: String
  
  var event: String
  
  /** Format: uri */
  var html_url: String
  
  /**
    * @description Unique identifier of the issue comment
    * @example 42
    */
  var id: Double
  
  /** Format: uri */
  var issue_url: String
  
  var node_id: String
  
  var performed_via_github_app: js.UndefOr[Clientsecret | Null] = js.undefined
  
  var reactions: js.UndefOr[`1`] = js.undefined
  
  /**
    * Format: date-time
    * @example 2011-04-14T16:00:49Z
    */
  var updated_at: String
  
  /**
    * Format: uri
    * @description URL for the issue comment
    * @example https://api.github.com/repositories/42/issues/comments/1
    */
  var url: String
  
  var user: Avatarurl
}
object Bodytext {
  
  inline def apply(
    actor: Avatarurl,
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    created_at: String,
    event: String,
    html_url: String,
    id: Double,
    issue_url: String,
    node_id: String,
    updated_at: String,
    url: String,
    user: Avatarurl
  ): Bodytext = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], author_association = author_association.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bodytext]
  }
  
  extension [Self <: Bodytext](x: Self) {
    
    inline def setActor(value: Avatarurl): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_htmlUndefined: Self = StObject.set(x, "body_html", js.undefined)
    
    inline def setBody_text(value: String): Self = StObject.set(x, "body_text", value.asInstanceOf[js.Any])
    
    inline def setBody_textUndefined: Self = StObject.set(x, "body_text", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: Clientsecret): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setReactions(value: `1`): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
