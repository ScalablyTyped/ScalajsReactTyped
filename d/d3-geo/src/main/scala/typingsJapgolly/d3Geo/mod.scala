package typingsJapgolly.d3Geo

import typingsJapgolly.d3Geo.anon.Properties
import typingsJapgolly.d3Geo.anon.Stream
import typingsJapgolly.d3Geo.anon.`0`
import typingsJapgolly.d3Geo.d3GeoStrings.Sphere
import typingsJapgolly.geojson.mod.GeoJsonObject
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.GeoJsonTypes
import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.geojson.mod.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-geo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def geoAlbers(): GeoConicProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoAlbers")().asInstanceOf[GeoConicProjection]
  
  inline def geoAlbersUsa(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoAlbersUsa")().asInstanceOf[GeoProjection_]
  
  inline def geoArea(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoArea")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def geoArea(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoArea")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def geoArea(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoArea")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def geoArea(`object`: GeoGeometryObjects): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoArea")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def geoAzimuthalEqualArea(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoAzimuthalEqualArea")().asInstanceOf[GeoProjection_]
  
  inline def geoAzimuthalEqualAreaRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoAzimuthalEqualAreaRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoAzimuthalEquidistant(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoAzimuthalEquidistant")().asInstanceOf[GeoProjection_]
  
  inline def geoAzimuthalEquidistantRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoAzimuthalEquidistantRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoBounds(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoBounds")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]]
  inline def geoBounds(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoBounds")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]]
  inline def geoBounds(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoBounds")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]]
  inline def geoBounds(`object`: GeoGeometryObjects): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoBounds")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]]
  
  inline def geoCentroid(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoCentroid")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def geoCentroid(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoCentroid")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def geoCentroid(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoCentroid")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def geoCentroid(`object`: GeoGeometryObjects): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoCentroid")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def geoCircle(): GeoCircleGenerator[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoCircle")().asInstanceOf[GeoCircleGenerator[Any, Any]]
  
  inline def geoCircle_Datum[Datum](): GeoCircleGenerator[Any, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoCircle")().asInstanceOf[GeoCircleGenerator[Any, Datum]]
  
  inline def geoCircle_ThisDatum[This, Datum](): GeoCircleGenerator[This, Datum] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoCircle")().asInstanceOf[GeoCircleGenerator[This, Datum]]
  
  inline def geoClipAntimeridian(stream: GeoStream_): GeoStream_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoClipAntimeridian")(stream.asInstanceOf[js.Any]).asInstanceOf[GeoStream_]
  
  inline def geoClipCircle(angle: Double): js.Function1[/* stream */ GeoStream_, GeoStream_] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoClipCircle")(angle.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* stream */ GeoStream_, GeoStream_]]
  
  inline def geoClipRectangle(x0: Double, y0: Double, x1: Double, y1: Double): js.Function1[/* stream */ GeoStream_, GeoStream_] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoClipRectangle")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* stream */ GeoStream_, GeoStream_]]
  
  inline def geoConicConformal(): GeoConicProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoConicConformal")().asInstanceOf[GeoConicProjection]
  
  inline def geoConicConformalRaw(phi0: Double, phi1: Double): GeoRawProjection = (^.asInstanceOf[js.Dynamic].applyDynamic("geoConicConformalRaw")(phi0.asInstanceOf[js.Any], phi1.asInstanceOf[js.Any])).asInstanceOf[GeoRawProjection]
  
  inline def geoConicEqualArea(): GeoConicProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoConicEqualArea")().asInstanceOf[GeoConicProjection]
  
  inline def geoConicEqualAreaRaw(phi0: Double, phi1: Double): GeoRawProjection = (^.asInstanceOf[js.Dynamic].applyDynamic("geoConicEqualAreaRaw")(phi0.asInstanceOf[js.Any], phi1.asInstanceOf[js.Any])).asInstanceOf[GeoRawProjection]
  
  inline def geoConicEquidistant(): GeoConicProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoConicEquidistant")().asInstanceOf[GeoConicProjection]
  
  inline def geoConicEquidistantRaw(phi0: Double, phi1: Double): GeoRawProjection = (^.asInstanceOf[js.Dynamic].applyDynamic("geoConicEquidistantRaw")(phi0.asInstanceOf[js.Any], phi1.asInstanceOf[js.Any])).asInstanceOf[GeoRawProjection]
  
  inline def geoContains(
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]],
    point: js.Tuple2[Double, Double]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("geoContains")(`object`.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def geoContains(
    `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties],
    point: js.Tuple2[Double, Double]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("geoContains")(`object`.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def geoContains(`object`: ExtendedGeometryCollection[GeoGeometryObjects], point: js.Tuple2[Double, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("geoContains")(`object`.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def geoContains(`object`: GeoGeometryObjects, point: js.Tuple2[Double, Double]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("geoContains")(`object`.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def geoDistance(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("geoDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def geoEqualEarth(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoEqualEarth")().asInstanceOf[GeoProjection_]
  
  inline def geoEqualEarthRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoEqualEarthRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoEquirectangular(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoEquirectangular")().asInstanceOf[GeoProjection_]
  
  inline def geoEquirectangularRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoEquirectangularRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoGnomonic(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoGnomonic")().asInstanceOf[GeoProjection_]
  
  inline def geoGnomonicRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoGnomonicRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoGraticule(): GeoGraticuleGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("geoGraticule")().asInstanceOf[GeoGraticuleGenerator]
  
  inline def geoGraticule10(): MultiLineString = ^.asInstanceOf[js.Dynamic].applyDynamic("geoGraticule10")().asInstanceOf[MultiLineString]
  
  inline def geoIdentity(): GeoIdentityTransform = ^.asInstanceOf[js.Dynamic].applyDynamic("geoIdentity")().asInstanceOf[GeoIdentityTransform]
  
  inline def geoInterpolate(a: js.Tuple2[Double, Double], b: js.Tuple2[Double, Double]): js.Function1[/* t */ Double, js.Tuple2[Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoInterpolate")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, js.Tuple2[Double, Double]]]
  
  inline def geoLength(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoLength")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def geoLength(`object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoLength")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def geoLength(`object`: ExtendedGeometryCollection[GeoGeometryObjects]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoLength")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def geoLength(`object`: GeoGeometryObjects): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geoLength")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def geoMercator(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoMercator")().asInstanceOf[GeoProjection_]
  
  inline def geoMercatorRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoMercatorRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoNaturalEarth1(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoNaturalEarth1")().asInstanceOf[GeoProjection_]
  
  inline def geoNaturalEarth1Raw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoNaturalEarth1Raw")().asInstanceOf[GeoRawProjection]
  
  inline def geoOrthographic(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoOrthographic")().asInstanceOf[GeoProjection_]
  
  inline def geoOrthographicRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoOrthographicRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoPath(): GeoPath_[Any, GeoPermissibleObjects] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")().asInstanceOf[GeoPath_[Any, GeoPermissibleObjects]]
  inline def geoPath(projection: Null, context: GeoContext): GeoPath_[Any, GeoPermissibleObjects] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, GeoPermissibleObjects]]
  inline def geoPath(projection: Unit, context: GeoContext): GeoPath_[Any, GeoPermissibleObjects] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, GeoPermissibleObjects]]
  inline def geoPath(projection: GeoProjection_): GeoPath_[Any, GeoPermissibleObjects] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any]).asInstanceOf[GeoPath_[Any, GeoPermissibleObjects]]
  inline def geoPath(projection: GeoProjection_, context: GeoContext): GeoPath_[Any, GeoPermissibleObjects] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, GeoPermissibleObjects]]
  inline def geoPath(projection: GeoStreamWrapper): GeoPath_[Any, GeoPermissibleObjects] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any]).asInstanceOf[GeoPath_[Any, GeoPermissibleObjects]]
  inline def geoPath(projection: GeoStreamWrapper, context: GeoContext): GeoPath_[Any, GeoPermissibleObjects] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, GeoPermissibleObjects]]
  
  inline def geoPath_DatumObject[DatumObject /* <: GeoPermissibleObjects */](): GeoPath_[Any, DatumObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")().asInstanceOf[GeoPath_[Any, DatumObject]]
  inline def geoPath_DatumObject[DatumObject /* <: GeoPermissibleObjects */](projection: Null, context: GeoContext): GeoPath_[Any, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, DatumObject]]
  inline def geoPath_DatumObject[DatumObject /* <: GeoPermissibleObjects */](projection: Unit, context: GeoContext): GeoPath_[Any, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, DatumObject]]
  inline def geoPath_DatumObject[DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection_): GeoPath_[Any, DatumObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any]).asInstanceOf[GeoPath_[Any, DatumObject]]
  inline def geoPath_DatumObject[DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection_, context: GeoContext): GeoPath_[Any, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, DatumObject]]
  inline def geoPath_DatumObject[DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper): GeoPath_[Any, DatumObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any]).asInstanceOf[GeoPath_[Any, DatumObject]]
  inline def geoPath_DatumObject[DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper, context: GeoContext): GeoPath_[Any, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[Any, DatumObject]]
  
  inline def geoPath_ThisDatumObject[This, DatumObject /* <: GeoPermissibleObjects */](): GeoPath_[This, DatumObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")().asInstanceOf[GeoPath_[This, DatumObject]]
  inline def geoPath_ThisDatumObject[This, DatumObject /* <: GeoPermissibleObjects */](projection: Null, context: GeoContext): GeoPath_[This, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[This, DatumObject]]
  inline def geoPath_ThisDatumObject[This, DatumObject /* <: GeoPermissibleObjects */](projection: Unit, context: GeoContext): GeoPath_[This, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[This, DatumObject]]
  inline def geoPath_ThisDatumObject[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection_): GeoPath_[This, DatumObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any]).asInstanceOf[GeoPath_[This, DatumObject]]
  inline def geoPath_ThisDatumObject[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoProjection_, context: GeoContext): GeoPath_[This, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[This, DatumObject]]
  inline def geoPath_ThisDatumObject[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper): GeoPath_[This, DatumObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any]).asInstanceOf[GeoPath_[This, DatumObject]]
  inline def geoPath_ThisDatumObject[This, DatumObject /* <: GeoPermissibleObjects */](projection: GeoStreamWrapper, context: GeoContext): GeoPath_[This, DatumObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("geoPath")(projection.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[GeoPath_[This, DatumObject]]
  
  inline def geoProjection(project: GeoRawProjection): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoProjection")(project.asInstanceOf[js.Any]).asInstanceOf[GeoProjection_]
  
  inline def geoProjectionMutator(factory: js.Function1[/* repeated */ Any, GeoRawProjection]): js.Function0[GeoProjection_] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoProjectionMutator")(factory.asInstanceOf[js.Any]).asInstanceOf[js.Function0[GeoProjection_]]
  
  inline def geoRotation(angles: js.Tuple2[Double, Double]): GeoRotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoRotation")(angles.asInstanceOf[js.Any]).asInstanceOf[GeoRotation_]
  inline def geoRotation(angles: js.Tuple3[Double, Double, Double]): GeoRotation_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoRotation")(angles.asInstanceOf[js.Any]).asInstanceOf[GeoRotation_]
  
  inline def geoStereographic(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoStereographic")().asInstanceOf[GeoProjection_]
  
  inline def geoStereographicRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoStereographicRaw")().asInstanceOf[GeoRawProjection]
  
  inline def geoStream(
    `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]],
    stream: GeoStream_
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("geoStream")(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def geoStream(`object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties], stream: GeoStream_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("geoStream")(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def geoStream(`object`: ExtendedGeometryCollection[GeoGeometryObjects], stream: GeoStream_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("geoStream")(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def geoStream(`object`: GeoGeometryObjects, stream: GeoStream_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("geoStream")(`object`.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def geoTransform[T /* <: GeoTransformPrototype */](methods: T): `0`[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("geoTransform")(methods.asInstanceOf[js.Any]).asInstanceOf[`0`[T]]
  
  inline def geoTransverseMercator(): GeoProjection_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoTransverseMercator")().asInstanceOf[GeoProjection_]
  
  inline def geoTransverseMercatorRaw(): GeoRawProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("geoTransverseMercatorRaw")().asInstanceOf[GeoRawProjection]
  
  trait ExtendedFeature[GeometryType /* <: GeoGeometryObjects | Null */, Properties /* <: GeoJsonProperties */]
    extends StObject
       with GeoJsonObject {
    
    var geometry: GeometryType
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var properties: Properties
  }
  object ExtendedFeature {
    
    inline def apply[GeometryType /* <: GeoGeometryObjects | Null */, Properties /* <: GeoJsonProperties */](geometry: GeometryType, properties: Properties, `type`: GeoJsonTypes): ExtendedFeature[GeometryType, Properties] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedFeature[GeometryType, Properties]]
    }
    
    extension [Self <: ExtendedFeature[?, ?], GeometryType /* <: GeoGeometryObjects | Null */, Properties /* <: GeoJsonProperties */](x: Self & (ExtendedFeature[GeometryType, Properties])) {
      
      inline def setGeometry(value: GeometryType): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtendedFeatureCollection[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */]
    extends StObject
       with GeoJsonObject {
    
    var features: js.Array[FeatureType]
  }
  object ExtendedFeatureCollection {
    
    inline def apply[FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */](features: js.Array[FeatureType], `type`: GeoJsonTypes): ExtendedFeatureCollection[FeatureType] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedFeatureCollection[FeatureType]]
    }
    
    extension [Self <: ExtendedFeatureCollection[?], FeatureType /* <: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties] */](x: Self & ExtendedFeatureCollection[FeatureType]) {
      
      inline def setFeatures(value: js.Array[FeatureType]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: FeatureType*): Self = StObject.set(x, "features", js.Array(value*))
    }
  }
  
  trait ExtendedGeometryCollection[GeometryType /* <: GeoGeometryObjects */] extends StObject {
    
    var bbox: js.UndefOr[js.Array[Double]] = js.undefined
    
    var crs: js.UndefOr[Properties] = js.undefined
    
    var geometries: js.Array[GeometryType]
    
    var `type`: String
  }
  object ExtendedGeometryCollection {
    
    inline def apply[GeometryType /* <: GeoGeometryObjects */](geometries: js.Array[GeometryType], `type`: String): ExtendedGeometryCollection[GeometryType] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedGeometryCollection[GeometryType]]
    }
    
    extension [Self <: ExtendedGeometryCollection[?], GeometryType /* <: GeoGeometryObjects */](x: Self & ExtendedGeometryCollection[GeometryType]) {
      
      inline def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value*))
      
      inline def setCrs(value: Properties): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      inline def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
      
      inline def setGeometries(value: js.Array[GeometryType]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: GeometryType*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GeoCircleGenerator[This, Datum] extends StObject {
    
    /**
      * Returns a new GeoJSON geometry object of type “Polygon” approximating a circle on the surface of a sphere,
      * with the current center, radius and precision. Any arguments are passed to the accessors.
      */
    def apply(d: Datum, args: Any*): Polygon = js.native
    def apply(d: Unit, args: Any*): Polygon = js.native
    
    /**
      * Returns the current center accessor, which defaults to a function returning [0, 0].
      */
    def center(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, js.Tuple2[Double, Double]] = js.native
    def center(
      center: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, js.Tuple2[Double, Double]]
    ): this.type = js.native
    /**
      * Sets the circle center to the specified point [longitude, latitude] in degrees, and returns this circle generator.
      * The center may also be specified as a function; this function will be invoked whenever a circle is generated, being passed any arguments passed to the circle generator.
      */
    def center(center: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the current precision accessor, which defaults to a function returning 6.
      */
    def precision(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, Double] = js.native
    def precision(precision: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, Double]): this.type = js.native
    /**
      * Sets the circle precision to the specified angle in degrees, and returns this circle generator.
      * The precision may also be specified as a function; this function will be invoked whenever a circle is generated, being passed any arguments passed to the circle generator.
      */
    def precision(precision: Double): this.type = js.native
    
    /**
      * Returns the current radius accessor, which defaults to a function returning 90.
      */
    def radius(): js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, Double] = js.native
    def radius(radius: js.ThisFunction2[/* this */ This, /* d */ Datum, /* repeated */ Any, Double]): this.type = js.native
    /**
      * Sets the circle radius to the specified angle in degrees, and returns this circle generator.
      * The radius may also be specified as a function; this function will be invoked whenever a circle is generated, being passed any arguments passed to the circle generator.
      */
    def radius(radius: Double): this.type = js.native
  }
  
  @js.native
  trait GeoConicProjection
    extends StObject
       with GeoProjection_ {
    
    /**
      * Return the standard parallels for the conic projection in degrees.
      */
    def parallels(): js.Tuple2[Double, Double] = js.native
    /**
      * Set the standard parallels for the conic projection in degrees and return the projection.
      *
      * @param value A two-dimensional array representing the standard parallels in degrees.
      */
    def parallels(value: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  @js.native
  trait GeoContext extends StObject {
    
    /**
      * Adds an arc to the path with center point (x, y) and radius r starting at startAngle and ending at endAngle.
      * The arc is drawn in clockwise direction by default.
      *
      * @param x x-coordinate of arc center point.
      * @param y y-coordinate of arc center point.
      * @param radius Radius of arc.
      * @param startAngle The starting angle of the arc, measured clockwise from the positive x axis and expressed in radians.
      * @param endAngle The end angle of the arc, measured clockwise from the positive x axis and expressed in radians.
      * @param anticlockwise Optional boolean flag, if true the arc is drawn counter-clockwise between the two angles.
      */
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
    def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Unit = js.native
    
    /**
      * Start a new path by emptying the list of sub-paths.
      */
    def beginPath(): Unit = js.native
    
    /**
      * Causes the point of the pen to move back to the start of the current sub-path.
      * It tries to draw a straight line from the current point to the start.
      * If the shape has already been closed or has only one point, this function does nothing.
      */
    def closePath(): Unit = js.native
    
    /**
      * Connects the last point in the sub-path to the x, y coordinates with a straight line (but does not actually draw it).
      *
      * @param x The x-coordinate for the end of the line.
      * @param y The y-coordinate for the end of the line.
      */
    def lineTo(x: Double, y: Double): Unit = js.native
    
    /**
      * Move the starting point of a new sub-path to the (x, y) coordinates.
      *
      * @param x The x-coordinate for the new starting point.
      * @param y The y-coordinate for the new starting point.
      */
    def moveTo(x: Double, y: Double): Unit = js.native
  }
  
  type GeoGeometryObjects = GeometryObject | GeoSphere
  
  @js.native
  trait GeoGraticuleGenerator extends StObject {
    
    /**
      * Returns a GeoJSON MultiLineString geometry object representing all meridians and parallels for this graticule.
      */
    def apply(): MultiLineString = js.native
    
    /**
      * Returns the current minor extent, which defaults to ⟨⟨-180°, -80° - ε⟩, ⟨180°, 80° + ε⟩⟩.
      */
    def extent(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    /**
      * Sets the major and minor extents of this graticule.
      *
      * @param extent Extent to use for major and minor extent of graticule.
      */
    def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    
    /**
      * Returns the current major extent, which defaults to ⟨⟨-180°, -90° + ε⟩, ⟨180°, 90° - ε⟩⟩.
      */
    def extentMajor(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    /**
      * Sets the major extent of this graticule.
      *
      * @param extent Major extent of graticule.
      */
    def extentMajor(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    
    /**
      * Returns the current minor extent, which defaults to  ⟨⟨-180°, -80° - ε⟩, ⟨180°, 80° + ε⟩⟩.
      */
    def extentMinor(): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    /**
      * Sets the minor extent of this graticule.
      *
      * @param extent Minor extent of graticule.
      */
    def extentMinor(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    
    /**
      * Returns an array of GeoJSON LineString geometry objects, one for each meridian or parallel for this graticule.
      */
    def lines(): js.Array[LineString] = js.native
    
    /**
      * Returns a GeoJSON Polygon geometry object representing the outline of this graticule, i.e. along the meridians and parallels defining its extent.
      */
    def outline(): Polygon = js.native
    
    /**
      * Returns the current precision, which defaults to 2.5°.
      */
    def precision(): Double = js.native
    /**
      * Sets the precision for this graticule, in degrees.
      *
      * @param angle Precision in degrees.
      */
    def precision(angle: Double): this.type = js.native
    
    /**
      * Returns the current minor step, which defaults to ⟨10°, 10°⟩.
      */
    def step(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the major and minor step for this graticule
      *
      * @param step Major and minor step to use for this graticule.
      */
    def step(step: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the current major step, which defaults to ⟨90°, 360°⟩.
      */
    def stepMajor(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the major step for this graticule.
      *
      * @param step Major step.
      */
    def stepMajor(step: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Returns the current major step, which defaults to ⟨10°, 10°⟩.
      */
    def stepMinor(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the minor step for this graticule.
      *
      * @param step Minor step.
      */
    def stepMinor(step: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  type GeoIdentityTranform = GeoIdentityTransform
  
  @js.native
  trait GeoIdentityTransform
    extends StObject
       with GeoStreamWrapper {
    
    /**
      * Returns a new array [x, y] (typically in pixels) representing the projected point of the given point.
      * The point must be specified as a two-element array [longitude, latitude] in degrees.
      * May return null if the specified point has no defined projected position, such as when the point is outside the clipping bounds of the projection.
      *
      * @param point A point specified as a two-dimensional array [longitude, latitude] in degrees.
      */
    def apply(point: js.Tuple2[Double, Double]): (js.Tuple2[Double, Double]) | Null = js.native
    
    /**
      * Returns the projection’s current angle, which defaults to 0°.
      */
    def angle(): Double = js.native
    /**
      * Sets the projection’s post-projection planar rotation angle to the specified angle in degrees and returns the projection.
      * @param angle The new rotation angle of the projection.
      */
    def angle(angle: Double): this.type = js.native
    
    /**
      * Sets the projection’s viewport clip extent to the specified bounds in pixels and returns the projection.
      * The extent bounds are specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left-side of the viewport, y₀ is the top, x₁ is the right and y₁ is the bottom.
      * If extent is null, no viewport clipping is performed.
      */
    def clipExtent(): this.type = js.native
    def clipExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    /**
      * Returns the current viewport clip extent which defaults to null.
      */
    @JSName("clipExtent")
    def clipExtent_Union(): (js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]) | Null = js.native
    
    /**
      * Sets the projection’s scale and translate to fit the specified GeoJSON object in the center of the given extent.
      * The extent is specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left side of the bounding box, y₀ is the top, x₁ is the right and y₁ is the bottom. Returns the projection.
      */
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]
    ): this.type = js.native
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
    ): this.type = js.native
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: ExtendedGeometryCollection[GeoGeometryObjects]
    ): this.type = js.native
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: GeoGeometryObjects
    ): this.type = js.native
    
    /**
      * A convenience method for projection.fitExtent where the top-left corner of the extent is [0, 0].
      */
    def fitSize(
      size: js.Tuple2[Double, Double],
      `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]
    ): this.type = js.native
    def fitSize(
      size: js.Tuple2[Double, Double],
      `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
    ): this.type = js.native
    def fitSize(size: js.Tuple2[Double, Double], `object`: ExtendedGeometryCollection[GeoGeometryObjects]): this.type = js.native
    def fitSize(size: js.Tuple2[Double, Double], `object`: GeoGeometryObjects): this.type = js.native
    
    /**
      * Returns a new array [longitude, latitude] in degrees representing the unprojected point of the given projected point.
      * May return null if the specified point has no defined projected position, such as when the point is outside the clipping bounds of the projection.
      *
      * @param point The projected point, specified as a two-element array [x, y] (typically in pixels).
      */
    def invert(point: js.Tuple2[Double, Double]): (js.Tuple2[Double, Double]) | Null = js.native
    
    /**
      * Returns the current cartesian clipping function.
      * Post-clipping occurs on the plane, when a projection is bounded to a certain extent such as a rectangle.
      */
    def postclip(): js.Function1[/* stream */ GeoStream_, GeoStream_] = js.native
    /**
      * Sets the projection’s cartesian clipping to the specified function and returns the projection.
      *
      * @param postclip A cartesian clipping function. Clipping functions are implemented as transformations of a projection stream.
      * Post-clipping operates on planar coordinates, in pixels.
      */
    def postclip(postclip: js.Function1[/* stream */ GeoStream_, GeoStream_]): this.type = js.native
    
    /**
      * Returns true if x-reflection is enabled, which defaults to false.
      */
    def reflectX(): Boolean = js.native
    /**
      * Sets whether or not the x-dimension is reflected (negated) in the output.
      *
      * @param reflect true = reflect x-dimension, false = do not reflect x-dimension.
      */
    def reflectX(reflect: Boolean): this.type = js.native
    
    /**
      * Returns true if y-reflection is enabled, which defaults to false.
      */
    def reflectY(): Boolean = js.native
    /**
      * Sets whether or not the y-dimension is reflected (negated) in the output.
      *
      * This is especially useful for transforming from standard spatial reference systems,
      * which treat positive y as pointing up, to display coordinate systems such as Canvas and SVG,
      * which treat positive y as pointing down.
      *
      * @param reflect true = reflect y-dimension, false = do not reflect y-dimension.
      */
    def reflectY(reflect: Boolean): this.type = js.native
    
    /**
      * Returns the current scale factor.
      *
      * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
      */
    def scale(): Double = js.native
    /**
      * Sets the projection’s scale factor to the specified value and returns the projection.
      * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
      *
      * @param scale Scale factor to be used for the projection.
      */
    def scale(scale: Double): this.type = js.native
    
    /**
      * Returns the current translation offset.
      * The translation offset determines the pixel coordinates of the projection’s center.
      */
    def translate(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the projection’s translation offset to the specified two-element array [tx, ty] and returns the projection.
      * The translation offset determines the pixel coordinates of the projection’s center.
      *
      * @param point A two-element array [tx, ty] specifying the translation offset.
      */
    def translate(point: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  @js.native
  trait GeoPath_[This, DatumObject /* <: GeoPermissibleObjects */] extends StObject {
    
    /**
      * Renders the given object, which may be any GeoJSON feature or geometry object:
      *
      * + Point - a single position.
      * + MultiPoint - an array of positions.
      * + LineString - an array of positions forming a continuous line.
      * + MultiLineString - an array of arrays of positions forming several lines.
      * + Polygon - an array of arrays of positions forming a polygon (possibly with holes).
      * + MultiPolygon - a multidimensional array of positions forming multiple polygons.
      * + GeometryCollection - an array of geometry objects.
      * + Feature - a feature containing one of the above geometry objects.
      * + FeatureCollection - an array of feature objects.
      *
      * The type Sphere is also supported, which is useful for rendering the outline of the globe; a sphere has no coordinates.
      *
      *
      * Any additional arguments are passed along to the pointRadius accessor.
      *
      * IMPORTANT: If the rendering context of the geoPath generator is null,
      * then the geoPath is returned as an SVG path data string.
      *
      * Separate path elements are typically slower than a single path element. However, distinct path elements are useful for styling and interaction (e.g., click or mouseover).
      * Canvas rendering (see path.context) is typically faster than SVG, but requires more effort to implement styling and interaction.
      *
      * The first generic type of the GeoPath generator used, must correspond to the "this" context bound to the function upon invocation.
      *
      * @param object An object to be rendered.
      */
    def apply(`object`: DatumObject, args: Any*): String | Null = js.native
    
    /**
      * Returns the projected planar area (typically in square pixels) for the specified GeoJSON object.
      * Point, MultiPoint, LineString and MultiLineString geometries have zero area. For Polygon and MultiPolygon geometries,
      * this method first computes the area of the exterior ring, and then subtracts the area of any interior holes.
      * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoArea.
      *
      * @param object An object for which the area is to be calculated.
      */
    def area(`object`: DatumObject): Double = js.native
    
    /**
      * Returns the projected planar bounding box (typically in pixels) for the specified GeoJSON object.
      * The bounding box is represented by a two-dimensional array: [[x₀, y₀], [x₁, y₁]], where x₀ is the minimum x-coordinate, y₀ is the minimum y-coordinate,
      * x₁ is maximum x-coordinate, and y₁ is the maximum y-coordinate.
      *
      * This is handy for, say, zooming in to a particular feature. (Note that in projected planar coordinates,
      * the minimum latitude is typically the maximum y-value, and the maximum latitude is typically the minimum y-value.)
      * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoBounds.
      *
      * @param object An object for which the bounds are to be calculated.
      */
    def bounds(`object`: DatumObject): js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    
    /**
      * Returns the projected planar centroid (typically in pixels) for the specified GeoJSON object.
      * This is handy for, say, labeling state or county boundaries, or displaying a symbol map.
      * For example, a noncontiguous cartogram might scale each state around its centroid.
      * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoCentroid.
      *
      * @param object An object for which the centroid is to be calculated.
      */
    def centroid(`object`: DatumObject): js.Tuple2[Double, Double] = js.native
    
    /**
      * sets the current render context and returns the path generator.
      * If the context is null, then the path generator will return an SVG path string;
      * if the context is non-null, the path generator will instead call methods on the specified context to render geometry.
      */
    def context(): this.type = js.native
    def context(context: GeoContext): this.type = js.native
    /**
      * Returns the current render context which defaults to null.
      *
      * Use the generic to cast the return type of the rendering context, if it is known for a specific application.
      */
    // tslint:disable-next-line:no-unnecessary-generics
    @JSName("context")
    def context_C_C[C /* <: GeoContext | Null */](): C = js.native
    
    /**
      * Returns the projected planar length (typically in pixels) for the specified GeoJSON object.
      * Point and MultiPoint geometries have zero length. For Polygon and MultiPolygon geometries, this method computes the summed length of all rings.
      *
      * This method observes any clipping performed by the projection; see projection.clipAngle and projection.clipExtent. This is the planar equivalent of d3.geoLength.
      *
      * @param object An object for which the measure is to be calculated.
      */
    def measure(`object`: DatumObject): Double = js.native
    
    /**
      * Returns the current radius or radius accessor used to determine the radius for the display of Point and MultiPoint geometries.
      * The default is a constant radius of 4.5.
      */
    def pointRadius(): (js.ThisFunction2[/* this */ This, /* object */ DatumObject, /* repeated */ Any, Double]) | Double = js.native
    def pointRadius(value: js.ThisFunction2[/* this */ This, /* object */ DatumObject, /* repeated */ Any, Double]): this.type = js.native
    /**
      * Sets the radius used to display Point and MultiPoint geometries to the specified number.
      * While the radius is commonly specified as a number constant, it may also be specified as a function which is computed per feature, being passed the any arguments passed to the path generator.
      * For example, if your GeoJSON data has additional properties, you might access those properties inside the radius function to vary the point size;
      * alternatively, you could d3.symbol and a projection for greater flexibility.
      */
    def pointRadius(value: Double): this.type = js.native
    
    /**
      * Sets the current projection to the specified projection.
      * The null projection represents the identity transformation: the input geometry is not projected and is instead rendered directly in raw coordinates.
      * This can be useful for fast rendering of pre-projected geometry, or for fast rendering of the equirectangular projection.
      */
    def projection(): this.type = js.native
    def projection(projection: GeoProjection_): this.type = js.native
    def projection(projection: GeoStreamWrapper): this.type = js.native
    /**
      * Get the current projection. The generic parameter can be used to cast the result to the
      * correct, known type of the projection, e.g. GeoProjection or GeoConicProjection. Otherwise,
      * the return type defaults to the minimum type requirement for a projection which
      * can be passed into a GeoPath.
      *
      * Use the generic to cast the return type of the projection, if it is known for a specific application.
      */
    // tslint:disable-next-line:no-unnecessary-generics
    @JSName("projection")
    def projection_P_P[P /* <: GeoConicProjection | GeoProjection_ | GeoStreamWrapper | Null */](): P = js.native
  }
  
  type GeoPermissibleObjects = GeoGeometryObjects | ExtendedGeometryCollection[GeoGeometryObjects] | (ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]) | (ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]])
  
  @js.native
  trait GeoProjection_
    extends StObject
       with GeoStreamWrapper {
    
    /**
      * Returns a new array [x, y] (typically in pixels) representing the projected point of the given point.
      * The point must be specified as a two-element array [longitude, latitude] in degrees.
      * May return null if the specified point has no defined projected position, such as when the point is outside the clipping bounds of the projection.
      *
      * @param point A point specified as a two-dimensional array [longitude, latitude] in degrees.
      */
    def apply(point: js.Tuple2[Double, Double]): (js.Tuple2[Double, Double]) | Null = js.native
    
    /**
      * Returns the projection’s current angle, which defaults to 0°.
      */
    def angle(): Double = js.native
    /**
      * Sets the projection’s post-projection planar rotation angle to the specified angle in degrees and returns the projection.
      * @param angle The new rotation angle of the projection.
      */
    def angle(angle: Double): this.type = js.native
    
    /**
      * Returns the current center of the projection, which defaults to ⟨0°,0°⟩.
      */
    def center(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the projection’s center to the specified center,
      * a two-element array of longitude and latitude in degrees and returns the projection.
      * The default is ⟨0°,0°⟩.
      *
      * @param point A point specified as a two-dimensional array [longitude, latitude] in degrees.
      */
    def center(point: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Sets the projection’s clipping circle radius to the specified angle in degrees and returns the projection.
      * If angle is null, switches to antimeridian cutting rather than small-circle clipping.
      */
    def clipAngle(): this.type = js.native
    def clipAngle(angle: Double): this.type = js.native
    /**
      * Returns the current clip angle which defaults to null.
      *
      * null switches to antimeridian cutting rather than small-circle clipping.
      */
    @JSName("clipAngle")
    def clipAngle_Union(): Double | Null = js.native
    
    /**
      * Sets the projection’s viewport clip extent to the specified bounds in pixels and returns the projection.
      * The extent bounds are specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left-side of the viewport, y₀ is the top, x₁ is the right and y₁ is the bottom.
      * If extent is null, no viewport clipping is performed.
      */
    def clipExtent(): this.type = js.native
    def clipExtent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    /**
      * Returns the current viewport clip extent which defaults to null.
      */
    @JSName("clipExtent")
    def clipExtent_Union(): (js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]) | Null = js.native
    
    /**
      * Sets the projection’s scale and translate to fit the specified GeoJSON object in the center of the given extent.
      * The extent is specified as an array [[x₀, y₀], [x₁, y₁]], where x₀ is the left side of the bounding box, y₀ is the top, x₁ is the right and y₁ is the bottom.
      * Returns the projection.
      */
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]
    ): this.type = js.native
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
    ): this.type = js.native
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: ExtendedGeometryCollection[GeoGeometryObjects]
    ): this.type = js.native
    def fitExtent(
      extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]],
      `object`: GeoGeometryObjects
    ): this.type = js.native
    
    /**
      * A convenience method for projection.fitSize where the width is automatically chosen from the aspect ratio of object and the given constraint on height.
      */
    def fitHeight(height: Double, `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): this.type = js.native
    def fitHeight(
      height: Double,
      `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
    ): this.type = js.native
    def fitHeight(height: Double, `object`: ExtendedGeometryCollection[GeoGeometryObjects]): this.type = js.native
    def fitHeight(height: Double, `object`: GeoGeometryObjects): this.type = js.native
    
    /**
      * A convenience method for projection.fitExtent where the top-left corner of the extent is [0, 0].
      */
    def fitSize(
      size: js.Tuple2[Double, Double],
      `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]
    ): this.type = js.native
    def fitSize(
      size: js.Tuple2[Double, Double],
      `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
    ): this.type = js.native
    def fitSize(size: js.Tuple2[Double, Double], `object`: ExtendedGeometryCollection[GeoGeometryObjects]): this.type = js.native
    def fitSize(size: js.Tuple2[Double, Double], `object`: GeoGeometryObjects): this.type = js.native
    
    /**
      * A convenience method for projection.fitSize where the height is automatically chosen from the aspect ratio of object and the given constraint on width.
      */
    def fitWidth(width: Double, `object`: ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]): this.type = js.native
    def fitWidth(
      width: Double,
      `object`: ExtendedFeatureCollection[ExtendedFeature[GeoGeometryObjects | Null, GeoJsonProperties]]
    ): this.type = js.native
    def fitWidth(width: Double, `object`: ExtendedGeometryCollection[GeoGeometryObjects]): this.type = js.native
    def fitWidth(width: Double, `object`: GeoGeometryObjects): this.type = js.native
    
    /**
      * Returns a new array [longitude, latitude] in degrees representing the unprojected point of the given projected point.
      * May return null if the specified point has no defined projected position, such as when the point is outside the clipping bounds of the projection.
      *
      * @param point The projected point, specified as a two-element array [x, y] (typically in pixels).
      */
    var invert: js.UndefOr[
        js.Function1[/* point */ js.Tuple2[Double, Double], (js.Tuple2[Double, Double]) | Null]
      ] = js.native
    
    /**
      * Returns the current cartesian clipping function.
      * Post-clipping occurs on the plane, when a projection is bounded to a certain extent such as a rectangle.
      */
    def postclip(): js.Function1[/* stream */ GeoStream_, GeoStream_] = js.native
    /**
      * Sets the projection’s cartesian clipping to the specified function and returns the projection.
      *
      * @param postclip A cartesian clipping function. Clipping functions are implemented as transformations of a projection stream.
      * Post-clipping operates on planar coordinates, in pixels.
      */
    def postclip(postclip: js.Function1[/* stream */ GeoStream_, GeoStream_]): this.type = js.native
    
    /**
      * Returns the projection’s current resampling precision which defaults to square root of 0.5.
      * This value corresponds to the Douglas–Peucker distance.
      */
    def precision(): Double = js.native
    /**
      * Sets the threshold for the projection’s adaptive resampling to the specified value in pixels and returns the projection.
      * This value corresponds to the Douglas–Peucker distance.
      *
      * @param precision A numeric value in pixels to use as the threshold for the projection’s adaptive resampling.
      */
    def precision(precision: Double): this.type = js.native
    
    /**
      * Returns the current spherical clipping function.
      * Pre-clipping occurs in geographic coordinates. Cutting along the antimeridian line,
      * or clipping along a small circle are the most common strategies.
      */
    def preclip(): js.Function1[/* stream */ GeoStream_, GeoStream_] = js.native
    /**
      * Sets the projection’s spherical clipping to the specified function and returns the projection.
      * Pre-clipping occurs in geographic coordinates. Cutting along the antimeridian line, or clipping along a small circle are the most common strategies.
      *
      * @param preclip A spherical clipping function. Clipping functions are implemented as transformations of a projection stream.
      * Pre-clipping operates on spherical coordinates, in radians.
      */
    def preclip(preclip: js.Function1[/* stream */ GeoStream_, GeoStream_]): this.type = js.native
    
    /**
      * Returns true if x-reflection is enabled, which defaults to false.
      */
    def reflectX(): Boolean = js.native
    /**
      * Sets whether or not the x-dimension is reflected (negated) in the output.
      * @param reflect Whether or not the x-dimension is reflected (negated) in the output.
      */
    def reflectX(reflect: Boolean): this.type = js.native
    
    /**
      * Returns true if y-reflection is enabled, which defaults to false.
      */
    def reflectY(): Boolean = js.native
    /**
      * Sets whether or not the y-dimension is reflected (negated) in the output.
      * @param reflect Whether or not the y-dimension is reflected (negated) in the output.
      */
    def reflectY(reflect: Boolean): this.type = js.native
    
    /**
      * Returns the current rotation [lambda, phi, gamma] specifying the rotation angles in degrees about each spherical axis.
      * (These correspond to yaw, pitch and roll.) which defaults [0, 0, 0].
      */
    def rotate(): js.Tuple3[Double, Double, Double] = js.native
    /**
      * Sets the projection’s three-axis rotation to the specified angles, which must be a two- or three-element array of numbers.
      *
      * @param angles  A two- or three-element array of numbers [lambda, phi, gamma] specifying the rotation angles in degrees about each spherical axis.
      * (These correspond to yaw, pitch and roll.) If the rotation angle gamma is omitted, it defaults to 0.
      */
    def rotate(angles: js.Tuple2[Double, Double]): this.type = js.native
    def rotate(angles: js.Tuple3[Double, Double, Double]): this.type = js.native
    
    /**
      * Returns the current scale factor; the default scale is projection-specific.
      *
      * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
      */
    def scale(): Double = js.native
    /**
      * Sets the projection’s scale factor to the specified value and returns the projection.
      * The scale factor corresponds linearly to the distance between projected points; however, absolute scale factors are not equivalent across projections.
      *
      * @param scale Scale factor to be used for the projection; the default scale is projection-specific.
      */
    def scale(scale: Double): this.type = js.native
    
    /**
      * Returns the current translation offset which defaults to [480, 250] and places ⟨0°,0°⟩ at the center of a 960×500 area.
      * The translation offset determines the pixel coordinates of the projection’s center.
      */
    def translate(): js.Tuple2[Double, Double] = js.native
    /**
      * Sets the projection’s translation offset to the specified two-element array [tx, ty] and returns the projection.
      * The translation offset determines the pixel coordinates of the projection’s center. The default translation offset places ⟨0°,0°⟩ at the center of a 960×500 area.
      *
      * @param point A two-element array [tx, ty] specifying the translation offset. The default translation offset of defaults to [480, 250] places ⟨0°,0°⟩ at the center of a 960×500 area.
      */
    def translate(point: js.Tuple2[Double, Double]): this.type = js.native
  }
  
  @js.native
  trait GeoRawProjection extends StObject {
    
    /**
      * Projects the specified point [lambda, phi] in radians, returning a new point [x, y] in unitless coordinates.
      * @param lambda Spherical lambda coordinate in radians.
      * @param phi Spherical phi coordinate in radians.
      */
    def apply(lambda: Double, phi: Double): js.Tuple2[Double, Double] = js.native
    
    /**
      * Inverts the projected point [x, y] in unitless coordinates, returning an unprojected point in spherical coordinates [lambda, phi] in radians.
      * @param x x-coordinate (unitless).
      * @param y y-coordinate (unitless).
      */
    var invert: js.UndefOr[js.Function2[/* x */ Double, /* y */ Double, js.Tuple2[Double, Double]]] = js.native
  }
  
  @js.native
  trait GeoRotation_ extends StObject {
    
    /**
      * Returns a new array [longitude, latitude] in degrees representing the rotated point of the given point.
      *
      * @param point The point must be specified as a two-element array [longitude, latitude] in degrees.
      */
    def apply(point: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
    
    /**
      * Returns a new array [longitude, latitude] in degrees representing the point of the given rotated point; the inverse of rotation.
      *
      * @param point The rotated point must be specified as a two-element array [longitude, latitude] in degrees.
      */
    def invert(point: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  }
  
  trait GeoSphere extends StObject {
    
    /**
      * Sphere geometry type
      */
    var `type`: Sphere
  }
  object GeoSphere {
    
    inline def apply(): GeoSphere = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Sphere")
      __obj.asInstanceOf[GeoSphere]
    }
    
    extension [Self <: GeoSphere](x: Self) {
      
      inline def setType(value: Sphere): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeoStreamWrapper extends StObject {
    
    /**
      * Returns a projection stream for the specified output stream. Any input geometry is projected before being streamed to the output stream.
      * A typical projection involves several geometry transformations: the input geometry is first converted to radians, rotated on three axes,
      * clipped to the small circle or cut along the antimeridian, and lastly projected to the plane with adaptive resampling, scale and translation.
      *
      * @param stream An input stream
      */
    def stream(stream: GeoStream_): GeoStream_
  }
  object GeoStreamWrapper {
    
    inline def apply(stream: GeoStream_ => GeoStream_): GeoStreamWrapper = {
      val __obj = js.Dynamic.literal(stream = js.Any.fromFunction1(stream))
      __obj.asInstanceOf[GeoStreamWrapper]
    }
    
    extension [Self <: GeoStreamWrapper](x: Self) {
      
      inline def setStream(value: GeoStream_ => GeoStream_): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GeoStream_ extends StObject {
    
    /**
      * Indicates the end of a line or ring. Within a polygon, indicates the end of a ring.
      * Unlike GeoJSON, the redundant closing coordinate of a ring is not indicated via point, and instead is implied via lineEnd within a polygon.
      */
    def lineEnd(): Unit = js.native
    
    /**
      * Indicates the start of a line or ring. Within a polygon, indicates the start of a ring. The first ring of a polygon is the exterior ring, and is typically clockwise.
      * Any subsequent rings indicate holes in the polygon, and are typically counterclockwise.
      */
    def lineStart(): Unit = js.native
    
    /**
      * Indicates a point with the specified coordinates x and y (and optionally z). The coordinate system is unspecified and implementation-dependent;
      * for example, projection streams require spherical coordinates in degrees as input. Outside the context of a polygon or line,
      * a point indicates a point geometry object (Point or MultiPoint). Within a line or polygon ring, the point indicates a control point.
      *
      * @param x x-coordinate of point.
      * @param y y-coordinate of point.
      * @param z Optional z-coordinate of point.
      */
    def point(x: Double, y: Double): Unit = js.native
    def point(x: Double, y: Double, z: Double): Unit = js.native
    
    /**
      * Indicates the end of a polygon.
      */
    def polygonEnd(): Unit = js.native
    
    /**
      * Indicates the start of a polygon. The first line of a polygon indicates the exterior ring, and any subsequent lines indicate interior holes.
      */
    def polygonStart(): Unit = js.native
    
    /**
      * Indicates the sphere (the globe; the unit sphere centered at ⟨0,0,0⟩).
      */
    var sphere: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  trait GeoTransformPrototype extends StObject {
    
    /**
      * Indicates the end of a line or ring. Within a polygon, indicates the end of a ring.
      * Unlike GeoJSON, the redundant closing coordinate of a ring is not indicated via point, and instead is implied via lineEnd within a polygon.
      */
    var lineEnd: js.UndefOr[js.ThisFunction0[/* this */ this.type & Stream, Unit]] = js.undefined
    
    /**
      * Indicates the start of a line or ring. Within a polygon, indicates the start of a ring. The first ring of a polygon is the exterior ring, and is typically clockwise.
      * Any subsequent rings indicate holes in the polygon, and are typically counterclockwise.
      */
    var lineStart: js.UndefOr[js.ThisFunction0[/* this */ this.type & Stream, Unit]] = js.undefined
    
    /**
      * Indicates a point with the specified coordinates x and y (and optionally z). The coordinate system is unspecified and implementation-dependent;
      * for example, projection streams require spherical coordinates in degrees as input. Outside the context of a polygon or line,
      * a point indicates a point geometry object (Point or MultiPoint). Within a line or polygon ring, the point indicates a control point.
      *
      * @param x x-coordinate of point.
      * @param y y-coordinate of point.
      * @param z Optional z-coordinate of point.
      */
    var point: js.UndefOr[
        js.ThisFunction3[
          /* this */ this.type & Stream, 
          /* x */ Double, 
          /* y */ Double, 
          /* z */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Indicates the end of a polygon.
      */
    var polygonEnd: js.UndefOr[js.ThisFunction0[/* this */ this.type & Stream, Unit]] = js.undefined
    
    /**
      * Indicates the start of a polygon. The first line of a polygon indicates the exterior ring, and any subsequent lines indicate interior holes.
      */
    var polygonStart: js.UndefOr[js.ThisFunction0[/* this */ this.type & Stream, Unit]] = js.undefined
    
    /**
      * Indicates the sphere (the globe; the unit sphere centered at ⟨0,0,0⟩).
      */
    var sphere: js.UndefOr[js.ThisFunction0[/* this */ this.type & Stream, Unit]] = js.undefined
  }
  object GeoTransformPrototype {
    
    inline def apply(): GeoTransformPrototype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeoTransformPrototype]
    }
    
    extension [Self <: GeoTransformPrototype](x: Self) {
      
      inline def setLineEnd(value: js.ThisFunction0[/* this */ GeoTransformPrototype & Stream, Unit]): Self = StObject.set(x, "lineEnd", value.asInstanceOf[js.Any])
      
      inline def setLineEndUndefined: Self = StObject.set(x, "lineEnd", js.undefined)
      
      inline def setLineStart(value: js.ThisFunction0[/* this */ GeoTransformPrototype & Stream, Unit]): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
      
      inline def setLineStartUndefined: Self = StObject.set(x, "lineStart", js.undefined)
      
      inline def setPoint(
        value: js.ThisFunction3[
              /* this */ GeoTransformPrototype & Stream, 
              /* x */ Double, 
              /* y */ Double, 
              /* z */ js.UndefOr[Double], 
              Unit
            ]
      ): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setPolygonEnd(value: js.ThisFunction0[/* this */ GeoTransformPrototype & Stream, Unit]): Self = StObject.set(x, "polygonEnd", value.asInstanceOf[js.Any])
      
      inline def setPolygonEndUndefined: Self = StObject.set(x, "polygonEnd", js.undefined)
      
      inline def setPolygonStart(value: js.ThisFunction0[/* this */ GeoTransformPrototype & Stream, Unit]): Self = StObject.set(x, "polygonStart", value.asInstanceOf[js.Any])
      
      inline def setPolygonStartUndefined: Self = StObject.set(x, "polygonStart", js.undefined)
      
      inline def setSphere(value: js.ThisFunction0[/* this */ GeoTransformPrototype & Stream, Unit]): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
      
      inline def setSphereUndefined: Self = StObject.set(x, "sphere", js.undefined)
    }
  }
}
