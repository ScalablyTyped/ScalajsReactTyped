package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonMenuItemConfig
  extends StObject
     with Object {
  
  /**
    * Indicates whether to automatically close the menu's item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var autoCloseMenu: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that executes on the ButtonMenuItem's `click` event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var clickFunction: js.UndefOr[ButtonMenuItemClickFunction] = js.undefined
  
  /**
    * Adds a CSS class to the menu button's DOM node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * An array of individual menu items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var items: js.UndefOr[js.Array[ButtonMenuItem]] = js.undefined
  
  /**
    * The label of the menu item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the menu content is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the menu item is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a toggled state should be applied to individual menu items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuItemConfig)
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.undefined
}
object ButtonMenuItemConfig {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ButtonMenuItemConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ButtonMenuItemConfig]
  }
  
  extension [Self <: ButtonMenuItemConfig](x: Self) {
    
    inline def setAutoCloseMenu(value: Boolean): Self = StObject.set(x, "autoCloseMenu", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseMenuUndefined: Self = StObject.set(x, "autoCloseMenu", js.undefined)
    
    inline def setClickFunction(value: /* event */ Any => Callback): Self = StObject.set(x, "clickFunction", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def setClickFunctionUndefined: Self = StObject.set(x, "clickFunction", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setItems(value: js.Array[ButtonMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ButtonMenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelectionEnabledUndefined: Self = StObject.set(x, "selectionEnabled", js.undefined)
  }
}
