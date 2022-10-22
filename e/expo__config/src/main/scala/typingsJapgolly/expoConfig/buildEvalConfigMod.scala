package typingsJapgolly.expoConfig

import typingsJapgolly.expoConfig.anon.ExportedObjectType
import typingsJapgolly.expoConfig.buildConfigDottypesMod.ConfigContext
import typingsJapgolly.expoConfigTypes.mod.ExpoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEvalConfigMod {
  
  @JSImport("@expo/config/build/evalConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evalConfig(configFile: String): DynamicConfigResults = ^.asInstanceOf[js.Dynamic].applyDynamic("evalConfig")(configFile.asInstanceOf[js.Any]).asInstanceOf[DynamicConfigResults]
  inline def evalConfig(configFile: String, request: ConfigContext): DynamicConfigResults = (^.asInstanceOf[js.Dynamic].applyDynamic("evalConfig")(configFile.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[DynamicConfigResults]
  
  inline def resolveConfigExport(result: Any, configFile: String): ExportedObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfigExport")(result.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any])).asInstanceOf[ExportedObjectType]
  inline def resolveConfigExport(result: Any, configFile: String, request: ConfigContext): ExportedObjectType = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveConfigExport")(result.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[ExportedObjectType]
  
  trait DynamicConfigResults extends StObject {
    
    var config: RawDynamicConfig
    
    var exportedObjectType: String
  }
  object DynamicConfigResults {
    
    inline def apply(exportedObjectType: String): DynamicConfigResults = {
      val __obj = js.Dynamic.literal(exportedObjectType = exportedObjectType.asInstanceOf[js.Any], config = null)
      __obj.asInstanceOf[DynamicConfigResults]
    }
    
    extension [Self <: DynamicConfigResults](x: Self) {
      
      inline def setConfig(value: RawDynamicConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigNull: Self = StObject.set(x, "config", null)
      
      inline def setExportedObjectType(value: String): Self = StObject.set(x, "exportedObjectType", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expoConfig.buildConfigDottypesMod.AppJSONConfig
    - typingsJapgolly.expoConfig.anon.PartialExpoConfig
    - scala.Null
  */
  type RawDynamicConfig = _RawDynamicConfig | Null
  
  trait _RawDynamicConfig extends StObject
  object _RawDynamicConfig {
    
    inline def AppJSONConfig(expo: ExpoConfig): typingsJapgolly.expoConfig.buildConfigDottypesMod.AppJSONConfig = {
      val __obj = js.Dynamic.literal(expo = expo.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.expoConfig.buildConfigDottypesMod.AppJSONConfig]
    }
    
    inline def PartialExpoConfig(): typingsJapgolly.expoConfig.anon.PartialExpoConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.expoConfig.anon.PartialExpoConfig]
    }
  }
}
