package typingsJapgolly.reactNativeMaterialUi.mod

import typingsJapgolly.reactNativeMaterialUi.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerSectionProps extends StObject {
  
  var divider: js.UndefOr[Boolean] = js.undefined
  
  var items: js.Array[DrawerSectionItem]
  
  var style: js.UndefOr[Item] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object DrawerSectionProps {
  
  inline def apply(items: js.Array[DrawerSectionItem]): DrawerSectionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerSectionProps]
  }
  
  extension [Self <: DrawerSectionProps](x: Self) {
    
    inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setItems(value: js.Array[DrawerSectionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: DrawerSectionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setStyle(value: Item): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
