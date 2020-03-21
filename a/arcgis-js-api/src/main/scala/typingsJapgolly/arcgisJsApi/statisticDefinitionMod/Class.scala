package typingsJapgolly.arcgisJsApi.statisticDefinitionMod

import typingsJapgolly.arcgisJsApi.esri.StatisticDefinition
import typingsJapgolly.arcgisJsApi.esri.StatisticDefinitionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/StatisticDefinition", JSImport.Namespace)
@js.native
class Class () extends StatisticDefinition {
  def this(properties: StatisticDefinitionProperties) = this()
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

