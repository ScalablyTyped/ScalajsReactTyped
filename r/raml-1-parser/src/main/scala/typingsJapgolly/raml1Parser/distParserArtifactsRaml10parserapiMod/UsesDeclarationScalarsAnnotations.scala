package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsesDeclarationScalarsAnnotations extends StObject {
  
  /**
    * UsesDeclaration.value annotations
    **/
  def value(): js.Array[AnnotationRef]
}
object UsesDeclarationScalarsAnnotations {
  
  inline def apply(value: CallbackTo[js.Array[AnnotationRef]]): UsesDeclarationScalarsAnnotations = {
    val __obj = js.Dynamic.literal(value = value.toJsFn)
    __obj.asInstanceOf[UsesDeclarationScalarsAnnotations]
  }
  
  extension [Self <: UsesDeclarationScalarsAnnotations](x: Self) {
    
    inline def setValue(value: CallbackTo[js.Array[AnnotationRef]]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
