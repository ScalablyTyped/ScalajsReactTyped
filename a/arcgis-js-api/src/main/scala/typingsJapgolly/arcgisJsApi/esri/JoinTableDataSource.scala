package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`join-table`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-inner-join`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-outer-join`
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinTableDataSource extends Object {
  /**
    * The type of join that will be performed.
    *
    * Possible Value | Description
    * ---------------|------------
    * left-outer-join | Unmatched records in the left table source are preserved and joined with `null` values in the right table source.
    * left-inner-join | Records in the left table source are discarded if they are unmatched with records in the right table source.
    *
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
    * The left table for joining to the right table source. This can either be a dynamic map layer or a dynamic data layer. The dynamic data layer may contain another join data source used for nested joining.
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
    * The right table for joining to the left table source. This can either be a dynamic map layer or a dynamic data layer. The dynamic data layer may contain another join data source used for nested joining.
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
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    joinType: `left-outer-join` | `left-inner-join`,
    leftTableKey: String,
    leftTableSource: DynamicMapLayer | DynamicDataLayer,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    rightTableKey: String,
    rightTableSource: DynamicMapLayer | DynamicDataLayer,
    `type`: `join-table`
  ): JoinTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], joinType = joinType.asInstanceOf[js.Any], leftTableKey = leftTableKey.asInstanceOf[js.Any], leftTableSource = leftTableSource.asInstanceOf[js.Any], rightTableKey = rightTableKey.asInstanceOf[js.Any], rightTableSource = rightTableSource.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinTableDataSource]
  }
}

