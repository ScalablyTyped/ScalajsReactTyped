package typingsJapgolly.arcgisJsApi.relationshipQueryMod

import typingsJapgolly.arcgisJsApi.esri.RelationshipQuery
import typingsJapgolly.arcgisJsApi.esri.RelationshipQueryProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/RelationshipQuery", JSImport.Namespace)
@js.native
class Class () extends RelationshipQuery {
  def this(properties: RelationshipQueryProperties) = this()
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

