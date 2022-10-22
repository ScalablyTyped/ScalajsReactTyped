package typingsJapgolly.openui5.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedOption extends StObject {
  
  /**
    * the selected option.
    */
  var selectedOption: js.UndefOr[HTMLElement] = js.undefined
}
object SelectedOption {
  
  inline def apply(): SelectedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedOption]
  }
  
  extension [Self <: SelectedOption](x: Self) {
    
    inline def setSelectedOption(value: HTMLElement): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptionUndefined: Self = StObject.set(x, "selectedOption", js.undefined)
  }
}
