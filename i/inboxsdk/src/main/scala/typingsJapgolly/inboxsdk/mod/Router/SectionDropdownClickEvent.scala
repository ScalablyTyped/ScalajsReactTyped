package typingsJapgolly.inboxsdk.mod.Router

import typingsJapgolly.inboxsdk.mod.Common.DropdownView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SectionDropdownClickEvent extends StObject {
  
  var dropdown: DropdownView
}
object SectionDropdownClickEvent {
  
  inline def apply(dropdown: DropdownView): SectionDropdownClickEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDropdownClickEvent]
  }
  
  extension [Self <: SectionDropdownClickEvent](x: Self) {
    
    inline def setDropdown(value: DropdownView): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
  }
}
