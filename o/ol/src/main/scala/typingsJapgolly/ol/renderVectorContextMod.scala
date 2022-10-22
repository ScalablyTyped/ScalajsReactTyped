package typingsJapgolly.ol

import typingsJapgolly.ol.featureMod.FeatureLike
import typingsJapgolly.ol.renderCanvasMod.DeclutterImageWithText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderVectorContextMod {
  
  @JSImport("ol/render/VectorContext", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with VectorContext
  
  @js.native
  trait VectorContext extends StObject {
    
    def drawCircle(
      circleGeometry: typingsJapgolly.ol.geomCircleMod.default,
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
    ): Unit = js.native
    
    /**
      * Render a geometry with a custom renderer.
      */
    def drawCustom(
      geometry: typingsJapgolly.ol.geomSimpleGeometryMod.default,
      feature: FeatureLike,
      renderer: js.Function0[Unit]
    ): Unit = js.native
    
    def drawFeature(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      style: typingsJapgolly.ol.styleStyleMod.default
    ): Unit = js.native
    
    /**
      * Render a geometry.
      */
    def drawGeometry(geometry: typingsJapgolly.ol.geomGeometryMod.default): Unit = js.native
    
    def drawGeometryCollection(
      geometryCollectionGeometry: typingsJapgolly.ol.geomGeometryCollectionMod.default,
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
    ): Unit = js.native
    
    def drawLineString(lineStringGeometry: typingsJapgolly.ol.geomLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawLineString(lineStringGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiLineString(multiLineStringGeometry: typingsJapgolly.ol.geomMultiLineStringMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiLineString(multiLineStringGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiPoint(multiPointGeometry: typingsJapgolly.ol.geomMultiPointMod.default, feature: FeatureLike): Unit = js.native
    def drawMultiPoint(multiPointGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawMultiPolygon(multiPolygonGeometry: typingsJapgolly.ol.geomMultiPolygonMod.default, feature: FeatureLike): Unit = js.native
    
    def drawPoint(pointGeometry: typingsJapgolly.ol.geomPointMod.default, feature: FeatureLike): Unit = js.native
    def drawPoint(pointGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawPolygon(polygonGeometry: typingsJapgolly.ol.geomPolygonMod.default, feature: FeatureLike): Unit = js.native
    def drawPolygon(polygonGeometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def drawText(geometry: typingsJapgolly.ol.geomSimpleGeometryMod.default, feature: FeatureLike): Unit = js.native
    def drawText(geometry: typingsJapgolly.ol.renderFeatureMod.default, feature: FeatureLike): Unit = js.native
    
    def setFillStrokeStyle(
      fillStyle: typingsJapgolly.ol.styleFillMod.default,
      strokeStyle: typingsJapgolly.ol.styleStrokeMod.default
    ): Unit = js.native
    
    def setImageStyle(imageStyle: typingsJapgolly.ol.styleImageMod.default): Unit = js.native
    def setImageStyle(
      imageStyle: typingsJapgolly.ol.styleImageMod.default,
      opt_declutterImageWithText: DeclutterImageWithText
    ): Unit = js.native
    
    /**
      * Set the rendering style.
      */
    def setStyle(style: typingsJapgolly.ol.styleStyleMod.default): Unit = js.native
    
    def setTextStyle(textStyle: typingsJapgolly.ol.styleTextMod.default): Unit = js.native
    def setTextStyle(
      textStyle: typingsJapgolly.ol.styleTextMod.default,
      opt_declutterImageWithText: DeclutterImageWithText
    ): Unit = js.native
  }
}
