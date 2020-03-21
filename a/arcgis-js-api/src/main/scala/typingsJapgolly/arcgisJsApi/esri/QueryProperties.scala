package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`envelope-intersects`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`index-intersects`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`us-nautical-miles`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.contains
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.crosses
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.disjoint
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.intersects
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.native
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.overlaps
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.relation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.standard
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.touches
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.within
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryProperties extends js.Object {
  /**
    * Datum transformation used for projecting geometries in the query results when [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) is different than the layer's spatial reference. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#datumTransformation)
    */
  var datumTransformation: js.UndefOr[Double] = js.undefined
  /**
    * Specifies a search distance from a given [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) in a spatial query. The [units property](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#units) indicates the unit of measurement. In essence, setting this property creates a buffer at the specified size around the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). The query will use that buffer to return features in the layer or layer view that adhere to the to the indicated [spatial relationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship).  If querying a feature service, the [supportsQueryWithDistance](https://developers.arcgis.com/rest/services-reference/query-feature-service-layer-.htm) capability must be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance)
    */
  var distance: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the geodatabase version to display for feature service queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  /**
    * The geometry to apply to the spatial filter. The spatial relationship as specified by [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship) will indicate how the geometry should be used to query features.
    * > **Known Limitations**  [Mesh](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html) geometry types are currently not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  /**
    * Specifies the number of decimal places for geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  /**
    * Used only in [statistical queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#statistic). When one or more field names are provided in this property, the output statisics will be grouped based on unique values from those fields. This is only valid when [outStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outStatistics) has been defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#groupByFieldsForStatistics)
    */
  var groupByFieldsForStatistics: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A condition used with [outStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outStatistics) and [groupByFieldsForStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#groupByFieldsForStatistics) to limit query results to groups that satisfy the aggregation function(s).  The following aggregation functions are supported in this clause: `MIN` | `MAX` | `AVG` | `SUM` | `STDDEV` | `COUNT` | `VAR`  Aggregation functions used in `having` must be included in the `outStatistics` as well. See the snippet below for an example of how this works.  For service-based layer queries, this parameter applies only if the [supportsHavingClause](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property of the layer is `true`. This property is supported on all [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#having)
    */
  var having: js.UndefOr[String] = js.undefined
  /**
    * The historic moment to query. This parameter applies only if the `supportsQueryWithHistoricMoment` capability of the service being queried is `true`. This setting is provided in the layer resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#historicMoment)
    */
  var historicMoment: js.UndefOr[DateProperties] = js.undefined
  /**
    * The maximum distance in units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) used for generalizing geometries returned by the query operation. It limits how far any part of the generalized geometry can be from the original geometry. If `outSpatialReference` is not defined, the spatialReference of the data is used.
    * > **Known Limitations**  This property does not apply to [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) or [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  /**
    * When set, the maximum number of features returned by the query will equal the `maxRecordCount` of the service multiplied by this factor. The value of this property may not exceed `5`.  For example, if the `maxRecordCount` of your feature service is `2000`, and you set the `maxRecordCountFactor` to `5`, then the maximum number of features that could be returned by the query is `10000`.
    * > **Known Limitations**  Only supported with ArcGIS Online hosted services or ArcGIS Enterprise 10.6 services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#maxRecordCountFactor)
    *
    * @default 1
    */
  var maxRecordCountFactor: js.UndefOr[Double] = js.undefined
  /**
    * Parameter dictates how the geometry of a multipatch feature will be returned. Currently, the only supported value is `xyFootprint`. If indicated, the xy footprint of each multipatch geometry will be returned in the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#multipatchOption)
    */
  var multipatchOption: js.UndefOr[String] = js.undefined
  /**
    * The number of features to retrieve. This option should be used in conjunction with the [start property](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#start). Use this to implement paging (i.e. to retrieve "pages" of results when querying).  If not provided, but an instance of Query has a `start` property, then the default value of `num` is 10. If neither `num` nor `start` properties are provided, then the default value of `num` is equal to the `maxRecordCount` of the service, which can be found at the REST endpoint of the FeatureLayer.
    * > **Known Limitations**  This property does not apply to layer view or [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#num)
    */
  var num: js.UndefOr[Double] = js.undefined
  /**
    * A comma delimited list of ObjectIDs for the features in the layer being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * One or more field names used to order the query results. Specfiy `ASC` (ascending) or `DESC` (descending) after the field name to control the order. The default order is `ASC`.
    * > **Known Limitations**
    *   * If querying a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), then `supportsAdvancedQueries` must be `true` on the service.
    *   * For [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), `FeatureLayer.capabilities.queryRelated.supportsOrderBy` must be `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Attribute fields to include in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). Fields must exist in the service layer. You must list actual field names rather than field aliases. You may, however, use field aliases when you display the results of the query.  When specifying the output fields, you should limit the fields to only those you expect to use in the query or the results. The fewer fields you include, the smaller the payload size, and therefore the faster the response of the query.  You can also specify SQL expressions as `outFields` to calculate new values server side for the query results. See the example snippets below for an example of this.  Each query must have access to the `Shape` and `ObjectId` fields for a layer. However, the list of outFields does not need to include these two fields.
    * > **Known Limitations**
    *   * If specifying outFields as expressions on a feature service-based [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), the service capabilities `advancedQueryCapabilities.supportsOutFieldSQLExpression` and `useStandardizedQueries` must both be true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The spatial reference for the returned geometry. If not specified, the geometry is returned in the spatial reference of the queried layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The definitions for one or more field-based statistics to be calculated. If `outStatistics` is specified the only other query parameters that should be used are [groupByFieldsForStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#groupByFieldsForStatistics), [orderByFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#orderByFields), [text](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#text), and [where](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#where).
    * > **Known Limitations**  For service-based queries, `outStatistics` is only supported on layers where `supportsStatistics = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outStatistics)
    */
  var outStatistics: js.UndefOr[js.Array[StatisticDefinitionProperties]] = js.undefined
  /**
    * Filters features from the layer based on pre-authored parameterized filters. When value is not specified for any parameter in a request, the default value, that is assigned during authoring time, gets used. Requires an ArcGIS Enterprise service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#parameterValues)
    */
  var parameterValues: js.UndefOr[js.Array[QueryParameterValues]] = js.undefined
  /**
    * Specifies the pixel level to be identified on the X and Y axis. Defaults to the base resolution of the dataset if not specified. Applicable only to Image Service layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#pixelSize)
    */
  var pixelSize: js.UndefOr[SymbolProperties] = js.undefined
  /**
    * Used to project the geometry onto a virtual grid, likely representing pixels on the screen. Geometry coordinates are converted to integers by building a grid with a resolution matching the `quantizationParameters.tolerance`. Each coordinate is then snapped to one pixel on the grid.
    * > **Known Limitations**  Only supported with ArcGIS Online hosted services or ArcGIS Enterprise 10.6.1 services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var quantizationParameters: js.UndefOr[QueryQuantizationParameters] = js.undefined
  /**
    * Filters features from the layer that are within the specified range values. Requires ArcGIS Enterprise services 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#rangeValues)
    */
  var rangeValues: js.UndefOr[js.Array[QueryRangeValues]] = js.undefined
  /**
    * The Dimensionally Extended 9 Intersection Model (DE-9IM) matrix relation (encoded as a string) to query the spatial relationship of the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) to the layer's features. This string contains the test result of each intersection represented in the DE-9IM matrix. Each result is one character of the string and may be represented as either a number (maximum dimension returned: 0,1,2), a Boolean value (T or F), or a mask character (for ignoring results: '*').  Set this parameter when the [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship) is `relation`. The [Relational functions for ST_Geometry](https://desktop.arcgis.com/en/arcmap/latest/manage-data/using-sql-with-gdbs/relational-functions-for-st-geometry.htm) topic has additional details on how to construct these strings.
    * > **Known Limitations**  This property does not apply to layer view or [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#relationParameter)
    */
  var relationParameter: js.UndefOr[String] = js.undefined
  /**
    * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) will be returned with a centroid. This property only applies to queries against polygon [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    * > **Known Limitations**  Only supported with ArcGIS Online hosted services or ArcGIS Enterprise 10.6.1 services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnCentroid)
    *
    * @default false
    */
  var returnCentroid: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true` then the query returns distinct values based on the field(s) specified in [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields).
    * > **Known Limitations**
    *   * For service-based queries, this parameter applies only if the `supportsAdvancedQueries` capability of the layer is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnDistinctValues)
    *
    * @default false
    */
  var returnDistinctValues: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, then all features are returned for each tile request, even if they exceed the maximum record limit per query indicated on the service by `maxRecordCount`. If `false`, the tile request will not return any features if the `maxRecordCount` limit is exceeded.
    * > **Known Limitations**  Only supported with ArcGIS Online hosted services or ArcGIS Enterprise 10.6 services.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnExceededLimitFeatures)
    *
    * @default true
    */
  var returnExceededLimitFeatures: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, each feature in the returned [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) includes the geometry.
    * > **Known Limitations**  For [FeatureLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html) queries, the precision of the returned geometries will only be as high as the view's scale resolution since geometries are quantized for improved performance on the view. The smaller the scale, the lower the resolution of the geometries.  This limitation does not apply to [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), and [CSVLayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html) queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry) is `true`, then m-values are included in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnM)
    */
  var returnM: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry) will be returned with the query results. It is useful for getting the buffer geometry generated when querying features by [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance) or getting the query geometry projected in the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) of the query. The query geometry is returned only for [client-side queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) and [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm) and if the layer's [capabilities.query.supportsQueryGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnQueryGeometry)
    *
    * @default false
    */
  var returnQueryGeometry: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry) is `true`, then z-values are included in the geometry.
    * > **Known Limitations**  [FeatureLayerView.queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) and [GeoJSONLayerView.queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#queryFeatures) results do not include the z-values when called in [2D MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) even if `returnZ` is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  /**
    * For spatial queries, this parameter defines the spatial relationship to query features in the layer or layer view against the input [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). The spatial relationships discover how features are spatially related to each other. For example, you may want to know if a polygon representing a county completely contains points representing settlements.  The spatial relationship is determined by whether the boundaries or interiors of a geometry intersect.
    *   * Boundary — The endpoints of all linear parts for line features, or the linear outline of a polygon. Only lines and polygons have boundaries.
    *   * Interior — Points are entirely interior and have no boundary. For lines and polygons, the interior is any part of the geometry that is not part of the boundary.
    *
    *
    * The possible values for this parameter are described below and the images highlight the geometries returned for the specified spatial relationship for given geometries.  The `intersects` spatial relationship returns features in the layer view that intersect the query [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry).  ![intersects](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/intersects.png)  The `contains` spatial relationship returns features in the layer view that are completely contained by the query [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry).  ![contains](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/contains.png)  The `crosses` spatial relationship returns features in the layer view when the interior of a query [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) comes into contact with the interior or boundary of features in the layer view. In other words, the geometries share some interior area, but not all interior area.  ![crosses](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/crosses.png)  The `envelope-intersects` spatial relationship returns features in the layer view that intersect the envelope (or extent) of the filter [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry).  ![envelope-intersects](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/envelope-intersects.png)  The `overlaps` spatial relationship returns features in the layer view that overlap the query [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). Only features of the same geometry can be compared.  ![overlaps](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/overlap.png)  The `touches` spatial relationship returns features in the layer view that touch the query [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). The boundaries of the geometries intersect, but not their interiors.  ![touches](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/touches.png)  The `within` spatial relationship returns features in the layer view that completely contain the query [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). In other words, the filter geometry is completely `within` the features in the layer view. It is opposite of `contains`.  ![within](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/within.png)  The `disjoint` spatial relationship returns features in the layer view that do not intersect the query [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) in anyway. Opposite of `intersects`.  ![disjoint](https://developers.arcgis.com/javascript/assets/img/apiref/layers/spatialRelationships/disjoint.png)
    * > **Known Limitations**  For spatial queries on 3D Object SceneLayerView the spatial relationship is evaluated based on the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the feature and not the footprint. As a result a feature might be returned from the query, even though its footprint is not in a spatial relationship with the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#spatialRelationship)
    *
    * @default intersects
    */
  var spatialRelationship: js.UndefOr[
    intersects | contains | crosses | disjoint | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation
  ] = js.undefined
  /**
    * This parameter can be either standard SQL92 `standard` or it can use the native SQL of the underlying datastore `native`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/query-feature-service-.htm) for more information.
    * > **Known Limitations**  This property does not apply to layer view or [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#sqlFormat)
    *
    * @default none
    */
  var sqlFormat: js.UndefOr[none | standard | native] = js.undefined
  /**
    * The zero-based index indicating where to begin retrieving features. This property should be used in conjunction with [num](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#num). Use this to implement paging and retrieve "pages" of results when querying. Features are sorted ascending by object ID by default.
    * > **Known Limitations**  This property does not apply to layer view or [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#start)
    */
  var start: js.UndefOr[Double] = js.undefined
  /**
    * Shorthand for a where clause using "like". The field used is the display field defined in the services directory.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#text)
    *
    * @default null
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * A time extent for a temporal query against [time-aware layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#timeInfo). For example, it can be used to discover all crimes that occurred during the night shift from 10 PM to 6 AM on a particular date.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  /**
    * The unit for calculating the buffer distance when [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance) is specified in spatial queries. If `units` is not specified, the unit is derived from the geometry spatial reference. If the geometry spatial reference is not specified, the unit is derived from the feature service data spatial reference. For service-based queries, this parameter only applies if the layer's [capabilities.query.supportsDistance](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#units)
    *
    * @default null
    */
  var units: js.UndefOr[feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_] = js.undefined
  /**
    * A where clause for the query. Any legal SQL where clause operating on the fields in the layer is allowed. Be sure to have the correct sequence of single and double quotes when writing the where clause in JavaScript.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#where)
    */
  var where: js.UndefOr[String] = js.undefined
}

object QueryProperties {
  @scala.inline
  def apply(
    datumTransformation: Int | Double = null,
    distance: Int | Double = null,
    gdbVersion: String = null,
    geometry: GeometryProperties = null,
    geometryPrecision: Int | Double = null,
    groupByFieldsForStatistics: js.Array[String] = null,
    having: String = null,
    historicMoment: DateProperties = null,
    maxAllowableOffset: Int | Double = null,
    maxRecordCountFactor: Int | Double = null,
    multipatchOption: String = null,
    num: Int | Double = null,
    objectIds: js.Array[Double] = null,
    orderByFields: js.Array[String] = null,
    outFields: js.Array[String] = null,
    outSpatialReference: SpatialReferenceProperties = null,
    outStatistics: js.Array[StatisticDefinitionProperties] = null,
    parameterValues: js.Array[QueryParameterValues] = null,
    pixelSize: SymbolProperties = null,
    quantizationParameters: QueryQuantizationParameters = null,
    rangeValues: js.Array[QueryRangeValues] = null,
    relationParameter: String = null,
    returnCentroid: js.UndefOr[Boolean] = js.undefined,
    returnDistinctValues: js.UndefOr[Boolean] = js.undefined,
    returnExceededLimitFeatures: js.UndefOr[Boolean] = js.undefined,
    returnGeometry: js.UndefOr[Boolean] = js.undefined,
    returnM: js.UndefOr[Boolean] = js.undefined,
    returnQueryGeometry: js.UndefOr[Boolean] = js.undefined,
    returnZ: js.UndefOr[Boolean] = js.undefined,
    spatialRelationship: intersects | contains | crosses | disjoint | `envelope-intersects` | `index-intersects` | overlaps | touches | within | relation = null,
    sqlFormat: none | standard | native = null,
    start: Int | Double = null,
    text: String = null,
    timeExtent: TimeExtentProperties = null,
    units: feet_ | miles_ | `nautical-miles` | `us-nautical-miles` | meters_ | kilometers_ = null,
    where: String = null
  ): QueryProperties = {
    val __obj = js.Dynamic.literal()
    if (datumTransformation != null) __obj.updateDynamic("datumTransformation")(datumTransformation.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (gdbVersion != null) __obj.updateDynamic("gdbVersion")(gdbVersion.asInstanceOf[js.Any])
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (geometryPrecision != null) __obj.updateDynamic("geometryPrecision")(geometryPrecision.asInstanceOf[js.Any])
    if (groupByFieldsForStatistics != null) __obj.updateDynamic("groupByFieldsForStatistics")(groupByFieldsForStatistics.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having.asInstanceOf[js.Any])
    if (historicMoment != null) __obj.updateDynamic("historicMoment")(historicMoment.asInstanceOf[js.Any])
    if (maxAllowableOffset != null) __obj.updateDynamic("maxAllowableOffset")(maxAllowableOffset.asInstanceOf[js.Any])
    if (maxRecordCountFactor != null) __obj.updateDynamic("maxRecordCountFactor")(maxRecordCountFactor.asInstanceOf[js.Any])
    if (multipatchOption != null) __obj.updateDynamic("multipatchOption")(multipatchOption.asInstanceOf[js.Any])
    if (num != null) __obj.updateDynamic("num")(num.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (orderByFields != null) __obj.updateDynamic("orderByFields")(orderByFields.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields.asInstanceOf[js.Any])
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference.asInstanceOf[js.Any])
    if (outStatistics != null) __obj.updateDynamic("outStatistics")(outStatistics.asInstanceOf[js.Any])
    if (parameterValues != null) __obj.updateDynamic("parameterValues")(parameterValues.asInstanceOf[js.Any])
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize.asInstanceOf[js.Any])
    if (quantizationParameters != null) __obj.updateDynamic("quantizationParameters")(quantizationParameters.asInstanceOf[js.Any])
    if (rangeValues != null) __obj.updateDynamic("rangeValues")(rangeValues.asInstanceOf[js.Any])
    if (relationParameter != null) __obj.updateDynamic("relationParameter")(relationParameter.asInstanceOf[js.Any])
    if (!js.isUndefined(returnCentroid)) __obj.updateDynamic("returnCentroid")(returnCentroid.asInstanceOf[js.Any])
    if (!js.isUndefined(returnDistinctValues)) __obj.updateDynamic("returnDistinctValues")(returnDistinctValues.asInstanceOf[js.Any])
    if (!js.isUndefined(returnExceededLimitFeatures)) __obj.updateDynamic("returnExceededLimitFeatures")(returnExceededLimitFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(returnGeometry)) __obj.updateDynamic("returnGeometry")(returnGeometry.asInstanceOf[js.Any])
    if (!js.isUndefined(returnM)) __obj.updateDynamic("returnM")(returnM.asInstanceOf[js.Any])
    if (!js.isUndefined(returnQueryGeometry)) __obj.updateDynamic("returnQueryGeometry")(returnQueryGeometry.asInstanceOf[js.Any])
    if (!js.isUndefined(returnZ)) __obj.updateDynamic("returnZ")(returnZ.asInstanceOf[js.Any])
    if (spatialRelationship != null) __obj.updateDynamic("spatialRelationship")(spatialRelationship.asInstanceOf[js.Any])
    if (sqlFormat != null) __obj.updateDynamic("sqlFormat")(sqlFormat.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryProperties]
  }
}

