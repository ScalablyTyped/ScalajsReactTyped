package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.reactSketchapp.libTypesMod.SketchDocument
import typingsJapgolly.reactSketchapp.libTypesMod.SketchDocumentData
import typingsJapgolly.reactSketchapp.libTypesMod.WrappedSketchDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearExistingStyles extends StObject {
  
  var clearExistingStyles: js.UndefOr[Boolean] = js.undefined
  
  var document: js.UndefOr[SketchDocument | SketchDocumentData | WrappedSketchDocument] = js.undefined
}
object ClearExistingStyles {
  
  inline def apply(): ClearExistingStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearExistingStyles]
  }
  
  extension [Self <: ClearExistingStyles](x: Self) {
    
    inline def setClearExistingStyles(value: Boolean): Self = StObject.set(x, "clearExistingStyles", value.asInstanceOf[js.Any])
    
    inline def setClearExistingStylesUndefined: Self = StObject.set(x, "clearExistingStyles", js.undefined)
    
    inline def setDocument(value: SketchDocument | SketchDocumentData | WrappedSketchDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
  }
}
