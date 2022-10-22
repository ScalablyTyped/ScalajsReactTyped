package typingsJapgolly.awsSdkNodeConfigProvider

import typingsJapgolly.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typingsJapgolly.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LocalConfigOptions
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/node-config-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfig[T](hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue: LoadedConfigSelectors[T]): Provider[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue.asInstanceOf[js.Any]).asInstanceOf[Provider[T]]
  inline def loadConfig[T](
    hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue: LoadedConfigSelectors[T],
    configuration: LocalConfigOptions
  ): Provider[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(hasEnvironmentVariableSelectorConfigFileSelectorDefaultValue.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[Provider[T]]
}
