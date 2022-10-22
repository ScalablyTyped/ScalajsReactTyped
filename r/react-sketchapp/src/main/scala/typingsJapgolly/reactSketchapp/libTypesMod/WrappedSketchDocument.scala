package typingsJapgolly.reactSketchapp.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappedSketchDocument extends StObject {
  
  var sketchObject: SketchDocument | SketchDocumentData
}
object WrappedSketchDocument {
  
  inline def apply(sketchObject: SketchDocument | SketchDocumentData): WrappedSketchDocument = {
    val __obj = js.Dynamic.literal(sketchObject = sketchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedSketchDocument]
  }
  
  extension [Self <: WrappedSketchDocument](x: Self) {
    
    inline def setSketchObject(value: SketchDocument | SketchDocumentData): Self = StObject.set(x, "sketchObject", value.asInstanceOf[js.Any])
  }
}
