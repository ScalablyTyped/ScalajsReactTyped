package typingsJapgolly.shpjs.mod

import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShpJS extends js.Object {
  def apply(base: String): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def apply(base: String, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def apply(base: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def apply(base: ShpJSBuffer, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def combine(arr: js.Tuple2[js.Array[Geometry], js.Array[GeoJsonProperties]]): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  def getShapeFile(base: String): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def getShapeFile(base: String, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def getShapeFile(base: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def getShapeFile(base: ShpJSBuffer, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def parseDbf(dbf: ShpJSBuffer, cpg: ShpJSBuffer): js.Array[GeoJsonProperties] = js.native
  def parseShp(shp: ShpJSBuffer, prj: String): js.Array[Geometry] = js.native
  def parseShp(shp: ShpJSBuffer, prj: Buffer): js.Array[Geometry] = js.native
  def parseZip(buffer: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  def parseZip(buffer: ShpJSBuffer, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
}

