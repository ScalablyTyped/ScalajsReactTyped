package typingsJapgolly.downshift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseMultipleSelectionComboboxGetDropdownProps
  extends StObject
     with GetInputPropsOptions
     with GetPropsWithRefKey
     with UseMultipleSelectionGetDropdownProps {
  
  var preventKeyAction: js.UndefOr[Boolean] = js.undefined
}
object UseMultipleSelectionComboboxGetDropdownProps {
  
  inline def apply(): UseMultipleSelectionComboboxGetDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseMultipleSelectionComboboxGetDropdownProps]
  }
  
  extension [Self <: UseMultipleSelectionComboboxGetDropdownProps](x: Self) {
    
    inline def setPreventKeyAction(value: Boolean): Self = StObject.set(x, "preventKeyAction", value.asInstanceOf[js.Any])
    
    inline def setPreventKeyActionUndefined: Self = StObject.set(x, "preventKeyAction", js.undefined)
  }
}
