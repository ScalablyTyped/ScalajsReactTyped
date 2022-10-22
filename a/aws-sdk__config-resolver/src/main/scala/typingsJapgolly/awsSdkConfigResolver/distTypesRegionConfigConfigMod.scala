package typingsJapgolly.awsSdkConfigResolver

import typingsJapgolly.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LoadedConfigSelectors
import typingsJapgolly.awsSdkNodeConfigProvider.distTypesConfigLoaderMod.LocalConfigOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRegionConfigConfigMod {
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig/config", "NODE_REGION_CONFIG_FILE_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_FILE_OPTIONS: LocalConfigOptions = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig/config", "NODE_REGION_CONFIG_OPTIONS")
  @js.native
  val NODE_REGION_CONFIG_OPTIONS: LoadedConfigSelectors[String] = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig/config", "REGION_ENV_NAME")
  @js.native
  val REGION_ENV_NAME: /* "AWS_REGION" */ String = js.native
  
  @JSImport("@aws-sdk/config-resolver/dist-types/regionConfig/config", "REGION_INI_NAME")
  @js.native
  val REGION_INI_NAME: /* "region" */ String = js.native
}
