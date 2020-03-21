package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanorama extends js.Object {
  def getAngularBBox(): js.Array[Double]
  def getConnectionArrows(): js.Array[IPanoramaConnectionArrow]
  def getConnectionMarkers(): js.Array[IPanoramaConnectionMarker]
  def getCoordSystem(): ICoordSystem
  def getDefaultDirection(): js.Array[Double]
  def getDefaultSpan(): js.Array[Double]
  def getGraph(): IPanoramaGraph | Null
  def getMarkers(): js.Array[IPanoramaMarker]
  def getName(): String
  def getPosition(): js.Array[Double]
  def getTileLevels(): js.Array[IPanoramaTileLevel]
  def getTileSize(): js.Array[Double]
}

object IPanorama {
  @scala.inline
  def apply(
    getAngularBBox: CallbackTo[js.Array[Double]],
    getConnectionArrows: CallbackTo[js.Array[IPanoramaConnectionArrow]],
    getConnectionMarkers: CallbackTo[js.Array[IPanoramaConnectionMarker]],
    getCoordSystem: CallbackTo[ICoordSystem],
    getDefaultDirection: CallbackTo[js.Array[Double]],
    getDefaultSpan: CallbackTo[js.Array[Double]],
    getGraph: CallbackTo[IPanoramaGraph | Null],
    getMarkers: CallbackTo[js.Array[IPanoramaMarker]],
    getName: CallbackTo[String],
    getPosition: CallbackTo[js.Array[Double]],
    getTileLevels: CallbackTo[js.Array[IPanoramaTileLevel]],
    getTileSize: CallbackTo[js.Array[Double]]
  ): IPanorama = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAngularBBox")(getAngularBBox.toJsFn)
    __obj.updateDynamic("getConnectionArrows")(getConnectionArrows.toJsFn)
    __obj.updateDynamic("getConnectionMarkers")(getConnectionMarkers.toJsFn)
    __obj.updateDynamic("getCoordSystem")(getCoordSystem.toJsFn)
    __obj.updateDynamic("getDefaultDirection")(getDefaultDirection.toJsFn)
    __obj.updateDynamic("getDefaultSpan")(getDefaultSpan.toJsFn)
    __obj.updateDynamic("getGraph")(getGraph.toJsFn)
    __obj.updateDynamic("getMarkers")(getMarkers.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.updateDynamic("getTileLevels")(getTileLevels.toJsFn)
    __obj.updateDynamic("getTileSize")(getTileSize.toJsFn)
    __obj.asInstanceOf[IPanorama]
  }
}

