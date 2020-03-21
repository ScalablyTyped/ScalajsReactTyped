package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.contains
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.crosses
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.intersects
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.layer
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.overlaps
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.touches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLayerProperties extends js.Object {
  /**
    * The geometry to apply to the spatial filter. The spatial relationship as specified by [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#spatialRelationship) is applied to this geometry while performing the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  /**
    * The name of the data layer in the map service that is being referenced.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The spatial relationship to be applied on the input geometry while performing the query.
    *
    * Possible Value | Description
    * ---------------|------------
    * intersects | Part of a feature from feature class 1 is contained in a feature from feature class 2.
    * contains | Part or all of a feature from feature class 1 is contained within a feature from feature class 2.
    * crosses | The feature from feature class 1 crosses a feature from feature class 2.
    * envelope-intersects | The envelope of feature class 1 intersects with the envelope of feature class 2.
    * index-intersects | The envelope of the query feature class intersects the index entry for the target feature class.
    * overlaps | Features from feature class 1 overlap features in feature class 2.
    * touches | The feature from feature class 1 touches the border of a feature from feature class 2.
    * within | The feature from feature class 1 is completely enclosed by the feature from feature class 2.
    * relation | Allows specification of any relationship defined using the [Shape Comparison Language](http://resources.esri.com/help/9.3/arcgisengine/dotnet/concepts_start.htm#40de6491-9b2d-440d-848b-2609efcd46b1.htm).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#spatialRelationship)
    */
  var spatialRelationship: js.UndefOr[
    intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
  ] = js.undefined
  var `type`: js.UndefOr[layer] = js.undefined
  /**
    * A where clause for the query. Any legal SQL where clause operating on the fields in the layer is allowed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html#where)
    */
  var where: js.UndefOr[String] = js.undefined
}

object DataLayerProperties {
  @scala.inline
  def apply(
    geometry: GeometryProperties = null,
    name: String = null,
    spatialRelationship: intersects | contains | crosses | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation = null,
    `type`: layer = null,
    where: String = null
  ): DataLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (spatialRelationship != null) __obj.updateDynamic("spatialRelationship")(spatialRelationship.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLayerProperties]
  }
}

