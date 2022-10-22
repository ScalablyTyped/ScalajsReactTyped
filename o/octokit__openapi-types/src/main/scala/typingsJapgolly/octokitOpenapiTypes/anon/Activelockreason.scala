package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.COLLABORATOR
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.CONTRIBUTOR
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIMER
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.FIRST_TIME_CONTRIBUTOR
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.MANNEQUIN
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.MEMBER
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.NONE
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.OWNER
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_planned
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.reopened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Activelockreason extends StObject {
  
  var active_lock_reason: js.UndefOr[String | Null] = js.undefined
  
  var assignee: Avatarurl | Null
  
  var assignees: js.UndefOr[js.Array[Avatarurl] | Null] = js.undefined
  
  var author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
  
  /**
    * @description Contents of the issue
    * @example It looks like the new widget form is broken on Safari. When I try and create the widget, Safari crashes. This is reproducible on 10.8, but not 10.9. Maybe a browser bug?
    */
  var body: js.UndefOr[String | Null] = js.undefined
  
  var body_html: js.UndefOr[String] = js.undefined
  
  var body_text: js.UndefOr[String] = js.undefined
  
  /** Format: date-time */
  var closed_at: String | Null
  
  var closed_by: js.UndefOr[Avatarurl | Null] = js.undefined
  
  var comments: Double
  
  /** Format: uri */
  var comments_url: String
  
  /** Format: date-time */
  var created_at: String
  
  var draft: js.UndefOr[Boolean] = js.undefined
  
  /** Format: uri */
  var events_url: String
  
  /** Format: uri */
  var html_url: String
  
  var id: Double
  
  /**
    * @description Labels to associate with this issue; pass one or more label names to replace the set of labels on this issue; send an empty array to clear all labels from the issue; note that the labels are silently dropped for users without push access to the repository
    * @example [
    *   "bug",
    *   "registration"
    * ]
    */
  var labels: js.Array[String | Color]
  
  var labels_url: String
  
  var locked: Boolean
  
  var milestone: Creator | Null
  
  var node_id: String
  
  /**
    * @description Number uniquely identifying the issue within its repository
    * @example 42
    */
  var number: Double
  
  var performed_via_github_app: js.UndefOr[Clientsecret | Null] = js.undefined
  
  var pull_request: js.UndefOr[Diffurl] = js.undefined
  
  var reactions: js.UndefOr[`1`] = js.undefined
  
  var repository: js.UndefOr[Allowmergecommit] = js.undefined
  
  /** Format: uri */
  var repository_url: String
  
  /**
    * @description State of the issue; either 'open' or 'closed'
    * @example open
    */
  var state: String
  
  /**
    * @description The reason for the current state
    * @example not_planned
    * @enum {string|null}
    */
  var state_reason: js.UndefOr[completed | reopened | not_planned | Null] = js.undefined
  
  /** Format: uri */
  var timeline_url: js.UndefOr[String] = js.undefined
  
  /**
    * @description Title of the issue
    * @example Widget creation fails in Safari on OS X 10.8
    */
  var title: String
  
  /** Format: date-time */
  var updated_at: String
  
  /**
    * Format: uri
    * @description URL for the issue
    * @example https://api.github.com/repositories/42/issues/1
    */
  var url: String
  
  var user: Avatarurl | Null
}
object Activelockreason {
  
  inline def apply(
    author_association: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER,
    comments: Double,
    comments_url: String,
    created_at: String,
    events_url: String,
    html_url: String,
    id: Double,
    labels: js.Array[String | Color],
    labels_url: String,
    locked: Boolean,
    node_id: String,
    number: Double,
    repository_url: String,
    state: String,
    title: String,
    updated_at: String,
    url: String
  ): Activelockreason = {
    val __obj = js.Dynamic.literal(author_association = author_association.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], events_url = events_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], labels_url = labels_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], assignee = null, closed_at = null, milestone = null, user = null)
    __obj.asInstanceOf[Activelockreason]
  }
  
  extension [Self <: Activelockreason](x: Self) {
    
    inline def setActive_lock_reason(value: String): Self = StObject.set(x, "active_lock_reason", value.asInstanceOf[js.Any])
    
    inline def setActive_lock_reasonNull: Self = StObject.set(x, "active_lock_reason", null)
    
    inline def setActive_lock_reasonUndefined: Self = StObject.set(x, "active_lock_reason", js.undefined)
    
    inline def setAssignee(value: Avatarurl): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
    
    inline def setAssigneeNull: Self = StObject.set(x, "assignee", null)
    
    inline def setAssignees(value: js.Array[Avatarurl]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
    
    inline def setAssigneesNull: Self = StObject.set(x, "assignees", null)
    
    inline def setAssigneesUndefined: Self = StObject.set(x, "assignees", js.undefined)
    
    inline def setAssigneesVarargs(value: Avatarurl*): Self = StObject.set(x, "assignees", js.Array(value*))
    
    inline def setAuthor_association(
      value: COLLABORATOR | CONTRIBUTOR | FIRST_TIMER | FIRST_TIME_CONTRIBUTOR | MANNEQUIN | MEMBER | NONE | OWNER
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_htmlUndefined: Self = StObject.set(x, "body_html", js.undefined)
    
    inline def setBody_text(value: String): Self = StObject.set(x, "body_text", value.asInstanceOf[js.Any])
    
    inline def setBody_textUndefined: Self = StObject.set(x, "body_text", js.undefined)
    
    inline def setClosed_at(value: String): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
    
    inline def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
    
    inline def setClosed_by(value: Avatarurl): Self = StObject.set(x, "closed_by", value.asInstanceOf[js.Any])
    
    inline def setClosed_byNull: Self = StObject.set(x, "closed_by", null)
    
    inline def setClosed_byUndefined: Self = StObject.set(x, "closed_by", js.undefined)
    
    inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDraft(value: Boolean): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setEvents_url(value: String): Self = StObject.set(x, "events_url", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabels(value: js.Array[String | Color]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: (String | Color)*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setLabels_url(value: String): Self = StObject.set(x, "labels_url", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setMilestone(value: Creator): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNull: Self = StObject.set(x, "milestone", null)
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(value: Clientsecret): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appNull: Self = StObject.set(x, "performed_via_github_app", null)
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setPull_request(value: Diffurl): Self = StObject.set(x, "pull_request", value.asInstanceOf[js.Any])
    
    inline def setPull_requestUndefined: Self = StObject.set(x, "pull_request", js.undefined)
    
    inline def setReactions(value: `1`): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setRepository(value: Allowmergecommit): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setState_reason(value: completed | reopened | not_planned): Self = StObject.set(x, "state_reason", value.asInstanceOf[js.Any])
    
    inline def setState_reasonNull: Self = StObject.set(x, "state_reason", null)
    
    inline def setState_reasonUndefined: Self = StObject.set(x, "state_reason", js.undefined)
    
    inline def setTimeline_url(value: String): Self = StObject.set(x, "timeline_url", value.asInstanceOf[js.Any])
    
    inline def setTimeline_urlUndefined: Self = StObject.set(x, "timeline_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Avatarurl): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserNull: Self = StObject.set(x, "user", null)
  }
}
