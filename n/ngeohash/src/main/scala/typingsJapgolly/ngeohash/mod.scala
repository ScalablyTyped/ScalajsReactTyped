package typingsJapgolly.ngeohash

import typingsJapgolly.ngeohash.ngeohash.GeographicBoundingBox
import typingsJapgolly.ngeohash.ngeohash.GeographicPoint
import typingsJapgolly.ngeohash.ngeohash.NSEW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ngeohash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("bboxes")(minlat.asInstanceOf[js.Any], minlon.asInstanceOf[js.Any], maxlat.asInstanceOf[js.Any], maxlon.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def bboxes(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, precision: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("bboxes")(minlat.asInstanceOf[js.Any], minlon.asInstanceOf[js.Any], maxlat.asInstanceOf[js.Any], maxlon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def bboxesInt(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bboxes_int")(minlat.asInstanceOf[js.Any], minlon.asInstanceOf[js.Any], maxlat.asInstanceOf[js.Any], maxlon.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def bboxesInt(minlat: Double, minlon: Double, maxlat: Double, maxlon: Double, bitDepth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bboxes_int")(minlat.asInstanceOf[js.Any], minlon.asInstanceOf[js.Any], maxlat.asInstanceOf[js.Any], maxlon.asInstanceOf[js.Any], bitDepth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def decode(hashstring: String): GeographicPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(hashstring.asInstanceOf[js.Any]).asInstanceOf[GeographicPoint]
  
  inline def decodeBbox(hashstring: String): GeographicBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_bbox")(hashstring.asInstanceOf[js.Any]).asInstanceOf[GeographicBoundingBox]
  
  inline def decodeBboxInt(hashinteger: Double): GeographicBoundingBox = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_bbox_int")(hashinteger.asInstanceOf[js.Any]).asInstanceOf[GeographicBoundingBox]
  inline def decodeBboxInt(hashinteger: Double, bitDepth: Double): GeographicBoundingBox = (^.asInstanceOf[js.Dynamic].applyDynamic("decode_bbox_int")(hashinteger.asInstanceOf[js.Any], bitDepth.asInstanceOf[js.Any])).asInstanceOf[GeographicBoundingBox]
  
  inline def decodeInt(hashinteger: Double): GeographicPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_int")(hashinteger.asInstanceOf[js.Any]).asInstanceOf[GeographicPoint]
  inline def decodeInt(hashinteger: Double, bitDepth: Double): GeographicPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("decode_int")(hashinteger.asInstanceOf[js.Any], bitDepth.asInstanceOf[js.Any])).asInstanceOf[GeographicPoint]
  
  inline def encode(latitude: String, longitude: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(latitude: String, longitude: String, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(latitude: String, longitude: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(latitude: String, longitude: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(latitude: Double, longitude: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(latitude: Double, longitude: String, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(latitude: Double, longitude: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(latitude: Double, longitude: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def encodeInt(latitude: Double, longitude: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encode_int")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def encodeInt(latitude: Double, longitude: Double, bitDepth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("encode_int")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], bitDepth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def neighbor(hashstring: String, direction: NSEW): String = (^.asInstanceOf[js.Dynamic].applyDynamic("neighbor")(hashstring.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def neighborInt(hashinteger: Double, direction: NSEW): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("neighbor_int")(hashinteger.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def neighborInt(hashinteger: Double, direction: NSEW, bitDepth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("neighbor_int")(hashinteger.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], bitDepth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def neighbors(hashstring: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("neighbors")(hashstring.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def neighborsInt(hashinteger: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("neighbors_int")(hashinteger.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def neighborsInt(hashinteger: Double, bitDepth: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("neighbors_int")(hashinteger.asInstanceOf[js.Any], bitDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
