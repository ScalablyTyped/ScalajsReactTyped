package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.dismissed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.fix_started
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.fixed
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.inaccurate
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.no_bandwidth
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.not_used
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.open
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.tolerable_risk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependency extends StObject {
  
  var created_at: String
  
  var dependency: Scope
  
  var dismissed_at: String | Null
  
  var dismissed_by: Avatarurl | Null
  
  var dismissed_comment: String | Null
  
  var dismissed_reason: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk | Null
  
  var fixed_at: String | Null
  
  var html_url: String
  
  var number: Double
  
  var security_advisory: Cveid
  
  var security_vulnerability: Vulnerableversionrange
  
  var state: dismissed | fixed | open
  
  var updated_at: String
  
  var url: String
}
object Dependency {
  
  inline def apply(
    created_at: String,
    dependency: Scope,
    html_url: String,
    number: Double,
    security_advisory: Cveid,
    security_vulnerability: Vulnerableversionrange,
    state: dismissed | fixed | open,
    updated_at: String,
    url: String
  ): Dependency = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dependency = dependency.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], security_advisory = security_advisory.asInstanceOf[js.Any], security_vulnerability = security_vulnerability.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], dismissed_at = null, dismissed_by = null, dismissed_comment = null, dismissed_reason = null, fixed_at = null)
    __obj.asInstanceOf[Dependency]
  }
  
  extension [Self <: Dependency](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: Scope): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDismissed_at(value: String): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_atNull: Self = StObject.set(x, "dismissed_at", null)
    
    inline def setDismissed_by(value: Avatarurl): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_byNull: Self = StObject.set(x, "dismissed_by", null)
    
    inline def setDismissed_comment(value: String): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentNull: Self = StObject.set(x, "dismissed_comment", null)
    
    inline def setDismissed_reason(value: fix_started | inaccurate | no_bandwidth | not_used | tolerable_risk): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonNull: Self = StObject.set(x, "dismissed_reason", null)
    
    inline def setFixed_at(value: String): Self = StObject.set(x, "fixed_at", value.asInstanceOf[js.Any])
    
    inline def setFixed_atNull: Self = StObject.set(x, "fixed_at", null)
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setSecurity_advisory(value: Cveid): Self = StObject.set(x, "security_advisory", value.asInstanceOf[js.Any])
    
    inline def setSecurity_vulnerability(value: Vulnerableversionrange): Self = StObject.set(x, "security_vulnerability", value.asInstanceOf[js.Any])
    
    inline def setState(value: dismissed | fixed | open): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
