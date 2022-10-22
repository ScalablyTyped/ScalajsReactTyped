package typingsJapgolly.heredatalens.H.datalens

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heredatalens.H.datalens.ObjectLayer.StyleState
import typingsJapgolly.heredatalens.H.datalens.QueryTileProvider.Zoom
import typingsJapgolly.heredatalens.H.datalens.Service.Data
import typingsJapgolly.heremaps.H.clustering.DataPoint
import typingsJapgolly.heremaps.H.clustering.Provider.ClusteringOptions
import typingsJapgolly.heremaps.H.geo.Point
import typingsJapgolly.heremaps.H.map.Icon
import typingsJapgolly.heremaps.H.map.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Presents data as points or spatial map objects with data-driven styles and client-side clustering.
  * Applicable for drawing interactive map objects like markers, polygons, circles and other instances of map.Object. Source of data can be either tiled or not tiled.
  * Styles for objects can be parametrized with data rows and zoom level. Allows to create data-driven icons for markers like donuts or bars.
  * Also enables clustering and data domains for visualizing up to 100k points or more.
  */
@js.native
trait ObjectLayer
  extends StObject
     with typingsJapgolly.heremaps.H.map.layer.ObjectLayer {
  
  /**
    * Force re-rendering of the layer. In the case where the callbacks passed to the layer options are not pure functions, you can call this method to force re-rendering.
    */
  def redraw(): Unit = js.native
  
  /**
    * Recalculates the style and applies it to the map object based on the new StyleState
    * @param object - Map object
    * @param state - New state
    */
  def updateObjectStyle(any: Object, state: StyleState): Unit = js.native
}
object ObjectLayer {
  
  /**
    * Defines client-side clustering in the ObjectLayer.
    * When the clustering option is provided, rows returned from dataToRows go to the clustering.rowToDataPoint callback to be transformed to data points.
    * Then, the data points are clustered according to clustering.options. Clustering produces clusters and noise points (data points that are not clustered).
    * Clusters and noise points must be presented as map objects with the rowToMapObject callback and can be styled with the rowToStyle callback.
    */
  trait Clustering extends StObject {
    
    /** Defines clustering options as a function of the zoom level */
    def options(zoom: Zoom): ClusteringOptions
    
    /** Defines data points from rows */
    def rowToDataPoint(row: Row): DataPoint
  }
  object Clustering {
    
    inline def apply(options: Zoom => ClusteringOptions, rowToDataPoint: Row => DataPoint): Clustering = {
      val __obj = js.Dynamic.literal(options = js.Any.fromFunction1(options), rowToDataPoint = js.Any.fromFunction1(rowToDataPoint))
      __obj.asInstanceOf[Clustering]
    }
    
    extension [Self <: Clustering](x: Self) {
      
      inline def setOptions(value: Zoom => ClusteringOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setRowToDataPoint(value: Row => DataPoint): Self = StObject.set(x, "rowToDataPoint", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Input data quantization domain, used to optimize styling performance.
    * The option must have properties corresponding to the properties of ObjectLayer.Row. Values must be represented as an Array of Numbers that defines the quantization domain.
    * When provided, the input data will be quantized, and rowToStyle will be called only for quantized values.
    */
  type DataDomains = Any
  
  /**
    * Output from the rowToStyle callback.
    * Defines the styles or the icon that is applied to the map object.
    */
  trait ObjectStyleOptions extends StObject {
    
    /** Style of arrows to render along a polyline */
    var arrows: js.UndefOr[typingsJapgolly.heremaps.H.map.ArrowStyle.Options] = js.undefined
    
    /** Marker icon */
    var icon: Icon
    
    /** Spatial style */
    var style: js.UndefOr[typingsJapgolly.heremaps.H.map.SpatialStyle.Options] = js.undefined
    
    /** The z-index value of the map object, default is 0 */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ObjectStyleOptions {
    
    inline def apply(icon: Icon): ObjectStyleOptions = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectStyleOptions]
    }
    
    extension [Self <: ObjectStyleOptions](x: Self) {
      
      inline def setArrows(value: typingsJapgolly.heremaps.H.map.ArrowStyle.Options): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: typingsJapgolly.heremaps.H.map.SpatialStyle.Options): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /**
    * Defines data processing and data-driven styling for ObjectLayer
    * The initial step of rendering is to split the tile data by rows, where each row represents a bucket.
    * By default this step is processed with ObjectLayer.defaultDataToRows. This behavior can be changed by defining the dataToRows callback.
    * In the next step each row must be presented as a map object with the rowToMapObject callback. Data-driven styling can be provided with the rowToStyle callback.
    */
  trait Options extends StObject {
    
    /** When present, client-side clustering is applied */
    var clustering: js.UndefOr[Clustering] = js.undefined
    
    /** Defines quantization of data for improving data-driven styling performance */
    var dataDomains: js.UndefOr[DataDomains] = js.undefined
    
    /** Defines how the input data is split by rows. You can specify this callback to define client-side aggregation and filtering. */
    var dataToRows: js.UndefOr[js.Function1[/* data */ Data, js.Array[Row]]] = js.undefined
    
    /** Defines how each row is presented on the map (eg marker, polygon) */
    def rowToMapObject(row: Row, z: Zoom): Object
    
    /**
      * Defines map object style and icon according to data row and zoom level.
      * Also it can define different styles depending on the StyleState (eg hovered, selected).
      */
    var rowToStyle: js.UndefOr[
        js.Function3[/* row */ Row, /* z */ Zoom, /* styleState */ StyleState, ObjectStyleOptions]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(rowToMapObject: (Row, Zoom) => Object): Options = {
      val __obj = js.Dynamic.literal(rowToMapObject = js.Any.fromFunction2(rowToMapObject))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setClustering(value: Clustering): Self = StObject.set(x, "clustering", value.asInstanceOf[js.Any])
      
      inline def setClusteringUndefined: Self = StObject.set(x, "clustering", js.undefined)
      
      inline def setDataDomains(value: DataDomains): Self = StObject.set(x, "dataDomains", value.asInstanceOf[js.Any])
      
      inline def setDataDomainsUndefined: Self = StObject.set(x, "dataDomains", js.undefined)
      
      inline def setDataToRows(value: /* data */ Data => js.Array[Row]): Self = StObject.set(x, "dataToRows", js.Any.fromFunction1(value))
      
      inline def setDataToRowsUndefined: Self = StObject.set(x, "dataToRows", js.undefined)
      
      inline def setRowToMapObject(value: (Row, Zoom) => Object): Self = StObject.set(x, "rowToMapObject", js.Any.fromFunction2(value))
      
      inline def setRowToStyle(value: (/* row */ Row, /* z */ Zoom, /* styleState */ StyleState) => ObjectStyleOptions): Self = StObject.set(x, "rowToStyle", js.Any.fromFunction3(value))
      
      inline def setRowToStyleUndefined: Self = StObject.set(x, "rowToStyle", js.undefined)
    }
  }
  
  /**
    * Slice of data (eg Data Lens query data row) that represents a data point.
    * Each row is translated to map objects with the rowToMapObject callback. By default each row is an Object where property names correspond to data column names.
    * This representation can be changed with the dataToRows callback.
    */
  trait Row extends StObject {
    
    def getPosition(): Point
    
    def isCluster(): Boolean
    
    var lat: Double
    
    var lng: Double
  }
  object Row {
    
    inline def apply(getPosition: CallbackTo[Point], isCluster: CallbackTo[Boolean], lat: Double, lng: Double): Row = {
      val __obj = js.Dynamic.literal(getPosition = getPosition.toJsFn, isCluster = isCluster.toJsFn, lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row]
    }
    
    extension [Self <: Row](x: Self) {
      
      inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
      
      inline def setIsCluster(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCluster", value.toJsFn)
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * User defined modification of a data-driven style
    * StyleState appears as a parameter in the rowToStyle callback. By default it is 'DEFAULT_STATE'. To change StyleState, use the ObjectLayer.updateObjectStyle method.
    */
  type StyleState = Any
}
