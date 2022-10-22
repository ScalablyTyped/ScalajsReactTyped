package typingsJapgolly.testingLibraryUserEvent.anon

import typingsJapgolly.testingLibraryUserEvent.distTypesDocumentUIMod.UISelectionRange
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selection extends StObject {
  
  val selection: UISelectionRange
  
  val `type`: input
}
object Selection {
  
  inline def apply(selection: UISelectionRange): Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("input")
    __obj.asInstanceOf[Selection]
  }
  
  extension [Self <: Selection](x: Self) {
    
    inline def setSelection(value: UISelectionRange): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setType(value: input): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
