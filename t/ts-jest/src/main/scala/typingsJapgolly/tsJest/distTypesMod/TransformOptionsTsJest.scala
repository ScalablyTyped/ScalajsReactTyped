package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.jestTransform.mod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOptionsTsJest
  extends StObject
     with TransformOptions[Any] {
  
  @JSName("config")
  var config_TransformOptionsTsJest: ProjectConfigTsJest
}
object TransformOptionsTsJest {
  
  inline def apply(
    cacheFS: typingsJapgolly.jestTransform.mod.StringMap,
    config: ProjectConfigTsJest,
    configString: String,
    instrument: Boolean,
    supportsDynamicImport: Boolean,
    supportsExportNamespaceFrom: Boolean,
    supportsStaticESM: Boolean,
    supportsTopLevelAwait: Boolean,
    transformerConfig: Any
  ): TransformOptionsTsJest = {
    val __obj = js.Dynamic.literal(cacheFS = cacheFS.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configString = configString.asInstanceOf[js.Any], instrument = instrument.asInstanceOf[js.Any], supportsDynamicImport = supportsDynamicImport.asInstanceOf[js.Any], supportsExportNamespaceFrom = supportsExportNamespaceFrom.asInstanceOf[js.Any], supportsStaticESM = supportsStaticESM.asInstanceOf[js.Any], supportsTopLevelAwait = supportsTopLevelAwait.asInstanceOf[js.Any], transformerConfig = transformerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptionsTsJest]
  }
  
  extension [Self <: TransformOptionsTsJest](x: Self) {
    
    inline def setConfig(value: ProjectConfigTsJest): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
  }
}
