package typingsJapgolly.arcgisJsApi.visualVariableMod

import typingsJapgolly.arcgisJsApi.esri.VisualVariable
import typingsJapgolly.arcgisJsApi.esri.VisualVariableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/visualVariables/VisualVariable", JSImport.Namespace)
@js.native
/**
  * The visual variable base class. See each of the subclasses that extend this class to learn how to create continuous data-driven thematic visualizations.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html)
  */
class Class () extends VisualVariable {
  def this(properties: VisualVariableProperties) = this()
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

