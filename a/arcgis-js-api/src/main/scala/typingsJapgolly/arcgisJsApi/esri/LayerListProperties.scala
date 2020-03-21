package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerListProperties extends WidgetProperties {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /**
    * Specifies a function that accesses each [ListItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html). Each list item can be modified according to its modifiable properties. Actions can be added to list items using the [actionsSections](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItem.html#actionsSections) property of the ListItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#listItemCreatedFunction)
    */
  var listItemCreatedFunction: js.UndefOr[ListItemCreatedHandler] = js.undefined
  /**
    * Indicates whether more than one list item may be selected by the user at a single time. You must first set [selectionEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectionEnabled) to `true` for this property to have an effect on the widget.  Selected items are available in the [selectedItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectedItems) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#multipleSelectionEnabled)
    *
    * @default false
    */
  var multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether list items may be selected by the user. Selected items may be reordered in the list by dragging gestures with the mouse or touch screen, or with arrow keys on the keyboard.  Selected items are available in the [selectedItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectedItems) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#selectionEnabled)
    *
    * @default false
    */
  var selectionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Option for enabling status indicators, which indicate whether or not each layer is loading resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#statusIndicatorsVisible)
    *
    * @default true
    */
  var statusIndicatorsVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [LayerListViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-LayerListViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#viewModel)
    */
  var viewModel: js.UndefOr[LayerListViewModelProperties] = js.undefined
}

object LayerListProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    iconClass: String = null,
    id: String = null,
    label: String = null,
    listItemCreatedFunction: /* event */ js.Any => Callback = null,
    multipleSelectionEnabled: js.UndefOr[Boolean] = js.undefined,
    selectionEnabled: js.UndefOr[Boolean] = js.undefined,
    statusIndicatorsVisible: js.UndefOr[Boolean] = js.undefined,
    view: MapViewProperties | SceneViewProperties = null,
    viewModel: LayerListViewModelProperties = null
  ): LayerListProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (listItemCreatedFunction != null) __obj.updateDynamic("listItemCreatedFunction")(js.Any.fromFunction1((t0: /* event */ js.Any) => listItemCreatedFunction(t0).runNow()))
    if (!js.isUndefined(multipleSelectionEnabled)) __obj.updateDynamic("multipleSelectionEnabled")(multipleSelectionEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionEnabled)) __obj.updateDynamic("selectionEnabled")(selectionEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(statusIndicatorsVisible)) __obj.updateDynamic("statusIndicatorsVisible")(statusIndicatorsVisible.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerListProperties]
  }
}

