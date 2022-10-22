package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TickElementGroup
  extends StObject
     with Object {
  
  /**
    * The HTMLElement representing the label associated with the tick element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickElementGroup)
    */
  var labelElement: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The HTMLElement representing a tick.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#TickElementGroup)
    */
  var tickElement: js.UndefOr[HTMLElement] = js.undefined
}
object TickElementGroup {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TickElementGroup = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[TickElementGroup]
  }
  
  extension [Self <: TickElementGroup](x: Self) {
    
    inline def setLabelElement(value: HTMLElement): Self = StObject.set(x, "labelElement", value.asInstanceOf[js.Any])
    
    inline def setLabelElementUndefined: Self = StObject.set(x, "labelElement", js.undefined)
    
    inline def setTickElement(value: HTMLElement): Self = StObject.set(x, "tickElement", value.asInstanceOf[js.Any])
    
    inline def setTickElementUndefined: Self = StObject.set(x, "tickElement", js.undefined)
  }
}
