package typingsJapgolly.ol

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.tileloadend
import typingsJapgolly.ol.olStrings.tileloaderror
import typingsJapgolly.ol.olStrings.tileloadstart
import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Tile
import typingsJapgolly.ol.olTileMod.UrlFunction
import typingsJapgolly.ol.projMod.ProjectionLike
import typingsJapgolly.ol.sourceSourceMod.AttributionLike
import typingsJapgolly.ol.sourceTileMod.TileSourceEvent
import typingsJapgolly.ol.stateMod.State
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/UrlTile", JSImport.Namespace)
@js.native
object urlTileMod extends js.Object {
  @js.native
  trait Options extends js.Object {
    var attributions: js.UndefOr[AttributionLike] = js.native
    var attributionsCollapsible: js.UndefOr[Boolean] = js.native
    var cacheSize: js.UndefOr[Double] = js.native
    var key: js.UndefOr[String] = js.native
    var opaque: js.UndefOr[Boolean] = js.native
    var projection: js.UndefOr[ProjectionLike] = js.native
    var state: js.UndefOr[State] = js.native
    var tileGrid: js.UndefOr[typingsJapgolly.ol.tilegridTileGridMod.default] = js.native
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    var tilePixelRatio: js.UndefOr[Double] = js.native
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.native
    var transition: js.UndefOr[Double] = js.native
    var url: js.UndefOr[String] = js.native
    var urls: js.UndefOr[js.Array[String]] = js.native
    var wrapX: js.UndefOr[Boolean] = js.native
    var zDirection: js.UndefOr[Double] = js.native
    def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
  }
  
  @js.native
  trait UrlTile
    extends typingsJapgolly.ol.sourceTileMod.default {
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    @JSName("tileUrlFunction")
    var tileUrlFunction_Original: UrlFunction = js.native
    var urls: js.Array[String] = js.native
    def getTileLoadFunction(): LoadFunction = js.native
    def getTileUrlFunction(): UrlFunction = js.native
    def getUrls(): js.Array[String] = js.native
    /* protected */ def handleTileChange(event: typingsJapgolly.ol.eventMod.default): Unit = js.native
    @JSName("on")
    def on_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): EventsKey = js.native
    def setTileLoadFunction(tileLoadFunction: LoadFunction): Unit = js.native
    def setTileUrlFunction(tileUrlFunction: UrlFunction): Unit = js.native
    def setTileUrlFunction(tileUrlFunction: UrlFunction, key: String): Unit = js.native
    def setUrl(url: String): Unit = js.native
    def setUrls(urls: js.Array[String]): Unit = js.native
    /* protected */ def tileLoadFunction(p0: Tile, p1: String): Unit = js.native
    /* protected */ def tileUrlFunction(p0: TileCoord, p1: Double, p2: typingsJapgolly.ol.projectionMod.default): String = js.native
    @JSName("un")
    def un_tileloadend(`type`: tileloadend, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloaderror(`type`: tileloaderror, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_tileloadstart(`type`: tileloadstart, listener: js.Function1[/* evt */ TileSourceEvent, Unit]): Unit = js.native
  }
  
  @js.native
  class default protected () extends UrlTile {
    def this(options: Options) = this()
  }
  
}

