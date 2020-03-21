package typingsJapgolly.ol.snapMod

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.pixelMod.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snap
  extends typingsJapgolly.ol.pointerMod.default {
  def addFeature(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]): Unit = js.native
  def addFeature(
    feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
    opt_listen: Boolean
  ): Unit = js.native
  def removeFeature(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]): Unit = js.native
  def removeFeature(
    feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
    opt_unlisten: Boolean
  ): Unit = js.native
  def snapTo(pixel: Pixel, pixelCoordinate: Coordinate, map: typingsJapgolly.ol.pluggableMapMod.default): Result = js.native
}

