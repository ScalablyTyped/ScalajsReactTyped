package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.formatFeatureMod.ReadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGmlbaseMod {
  
  /* note: abstract class */ @JSImport("ol/format/GMLBase", JSImport.Default)
  @js.native
  open class default () extends GMLBase {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/format/GMLBase", "GMLNS")
  @js.native
  val GMLNS: String = js.native
  
  @js.native
  trait GMLBase
    extends typingsJapgolly.ol.formatXmlfeatureMod.default {
    
    /* protected */ var featureNS: StringDictionary[String] | String = js.native
    
    /* protected */ var featureType: js.Array[String] | String = js.native
    
    def lineStringMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def pointMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def polygonMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def readFeatureElement(node: Element, objectStack: js.Array[Any]): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    def readFeatureElementInternal(node: Element, objectStack: js.Array[Any], asFeature: Boolean): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] | js.Object = js.native
    
    def readFeaturesInternal(node: Element, objectStack: js.Array[Any]): js.UndefOr[
        js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
      ] = js.native
    
    def readFlatCoordinatesFromNode(node: Element, objectStack: js.Array[Any]): js.Array[Double] = js.native
    
    def readFlatLinearRing(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readGeometryElement(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomGeometryMod.default | Extent] = js.native
    
    /* protected */ @JSName("readGeometryFromNode")
    def readGeometryFromNode_default(node: Element): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /* protected */ @JSName("readGeometryFromNode")
    def readGeometryFromNode_default(node: Element, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    
    def readLineString(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomLineStringMod.default] = js.native
    
    def readLinearRing(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomLinearRingMod.default] = js.native
    
    def readMultiLineString(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomMultiLineStringMod.default] = js.native
    
    def readMultiPoint(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomMultiPointMod.default] = js.native
    
    def readMultiPolygon(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomMultiPolygonMod.default] = js.native
    
    def readPoint(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomPointMod.default] = js.native
    
    def readPolygon(node: Element, objectStack: js.Array[Any]): js.UndefOr[typingsJapgolly.ol.geomPolygonMod.default] = js.native
    
    /* protected */ var schemaLocation: String = js.native
    
    /* protected */ var srsName: String = js.native
  }
  
  trait Options extends StObject {
    
    var curve: js.UndefOr[Boolean] = js.undefined
    
    var featureNS: js.UndefOr[StringDictionary[String] | String] = js.undefined
    
    var featureType: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var hasZ: js.UndefOr[Boolean] = js.undefined
    
    var multiCurve: js.UndefOr[Boolean] = js.undefined
    
    var multiSurface: js.UndefOr[Boolean] = js.undefined
    
    var schemaLocation: js.UndefOr[String] = js.undefined
    
    var srsName: String
    
    var surface: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(srsName: String): Options = {
      val __obj = js.Dynamic.literal(srsName = srsName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCurve(value: Boolean): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
      
      inline def setFeatureNS(value: StringDictionary[String] | String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      inline def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
      
      inline def setFeatureType(value: js.Array[String] | String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      inline def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
      
      inline def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value*))
      
      inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      inline def setMultiCurve(value: Boolean): Self = StObject.set(x, "multiCurve", value.asInstanceOf[js.Any])
      
      inline def setMultiCurveUndefined: Self = StObject.set(x, "multiCurve", js.undefined)
      
      inline def setMultiSurface(value: Boolean): Self = StObject.set(x, "multiSurface", value.asInstanceOf[js.Any])
      
      inline def setMultiSurfaceUndefined: Self = StObject.set(x, "multiSurface", js.undefined)
      
      inline def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
      
      inline def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
      
      inline def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
      
      inline def setSurface(value: Boolean): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
      
      inline def setSurfaceUndefined: Self = StObject.set(x, "surface", js.undefined)
    }
  }
}
