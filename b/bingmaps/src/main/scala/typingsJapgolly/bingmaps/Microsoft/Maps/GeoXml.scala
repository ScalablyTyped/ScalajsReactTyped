package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalajs.dom.raw.Blob
import typingsJapgolly.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.GeoXml")
@js.native
object GeoXml extends js.Object {
  def read(xml: String, options: IGeoXmlReadOptions): IGeoXmlDataSet = js.native
  def read(xml: ArrayBuffer, options: IGeoXmlReadOptions): IGeoXmlDataSet = js.native
  def readFromUrl(
    urlString: String,
    options: IGeoXmlReadOptions,
    callback: js.Function1[/* data */ IGeoXmlDataSet, Unit]
  ): Unit = js.native
  def write(shapes: js.Array[GroundOverlay | IPrimitive]): String = js.native
  def write(shapes: js.Array[GroundOverlay | IPrimitive], options: IGeoXmlWriteOptions): String = js.native
  def write(shapes: IGeoXmlDataSet): String = js.native
  def write(shapes: IGeoXmlDataSet, options: IGeoXmlWriteOptions): String = js.native
  def write(shapes: IPrimitive): String = js.native
  def write(shapes: IPrimitive, options: IGeoXmlWriteOptions): String = js.native
  def write(shapes: Layer): String = js.native
  def write(shapes: Layer, options: IGeoXmlWriteOptions): String = js.native
  def write(shapes: Map): String = js.native
  def write(shapes: Map, options: IGeoXmlWriteOptions): String = js.native
  def writeCompressed(shapes: js.Array[GroundOverlay | IPrimitive]): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: js.Array[GroundOverlay | IPrimitive], compressFormat: GeoXmlCompressedFormat): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(
    shapes: js.Array[GroundOverlay | IPrimitive],
    compressFormat: GeoXmlCompressedFormat,
    options: IGeoXmlWriteOptions
  ): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: IGeoXmlDataSet): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: IGeoXmlDataSet, compressFormat: GeoXmlCompressedFormat): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: IGeoXmlDataSet, compressFormat: GeoXmlCompressedFormat, options: IGeoXmlWriteOptions): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: IPrimitive): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: IPrimitive, compressFormat: GeoXmlCompressedFormat): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: IPrimitive, compressFormat: GeoXmlCompressedFormat, options: IGeoXmlWriteOptions): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: Layer): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: Layer, compressFormat: GeoXmlCompressedFormat): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: Layer, compressFormat: GeoXmlCompressedFormat, options: IGeoXmlWriteOptions): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: Map): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: Map, compressFormat: GeoXmlCompressedFormat): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
  def writeCompressed(shapes: Map, compressFormat: GeoXmlCompressedFormat, options: IGeoXmlWriteOptions): String | scala.scalajs.js.typedarray.ArrayBuffer | Blob = js.native
}

