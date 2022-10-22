package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.HTMLElement
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-leading`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`bottom-trailing`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-leading`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`top-trailing`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.manual
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIMoveComponent
  extends StObject
     with Object {
  
  /**
    * The component to move.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var component: Widget_ | HTMLElement | String
  
  /**
    * The placement index of the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The destination position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var position: js.UndefOr[
    `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
  ] = js.undefined
}
object UIMoveComponent {
  
  inline def apply(
    component: Widget_ | HTMLElement | String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): UIMoveComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[UIMoveComponent]
  }
  
  extension [Self <: UIMoveComponent](x: Self) {
    
    inline def setComponent(value: Widget_ | HTMLElement | String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPosition(
      value: `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
