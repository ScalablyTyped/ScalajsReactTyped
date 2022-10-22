package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geographic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.heading
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.roll
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tilt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationVariableProperties
  extends StObject
     with VisualVariableProperties {
  
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default heading
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    */
  var axis: js.UndefOr[heading | tilt | roll] = js.undefined
  
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured.
    *
    * @default geographic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    */
  var rotationType: js.UndefOr[geographic | arithmetic] = js.undefined
}
object RotationVariableProperties {
  
  inline def apply(): RotationVariableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotationVariableProperties]
  }
  
  extension [Self <: RotationVariableProperties](x: Self) {
    
    inline def setAxis(value: heading | tilt | roll): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setRotationType(value: geographic | arithmetic): Self = StObject.set(x, "rotationType", value.asInstanceOf[js.Any])
    
    inline def setRotationTypeUndefined: Self = StObject.set(x, "rotationType", js.undefined)
  }
}
