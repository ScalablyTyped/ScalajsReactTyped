package typingsJapgolly.ol

import typingsJapgolly.ol.featureloaderMod.FeatureLoader
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Options
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/VectorTile", JSImport.Namespace)
@js.native
object olVectorTileMod extends js.Object {
  @js.native
  trait VectorTile
    extends typingsJapgolly.ol.olTileMod.default {
    def getFeatures(): js.Array[FeatureLike] = js.native
    def getFormat(): typingsJapgolly.ol.featureMod.default = js.native
    def onError(): Unit = js.native
    def onLoad(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
      dataProjection: typingsJapgolly.ol.projectionMod.default
    ): Unit = js.native
    def setFeatures(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
    ): Unit = js.native
    def setLoader(loader: FeatureLoader): Unit = js.native
  }
  
  @js.native
  class default protected () extends VectorTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsJapgolly.ol.featureMod.default,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      format: typingsJapgolly.ol.featureMod.default,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
}

