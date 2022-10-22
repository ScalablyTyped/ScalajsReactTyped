package typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime

import typingsJapgolly.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A toolbar item.
  */
trait IToolbarItem extends StObject {
  
  /**
    * Item name
    */
  var name: String
  
  /**
    * Toolbar widget
    */
  var widget: Widget
}
object IToolbarItem {
  
  inline def apply(name: String, widget: Widget): IToolbarItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolbarItem]
  }
  
  extension [Self <: IToolbarItem](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWidget(value: Widget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
  }
}
