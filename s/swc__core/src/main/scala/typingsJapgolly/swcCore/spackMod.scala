package typingsJapgolly.swcCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.swcCore.typesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spackMod {
  
  @JSImport("@swc/core/spack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileBundleOptions(): js.Promise[BundleInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileBundleOptions")().asInstanceOf[js.Promise[BundleInput]]
  inline def compileBundleOptions(config: String): js.Promise[BundleInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileBundleOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BundleInput]]
  inline def compileBundleOptions(config: BundleInput): js.Promise[BundleInput] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileBundleOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[BundleInput]]
  
  inline def config(c: BundleInput): BundleInput = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(c.asInstanceOf[js.Any]).asInstanceOf[BundleInput]
  
  type BundleInput = BundleOptions | js.Array[BundleOptions]
  
  trait BundleOptions
    extends StObject
       with SpackConfig {
    
    var workingDir: js.UndefOr[String] = js.undefined
  }
  object BundleOptions {
    
    inline def apply(entry: EntryConfig, module: ModuleConfig, output: OutputConfig): BundleOptions = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleOptions]
    }
    
    extension [Self <: BundleOptions](x: Self) {
      
      inline def setWorkingDir(value: String): Self = StObject.set(x, "workingDir", value.asInstanceOf[js.Any])
      
      inline def setWorkingDirUndefined: Self = StObject.set(x, "workingDir", js.undefined)
    }
  }
  
  type EntryConfig = String | js.Array[String] | StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.swcCore.swcCoreStrings.production
    - typingsJapgolly.swcCore.swcCoreStrings.development
    - typingsJapgolly.swcCore.swcCoreStrings.none
  */
  trait Mode extends StObject
  object Mode {
    
    inline def development: typingsJapgolly.swcCore.swcCoreStrings.development = "development".asInstanceOf[typingsJapgolly.swcCore.swcCoreStrings.development]
    
    inline def none: typingsJapgolly.swcCore.swcCoreStrings.none = "none".asInstanceOf[typingsJapgolly.swcCore.swcCoreStrings.none]
    
    inline def production: typingsJapgolly.swcCore.swcCoreStrings.production = "production".asInstanceOf[typingsJapgolly.swcCore.swcCoreStrings.production]
  }
  
  trait ModuleConfig extends StObject
  
  trait OutputConfig extends StObject {
    
    var name: String
    
    var path: String
  }
  object OutputConfig {
    
    inline def apply(name: String, path: String): OutputConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputConfig]
    }
    
    extension [Self <: OutputConfig](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait SpackConfig extends StObject {
    
    var entry: EntryConfig
    
    /**
      * Modules to exclude from bundle.
      */
    var externalModules: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @default process.env.NODE_ENV
      */
    var mode: js.UndefOr[Mode] = js.undefined
    
    var module: ModuleConfig
    
    var options: js.UndefOr[Options] = js.undefined
    
    var output: OutputConfig
    
    var target: js.UndefOr[Target] = js.undefined
  }
  object SpackConfig {
    
    inline def apply(entry: EntryConfig, module: ModuleConfig, output: OutputConfig): SpackConfig = {
      val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpackConfig]
    }
    
    extension [Self <: SpackConfig](x: Self) {
      
      inline def setEntry(value: EntryConfig): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
      
      inline def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value*))
      
      inline def setExternalModules(value: js.Array[String]): Self = StObject.set(x, "externalModules", value.asInstanceOf[js.Any])
      
      inline def setExternalModulesUndefined: Self = StObject.set(x, "externalModules", js.undefined)
      
      inline def setExternalModulesVarargs(value: String*): Self = StObject.set(x, "externalModules", js.Array(value*))
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setModule(value: ModuleConfig): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOutput(value: OutputConfig): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.swcCore.swcCoreStrings.browser
    - typingsJapgolly.swcCore.swcCoreStrings.node
  */
  trait Target extends StObject
  object Target {
    
    inline def browser: typingsJapgolly.swcCore.swcCoreStrings.browser = "browser".asInstanceOf[typingsJapgolly.swcCore.swcCoreStrings.browser]
    
    inline def node: typingsJapgolly.swcCore.swcCoreStrings.node = "node".asInstanceOf[typingsJapgolly.swcCore.swcCoreStrings.node]
  }
}
