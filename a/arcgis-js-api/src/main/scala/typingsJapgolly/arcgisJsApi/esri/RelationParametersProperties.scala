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
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.touch
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.within
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationParametersProperties extends StObject {
  
  /**
    * The first array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#geometries1)
    */
  var geometries1: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  
  /**
    * The second array of geometries to compute the relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#geometries2)
    */
  var geometries2: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  
  /**
    * The spatial relationship to be tested between the two input geometry arrays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#relation)
    */
  var relation: js.UndefOr[
    cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relation | touch | within
  ] = js.undefined
  
  /**
    * The string describes the spatial relationship to be tested when `RelationParameters.relation = 'relation'`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationParameters.html#relationParameter)
    */
  var relationParameter: js.UndefOr[String] = js.undefined
}
object RelationParametersProperties {
  
  inline def apply(): RelationParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationParametersProperties]
  }
  
  extension [Self <: RelationParametersProperties](x: Self) {
    
    inline def setGeometries1(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries1", value.asInstanceOf[js.Any])
    
    inline def setGeometries1Undefined: Self = StObject.set(x, "geometries1", js.undefined)
    
    inline def setGeometries1Varargs(value: GeometryProperties*): Self = StObject.set(x, "geometries1", js.Array(value*))
    
    inline def setGeometries2(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries2", value.asInstanceOf[js.Any])
    
    inline def setGeometries2Undefined: Self = StObject.set(x, "geometries2", js.undefined)
    
    inline def setGeometries2Varargs(value: GeometryProperties*): Self = StObject.set(x, "geometries2", js.Array(value*))
    
    inline def setRelation(
      value: cross | disjoint | in_ | `interior-intersection` | intersection | `line-coincidence` | `line-touch` | overlap | `point-touch` | relation | touch | within
    ): Self = StObject.set(x, "relation", value.asInstanceOf[js.Any])
    
    inline def setRelationParameter(value: String): Self = StObject.set(x, "relationParameter", value.asInstanceOf[js.Any])
    
    inline def setRelationParameterUndefined: Self = StObject.set(x, "relationParameter", js.undefined)
    
    inline def setRelationUndefined: Self = StObject.set(x, "relation", js.undefined)
  }
}
