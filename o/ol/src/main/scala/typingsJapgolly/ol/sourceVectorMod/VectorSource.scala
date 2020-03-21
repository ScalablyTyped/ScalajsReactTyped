package typingsJapgolly.ol.sourceVectorMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.featureloaderMod.FeatureLoader
import typingsJapgolly.ol.featureloaderMod.FeatureUrlFunction
import typingsJapgolly.ol.olStrings.addfeature
import typingsJapgolly.ol.olStrings.changefeature
import typingsJapgolly.ol.olStrings.clear
import typingsJapgolly.ol.olStrings.removefeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorSource[GeomType /* <: typingsJapgolly.ol.geometryMod.default */]
  extends typingsJapgolly.ol.sourceSourceMod.default {
  def addFeature(feature: typingsJapgolly.ol.olFeatureMod.default[GeomType]): Unit = js.native
  /* protected */ def addFeatureInternal(feature: typingsJapgolly.ol.olFeatureMod.default[GeomType]): Unit = js.native
  def addFeatures(features: js.Array[typingsJapgolly.ol.olFeatureMod.default[GeomType]]): Unit = js.native
  /* protected */ def addFeaturesInternal(features: js.Array[typingsJapgolly.ol.olFeatureMod.default[GeomType]]): Unit = js.native
  def clear(): Unit = js.native
  def clear(opt_fast: Boolean): Unit = js.native
  def forEachFeature[T](callback: js.Function1[/* p0 */ typingsJapgolly.ol.olFeatureMod.default[GeomType], T]): T = js.native
  def forEachFeatureAtCoordinateDirect[T](
    coordinate: Coordinate,
    callback: js.Function1[/* p0 */ typingsJapgolly.ol.olFeatureMod.default[GeomType], T]
  ): T = js.native
  def forEachFeatureInExtent[T](
    extent: Extent,
    callback: js.Function1[/* p0 */ typingsJapgolly.ol.olFeatureMod.default[GeomType], T]
  ): T = js.native
  def forEachFeatureIntersectingExtent[T](
    extent: Extent,
    callback: js.Function1[/* p0 */ typingsJapgolly.ol.olFeatureMod.default[GeomType], T]
  ): T = js.native
  def getClosestFeatureToCoordinate(coordinate: Coordinate): typingsJapgolly.ol.olFeatureMod.default[GeomType] = js.native
  def getClosestFeatureToCoordinate(coordinate: Coordinate, opt_filter: js.Function0[Unit]): typingsJapgolly.ol.olFeatureMod.default[GeomType] = js.native
  def getExtent(): Extent = js.native
  def getExtent(opt_extent: Extent): Extent = js.native
  def getFeatureById(id: String): typingsJapgolly.ol.olFeatureMod.default[GeomType] = js.native
  def getFeatureById(id: Double): typingsJapgolly.ol.olFeatureMod.default[GeomType] = js.native
  def getFeatureByUid(uid: String): typingsJapgolly.ol.olFeatureMod.default[GeomType] = js.native
  def getFeatures(): js.Array[typingsJapgolly.ol.olFeatureMod.default[GeomType]] = js.native
  def getFeaturesAtCoordinate(coordinate: Coordinate): js.Array[typingsJapgolly.ol.olFeatureMod.default[GeomType]] = js.native
  def getFeaturesCollection(): typingsJapgolly.ol.collectionMod.default[typingsJapgolly.ol.olFeatureMod.default[GeomType]] = js.native
  def getFeaturesInExtent(extent: Extent): js.Array[typingsJapgolly.ol.olFeatureMod.default[GeomType]] = js.native
  def getFormat(): typingsJapgolly.ol.featureMod.default = js.native
  def getOverlaps(): Boolean = js.native
  def getUrl(): String | FeatureUrlFunction = js.native
  def hasFeature(feature: typingsJapgolly.ol.olFeatureMod.default[GeomType]): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def loadFeatures(extent: Extent, resolution: Double, projection: typingsJapgolly.ol.projectionMod.default): Unit = js.native
  @JSName("on")
  def on_addfeature(
    `type`: addfeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_changefeature(
    `type`: changefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_clear(
    `type`: clear,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  @JSName("on")
  def on_removefeature(
    `type`: removefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_addfeature(
    `type`: addfeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_changefeature(
    `type`: changefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_clear(
    `type`: clear,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  @JSName("once")
  def once_removefeature(
    `type`: removefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): EventsKey = js.native
  def removeFeature(feature: typingsJapgolly.ol.olFeatureMod.default[GeomType]): Unit = js.native
  /* protected */ def removeFeatureInternal(feature: typingsJapgolly.ol.olFeatureMod.default[GeomType]): Unit = js.native
  def removeLoadedExtent(extent: Extent): Unit = js.native
  def setLoader(loader: FeatureLoader): Unit = js.native
  def setUrl(url: String): Unit = js.native
  def setUrl(url: FeatureUrlFunction): Unit = js.native
  @JSName("un")
  def un_addfeature(
    `type`: addfeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): Unit = js.native
  @JSName("un")
  def un_changefeature(
    `type`: changefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): Unit = js.native
  @JSName("un")
  def un_clear(
    `type`: clear,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): Unit = js.native
  @JSName("un")
  def un_removefeature(
    `type`: removefeature,
    listener: js.Function1[/* evt */ VectorSourceEvent[typingsJapgolly.ol.geometryMod.default], Unit]
  ): Unit = js.native
}

