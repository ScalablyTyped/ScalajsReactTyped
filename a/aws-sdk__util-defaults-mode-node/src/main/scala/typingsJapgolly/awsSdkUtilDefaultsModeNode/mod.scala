package typingsJapgolly.awsSdkUtilDefaultsModeNode

import typingsJapgolly.awsSdkSmithyClient.distTypesDefaultsModeMod.ResolvedDefaultsMode
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.awsSdkUtilDefaultsModeNode.distTypesResolveDefaultsModeConfigMod.ResolveDefaultsModeConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-defaults-mode-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveDefaultsModeConfig(): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")().asInstanceOf[Provider[ResolvedDefaultsMode]]
  inline def resolveDefaultsModeConfig(hasRegionDefaultsMode: ResolveDefaultsModeConfigOptions): Provider[ResolvedDefaultsMode] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveDefaultsModeConfig")(hasRegionDefaultsMode.asInstanceOf[js.Any]).asInstanceOf[Provider[ResolvedDefaultsMode]]
}
