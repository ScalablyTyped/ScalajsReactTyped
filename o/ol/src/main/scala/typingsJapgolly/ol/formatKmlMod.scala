package typingsJapgolly.ol

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.ol.styleIconAnchorUnitsMod.IconAnchorUnits
import typingsJapgolly.ol.styleIconOriginMod.IconOrigin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatKmlMod {
  
  @JSImport("ol/format/KML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/format/KML", JSImport.Default)
  @js.native
  open class default () extends KML {
    def this(opt_options: Options) = this()
  }
  
  inline def getDefaultFillStyle(): typingsJapgolly.ol.styleFillMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFillStyle")().asInstanceOf[typingsJapgolly.ol.styleFillMod.default]
  
  inline def getDefaultImageStyle(): typingsJapgolly.ol.styleImageMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultImageStyle")().asInstanceOf[typingsJapgolly.ol.styleImageMod.default]
  
  inline def getDefaultStrokeStyle(): typingsJapgolly.ol.styleStrokeMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStrokeStyle")().asInstanceOf[typingsJapgolly.ol.styleStrokeMod.default]
  
  inline def getDefaultStyle(): typingsJapgolly.ol.styleStyleMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyle")().asInstanceOf[typingsJapgolly.ol.styleStyleMod.default]
  
  inline def getDefaultStyleArray(): js.Array[typingsJapgolly.ol.styleStyleMod.default] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultStyleArray")().asInstanceOf[js.Array[typingsJapgolly.ol.styleStyleMod.default]]
  
  inline def getDefaultTextStyle(): typingsJapgolly.ol.styleTextMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTextStyle")().asInstanceOf[typingsJapgolly.ol.styleTextMod.default]
  
  inline def readFlatCoordinates(node: Node): js.UndefOr[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFlatCoordinates")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Double]]]
  
  trait GxTrackObject extends StObject {
    
    var flatCoordinates: js.Array[Double]
    
    var whens: js.Array[Double]
  }
  object GxTrackObject {
    
    inline def apply(flatCoordinates: js.Array[Double], whens: js.Array[Double]): GxTrackObject = {
      val __obj = js.Dynamic.literal(flatCoordinates = flatCoordinates.asInstanceOf[js.Any], whens = whens.asInstanceOf[js.Any])
      __obj.asInstanceOf[GxTrackObject]
    }
    
    extension [Self <: GxTrackObject](x: Self) {
      
      inline def setFlatCoordinates(value: js.Array[Double]): Self = StObject.set(x, "flatCoordinates", value.asInstanceOf[js.Any])
      
      inline def setFlatCoordinatesVarargs(value: Double*): Self = StObject.set(x, "flatCoordinates", js.Array(value*))
      
      inline def setWhens(value: js.Array[Double]): Self = StObject.set(x, "whens", value.asInstanceOf[js.Any])
      
      inline def setWhensVarargs(value: Double*): Self = StObject.set(x, "whens", js.Array(value*))
    }
  }
  
  type IconUrlFunction = js.Function1[/* p0 */ String, String]
  
  @js.native
  trait KML
    extends typingsJapgolly.ol.formatXmlfeatureMod.default {
    
    def readName(source: String): js.UndefOr[String] = js.native
    /**
      * Read the name of the KML.
      */
    def readName(source: Document): js.UndefOr[String] = js.native
    def readName(source: Element): js.UndefOr[String] = js.native
    
    def readNameFromDocument(doc: Document): js.UndefOr[String] = js.native
    
    def readNameFromNode(node: Element): js.UndefOr[String] = js.native
    
    def readNetworkLinks(source: String): js.Array[js.Object] = js.native
    /**
      * Read the network links of the KML.
      */
    def readNetworkLinks(source: Document): js.Array[js.Object] = js.native
    def readNetworkLinks(source: Element): js.Array[js.Object] = js.native
    
    def readNetworkLinksFromDocument(doc: Document): js.Array[js.Object] = js.native
    
    def readNetworkLinksFromNode(node: Element): js.Array[js.Object] = js.native
    
    def readRegion(source: String): js.Array[js.Object] = js.native
    /**
      * Read the regions of the KML.
      */
    def readRegion(source: Document): js.Array[js.Object] = js.native
    def readRegion(source: Element): js.Array[js.Object] = js.native
    
    def readRegionFromDocument(doc: Document): js.Array[js.Object] = js.native
    
    def readRegionFromNode(node: Element): js.Array[js.Object] = js.native
  }
  
  trait Options extends StObject {
    
    var crossOrigin: js.UndefOr[Null | String] = js.undefined
    
    var defaultStyle: js.UndefOr[js.Array[typingsJapgolly.ol.styleStyleMod.default]] = js.undefined
    
    var extractStyles: js.UndefOr[Boolean] = js.undefined
    
    var iconUrlFunction: js.UndefOr[IconUrlFunction] = js.undefined
    
    var showPointNames: js.UndefOr[Boolean] = js.undefined
    
    var writeStyles: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDefaultStyle(value: js.Array[typingsJapgolly.ol.styleStyleMod.default]): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
      
      inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
      
      inline def setDefaultStyleVarargs(value: typingsJapgolly.ol.styleStyleMod.default*): Self = StObject.set(x, "defaultStyle", js.Array(value*))
      
      inline def setExtractStyles(value: Boolean): Self = StObject.set(x, "extractStyles", value.asInstanceOf[js.Any])
      
      inline def setExtractStylesUndefined: Self = StObject.set(x, "extractStyles", js.undefined)
      
      inline def setIconUrlFunction(value: /* p0 */ String => String): Self = StObject.set(x, "iconUrlFunction", js.Any.fromFunction1(value))
      
      inline def setIconUrlFunctionUndefined: Self = StObject.set(x, "iconUrlFunction", js.undefined)
      
      inline def setShowPointNames(value: Boolean): Self = StObject.set(x, "showPointNames", value.asInstanceOf[js.Any])
      
      inline def setShowPointNamesUndefined: Self = StObject.set(x, "showPointNames", js.undefined)
      
      inline def setWriteStyles(value: Boolean): Self = StObject.set(x, "writeStyles", value.asInstanceOf[js.Any])
      
      inline def setWriteStylesUndefined: Self = StObject.set(x, "writeStyles", js.undefined)
    }
  }
  
  trait Vec2 extends StObject {
    
    var origin: IconOrigin
    
    var x: Double
    
    var xunits: IconAnchorUnits
    
    var y: Double
    
    var yunits: IconAnchorUnits
  }
  object Vec2 {
    
    inline def apply(origin: IconOrigin, x: Double, xunits: IconAnchorUnits, y: Double, yunits: IconAnchorUnits): Vec2 = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xunits = xunits.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yunits = yunits.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vec2]
    }
    
    extension [Self <: Vec2](x: Self) {
      
      inline def setOrigin(value: IconOrigin): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXunits(value: IconAnchorUnits): Self = StObject.set(x, "xunits", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYunits(value: IconAnchorUnits): Self = StObject.set(x, "yunits", value.asInstanceOf[js.Any])
    }
  }
}
