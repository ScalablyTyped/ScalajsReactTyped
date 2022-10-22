package typingsJapgolly.openlayers.global.ol

import typingsJapgolly.openlayers.mod.Tile.State
import typingsJapgolly.openlayers.mod.TileCoord
import typingsJapgolly.openlayers.mod.TileLoadFunctionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.ImageTile")
@js.native
open class ImageTile protected ()
  extends typingsJapgolly.openlayers.mod.ImageTile {
  /**
    * @param tileCoord Tile coordinate.
    * @param state State.
    * @param src Image source URI.
    * @param crossOrigin Cross origin.
    * @param tileLoadFunction Tile load function.
    */
  def this(tileCoord: TileCoord, state: State, src: String) = this()
  def this(tileCoord: TileCoord, state: State, src: String, crossOrigin: String) = this()
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    crossOrigin: String,
    tileLoadFunction: TileLoadFunctionType
  ) = this()
  def this(
    tileCoord: TileCoord,
    state: State,
    src: String,
    crossOrigin: Unit,
    tileLoadFunction: TileLoadFunctionType
  ) = this()
}
