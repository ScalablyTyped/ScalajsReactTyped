package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.arithmetic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.geographic
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.heading
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.roll
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rotation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.tilt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RotationVariable
  extends StObject
     with VisualVariable {
  
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * @default heading
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    */
  var axis: heading | tilt | roll = js.native
  
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured.
    *
    * @default geographic
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    */
  var rotationType: geographic | arithmetic = js.native
  
  /**
    * The visual variable type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#type)
    */
  @JSName("type")
  val type_RotationVariable: rotation = js.native
}
