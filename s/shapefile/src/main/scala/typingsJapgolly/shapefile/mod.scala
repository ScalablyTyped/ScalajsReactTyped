package typingsJapgolly.shapefile

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.ReadableStream
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.geojson.mod.GeometryObject
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.shapefile.anon.Done
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shapefile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def open(shp: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  inline def open(shp: Openable, dbf: Unit, options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  inline def open(shp: Openable, dbf: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  inline def open(shp: Openable, dbf: Openable, options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  
  inline def openDbf(source: Openable): js.Promise[Source[GeoJsonProperties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDbf")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Source[GeoJsonProperties]]]
  inline def openDbf(source: Openable, options: Options): js.Promise[Source[GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDbf")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[GeoJsonProperties]]]
  
  inline def openShp(source: Openable): js.Promise[Source[GeometryObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openShp")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Source[GeometryObject]]]
  inline def openShp(source: Openable, options: Options): js.Promise[Source[GeometryObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openShp")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[GeometryObject]]]
  
  inline def read(shp: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  inline def read(shp: Openable, dbf: Unit, options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  inline def read(shp: Openable, dbf: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  inline def read(shp: Openable, dbf: Openable, options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  
  type Openable = String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | Readable | ReadableStream[Any]
  
  trait Options extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  trait Source[RecordType] extends StObject {
    
    var bbox: js.Array[Double]
    
    def cancel(): js.Promise[Unit]
    
    def read(): js.Promise[Done[RecordType]]
  }
  object Source {
    
    inline def apply[RecordType](
      bbox: js.Array[Double],
      cancel: CallbackTo[js.Promise[Unit]],
      read: CallbackTo[js.Promise[Done[RecordType]]]
    ): Source[RecordType] = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], cancel = cancel.toJsFn, read = read.toJsFn)
      __obj.asInstanceOf[Source[RecordType]]
    }
    
    extension [Self <: Source[?], RecordType](x: Self & Source[RecordType]) {
      
      inline def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value*))
      
      inline def setCancel(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setRead(value: CallbackTo[js.Promise[Done[RecordType]]]): Self = StObject.set(x, "read", value.toJsFn)
    }
  }
}
