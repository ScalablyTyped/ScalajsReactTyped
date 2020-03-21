package typingsJapgolly.atom.statusBarMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBar extends js.Object {
  /**
    *  Add a tile to the left side of the status bar. Lower priority tiles are placed
    *  further to the left.
    */
  def addLeftTile(options: AddTileOptions): Tile
  /**
    *  Add a tile to the right side of the status bar. Lower priority tiles are placed
    *  further to the right.
    */
  def addRightTile(options: AddTileOptions): Tile
  /** Retrieve all of the tiles on the left side of the status bar. */
  def getLeftTiles(): js.Array[Tile]
  /** Retrieve all of the tiles on the right side of the status bar. */
  def getRightTiles(): js.Array[Tile]
}

object StatusBar {
  @scala.inline
  def apply(
    addLeftTile: AddTileOptions => CallbackTo[Tile],
    addRightTile: AddTileOptions => CallbackTo[Tile],
    getLeftTiles: CallbackTo[js.Array[Tile]],
    getRightTiles: CallbackTo[js.Array[Tile]]
  ): StatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addLeftTile")(js.Any.fromFunction1((t0: typingsJapgolly.atom.statusBarMod.AddTileOptions) => addLeftTile(t0).runNow()))
    __obj.updateDynamic("addRightTile")(js.Any.fromFunction1((t0: typingsJapgolly.atom.statusBarMod.AddTileOptions) => addRightTile(t0).runNow()))
    __obj.updateDynamic("getLeftTiles")(getLeftTiles.toJsFn)
    __obj.updateDynamic("getRightTiles")(getRightTiles.toJsFn)
    __obj.asInstanceOf[StatusBar]
  }
}

