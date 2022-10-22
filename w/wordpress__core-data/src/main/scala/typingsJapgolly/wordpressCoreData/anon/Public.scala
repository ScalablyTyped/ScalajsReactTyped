package typingsJapgolly.wordpressCoreData.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Public extends StObject {
  
  var public: Boolean
  
  var publicly_queryable: Boolean
  
  var show_admin_column: Boolean
  
  var show_in_nav_menus: Boolean
  
  var show_in_quick_edit: Boolean
  
  var show_ui: Boolean
}
object Public {
  
  inline def apply(
    public: Boolean,
    publicly_queryable: Boolean,
    show_admin_column: Boolean,
    show_in_nav_menus: Boolean,
    show_in_quick_edit: Boolean,
    show_ui: Boolean
  ): Public = {
    val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any], publicly_queryable = publicly_queryable.asInstanceOf[js.Any], show_admin_column = show_admin_column.asInstanceOf[js.Any], show_in_nav_menus = show_in_nav_menus.asInstanceOf[js.Any], show_in_quick_edit = show_in_quick_edit.asInstanceOf[js.Any], show_ui = show_ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[Public]
  }
  
  extension [Self <: Public](x: Self) {
    
    inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    inline def setPublicly_queryable(value: Boolean): Self = StObject.set(x, "publicly_queryable", value.asInstanceOf[js.Any])
    
    inline def setShow_admin_column(value: Boolean): Self = StObject.set(x, "show_admin_column", value.asInstanceOf[js.Any])
    
    inline def setShow_in_nav_menus(value: Boolean): Self = StObject.set(x, "show_in_nav_menus", value.asInstanceOf[js.Any])
    
    inline def setShow_in_quick_edit(value: Boolean): Self = StObject.set(x, "show_in_quick_edit", value.asInstanceOf[js.Any])
    
    inline def setShow_ui(value: Boolean): Self = StObject.set(x, "show_ui", value.asInstanceOf[js.Any])
  }
}
