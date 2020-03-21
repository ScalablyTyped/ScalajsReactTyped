package typingsJapgolly.ol.tileRangeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileRange extends js.Object {
  def contains(tileCoord: TileCoord): Boolean
  def containsTileRange(tileRange: TileRange): Boolean
  def containsXY(x: Double, y: Double): Boolean
  def equals(tileRange: TileRange): Boolean
  def extend(tileRange: TileRange): Unit
  def getHeight(): Double
  def getSize(): Size
  def getWidth(): Double
  def intersects(tileRange: TileRange): Boolean
}

object TileRange {
  @scala.inline
  def apply(
    contains: TileCoord => CallbackTo[Boolean],
    containsTileRange: TileRange => CallbackTo[Boolean],
    containsXY: (Double, Double) => CallbackTo[Boolean],
    equals: TileRange => CallbackTo[Boolean],
    extend: TileRange => Callback,
    getHeight: CallbackTo[Double],
    getSize: CallbackTo[Size],
    getWidth: CallbackTo[Double],
    intersects: TileRange => CallbackTo[Boolean]
  ): TileRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: typingsJapgolly.ol.tilecoordMod.TileCoord) => contains(t0).runNow()))
    __obj.updateDynamic("containsTileRange")(js.Any.fromFunction1((t0: typingsJapgolly.ol.tileRangeMod.TileRange) => containsTileRange(t0).runNow()))
    __obj.updateDynamic("containsXY")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => containsXY(t0, t1).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.ol.tileRangeMod.TileRange) => equals(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction1((t0: typingsJapgolly.ol.tileRangeMod.TileRange) => extend(t0).runNow()))
    __obj.updateDynamic("getHeight")(getHeight.toJsFn)
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("getWidth")(getWidth.toJsFn)
    __obj.updateDynamic("intersects")(js.Any.fromFunction1((t0: typingsJapgolly.ol.tileRangeMod.TileRange) => intersects(t0).runNow()))
    __obj.asInstanceOf[TileRange]
  }
}

