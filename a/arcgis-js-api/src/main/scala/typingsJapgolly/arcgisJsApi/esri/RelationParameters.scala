package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`interior-intersection`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-coincidence`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`line-touch`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`point-touch`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.cross
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disjoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.in_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.intersection
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.overlap
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.touch
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The first array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#geometries1)
    */
  var geometries1: js.Array[Geometry_] = js.native
  
  /**
    * The second array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#geometries2)
    */
  var geometries2: js.Array[Geometry_] = js.native
  
  /**
    * The spatial relationship to be tested between the two input geometry arrays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#relation)
    */
  var relation: cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relation | touch | within = js.native
  
  /**
    * The string describes the spatial relationship to be tested when `RelationParameters.relation = 'relation'`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#relationParameter)
    */
  var relationParameter: String = js.native
}
