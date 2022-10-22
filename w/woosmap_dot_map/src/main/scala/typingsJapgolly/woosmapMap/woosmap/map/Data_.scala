package typingsJapgolly.woosmapMap.woosmap.map

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.woosmapMap.anon.IdPropertyName
import typingsJapgolly.woosmapMap.woosmap.map.data.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer for displaying geospatial data. Points can be displayed.
  */
@js.native
trait Data_
  extends StObject
     with MVCObject {
  
  def add(feature: FeatureData): Unit = js.native
  /**
    * Adds the feature passed as parameter.
    */
  def add(feature: Feature): Unit = js.native
  
  def addGeoJson(geojson: GeoJSONFeature): Unit = js.native
  /**
    * Adds GeoJSON features to the collection. Give this method a parsed JSON.
    * The imported features are returned. Throws an exception if the GeoJSON could not be imported.
    */
  def addGeoJson(geojson: GeoJSONFeatureCollection): Unit = js.native
  def addGeoJson(geojson: GeoJSONFeatureCollection, options: IdPropertyName): Unit = js.native
  def addGeoJson(geojson: GeoJSONFeature, options: IdPropertyName): Unit = js.native
  
  /**
    * Checks whether the given feature is in the collection.
    */
  def contains(feature: Feature): Boolean = js.native
  
  /**
    * Repeatedly invokes the given function, passing a feature in the collection to the function on each invocation.
    * The order of iteration through the features is undefined.
    */
  def forEach(callback: js.Function1[/* feature */ Feature, Unit]): Unit = js.native
  
  /**
    * Returns the feature matching the id.
    */
  def getFeatureById(id: String): Feature | Null = js.native
  
  /**
    * Returns the map on which the features are displayed.
    */
  def getMap(): Map | Null = js.native
  
  /**
    * Gets the style for all features in the collection.
    */
  def getStyle(): StyleFunction | StyleOptions = js.native
  
  /**
    * Loads GeoJSON features to the collection from an url. If a callback is provided
    * it will be called with the imported features.
    */
  def loadGeoJson(url: String): Unit = js.native
  def loadGeoJson(url: String, options: Unit, callback: js.Function1[/* data */ js.Array[Feature], Unit]): Unit = js.native
  def loadGeoJson(url: String, options: IdPropertyName): Unit = js.native
  def loadGeoJson(url: String, options: IdPropertyName, callback: js.Function1[/* data */ js.Array[Feature], Unit]): Unit = js.native
  
  /**
    * Changes the style of a feature.
    * These changes are applied on top of the style specified by `setStyle()`.
    * Style properties set to null revert to the value specified via `setStyle()`.
    */
  def overrideStyle(feature: Feature, style: StyleOptions): Unit = js.native
  
  /**
    * Remove the feature passed as parameter.
    */
  def remove(feature: Feature): Unit = js.native
  
  /**
    * Removes the effect of previous `overrideStyle()` calls.
    * The style of the given feature reverts to the style specified by `setStyle()`.
    * If no feature is given, all features have their style reverted.
    */
  def revertStyle(feature: Feature): Unit = js.native
  
  /**
    * Renders the features on the specified map. If map is set to null, the features will be removed from the map.
    */
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  /**
    * Sets the style for all features in the collection. Styles specified on a per-feature basis via `overrideStyle()`
    * continue to apply.
    * Pass either an object with the desired style options, or a function that computes the style for each feature.
    * The function will be called every time a feature's properties are updated.
    */
  def setStyle(style: StyleFunction): Unit = js.native
  def setStyle(style: StyleOptions): Unit = js.native
  
  /**
    * Exports the features in the collection to a GeoJSON object.
    */
  def toGeoJson(callback: js.Function1[/* geojson */ GeoJSONFeatureCollection, Unit]): Unit = js.native
}
object Data_ {
  
  trait Geometry[T, C] extends StObject {
    
    /**
      * Returns the type of the geometry.
      */
    def getType(): T
  }
  object Geometry {
    
    inline def apply[T, C](getType: CallbackTo[T]): Geometry[T, C] = {
      val __obj = js.Dynamic.literal(getType = getType.toJsFn)
      __obj.asInstanceOf[Geometry[T, C]]
    }
    
    extension [Self <: Geometry[?, ?], T, C](x: Self & (Geometry[T, C])) {
      
      inline def setGetType(value: CallbackTo[T]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  trait GeometryCollection
    extends StObject
       with GeometryClasses {
    
    def forEachLatLng(callback: js.Function1[/* point */ LatLng, Unit]): Unit
    
    def getArray(): GeometryArray
    
    /**
      * Returns the n-th Geometry of the GeometryCollection.
      */
    def getAt(n: Double): GeometryCollectionElement
    
    def getLength(): Double
    
    /**
      * Returns `"GeometryCollection"`.
      */
    def getType(): typingsJapgolly.woosmapMap.woosmapMapStrings.GeometryCollection
  }
  object GeometryCollection {
    
    inline def apply(
      forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
      getArray: CallbackTo[GeometryArray],
      getAt: Double => GeometryCollectionElement,
      getLength: CallbackTo[Double],
      getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.GeometryCollection]
    ): GeometryCollection = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[GeometryCollection]
    }
    
    extension [Self <: GeometryCollection](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* point */ LatLng, Unit] => Callback): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => value(t0).runNow()))
      
      inline def setGetArray(value: CallbackTo[GeometryArray]): Self = StObject.set(x, "getArray", value.toJsFn)
      
      inline def setGetAt(value: Double => GeometryCollectionElement): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.GeometryCollection]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  trait LineString
    extends StObject
       with GeometryCollectionElement {
    
    def forEachLatLng(callback: js.Function1[/* point */ LatLng, Unit]): Unit
    
    /**
      * Returns the points of the linestring as an array of LatLng.
      */
    def getArray(): js.Array[LatLng]
    
    /**
      * Returns the n-th Point (as LatLng) of the LineString.
      */
    def getAt(n: Double): LatLng
    
    /**
      * Returns the count of points in the linestring.
      */
    def getLength(): Double
    
    def getType(): typingsJapgolly.woosmapMap.woosmapMapStrings.LineString
  }
  object LineString {
    
    inline def apply(
      forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
      getArray: CallbackTo[js.Array[LatLng]],
      getAt: Double => LatLng,
      getLength: CallbackTo[Double],
      getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.LineString]
    ): LineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[LineString]
    }
    
    extension [Self <: LineString](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* point */ LatLng, Unit] => Callback): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => value(t0).runNow()))
      
      inline def setGetArray(value: CallbackTo[js.Array[LatLng]]): Self = StObject.set(x, "getArray", value.toJsFn)
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.LineString]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  type LinearRing = LineString
  
  trait MultiLineString
    extends StObject
       with GeometryCollectionElement {
    
    def forEachLatLng(callback: js.Function1[/* point */ LatLng, Unit]): Unit
    
    def getArray(): js.Array[LineString]
    
    /**
      * Returns the n-th LineString of the MultiLineString.
      */
    def getAt(n: Double): LineString
    
    /**
      * Returns `"MultiLineString"`.
      */
    def getType(): typingsJapgolly.woosmapMap.woosmapMapStrings.MultiLineString
  }
  object MultiLineString {
    
    inline def apply(
      forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
      getArray: CallbackTo[js.Array[LineString]],
      getAt: Double => LineString,
      getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.MultiLineString]
    ): MultiLineString = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getType = getType.toJsFn)
      __obj.asInstanceOf[MultiLineString]
    }
    
    extension [Self <: MultiLineString](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* point */ LatLng, Unit] => Callback): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => value(t0).runNow()))
      
      inline def setGetArray(value: CallbackTo[js.Array[LineString]]): Self = StObject.set(x, "getArray", value.toJsFn)
      
      inline def setGetAt(value: Double => LineString): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetType(value: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.MultiLineString]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  trait MultiPoint
    extends StObject
       with GeometryCollectionElement {
    
    /**
      * For each point calls the callback.
      */
    def forEachLatLng(callback: js.Function1[/* point */ LatLng, Unit]): Unit
    
    /**
      * Return the array of points
      */
    def getArray(): js.Array[LatLng]
    
    /**
      * Returns n-th Point of the MultiPoint.
      */
    def getAt(n: Double): LatLng
    
    /**
      * Returns the length of the multipoint.
      */
    def getLength(): Double
    
    /**
      * Returns `"MultiPoint"`.
      */
    def getType(): typingsJapgolly.woosmapMap.woosmapMapStrings.MultiPoint
  }
  object MultiPoint {
    
    inline def apply(
      forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
      getArray: CallbackTo[js.Array[LatLng]],
      getAt: Double => LatLng,
      getLength: CallbackTo[Double],
      getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.MultiPoint]
    ): MultiPoint = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[MultiPoint]
    }
    
    extension [Self <: MultiPoint](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* point */ LatLng, Unit] => Callback): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => value(t0).runNow()))
      
      inline def setGetArray(value: CallbackTo[js.Array[LatLng]]): Self = StObject.set(x, "getArray", value.toJsFn)
      
      inline def setGetAt(value: Double => LatLng): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.MultiPoint]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  trait MultiPolygon
    extends StObject
       with GeometryCollectionElement {
    
    def forEachLatLng(callback: js.Function1[/* point */ LatLng, Unit]): Unit
    
    /**
      * Returns the array of Polygons that makes the MultiPolygon.
      */
    def getArray(): js.Array[typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon]
    
    /**
      * Returns the n-th polygon of the MultiPolygon.
      */
    def getAt(n: Double): typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon
    
    /**
      * Return the count of Polygon in the MultiPolygon.
      */
    def getLength(): Double
    
    /**
      * Returns `"MultiPolygon"`.
      */
    def getType(): String
  }
  object MultiPolygon {
    
    inline def apply(
      forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
      getArray: CallbackTo[js.Array[typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon]],
      getAt: Double => typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon,
      getLength: CallbackTo[Double],
      getType: CallbackTo[String]
    ): MultiPolygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[MultiPolygon]
    }
    
    extension [Self <: MultiPolygon](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* point */ LatLng, Unit] => Callback): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => value(t0).runNow()))
      
      inline def setGetArray(value: CallbackTo[js.Array[typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon]]): Self = StObject.set(x, "getArray", value.toJsFn)
      
      inline def setGetAt(value: Double => typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  trait Point
    extends StObject
       with GeometryCollectionElement {
    
    def forEachLatLng(callback: js.Function1[/* point */ LatLng, Unit]): Unit
    
    /**
      * Returns the point geometry
      */
    def get(): LatLng
    
    /**
      * Returns `"Point"`.
      */
    def getType(): typingsJapgolly.woosmapMap.woosmapMapStrings.Point
  }
  object Point {
    
    inline def apply(
      forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
      get: CallbackTo[LatLng],
      getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.Point]
    ): typingsJapgolly.woosmapMap.woosmap.map.Data_.Point = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), get = get.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.Point]
    }
    
    extension [Self <: typingsJapgolly.woosmapMap.woosmap.map.Data_.Point](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* point */ LatLng, Unit] => Callback): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => value(t0).runNow()))
      
      inline def setGet(value: CallbackTo[LatLng]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.Point]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
  
  trait Polygon
    extends StObject
       with GeometryCollectionElement {
    
    /**
      * For each LinearRing call `callback`.
      */
    def forEachLatLng(callback: js.Function1[/* point */ LatLng, Unit]): Unit
    
    /**
      * Returns the array of LinearRing that composes the Polygon.
      */
    def getArray(): js.Array[LinearRing]
    
    /**
      * Returns the n-th LinearRing of the Polygon.
      */
    def getAt(n: Double): LinearRing
    
    /**
      * Returns the count of LinearRings that composes the Polygon.
      */
    def getLength(): Double
    
    /**
      * Returns `"Polygon"`.
      */
    def getType(): typingsJapgolly.woosmapMap.woosmapMapStrings.Polygon
  }
  object Polygon {
    
    inline def apply(
      forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
      getArray: CallbackTo[js.Array[LinearRing]],
      getAt: Double => LinearRing,
      getLength: CallbackTo[Double],
      getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.Polygon]
    ): typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon = {
      val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
      __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon]
    }
    
    extension [Self <: typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon](x: Self) {
      
      inline def setForEachLatLng(value: js.Function1[/* point */ LatLng, Unit] => Callback): Self = StObject.set(x, "forEachLatLng", js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => value(t0).runNow()))
      
      inline def setGetArray(value: CallbackTo[js.Array[LinearRing]]): Self = StObject.set(x, "getArray", value.toJsFn)
      
      inline def setGetAt(value: Double => LinearRing): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.Polygon]): Self = StObject.set(x, "getType", value.toJsFn)
    }
  }
}
