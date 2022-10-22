package typingsJapgolly.ol

import typingsJapgolly.ol.formatFeatureMod.ReadOptions
import typingsJapgolly.ol.formatFeatureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatTextFeatureMod {
  
  /* note: abstract class */ @JSImport("ol/format/TextFeature", JSImport.Default)
  @js.native
  open class default () extends TextFeature
  
  @js.native
  trait TextFeature
    extends typingsJapgolly.ol.formatFeatureMod.default {
    
    /* protected */ def readFeatureFromText(text: String): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeatureFromText(text: String, opt_options: ReadOptions): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromText(text: String): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    /* protected */ def readFeaturesFromText(text: String, opt_options: ReadOptions): js.Array[
        typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
      ] = js.native
    
    /* protected */ def readGeometryFromText(text: String): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromText(text: String, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
    
    /* protected */ def readProjectionFromText(text: String): typingsJapgolly.ol.projProjectionMod.default = js.native
    
    /* protected */ def writeFeatureText(feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]): String = js.native
    /* protected */ def writeFeatureText(
      feature: typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default],
      opt_options: WriteOptions
    ): String = js.native
    
    /* protected */ def writeFeaturesText(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ]
    ): String = js.native
    /* protected */ def writeFeaturesText(
      features: js.Array[
          typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default]
        ],
      opt_options: WriteOptions
    ): String = js.native
    
    /* protected */ def writeGeometryText(geometry: typingsJapgolly.ol.geomGeometryMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typingsJapgolly.ol.geomGeometryMod.default, opt_options: WriteOptions): String = js.native
  }
}
