package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.button
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.slider
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionBase
  extends StObject
     with Accessor {
  
  /**
    * Set this property to `true` to display a spinner icon.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#active)
    */
  var active: Boolean = js.native
  
  /**
    * This adds a CSS class to the [ActionButton's](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#className)
    */
  var className: String = js.native
  
  /**
    * Indicates whether this action is disabled.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#disabled)
    */
  var disabled: Boolean = js.native
  
  /**
    * The name of the ID assigned to this action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#id)
    */
  var id: String = js.native
  
  /**
    * The title of the action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#title)
    */
  var title: String = js.native
  
  /**
    * Specifies the type of action.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#type)
    */
  var `type`: button | slider | toggle = js.native
  
  /**
    * Indicates if the action is visible.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#visible)
    */
  var visible: Boolean = js.native
}
