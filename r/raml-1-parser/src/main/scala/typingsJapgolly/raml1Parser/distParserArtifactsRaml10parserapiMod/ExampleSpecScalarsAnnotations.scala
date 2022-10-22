package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExampleSpecScalarsAnnotations extends StObject {
  
  /**
    * ExampleSpec.description annotations
    **/
  def description(): js.Array[AnnotationRef]
  
  /**
    * ExampleSpec.displayName annotations
    **/
  def displayName(): js.Array[AnnotationRef]
  
  /**
    * ExampleSpec.strict annotations
    **/
  def strict(): js.Array[AnnotationRef]
}
object ExampleSpecScalarsAnnotations {
  
  inline def apply(
    description: CallbackTo[js.Array[AnnotationRef]],
    displayName: CallbackTo[js.Array[AnnotationRef]],
    strict: CallbackTo[js.Array[AnnotationRef]]
  ): ExampleSpecScalarsAnnotations = {
    val __obj = js.Dynamic.literal(description = description.toJsFn, displayName = displayName.toJsFn, strict = strict.toJsFn)
    __obj.asInstanceOf[ExampleSpecScalarsAnnotations]
  }
  
  extension [Self <: ExampleSpecScalarsAnnotations](x: Self) {
    
    inline def setDescription(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "description", value.toJsFn)
    
    inline def setDisplayName(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "displayName", value.toJsFn)
    
    inline def setStrict(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "strict", value.toJsFn)
  }
}
