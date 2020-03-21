package typingsJapgolly.ol.baseVectorMod

import typingsJapgolly.ol.renderMod.OrderFunction
import typingsJapgolly.ol.styleStyleMod.StyleFunction
import typingsJapgolly.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseVectorLayer[VectorSourceType /* <: typingsJapgolly.ol.sourceVectorMod.default[typingsJapgolly.ol.geometryMod.default] | typingsJapgolly.ol.sourceVectorTileMod.default */]
  extends typingsJapgolly.ol.layerLayerMod.default[VectorSourceType] {
  def getDeclutter(): Boolean = js.native
  def getRenderBuffer(): Double = js.native
  def getRenderOrder(): js.Function2[
    /* p0 */ typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default], 
    /* p1 */ typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default], 
    Double
  ] = js.native
  def getStyle(): StyleLike = js.native
  def getStyleFunction(): StyleFunction = js.native
  def getUpdateWhileAnimating(): Boolean = js.native
  def getUpdateWhileInteracting(): Boolean = js.native
  def setRenderOrder(): Unit = js.native
  def setRenderOrder(renderOrder: OrderFunction): Unit = js.native
  def setStyle(): Unit = js.native
  def setStyle(style: StyleLike): Unit = js.native
}

