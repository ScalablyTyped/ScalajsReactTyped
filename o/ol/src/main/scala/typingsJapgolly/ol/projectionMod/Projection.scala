package typingsJapgolly.ol.projectionMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.unitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  def canWrapX(): Boolean
  def getAxisOrientation(): String
  def getCode(): String
  def getDefaultTileGrid(): typingsJapgolly.ol.tilegridTileGridMod.default
  def getExtent(): Extent
  def getMetersPerUnit(): Double
  def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]
  def getUnits(): Units
  def getWorldExtent(): Extent
  def isGlobal(): Boolean
  def setDefaultTileGrid(tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default): Unit
  def setExtent(extent: Extent): Unit
  def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit
  def setGlobal(global: Boolean): Unit
  def setWorldExtent(worldExtent: Extent): Unit
}

object Projection {
  @scala.inline
  def apply(
    canWrapX: CallbackTo[Boolean],
    getAxisOrientation: CallbackTo[String],
    getCode: CallbackTo[String],
    getDefaultTileGrid: CallbackTo[typingsJapgolly.ol.tilegridTileGridMod.default],
    getExtent: CallbackTo[Extent],
    getMetersPerUnit: CallbackTo[Double],
    getPointResolutionFunc: CallbackTo[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]],
    getUnits: CallbackTo[Units],
    getWorldExtent: CallbackTo[Extent],
    isGlobal: CallbackTo[Boolean],
    setDefaultTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default => Callback,
    setExtent: Extent => Callback,
    setGetPointResolution: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Callback,
    setGlobal: Boolean => Callback,
    setWorldExtent: Extent => Callback
  ): Projection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canWrapX")(canWrapX.toJsFn)
    __obj.updateDynamic("getAxisOrientation")(getAxisOrientation.toJsFn)
    __obj.updateDynamic("getCode")(getCode.toJsFn)
    __obj.updateDynamic("getDefaultTileGrid")(getDefaultTileGrid.toJsFn)
    __obj.updateDynamic("getExtent")(getExtent.toJsFn)
    __obj.updateDynamic("getMetersPerUnit")(getMetersPerUnit.toJsFn)
    __obj.updateDynamic("getPointResolutionFunc")(getPointResolutionFunc.toJsFn)
    __obj.updateDynamic("getUnits")(getUnits.toJsFn)
    __obj.updateDynamic("getWorldExtent")(getWorldExtent.toJsFn)
    __obj.updateDynamic("isGlobal")(isGlobal.toJsFn)
    __obj.updateDynamic("setDefaultTileGrid")(js.Any.fromFunction1((t0: typingsJapgolly.ol.tilegridTileGridMod.default) => setDefaultTileGrid(t0).runNow()))
    __obj.updateDynamic("setExtent")(js.Any.fromFunction1((t0: typingsJapgolly.ol.extentMod.Extent) => setExtent(t0).runNow()))
    __obj.updateDynamic("setGetPointResolution")(js.Any.fromFunction1((t0: js.Function2[
  /* p0 */ scala.Double, 
  /* p1 */ typingsJapgolly.ol.coordinateMod.Coordinate, 
  scala.Double]) => setGetPointResolution(t0).runNow()))
    __obj.updateDynamic("setGlobal")(js.Any.fromFunction1((t0: scala.Boolean) => setGlobal(t0).runNow()))
    __obj.updateDynamic("setWorldExtent")(js.Any.fromFunction1((t0: typingsJapgolly.ol.extentMod.Extent) => setWorldExtent(t0).runNow()))
    __obj.asInstanceOf[Projection]
  }
}

