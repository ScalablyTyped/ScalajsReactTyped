package typingsJapgolly.pulumiKubernetes.typesInputMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HelmReleaseSettings extends StObject {
  
  /**
    * The backend storage driver for Helm. Values are: configmap, secret, memory, sql.
    */
  var driver: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The path to the helm plugins directory.
    */
  var pluginsPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The path to the registry config file.
    */
  var registryConfigPath: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The path to the file containing cached repository indexes.
    */
  var repositoryCache: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The path to the file containing repository names and URLs.
    */
  var repositoryConfigPath: js.UndefOr[Input[String]] = js.undefined
}
object HelmReleaseSettings {
  
  inline def apply(): HelmReleaseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HelmReleaseSettings]
  }
  
  extension [Self <: HelmReleaseSettings](x: Self) {
    
    inline def setDriver(value: Input[String]): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
    
    inline def setDriverUndefined: Self = StObject.set(x, "driver", js.undefined)
    
    inline def setPluginsPath(value: Input[String]): Self = StObject.set(x, "pluginsPath", value.asInstanceOf[js.Any])
    
    inline def setPluginsPathUndefined: Self = StObject.set(x, "pluginsPath", js.undefined)
    
    inline def setRegistryConfigPath(value: Input[String]): Self = StObject.set(x, "registryConfigPath", value.asInstanceOf[js.Any])
    
    inline def setRegistryConfigPathUndefined: Self = StObject.set(x, "registryConfigPath", js.undefined)
    
    inline def setRepositoryCache(value: Input[String]): Self = StObject.set(x, "repositoryCache", value.asInstanceOf[js.Any])
    
    inline def setRepositoryCacheUndefined: Self = StObject.set(x, "repositoryCache", js.undefined)
    
    inline def setRepositoryConfigPath(value: Input[String]): Self = StObject.set(x, "repositoryConfigPath", value.asInstanceOf[js.Any])
    
    inline def setRepositoryConfigPathUndefined: Self = StObject.set(x, "repositoryConfigPath", js.undefined)
  }
}
