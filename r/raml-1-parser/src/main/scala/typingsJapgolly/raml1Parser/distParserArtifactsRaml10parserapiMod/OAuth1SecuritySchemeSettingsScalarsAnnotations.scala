package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuth1SecuritySchemeSettingsScalarsAnnotations extends StObject {
  
  /**
    * OAuth1SecuritySchemeSettings.authorizationUri annotations
    **/
  def authorizationUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth1SecuritySchemeSettings.requestTokenUri annotations
    **/
  def requestTokenUri(): js.Array[AnnotationRef]
  
  /**
    * OAuth1SecuritySchemeSettings.signatures annotations
    **/
  def signatures(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * OAuth1SecuritySchemeSettings.tokenCredentialsUri annotations
    **/
  def tokenCredentialsUri(): js.Array[AnnotationRef]
}
object OAuth1SecuritySchemeSettingsScalarsAnnotations {
  
  inline def apply(
    authorizationUri: CallbackTo[js.Array[AnnotationRef]],
    requestTokenUri: CallbackTo[js.Array[AnnotationRef]],
    signatures: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    tokenCredentialsUri: CallbackTo[js.Array[AnnotationRef]]
  ): OAuth1SecuritySchemeSettingsScalarsAnnotations = {
    val __obj = js.Dynamic.literal(authorizationUri = authorizationUri.toJsFn, requestTokenUri = requestTokenUri.toJsFn, signatures = signatures.toJsFn, tokenCredentialsUri = tokenCredentialsUri.toJsFn)
    __obj.asInstanceOf[OAuth1SecuritySchemeSettingsScalarsAnnotations]
  }
  
  extension [Self <: OAuth1SecuritySchemeSettingsScalarsAnnotations](x: Self) {
    
    inline def setAuthorizationUri(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "authorizationUri", value.toJsFn)
    
    inline def setRequestTokenUri(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "requestTokenUri", value.toJsFn)
    
    inline def setSignatures(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "signatures", value.toJsFn)
    
    inline def setTokenCredentialsUri(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "tokenCredentialsUri", value.toJsFn)
  }
}
