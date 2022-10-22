package typingsJapgolly.bingmaps.global.Microsoft.Maps

import org.scalajs.dom.Blob
import typingsJapgolly.bingmaps.Microsoft.Maps.IGeoXmlDataSet
import typingsJapgolly.bingmaps.Microsoft.Maps.IGeoXmlReadOptions
import typingsJapgolly.bingmaps.Microsoft.Maps.IGeoXmlWriteOptions
import typingsJapgolly.bingmaps.Microsoft.Maps.IPrimitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeoXml {
  
  @JSGlobal("Microsoft.Maps.GeoXml")
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(xml: String, options: IGeoXmlReadOptions): IGeoXmlDataSet = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IGeoXmlDataSet]
  inline def read(xml: js.typedarray.ArrayBuffer, options: IGeoXmlReadOptions): IGeoXmlDataSet = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(xml.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IGeoXmlDataSet]
  
  inline def readFromUrl(
    urlString: String,
    options: IGeoXmlReadOptions,
    callback: js.Function1[/* data */ IGeoXmlDataSet, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFromUrl")(urlString.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def write(shapes: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def write(
    shapes: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    options: IGeoXmlWriteOptions
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def write(shapes: IGeoXmlDataSet): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def write(shapes: IGeoXmlDataSet, options: IGeoXmlWriteOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def write(shapes: IPrimitive): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def write(shapes: IPrimitive, options: IGeoXmlWriteOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def write(shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Layer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def write(shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Layer, options: IGeoXmlWriteOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def write(shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Map): String = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def write(shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Map, options: IGeoXmlWriteOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(shapes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def writeCompressed(shapes: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive]): String | js.typedarray.ArrayBuffer | Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: Unit,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: js.Array[typingsJapgolly.bingmaps.Microsoft.Maps.GroundOverlay | IPrimitive],
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(shapes: IGeoXmlDataSet): String | js.typedarray.ArrayBuffer | Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(shapes: IGeoXmlDataSet, compressFormat: Unit, options: IGeoXmlWriteOptions): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: IGeoXmlDataSet,
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: IGeoXmlDataSet,
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(shapes: IPrimitive): String | js.typedarray.ArrayBuffer | Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(shapes: IPrimitive, compressFormat: Unit, options: IGeoXmlWriteOptions): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(shapes: IPrimitive, compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: IPrimitive,
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Layer): String | js.typedarray.ArrayBuffer | Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Layer,
    compressFormat: Unit,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Layer,
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Layer,
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Map): String | js.typedarray.ArrayBuffer | Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Map,
    compressFormat: Unit,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Map,
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
  inline def writeCompressed(
    shapes: typingsJapgolly.bingmaps.Microsoft.Maps.Map,
    compressFormat: typingsJapgolly.bingmaps.Microsoft.Maps.GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | js.typedarray.ArrayBuffer | Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("writeCompressed")(shapes.asInstanceOf[js.Any], compressFormat.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.ArrayBuffer | Blob]
}
