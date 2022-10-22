package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboMultiSelection
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Set addWithKeyModifier to true to disable the additive selection, then additive selection can be done by ctrl + mouse click / enter.
    *
    */
  var addWithKeyModifier: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set enabled to true to turn multi selection on. Set to true by default when target element for the combo is a select with the multiple attribute set.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use itemSeparator to set what string to be rendered between items in field.
    *
    */
  var itemSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Set showCheckboxes to true to render check boxes in front of each drop down item.
    *
    */
  var showCheckboxes: js.UndefOr[Boolean] = js.undefined
}
object IgComboMultiSelection {
  
  inline def apply(): IgComboMultiSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboMultiSelection]
  }
  
  extension [Self <: IgComboMultiSelection](x: Self) {
    
    inline def setAddWithKeyModifier(value: Boolean): Self = StObject.set(x, "addWithKeyModifier", value.asInstanceOf[js.Any])
    
    inline def setAddWithKeyModifierUndefined: Self = StObject.set(x, "addWithKeyModifier", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setItemSeparator(value: String): Self = StObject.set(x, "itemSeparator", value.asInstanceOf[js.Any])
    
    inline def setItemSeparatorUndefined: Self = StObject.set(x, "itemSeparator", js.undefined)
    
    inline def setShowCheckboxes(value: Boolean): Self = StObject.set(x, "showCheckboxes", value.asInstanceOf[js.Any])
    
    inline def setShowCheckboxesUndefined: Self = StObject.set(x, "showCheckboxes", js.undefined)
  }
}
