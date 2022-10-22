package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitArchitect.srcApiMod.BuilderContext
import typingsJapgolly.angularDevkitBuildAngular.anon.PartialNormalizedBrowserB
import typingsJapgolly.angularDevkitBuildAngular.anon.ProjectRoot
import typingsJapgolly.angularDevkitBuildAngular.anon.ProjectSourceRoot
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.IndexUnion
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod.Schema
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsBuildOptionsMod.WebpackConfigOptions
import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeBuilderSchemaMod.NormalizedBrowserBuilderSchema
import typingsJapgolly.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import typingsJapgolly.webpack.mod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsWebpackBrowserConfigMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/webpack-browser-config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateBrowserWebpackConfigFromContext(options: Schema, context: BuilderContext, webpackPartialGenerator: WebpackPartialGenerator): js.Promise[ProjectRoot] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBrowserWebpackConfigFromContext")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], webpackPartialGenerator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProjectRoot]]
  inline def generateBrowserWebpackConfigFromContext(
    options: Schema,
    context: BuilderContext,
    webpackPartialGenerator: WebpackPartialGenerator,
    extraBuildOptions: PartialNormalizedBrowserB
  ): js.Promise[ProjectRoot] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateBrowserWebpackConfigFromContext")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], webpackPartialGenerator.asInstanceOf[js.Any], extraBuildOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProjectRoot]]
  
  inline def generateI18nBrowserWebpackConfigFromContext(options: Schema, context: BuilderContext, webpackPartialGenerator: WebpackPartialGenerator): js.Promise[ProjectSourceRoot] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateI18nBrowserWebpackConfigFromContext")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], webpackPartialGenerator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProjectSourceRoot]]
  inline def generateI18nBrowserWebpackConfigFromContext(
    options: Schema,
    context: BuilderContext,
    webpackPartialGenerator: WebpackPartialGenerator,
    extraBuildOptions: PartialNormalizedBrowserB
  ): js.Promise[ProjectSourceRoot] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateI18nBrowserWebpackConfigFromContext")(options.asInstanceOf[js.Any], context.asInstanceOf[js.Any], webpackPartialGenerator.asInstanceOf[js.Any], extraBuildOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProjectSourceRoot]]
  
  inline def generateWebpackConfig(
    workspaceRoot: String,
    projectRoot: String,
    sourceRoot: String,
    projectName: String,
    options: NormalizedBrowserBuilderSchema,
    webpackPartialGenerator: WebpackPartialGenerator,
    logger: LoggerApi,
    extraBuildOptions: PartialNormalizedBrowserB
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateWebpackConfig")(workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], sourceRoot.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], webpackPartialGenerator.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], extraBuildOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  inline def generateWebpackConfig(
    workspaceRoot: String,
    projectRoot: String,
    sourceRoot: Unit,
    projectName: String,
    options: NormalizedBrowserBuilderSchema,
    webpackPartialGenerator: WebpackPartialGenerator,
    logger: LoggerApi,
    extraBuildOptions: PartialNormalizedBrowserB
  ): js.Promise[Configuration] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateWebpackConfig")(workspaceRoot.asInstanceOf[js.Any], projectRoot.asInstanceOf[js.Any], sourceRoot.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], webpackPartialGenerator.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], extraBuildOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Configuration]]
  
  inline def getIndexInputFile(index: IndexUnion): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexInputFile")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIndexOutputFile(index: IndexUnion): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIndexOutputFile")(index.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type BrowserWebpackConfigOptions = WebpackConfigOptions[NormalizedBrowserBuilderSchema]
  
  type WebpackPartialGenerator = js.Function1[
    /* configurationOptions */ BrowserWebpackConfigOptions, 
    js.Array[js.Promise[Configuration] | Configuration]
  ]
}
