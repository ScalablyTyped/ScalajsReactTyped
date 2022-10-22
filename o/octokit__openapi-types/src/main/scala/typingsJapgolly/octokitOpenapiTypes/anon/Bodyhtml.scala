package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bodyhtml extends StObject {
  
  var author_association: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['author-association'] */ js.Any
  
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
  
  var performed_via_github_app: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
  ] = js.undefined
  
  var reactions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['reaction-rollup'] */ js.Any
  ] = js.undefined
  
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
  
  var user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
}
object Bodyhtml {
  
  inline def apply(
    author_association: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['author-association'] */ js.Any,
    created_at: String,
    html_url: String,
    id: Double,
    issue_url: String,
    node_id: String,
    updated_at: String,
    url: String,
    user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  ): Bodyhtml = {
    val __obj = js.Dynamic.literal(author_association = author_association.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bodyhtml]
  }
  
  extension [Self <: Bodyhtml](x: Self) {
    
    inline def setAuthor_association(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['author-association'] */ js.Any
    ): Self = StObject.set(x, "author_association", value.asInstanceOf[js.Any])
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setBody_html(value: String): Self = StObject.set(x, "body_html", value.asInstanceOf[js.Any])
    
    inline def setBody_htmlUndefined: Self = StObject.set(x, "body_html", js.undefined)
    
    inline def setBody_text(value: String): Self = StObject.set(x, "body_text", value.asInstanceOf[js.Any])
    
    inline def setBody_textUndefined: Self = StObject.set(x, "body_text", js.undefined)
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_app(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-integration'] */ js.Any
    ): Self = StObject.set(x, "performed_via_github_app", value.asInstanceOf[js.Any])
    
    inline def setPerformed_via_github_appUndefined: Self = StObject.set(x, "performed_via_github_app", js.undefined)
    
    inline def setReactions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['reaction-rollup'] */ js.Any
    ): Self = StObject.set(x, "reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "reactions", js.undefined)
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
