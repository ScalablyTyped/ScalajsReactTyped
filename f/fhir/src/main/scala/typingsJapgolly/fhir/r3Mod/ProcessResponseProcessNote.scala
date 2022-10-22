package typingsJapgolly.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessResponseProcessNote
  extends StObject
     with BackboneElement {
  
  var _text: js.UndefOr[Element] = js.undefined
  
  /**
    * The note text.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The note purpose: Print/Display.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object ProcessResponseProcessNote {
  
  inline def apply(): ProcessResponseProcessNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessResponseProcessNote]
  }
  
  extension [Self <: ProcessResponseProcessNote](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    inline def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
