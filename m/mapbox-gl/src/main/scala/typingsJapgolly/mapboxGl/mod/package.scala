package typingsJapgolly.mapboxGl.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.ImageData
import typingsJapgolly.mapboxGl.anon.FailIfMajorPerformanceCaveat
import typingsJapgolly.mapboxGl.mod.^
import typingsJapgolly.std.ImageBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def accessToken: String = ^.asInstanceOf[js.Dynamic].selectDynamic("accessToken").asInstanceOf[String]
inline def accessToken_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(x.asInstanceOf[js.Any])

inline def baseApiUrl: String = ^.asInstanceOf[js.Dynamic].selectDynamic("baseApiUrl").asInstanceOf[String]
inline def baseApiUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseApiUrl")(x.asInstanceOf[js.Any])

inline def clearPrewarmedResources(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPrewarmedResources")().asInstanceOf[Unit]

inline def clearStorage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")().asInstanceOf[Unit]
inline def clearStorage(callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStorage")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getRTLTextPluginStatus(): PluginStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTLTextPluginStatus")().asInstanceOf[PluginStatus]

/**
  * Maximum number of images (raster tiles, sprites, icons) to load in parallel, which affects performance in raster-heavy maps.
  * 16 by default.
  */
inline def maxParallelImageRequests: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("maxParallelImageRequests").asInstanceOf[Double]
inline def maxParallelImageRequests_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxParallelImageRequests")(x.asInstanceOf[js.Any])

inline def prewarm(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prewarm")().asInstanceOf[Unit]

inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def setRTLTextPlugin(pluginURL: String, callback: js.Function1[/* error */ js.Error, Unit], deferred: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRTLTextPlugin")(pluginURL.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], deferred.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def supported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")().asInstanceOf[Boolean]
inline def supported(options: FailIfMajorPerformanceCaveat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supported")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

/**
  * Number of web workers instantiated on a page with GL JS maps.
  * By default, it is set to half the number of CPU cores (capped at 6).
  */
inline def workerCount: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("workerCount").asInstanceOf[Double]
inline def workerCount_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("workerCount")(x.asInstanceOf[js.Any])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mod.BackgroundLayout
  - typingsJapgolly.mapboxGl.mod.FillLayout
  - typingsJapgolly.mapboxGl.mod.FillExtrusionLayout
  - typingsJapgolly.mapboxGl.mod.LineLayout
  - typingsJapgolly.mapboxGl.mod.SymbolLayout
  - typingsJapgolly.mapboxGl.mod.RasterLayout
  - typingsJapgolly.mapboxGl.mod.CircleLayout
  - typingsJapgolly.mapboxGl.mod.HeatmapLayout
  - typingsJapgolly.mapboxGl.mod.HillshadeLayout
  - typingsJapgolly.mapboxGl.mod.SkyLayout
*/
type AnyLayout = _AnyLayout | BackgroundLayout | FillExtrusionLayout | RasterLayout | HeatmapLayout | HillshadeLayout | SkyLayout

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mod.GeoJSONSourceRaw
  - typingsJapgolly.mapboxGl.mod.VideoSourceRaw
  - typingsJapgolly.mapboxGl.mod.ImageSourceRaw
  - typingsJapgolly.mapboxGl.mod.CanvasSourceRaw
  - typingsJapgolly.mapboxGl.mod.VectorSource
  - typingsJapgolly.mapboxGl.mod.RasterSource
  - typingsJapgolly.mapboxGl.mod.RasterDemSource
  - typingsJapgolly.mapboxGl.mod.CustomSourceInterface[
org.scalajs.dom.HTMLImageElement | org.scalajs.dom.ImageData | typingsJapgolly.std.ImageBitmap]
*/
type AnySourceData = _AnySourceData | (CustomSourceInterface[HTMLImageElement | ImageData | ImageBitmap])

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mod.GeoJSONSource
  - typingsJapgolly.mapboxGl.mod.VideoSource
  - typingsJapgolly.mapboxGl.mod.ImageSource
  - typingsJapgolly.mapboxGl.mod.CanvasSource
  - typingsJapgolly.mapboxGl.mod.VectorSourceImpl
  - typingsJapgolly.mapboxGl.mod.RasterSource
  - typingsJapgolly.mapboxGl.mod.RasterDemSource
  - typingsJapgolly.mapboxGl.mod.CustomSource[
org.scalajs.dom.HTMLImageElement | org.scalajs.dom.ImageData | typingsJapgolly.std.ImageBitmap]
*/
type AnySourceImpl = _AnySourceImpl | (CustomSource[HTMLImageElement | ImageData | ImageBitmap])

type BackgroundLayout = Layout

type EventData = StringDictionary[Any]

type EventedListener = js.Function1[/* object */ js.UndefOr[js.Object], Any]

type Expression = Array[ExpressionName | Any]

type ExpressionSpecification = js.Array[Any]

type FillExtrusionLayout = Layout

type HeatmapLayout = Layout

type HillshadeLayout = Layout

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxGl.mod.LngLatBounds
  - js.Tuple2[typingsJapgolly.mapboxGl.mod.LngLatLike, typingsJapgolly.mapboxGl.mod.LngLatLike]
  - js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  - typingsJapgolly.mapboxGl.mod.LngLatLike
*/
type LngLatBoundsLike = _LngLatBoundsLike | (js.Tuple2[Double | LngLatLike, Double | LngLatLike]) | (js.Tuple4[Double, Double, Double, Double])

/* Rewritten from type alias, can be one of: 
  - js.Tuple2[scala.Double, scala.Double]
  - typingsJapgolly.mapboxGl.mod.LngLat
  - typingsJapgolly.mapboxGl.anon.Lat
  - typingsJapgolly.mapboxGl.anon.Lon
*/
type LngLatLike = _LngLatLike | (js.Tuple2[Double, Double])

type Offset = Double | PointLike | StringDictionary[PointLike]

type PointLike = Point | (js.Tuple2[Double, Double])

type PromoteIdSpecification = StringDictionary[String] | String

type PropertyValueSpecification[T] = T | CameraFunctionSpecification[T] | ExpressionSpecification

type RasterLayout = Layout

type SkyLayout = Layout

type Sources = StringDictionary[AnySourceData]

type TransformRequestFunction = js.Function2[/* url */ String, /* resourceType */ ResourceType, RequestParameters]

type quat = js.Array[Double]

type vec3 = js.Array[Double]
