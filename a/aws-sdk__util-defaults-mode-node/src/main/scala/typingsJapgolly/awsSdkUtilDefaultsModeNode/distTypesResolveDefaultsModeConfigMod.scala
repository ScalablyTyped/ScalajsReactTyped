package typingsJapgolly.awsSdkUtilDefaultsModeNode

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.awsSdkSmithyClient.distTypesDefaultsModeMod.DefaultsMode
import typingsJapgolly.awsSdkSmithyClient.distTypesDefaultsModeMod.ResolvedDefaultsMode
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResolveDefaultsModeConfigMod {
  
  @JSImport("@aws-sdk/util-defaults-mode-node/dist-types/resolveDefaultsModeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveDefaultsModeConfig(): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")().asInstanceOf[Provider[ResolvedDefaultsMode]]
  inline def resolveDefaultsModeConfig(hasRegionDefaultsMode: ResolveDefaultsModeConfigOptions): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")(hasRegionDefaultsMode.asInstanceOf[js.Any]).asInstanceOf[Provider[ResolvedDefaultsMode]]
  
  trait ResolveDefaultsModeConfigOptions extends StObject {
    
    var defaultsMode: js.UndefOr[DefaultsMode | Provider[DefaultsMode]] = js.undefined
    
    var region: js.UndefOr[String | Provider[String]] = js.undefined
  }
  object ResolveDefaultsModeConfigOptions {
    
    inline def apply(): ResolveDefaultsModeConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveDefaultsModeConfigOptions]
    }
    
    extension [Self <: ResolveDefaultsModeConfigOptions](x: Self) {
      
      inline def setDefaultsMode(value: DefaultsMode | Provider[DefaultsMode]): Self = StObject.set(x, "defaultsMode", value.asInstanceOf[js.Any])
      
      inline def setDefaultsModeCallbackTo(value: CallbackTo[js.Promise[DefaultsMode]]): Self = StObject.set(x, "defaultsMode", value.toJsFn)
      
      inline def setDefaultsModeUndefined: Self = StObject.set(x, "defaultsMode", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionCallbackTo(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "region", value.toJsFn)
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
