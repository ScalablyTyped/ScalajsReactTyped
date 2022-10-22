package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[TableListListItemCreatedHandler] = js.undefined
  
  /**
    * A reference to a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) containing the tables.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#map)
    */
  var map: js.UndefOr[MapProperties | WebMapProperties] = js.undefined
  
  /**
    * Indicates whether more than one [list item](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) can be selected by a user at a single time.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#multipleSelectionEnabled)
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A collection of selected [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html)s representing table list items selected by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectedItems)
    */
  var selectedItems: js.UndefOr[CollectionProperties[TableListListItem]] = js.undefined
  
  /**
    * Indicates whether [list items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList-ListItem.html) may be selected by the user.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#selectionEnabled)
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#viewModel)
    */
  var viewModel: js.UndefOr[TableListViewModel] = js.undefined
}
object TableListProperties {
  
  inline def apply(): TableListProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableListProperties]
  }
  
  extension [Self <: TableListProperties](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setListItemCreatedFunction(value: /* event */ Any => Callback): Self = StObject.set(x, "listItemCreatedFunction", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
    
    inline def setListItemCreatedFunctionUndefined: Self = StObject.set(x, "listItemCreatedFunction", js.undefined)
    
    inline def setMap(value: MapProperties | WebMapProperties): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMultipleSelectionEnabled(value: Boolean): Self = StObject.set(x, "multipleSelectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultipleSelectionEnabledUndefined: Self = StObject.set(x, "multipleSelectionEnabled", js.undefined)
    
    inline def setSelectedItems(value: CollectionProperties[TableListListItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: TableListListItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectionEnabled(value: Boolean): Self = StObject.set(x, "selectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelectionEnabledUndefined: Self = StObject.set(x, "selectionEnabled", js.undefined)
    
    inline def setViewModel(value: TableListViewModel): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
