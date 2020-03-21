package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemPanel extends js.Object {
  /**
    * Adds a CSS class used to style a node that represents the panel. Clicking the node will open and close the panel. Typically, an icon font is used for this property. [Esri Icon Fonts](https://developers.arcgis.com/javascript/latest/guide/esri-icon-font/index.html) are automatically made available and can be used to represent this content. To use one of these provided icon fonts, you must prefix the class name with `esri-`. For example, the default icon font is `esri-icon-layer-list`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className)
    *
    * @default esri-icon-layer-list
    */
  var className: String
  /**
    * The content displayed in the ListItem panel. This can be raw text, a [Widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) instance, an HTML Element, or an array of any of those elements.  If the text `legend` is used, then an instance of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget is placed in the content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#content)
    */
  var content: Widget_ | HTMLElement | String | js.Array[_]
  /**
    * The URL or data URI of an image used to represent the panel. This property will be used as a background image for the node. If neither `image` nor `className` are specified, a default icon ![default icon](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/41/default-action.png) will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image)
    */
  var image: String
  /**
    * The panel's parent ListItem that represents a layer in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#listItem)
    */
  var listItem: ListItem
  /**
    * Indicates if the panel's content is open and visible to the user. This is different from the [visible](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#visible) property, which is used for toggling the visibility of the icon used to control whether the content is expanded or collapsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#open)
    *
    * @default false
    */
  var open: Boolean
  /**
    * The title of the panel. By default, this title matches the ListItem's title. Changing this value will not change the title of the ListItem in the LayerList.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#title)
    */
  var title: String
  /**
    * Indicates if the node containing the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#image) or [icon font](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#className) is visible to the user. Setting this value to `false` will prevent the user from toggling the visibility of the panel's content. Use [open](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#open) to programmatically set the visibility of the panel's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList-ListItemPanel.html#visible)
    *
    * @default true
    */
  var visible: Boolean
}

@JSGlobal("__esri.ListItemPanel")
@js.native
object ListItemPanel extends TopLevel[ListItemPanelConstructor]

