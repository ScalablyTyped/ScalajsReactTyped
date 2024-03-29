package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.highchartsStrings.menu
import typingsJapgolly.highcharts.highchartsStrings.menuball
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingButtonsOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The class name of the context
    * button.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to enable buttons.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The class name of the menu
    * appearing from the button.
    */
  var menuClassName: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A collection of strings pointing
    * to config options for the menu items. The config options are defined in
    * the `menuItemDefinitions` option.
    *
    * By default, there is the "View in full screen" and "Print" menu items,
    * plus one menu item for each of the available export types.
    */
  var menuItems: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A click handler callback to use
    * on the button directly instead of the popup menu.
    */
  var onclick: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The symbol for the button.
    * Points to a definition function in the `Highcharts.Renderer.symbols`
    * collection. The default `menu` function is part of the exporting module.
    * Possible values are "circle", "square", "diamond", "triangle",
    * "triangle-down", "menu", "menuball" or custom shape.
    */
  var symbol: js.UndefOr[menu | menuball | String | SymbolKeyValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) See
    * navigation.buttonOptions.symbolFill.
    */
  var symbolFill: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text string to add to the
    * individual button.
    */
  var text: js.UndefOr[String] = js.undefined
  
  var theme: js.UndefOr[ExportingButtonsContextButtonThemeOptions] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The key to a lang option setting
    * that is used for the button's title tooltip. When the key is
    * `contextButtonTitle`, it refers to lang.contextButtonTitle that defaults
    * to "Chart context menu".
    */
  var titleKey: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The horizontal position of the
    * button relative to the `align` option.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical offset of the
    * button's position relative to its `verticalAlign`.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object ExportingButtonsOptionsObject {
  
  inline def apply(): ExportingButtonsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingButtonsOptionsObject]
  }
  
  extension [Self <: ExportingButtonsOptionsObject](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMenuClassName(value: String): Self = StObject.set(x, "menuClassName", value.asInstanceOf[js.Any])
    
    inline def setMenuClassNameUndefined: Self = StObject.set(x, "menuClassName", js.undefined)
    
    inline def setMenuItems(value: js.Array[String]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    inline def setMenuItemsUndefined: Self = StObject.set(x, "menuItems", js.undefined)
    
    inline def setMenuItemsVarargs(value: String*): Self = StObject.set(x, "menuItems", js.Array(value*))
    
    inline def setOnclick(value: js.Function): Self = StObject.set(x, "onclick", value.asInstanceOf[js.Any])
    
    inline def setOnclickUndefined: Self = StObject.set(x, "onclick", js.undefined)
    
    inline def setSymbol(value: menu | menuball | String | SymbolKeyValue): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolFill(value: ColorString): Self = StObject.set(x, "symbolFill", value.asInstanceOf[js.Any])
    
    inline def setSymbolFillUndefined: Self = StObject.set(x, "symbolFill", js.undefined)
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTheme(value: ExportingButtonsContextButtonThemeOptions): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitleKey(value: String): Self = StObject.set(x, "titleKey", value.asInstanceOf[js.Any])
    
    inline def setTitleKeyUndefined: Self = StObject.set(x, "titleKey", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
