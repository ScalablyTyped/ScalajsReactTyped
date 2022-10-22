package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`join-table`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-inner-join`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-outer-join`
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinTableDataSource
  extends StObject
     with Object {
  
  /**
    * The type of join that will be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var joinType: `left-outer-join` | `left-inner-join`
  
  /**
    * The field name used for joining or matching records in the left table to records in the right table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var leftTableKey: String
  
  /**
    * The left table for joining to the right table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var leftTableSource: DynamicMapLayer | DynamicDataLayer
  
  /**
    * The field name used for joining or matching records in the right table to records in the left table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var rightTableKey: String
  
  /**
    * The right table for joining to the left table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var rightTableSource: DynamicMapLayer | DynamicDataLayer
  
  /**
    * This value is always `join-table` and is inferred when other join table properties of this object are set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinTableDataSource)
    */
  var `type`: `join-table`
}
object JoinTableDataSource {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    joinType: `left-outer-join` | `left-inner-join`,
    leftTableKey: String,
    leftTableSource: DynamicMapLayer | DynamicDataLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    rightTableKey: String,
    rightTableSource: DynamicMapLayer | DynamicDataLayer
  ): JoinTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), joinType = joinType.asInstanceOf[js.Any], leftTableKey = leftTableKey.asInstanceOf[js.Any], leftTableSource = leftTableSource.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), rightTableKey = rightTableKey.asInstanceOf[js.Any], rightTableSource = rightTableSource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("join-table")
    __obj.asInstanceOf[JoinTableDataSource]
  }
  
  extension [Self <: JoinTableDataSource](x: Self) {
    
    inline def setJoinType(value: `left-outer-join` | `left-inner-join`): Self = StObject.set(x, "joinType", value.asInstanceOf[js.Any])
    
    inline def setLeftTableKey(value: String): Self = StObject.set(x, "leftTableKey", value.asInstanceOf[js.Any])
    
    inline def setLeftTableSource(value: DynamicMapLayer | DynamicDataLayer): Self = StObject.set(x, "leftTableSource", value.asInstanceOf[js.Any])
    
    inline def setRightTableKey(value: String): Self = StObject.set(x, "rightTableKey", value.asInstanceOf[js.Any])
    
    inline def setRightTableSource(value: DynamicMapLayer | DynamicDataLayer): Self = StObject.set(x, "rightTableSource", value.asInstanceOf[js.Any])
    
    inline def setType(value: `join-table`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
