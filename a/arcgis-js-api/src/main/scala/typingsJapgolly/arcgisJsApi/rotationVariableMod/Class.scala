package typingsJapgolly.arcgisJsApi.rotationVariableMod

import typingsJapgolly.arcgisJsApi.esri.RotationVariable
import typingsJapgolly.arcgisJsApi.esri.RotationVariableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/visualVariables/RotationVariable", JSImport.Namespace)
@js.native
/**
  * The rotation visual variable defines how features rendered with [marker symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html) or [text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html) in a MapView are rotated. The rotation value is determined by mapping the values to data in a field, or by other arithmetic means with an Arcade expression.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html)
  */
class Class () extends RotationVariable {
  def this(properties: RotationVariableProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

