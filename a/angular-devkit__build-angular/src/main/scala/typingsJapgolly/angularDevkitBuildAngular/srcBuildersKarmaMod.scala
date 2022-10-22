package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.anon.KarmaOptions
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaSchemaMod.Schema
import typingsJapgolly.karma.mod.ConfigOptions
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersKarmaMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/karma", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular/src/builders/karma", JSImport.Default)
  @js.native
  val default: Builder[
    (Record[String, String]) & Schema & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src.JsonObject */ Any)
  ] = js.native
  
  inline def execute(options: Schema, context: BuilderContext): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def execute(options: Schema, context: BuilderContext, transforms: KarmaOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("execute")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  trait KarmaConfigOptions
    extends StObject
       with ConfigOptions {
    
    var buildWebpack: js.UndefOr[Any] = js.undefined
    
    var configFile: js.UndefOr[String] = js.undefined
  }
  object KarmaConfigOptions {
    
    inline def apply(): KarmaConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KarmaConfigOptions]
    }
    
    extension [Self <: KarmaConfigOptions](x: Self) {
      
      inline def setBuildWebpack(value: Any): Self = StObject.set(x, "buildWebpack", value.asInstanceOf[js.Any])
      
      inline def setBuildWebpackUndefined: Self = StObject.set(x, "buildWebpack", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    }
  }
}
