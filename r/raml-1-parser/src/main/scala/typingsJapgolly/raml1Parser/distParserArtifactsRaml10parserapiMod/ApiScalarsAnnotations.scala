package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiScalarsAnnotations extends StObject {
  
  /**
    * Api.baseUri annotations
    **/
  def baseUri(): js.Array[AnnotationRef]
  
  /**
    * Api.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * Api.mediaType annotations
    **/
  def mediaType(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * Api.protocols annotations
    **/
  def protocols(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * Api.securedBy annotations
    **/
  def securedBy(): js.Array[js.Array[AnnotationRef]]
  
  /**
    * Api.title annotations
    **/
  def title(): js.Array[AnnotationRef]
  
  /**
    * Api.version annotations
    **/
  def version(): js.Array[AnnotationRef]
}
object ApiScalarsAnnotations {
  
  inline def apply(
    baseUri: CallbackTo[js.Array[AnnotationRef]],
    description: CallbackTo[js.Array[AnnotationRef]],
    mediaType: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    protocols: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    securedBy: CallbackTo[js.Array[js.Array[AnnotationRef]]],
    title: CallbackTo[js.Array[AnnotationRef]],
    version: CallbackTo[js.Array[AnnotationRef]]
  ): ApiScalarsAnnotations = {
    val __obj = js.Dynamic.literal(baseUri = baseUri.toJsFn, description = description.toJsFn, mediaType = mediaType.toJsFn, protocols = protocols.toJsFn, securedBy = securedBy.toJsFn, title = title.toJsFn, version = version.toJsFn)
    __obj.asInstanceOf[ApiScalarsAnnotations]
  }
  
  extension [Self <: ApiScalarsAnnotations](x: Self) {
    
    inline def setBaseUri(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "baseUri", value.toJsFn)
    
    inline def setDescription(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "description", value.toJsFn)
    
    inline def setMediaType(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "mediaType", value.toJsFn)
    
    inline def setProtocols(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "protocols", value.toJsFn)
    
    inline def setSecuredBy(value: CallbackTo[js.Array[js.Array[AnnotationRef]]]): Self = StObject.set(x, "securedBy", value.toJsFn)
    
    inline def setTitle(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "title", value.toJsFn)
    
    inline def setVersion(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "version", value.toJsFn)
  }
}
