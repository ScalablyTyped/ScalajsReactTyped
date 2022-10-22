package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderOutput
import typingsJapgolly.angularDevkitBuildAngular.anon.IndexHtml
import typingsJapgolly.angularDevkitBuildAngular.anon.KarmaOptions
import typingsJapgolly.angularDevkitBuildAngular.anon.WebpackConfiguration
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserMod.BrowserBuilderOutput
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersDevServerMod.DevServerBuilderOptions
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersDevServerMod.DevServerBuilderOutput
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersExtractI18nMod.ExtractI18nBuilderOptions
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerMod.ServerBuilderOutput
import typingsJapgolly.angularDevkitBuildWebpack.srcWebpackMod.BuildResult
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular-devkit/build-angular", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-angular", "CrossOrigin")
  @js.native
  object CrossOrigin extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.CrossOrigin & String
      ] = js.native
    
    /* "anonymous" */ val Anonymous: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.CrossOrigin.Anonymous & String = js.native
    
    /* "none" */ val None: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.CrossOrigin.None & String = js.native
    
    /* "use-credentials" */ val UseCredentials: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.CrossOrigin.UseCredentials & String = js.native
  }
  
  @JSImport("@angular-devkit/build-angular", "OutputHashing")
  @js.native
  object OutputHashing extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OutputHashing & String
      ] = js.native
    
    /* "all" */ val All: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OutputHashing.All & String = js.native
    
    /* "bundles" */ val Bundles: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OutputHashing.Bundles & String = js.native
    
    /* "media" */ val Media: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OutputHashing.Media & String = js.native
    
    /* "none" */ val None: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.OutputHashing.None & String = js.native
  }
  
  @JSImport("@angular-devkit/build-angular", "Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type & String
      ] = js.native
    
    /* "all" */ val All: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.All & String = js.native
    
    /* "allScript" */ val AllScript: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.AllScript & String = js.native
    
    /* "any" */ val Any: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.Any & String = js.native
    
    /* "anyComponentStyle" */ val AnyComponentStyle: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.AnyComponentStyle & String = js.native
    
    /* "anyScript" */ val AnyScript: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.AnyScript & String = js.native
    
    /* "bundle" */ val Bundle: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.Bundle & String = js.native
    
    /* "initial" */ val Initial: typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Type.Initial & String = js.native
  }
  
  inline def executeBrowserBuilder(options: Schema, context: BuilderContext): Observable_[BrowserBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeBrowserBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BrowserBuilderOutput]]
  inline def executeBrowserBuilder(options: Schema, context: BuilderContext, transforms: IndexHtml): Observable_[BrowserBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeBrowserBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Observable_[BrowserBuilderOutput]]
  
  inline def executeDevServerBuilder(options: DevServerBuilderOptions, context: BuilderContext): Observable_[DevServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeDevServerBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuilderOutput]]
  inline def executeDevServerBuilder(options: DevServerBuilderOptions, context: BuilderContext, transforms: IndexHtml): Observable_[DevServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeDevServerBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Observable_[DevServerBuilderOutput]]
  
  inline def executeExtractI18nBuilder(options: ExtractI18nBuilderOptions, context: BuilderContext): js.Promise[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeExtractI18nBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuildResult]]
  inline def executeExtractI18nBuilder(options: ExtractI18nBuilderOptions, context: BuilderContext, transforms: WebpackConfiguration): js.Promise[BuildResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeExtractI18nBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuildResult]]
  
  inline def executeKarmaBuilder(
    options: typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaSchemaMod.Schema,
    context: BuilderContext
  ): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeKarmaBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def executeKarmaBuilder(
    options: typingsJapgolly.angularDevkitBuildAngular.srcBuildersKarmaSchemaMod.Schema,
    context: BuilderContext,
    transforms: KarmaOptions
  ): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeKarmaBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  inline def executeNgPackagrBuilder(
    options: typingsJapgolly.angularDevkitBuildAngular.srcBuildersNgPackagrSchemaMod.Schema,
    context: BuilderContext
  ): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeNgPackagrBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  inline def executeProtractorBuilder(
    options: typingsJapgolly.angularDevkitBuildAngular.srcBuildersProtractorSchemaMod.Schema,
    context: BuilderContext
  ): js.Promise[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeProtractorBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BuilderOutput]]
  
  inline def executeServerBuilder(
    options: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.Schema,
    context: BuilderContext
  ): Observable_[ServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeServerBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Observable_[ServerBuilderOutput]]
  inline def executeServerBuilder(
    options: typingsJapgolly.angularDevkitBuildAngular.srcBuildersServerSchemaMod.Schema,
    context: BuilderContext,
    transforms: WebpackConfiguration
  ): Observable_[ServerBuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeServerBuilder")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Observable_[ServerBuilderOutput]]
}
