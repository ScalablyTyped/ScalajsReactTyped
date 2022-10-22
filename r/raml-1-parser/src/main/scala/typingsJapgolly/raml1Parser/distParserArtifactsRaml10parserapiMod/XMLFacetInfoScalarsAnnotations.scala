package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLFacetInfoScalarsAnnotations extends StObject {
  
  /**
    * XMLFacetInfo.attribute annotations
    **/
  def attribute(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.name annotations
    **/
  def name(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.namespace annotations
    **/
  def namespace(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.prefix annotations
    **/
  def prefix(): js.Array[AnnotationRef]
  
  /**
    * XMLFacetInfo.wrapped annotations
    **/
  def wrapped(): js.Array[AnnotationRef]
}
object XMLFacetInfoScalarsAnnotations {
  
  inline def apply(
    attribute: CallbackTo[js.Array[AnnotationRef]],
    name: CallbackTo[js.Array[AnnotationRef]],
    namespace: CallbackTo[js.Array[AnnotationRef]],
    prefix: CallbackTo[js.Array[AnnotationRef]],
    wrapped: CallbackTo[js.Array[AnnotationRef]]
  ): XMLFacetInfoScalarsAnnotations = {
    val __obj = js.Dynamic.literal(attribute = attribute.toJsFn, name = name.toJsFn, namespace = namespace.toJsFn, prefix = prefix.toJsFn, wrapped = wrapped.toJsFn)
    __obj.asInstanceOf[XMLFacetInfoScalarsAnnotations]
  }
  
  extension [Self <: XMLFacetInfoScalarsAnnotations](x: Self) {
    
    inline def setAttribute(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "attribute", value.toJsFn)
    
    inline def setName(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setNamespace(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "namespace", value.toJsFn)
    
    inline def setPrefix(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "prefix", value.toJsFn)
    
    inline def setWrapped(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "wrapped", value.toJsFn)
  }
}
