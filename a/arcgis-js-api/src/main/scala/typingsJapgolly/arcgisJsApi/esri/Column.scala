package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * Returns any associated menu items on the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#getMenuItems)
    */
  def getMenuItems(): ButtonMenuItemConfig
  
  /**
    * The object to customize the feature table column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#menu)
    */
  val menu: ButtonMenu
  
  /**
    * Indicates whether the column is resizable.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-Column.html#resizable)
    */
  val resizable: Boolean
}
object Column {
  
  inline def apply(getMenuItems: CallbackTo[ButtonMenuItemConfig], menu: ButtonMenu, resizable: Boolean): Column = {
    val __obj = js.Dynamic.literal(getMenuItems = getMenuItems.toJsFn, menu = menu.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setGetMenuItems(value: CallbackTo[ButtonMenuItemConfig]): Self = StObject.set(x, "getMenuItems", value.toJsFn)
    
    inline def setMenu(value: ButtonMenu): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
  }
}
