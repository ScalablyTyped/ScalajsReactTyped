package typingsJapgolly.officeUiFabricReact.anon

import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.ConstrainMode
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.DetailsListLayoutMode
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxVisibility extends StObject {
  
  var checkboxVisibility: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility
  
  var compact: Boolean
  
  var constrainMode: ConstrainMode
  
  var isHeaderVisible: Boolean
  
  var layoutMode: DetailsListLayoutMode
  
  var selectionMode: SelectionMode
  
  var useFastIcons: Boolean
}
object CheckboxVisibility {
  
  inline def apply(
    checkboxVisibility: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility,
    compact: Boolean,
    constrainMode: ConstrainMode,
    isHeaderVisible: Boolean,
    layoutMode: DetailsListLayoutMode,
    selectionMode: SelectionMode,
    useFastIcons: Boolean
  ): CheckboxVisibility = {
    val __obj = js.Dynamic.literal(checkboxVisibility = checkboxVisibility.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any], constrainMode = constrainMode.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], layoutMode = layoutMode.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], useFastIcons = useFastIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxVisibility]
  }
  
  extension [Self <: CheckboxVisibility](x: Self) {
    
    inline def setCheckboxVisibility(
      value: typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.CheckboxVisibility
    ): Self = StObject.set(x, "checkboxVisibility", value.asInstanceOf[js.Any])
    
    inline def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setConstrainMode(value: ConstrainMode): Self = StObject.set(x, "constrainMode", value.asInstanceOf[js.Any])
    
    inline def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "isHeaderVisible", value.asInstanceOf[js.Any])
    
    inline def setLayoutMode(value: DetailsListLayoutMode): Self = StObject.set(x, "layoutMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setUseFastIcons(value: Boolean): Self = StObject.set(x, "useFastIcons", value.asInstanceOf[js.Any])
  }
}
