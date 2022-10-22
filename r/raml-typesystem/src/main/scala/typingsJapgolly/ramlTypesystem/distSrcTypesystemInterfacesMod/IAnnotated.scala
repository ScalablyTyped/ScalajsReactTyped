package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotated extends StObject {
  
  def annotation(name: String): Any
  
  def annotations(): js.Array[IAnnotation]
}
object IAnnotated {
  
  inline def apply(annotation: String => Any, annotations: CallbackTo[js.Array[IAnnotation]]): IAnnotated = {
    val __obj = js.Dynamic.literal(annotation = js.Any.fromFunction1(annotation), annotations = annotations.toJsFn)
    __obj.asInstanceOf[IAnnotated]
  }
  
  extension [Self <: IAnnotated](x: Self) {
    
    inline def setAnnotation(value: String => Any): Self = StObject.set(x, "annotation", js.Any.fromFunction1(value))
    
    inline def setAnnotations(value: CallbackTo[js.Array[IAnnotation]]): Self = StObject.set(x, "annotations", value.toJsFn)
  }
}
