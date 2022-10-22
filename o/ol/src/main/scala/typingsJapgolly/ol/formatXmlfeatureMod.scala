package typingsJapgolly.ol

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.ol.formatFeatureMod.ReadOptions
import typingsJapgolly.ol.formatFeatureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatXmlfeatureMod {
  
  /* note: abstract class */ @JSImport("ol/format/XMLFeature", JSImport.Default)
  @js.native
  open class default () extends XMLFeature
  
  @js.native
  trait XMLFeature
    extends typingsJapgolly.ol.formatFeatureMod.default {
    
    def readFeatureFromDocument(doc: Document): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    def readFeatureFromDocument(doc: Document, opt_options: ReadOptions): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    def readFeatureFromNode(node: Element): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    def readFeatureFromNode(node: Element, opt_options: ReadOptions): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromDocument(doc: Document): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document, opt_options: ReadOptions): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /* protected */ def readFeaturesFromNode(node: Element): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    /* protected */ def readFeaturesFromNode(node: Element, opt_options: ReadOptions): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /* protected */ def readGeometryFromDocument(doc: Document): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    
    /* protected */ def readGeometryFromNode(node: Element): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Element, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    
    /* protected */ def readProjectionFromDocument(doc: Document): typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /* protected */ def readProjectionFromNode(node: Element): typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /* protected */ def writeFeatureNode(feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]): Node = js.native
    /* protected */ def writeFeatureNode(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeFeaturesNode(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
    ): Node = js.native
    def writeFeaturesNode(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ],
      opt_options: WriteOptions
    ): Node = js.native
    
    def writeGeometryNode(geometry: typingsJapgolly.ol.geomGeometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_options: WriteOptions): Node = js.native
  }
}
