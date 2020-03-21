package typingsJapgolly.ol

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import typingsJapgolly.ol.olTileMod.LoadFunction
import typingsJapgolly.ol.olTileMod.Options
import typingsJapgolly.ol.tileStateMod.TileState
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageTile", JSImport.Namespace)
@js.native
object imageTileMod extends js.Object {
  @js.native
  trait ImageTile
    extends typingsJapgolly.ol.olTileMod.default {
    def getImage(): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
  }
  
  @js.native
  class default protected () extends ImageTile {
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction
    ) = this()
    def this(
      tileCoord: TileCoord,
      state: TileState,
      src: String,
      crossOrigin: String,
      tileLoadFunction: LoadFunction,
      opt_options: Options
    ) = this()
  }
  
}

