package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentuseractor extends StObject {
  
  var current_user: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
  ] = js.undefined
  
  var current_user_actor: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
  ] = js.undefined
  
  var current_user_organization: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
  ] = js.undefined
  
  var current_user_organizations: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ]
  ] = js.undefined
  
  var current_user_public: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
  ] = js.undefined
  
  var security_advisories: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
  ] = js.undefined
  
  var timeline: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
  
  var user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
}
object Currentuseractor {
  
  inline def apply(
    timeline: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any,
    user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
  ): Currentuseractor = {
    val __obj = js.Dynamic.literal(timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentuseractor]
  }
  
  extension [Self <: Currentuseractor](x: Self) {
    
    inline def setCurrent_user(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ): Self = StObject.set(x, "current_user", value.asInstanceOf[js.Any])
    
    inline def setCurrent_userUndefined: Self = StObject.set(x, "current_user", js.undefined)
    
    inline def setCurrent_user_actor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ): Self = StObject.set(x, "current_user_actor", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_actorUndefined: Self = StObject.set(x, "current_user_actor", js.undefined)
    
    inline def setCurrent_user_organization(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ): Self = StObject.set(x, "current_user_organization", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organizationUndefined: Self = StObject.set(x, "current_user_organization", js.undefined)
    
    inline def setCurrent_user_organizations(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
        ]
    ): Self = StObject.set(x, "current_user_organizations", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_organizationsUndefined: Self = StObject.set(x, "current_user_organizations", js.undefined)
    
    inline def setCurrent_user_organizationsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any)*
    ): Self = StObject.set(x, "current_user_organizations", js.Array(value*))
    
    inline def setCurrent_user_public(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ): Self = StObject.set(x, "current_user_public", value.asInstanceOf[js.Any])
    
    inline def setCurrent_user_publicUndefined: Self = StObject.set(x, "current_user_public", js.undefined)
    
    inline def setSecurity_advisories(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ): Self = StObject.set(x, "security_advisories", value.asInstanceOf[js.Any])
    
    inline def setSecurity_advisoriesUndefined: Self = StObject.set(x, "security_advisories", js.undefined)
    
    inline def setTimeline(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['link-with-type'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
