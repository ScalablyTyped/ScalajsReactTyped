package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth2SecuritySchemeSettingsScalarsAnnotations extends StObject {
  
  /**
    * OAuth2SecuritySchemeSettings.accessTokenUri annotations
    **/
  def accessTokenUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth2SecuritySchemeSettings.authorizationGrants annotations
    **/
  def authorizationGrants(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * OAuth2SecuritySchemeSettings.authorizationUri annotations
    **/
  def authorizationUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth2SecuritySchemeSettings.scopes annotations
    **/
  def scopes(): js.Array[js.Array[AnnotationRef]]
}
object OAuth2SecuritySchemeSettingsScalarsAnnotations {
  
  inline def apply(
    accessTokenUri: CallbackTo[js.Array[AnnotationRef]],
    authorizationGrants: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    authorizationUri: CallbackTo[js.Array[AnnotationRef]],
    scopes: CallbackTo[js.Array[js.Array[AnnotationRef]]]
  ): OAuth2SecuritySchemeSettingsScalarsAnnotations = {
    val __obj = js.Dynamic.literal(accessTokenUri = accessTokenUri.toJsFn, authorizationGrants = authorizationGrants.toJsFn, authorizationUri = authorizationUri.toJsFn, scopes = scopes.toJsFn)
    __obj.asInstanceOf[OAuth2SecuritySchemeSettingsScalarsAnnotations]
  }
  
  extension [Self <: OAuth2SecuritySchemeSettingsScalarsAnnotations](x: Self) {
    
    inline def setAccessTokenUri(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "accessTokenUri", value.toJsFn)
    
    inline def setAuthorizationGrants(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "authorizationGrants", value.toJsFn)
    
    inline def setAuthorizationUri(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "authorizationUri", value.toJsFn)
    
    inline def setScopes(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "scopes", value.toJsFn)
  }
}
