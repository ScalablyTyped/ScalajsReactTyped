package typingsJapgolly.ol

import typingsJapgolly.ol.canvasMod.DeclutterGroup
import typingsJapgolly.ol.canvasMod.DeclutterGroups
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/VectorContext", JSImport.Namespace)
@js.native
object vectorContextMod extends js.Object {
  @js.native
  trait VectorContext extends js.Object {
    def drawCircle(
      circleGeometry: typingsJapgolly.ol.circleMod.default,
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]
    ): Unit = js.native
    def drawCustom(
      geometry: typingsJapgolly.ol.simpleGeometryMod.default,
      feature: FeatureLike,
      renderer: js.Function0[Unit]
    ): Unit = js.native
    def drawFeature(
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
      style: typingsJapgolly.ol.styleStyleMod.default
    ): Unit = js.native
    def drawGeometry(geometry: typingsJapgolly.ol.geometryMod.default): Unit = js.native
    def drawGeometryCollection(
      geometryCollectionGeometry: typingsJapgolly.ol.geometryCollectionMod.default,
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]
    ): Unit = js.native
    def drawLineString(lineStringGeometry: typingsJapgolly.ol.lineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawLineString(lineStringGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typingsJapgolly.ol.multiLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typingsJapgolly.ol.multiPointMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPolygon(multiPolygonGeometry: typingsJapgolly.ol.multiPolygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typingsJapgolly.ol.pointMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typingsJapgolly.ol.polygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typingsJapgolly.ol.geometryMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    def setFillStrokeStyle(fillStyle: typingsJapgolly.ol.fillMod.default, strokeStyle: typingsJapgolly.ol.strokeMod.default): Unit = js.native
    def setImageStyle(imageStyle: typingsJapgolly.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(imageStyle: typingsJapgolly.ol.styleImageMod.default, opt_declutterGroup: DeclutterGroup): Unit = js.native
    def setStyle(style: typingsJapgolly.ol.styleStyleMod.default): Unit = js.native
    def setTextStyle(textStyle: typingsJapgolly.ol.textMod.default): Unit = js.native
    def setTextStyle(textStyle: typingsJapgolly.ol.textMod.default, opt_declutterGroups: DeclutterGroups): Unit = js.native
  }
  
  @js.native
  class default () extends VectorContext
  
}

