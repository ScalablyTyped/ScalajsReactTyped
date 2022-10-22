package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import typingsJapgolly.devextreme.mod.DevExpress.common.ToolbarItemComponent
import typingsJapgolly.devextreme.mod.DevExpress.common.ToolbarItemLocation
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxToolbar.LocateInMenuMode
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxToolbar.ShowTextMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxToolbarItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a CSS class to be applied to the item.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies when to display an item in the toolbar&apos;s overflow menu.
    */
  var locateInMenu: js.UndefOr[LocateInMenuMode] = js.undefined
  
  /**
    * Specifies a location for the item on the toolbar.
    */
  var location: js.UndefOr[ToolbarItemLocation] = js.undefined
  
  /**
    * Specifies a template that should be used to render a menu item.
    */
  var menuItemTemplate: js.UndefOr[template | (js.Function0[String | UserDefinedElement[Element]])] = js.undefined
  
  /**
    * Configures the DevExtreme UI component used as a toolbar item.
    */
  var options: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies when to display the text for the UI component item.
    */
  var showText: js.UndefOr[ShowTextMode] = js.undefined
  
  /**
    * A UI component that presents a toolbar item. To configure it, use the options object.
    */
  var widget: js.UndefOr[ToolbarItemComponent] = js.undefined
}
object dxToolbarItem {
  
  inline def apply(): dxToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToolbarItem]
  }
  
  extension [Self <: dxToolbarItem](x: Self) {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setLocateInMenu(value: LocateInMenuMode): Self = StObject.set(x, "locateInMenu", value.asInstanceOf[js.Any])
    
    inline def setLocateInMenuUndefined: Self = StObject.set(x, "locateInMenu", js.undefined)
    
    inline def setLocation(value: ToolbarItemLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMenuItemTemplate(value: template | (js.Function0[String | UserDefinedElement[Element]])): Self = StObject.set(x, "menuItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuItemTemplateCallbackTo(value: CallbackTo[String | UserDefinedElement[Element]]): Self = StObject.set(x, "menuItemTemplate", value.toJsFn)
    
    inline def setMenuItemTemplateUndefined: Self = StObject.set(x, "menuItemTemplate", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setShowText(value: ShowTextMode): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
    
    inline def setWidget(value: ToolbarItemComponent): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
  }
}
