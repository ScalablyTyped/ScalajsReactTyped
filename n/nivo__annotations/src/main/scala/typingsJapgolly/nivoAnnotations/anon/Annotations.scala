package typingsJapgolly.nivoAnnotations.anon

import typingsJapgolly.nivoAnnotations.distTypesTypesMod.ComputedAnnotation
import typingsJapgolly.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations[Datum] extends StObject {
  
  var annotations: js.Array[ComputedAnnotation[Datum]]
  
  var theme: CompleteTheme
}
object Annotations {
  
  inline def apply[Datum](annotations: js.Array[ComputedAnnotation[Datum]], theme: CompleteTheme): Annotations[Datum] = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotations[Datum]]
  }
  
  extension [Self <: Annotations[?], Datum](x: Self & Annotations[Datum]) {
    
    inline def setAnnotations(value: js.Array[ComputedAnnotation[Datum]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: ComputedAnnotation[Datum]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
