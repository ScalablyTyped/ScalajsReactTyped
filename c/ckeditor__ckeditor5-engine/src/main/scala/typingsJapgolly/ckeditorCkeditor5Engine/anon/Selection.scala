package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  var selection: default
}
object Selection {
  
  inline def apply(selection: default): Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setSelection(value: default): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
