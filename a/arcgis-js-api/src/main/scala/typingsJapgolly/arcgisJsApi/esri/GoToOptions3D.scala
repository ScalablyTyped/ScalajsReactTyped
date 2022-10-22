package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`in-cubic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`in-expo`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`in-out-coast-quadratic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`in-out-cubic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`in-out-expo`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`out-cubic`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`out-expo`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.linear
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoToOptions3D
  extends StObject
     with Object {
  
  /**
    * Indicates if the transition to the new view should be animated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the exact duration (in milliseconds) of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The easing function to use for the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var easing: js.UndefOr[
    linear | `in-cubic` | `out-cubic` | `in-out-cubic` | `in-expo` | `out-expo` | `in-out-expo` | `in-out-coast-quadratic` | EasingFunction
  ] = js.undefined
  
  /**
    * The maximum allowed duration (in milliseconds) of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Increases or decreases the animation speed by the specified factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var speedFactor: js.UndefOr[Double] = js.undefined
}
object GoToOptions3D {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GoToOptions3D = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GoToOptions3D]
  }
  
  extension [Self <: GoToOptions3D](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(
      value: linear | `in-cubic` | `out-cubic` | `in-out-cubic` | `in-expo` | `out-expo` | `in-out-expo` | `in-out-coast-quadratic` | EasingFunction
    ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingFunction2(value: (/* t */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easing", js.Any.fromFunction2(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSpeedFactor(value: Double): Self = StObject.set(x, "speedFactor", value.asInstanceOf[js.Any])
    
    inline def setSpeedFactorUndefined: Self = StObject.set(x, "speedFactor", js.undefined)
  }
}
