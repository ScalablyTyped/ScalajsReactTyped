package typingsJapgolly.awsSdkSmithyClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDefaultsModeMod {
  
  @JSImport("@aws-sdk/smithy-client/dist-types/defaults-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfigsForDefaultMode(mode: ResolvedDefaultsMode): DefaultsModeConfigs = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigsForDefaultMode")(mode.asInstanceOf[js.Any]).asInstanceOf[DefaultsModeConfigs]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.standard
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`in-region`
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`cross-region`
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.mobile
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.auto
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.legacy
  */
  trait DefaultsMode extends StObject
  object DefaultsMode {
    
    inline def auto: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.auto = "auto".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.auto]
    
    inline def `cross-region`: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`cross-region` = "cross-region".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`cross-region`]
    
    inline def `in-region`: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`in-region` = "in-region".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`in-region`]
    
    inline def legacy: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.legacy = "legacy".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.legacy]
    
    inline def mobile: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.mobile = "mobile".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.mobile]
    
    inline def standard: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.standard = "standard".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.standard]
  }
  
  trait DefaultsModeConfigs extends StObject {
    
    var connectionTimeout: js.UndefOr[Double] = js.undefined
    
    var requestTimeout: js.UndefOr[Double] = js.undefined
    
    var retryMode: js.UndefOr[String] = js.undefined
  }
  object DefaultsModeConfigs {
    
    inline def apply(): DefaultsModeConfigs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultsModeConfigs]
    }
    
    extension [Self <: DefaultsModeConfigs](x: Self) {
      
      inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
      
      inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
      
      inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
      
      inline def setRetryMode(value: String): Self = StObject.set(x, "retryMode", value.asInstanceOf[js.Any])
      
      inline def setRetryModeUndefined: Self = StObject.set(x, "retryMode", js.undefined)
    }
  }
  
  /* Inlined std.Exclude<@aws-sdk/smithy-client.@aws-sdk/smithy-client/dist-types/defaults-mode.DefaultsMode, 'auto'> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.standard
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`cross-region`
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.mobile
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`in-region`
    - typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.legacy
  */
  trait ResolvedDefaultsMode extends StObject
  object ResolvedDefaultsMode {
    
    inline def `cross-region`: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`cross-region` = "cross-region".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`cross-region`]
    
    inline def `in-region`: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`in-region` = "in-region".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.`in-region`]
    
    inline def legacy: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.legacy = "legacy".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.legacy]
    
    inline def mobile: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.mobile = "mobile".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.mobile]
    
    inline def standard: typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.standard = "standard".asInstanceOf[typingsJapgolly.awsSdkSmithyClient.awsSdkSmithyClientStrings.standard]
  }
}
