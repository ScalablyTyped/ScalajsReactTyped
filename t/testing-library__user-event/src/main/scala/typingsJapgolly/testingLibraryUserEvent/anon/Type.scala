package typingsJapgolly.testingLibraryUserEvent.anon

import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.contenteditable
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  val selection: js.UndefOr[org.scalajs.dom.Selection | Null] = js.undefined
  
  val `type`: contenteditable | default
}
object Type {
  
  inline def apply(`type`: contenteditable | default): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setSelection(value: org.scalajs.dom.Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionNull: Self = StObject.set(x, "selection", null)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setType(value: contenteditable | default): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
