package typingsJapgolly.ol

import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.formatGmlbaseMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGml3Mod {
  
  @JSImport("ol/format/GML3", JSImport.Default)
  @js.native
  open class default () extends GML3 {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GML3
    extends typingsJapgolly.ol.formatGmlbaseMod.default {
    
    def curveMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def exteriorParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def interiorParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def readCurve(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomLineStringMod.default] = js.native
    
    def readEnvelope(node: Element, objectStack: js.Array[Any]): js.UndefOr[Extent] = js.native
    
    def readFlatPos(node: Node, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readFlatPosList(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readLineStringSegment(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readMultiCurve(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomMultiLineStringMod.default] = js.native
    
    def readMultiSurface(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomMultiPolygonMod.default] = js.native
    
    def readPatch(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readPolygonPatch(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readSegment(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readSurface(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomPolygonMod.default] = js.native
    
    def surfaceMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def writeCurveOrLineString(node: Element, geometry: typingsJapgolly.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[Any]): Unit = js.native
    
    def writeFeatureElement(
      node: Element,
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      objectStack: js.Array[Any]
    ): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[Any]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typingsJapgolly.ol.geomGeometryMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeLineStringOrCurveMember(node: Node, line: typingsJapgolly.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeLinearRing(node: Element, geometry: typingsJapgolly.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeMultiCurveOrLineString(
      node: Element,
      geometry: typingsJapgolly.ol.geomMultiLineStringMod.default,
      objectStack: js.Array[Any]
    ): Unit = js.native
    
    def writeMultiPoint(node: Element, geometry: typingsJapgolly.ol.geomMultiPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeMultiSurfaceOrPolygon(
      node: Element,
      geometry: typingsJapgolly.ol.geomMultiPolygonMod.default,
      objectStack: js.Array[Any]
    ): Unit = js.native
    
    def writePoint(node: Element, geometry: typingsJapgolly.ol.geomPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writePointMember(node: Node, point: typingsJapgolly.ol.geomPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeRing(node: Node, ring: typingsJapgolly.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeSurfaceOrPolygon(node: Element, geometry: typingsJapgolly.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeSurfaceOrPolygonMember(node: Node, polygon: typingsJapgolly.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
  }
}
