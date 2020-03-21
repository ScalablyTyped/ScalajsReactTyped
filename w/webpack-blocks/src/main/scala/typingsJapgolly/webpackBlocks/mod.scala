package typingsJapgolly.webpackBlocks

import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.Entry
import typingsJapgolly.webpack.mod.Options.Devtool
import typingsJapgolly.webpack.mod.Options.Performance
import typingsJapgolly.webpack.mod.Output
import typingsJapgolly.webpack.mod.Plugin
import typingsJapgolly.webpack.mod.Resolve
import typingsJapgolly.webpackBlocksAssets.mod.css.CssOptions
import typingsJapgolly.webpackBlocksAssets.mod.css.FileOptions
import typingsJapgolly.webpackBlocksAssets.mod.css.ModuleOptions
import typingsJapgolly.webpackBlocksAssets.mod.css.UrlOptions
import typingsJapgolly.webpackBlocksCore.mod.Block
import typingsJapgolly.webpackBlocksCore.mod.Context
import typingsJapgolly.webpackBlocksCore.mod.MatchOptions
import typingsJapgolly.webpackBlocksDevServer.mod.Options
import typingsJapgolly.webpackBlocksWebpack.mod.ConstantOptions
import typingsJapgolly.webpackBlocksWebpack.mod.OptimizationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-blocks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def addPlugins(plugins: js.Array[Plugin]): Block[Context] = js.native
  def createConfig(configSetters: js.Array[Block[Context]]): Configuration = js.native
  def createConfig(configSetters: Block[Context]): Configuration = js.native
  def customConfig(wpConfig: js.Any): Configuration = js.native
  def defineConstants(constants: ConstantOptions): Block[Context] = js.native
  def entryPoint(entry: String): Block[Context] = js.native
  def entryPoint(entry: js.Array[String]): Block[Context] = js.native
  def entryPoint(entry: Entry): Block[Context] = js.native
  def env(envName: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def file(): js.Any = js.native
  def file(options: FileOptions): js.Any = js.native
  def group(configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: String, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: String, options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: js.Array[String], configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def `match`(test: js.Array[String], options: MatchOptions, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  def optimization(optimizationOptions: OptimizationOptions): Block[Context] = js.native
  def performance(performanceBudget: Performance): Block[Context] = js.native
  def resolve(config: Resolve): Block[Context] = js.native
  def setContext(contextPath: String): Block[Context] = js.native
  def setDevTool(devtool: String): Block[Context] = js.native
  def setEnv(constants: ConstantOptions): js.Any = js.native
  def setMode(mode: js.Any): Block[Context] = js.native
  def setOutput(): Block[Context] = js.native
  def setOutput(output: String): Block[Context] = js.native
  def setOutput(output: Output): Block[Context] = js.native
  def sourceMaps(): Block[Context] = js.native
  def sourceMaps(devtool: Devtool): Block[Context] = js.native
  def url(): js.Any = js.native
  def url(options: UrlOptions): js.Any = js.native
  def when(condition: Boolean, configSetters: js.Array[Block[Context]]): Block[Context] = js.native
  @js.native
  object babel extends js.Object {
    def apply(): js.Any = js.native
    def apply(options: typingsJapgolly.webpackBlocksBabel.mod.babel): js.Any = js.native
  }
  
  @js.native
  object css extends js.Object {
    def apply(): js.Any = js.native
    def apply(options: CssOptions): js.Any = js.native
    def modules(): js.Any = js.native
    def modules(options: ModuleOptions): js.Any = js.native
  }
  
  @js.native
  object devServer extends js.Object {
    def apply(): js.Any = js.native
    def apply(options: Options): js.Any = js.native
    def apply(options: Options, entry: String): js.Any = js.native
    def apply(options: Options, entry: js.Array[String]): js.Any = js.native
  }
  
  @js.native
  object extractText extends js.Object {
    def apply(): js.Any = js.native
    def apply(outputFilePattern: String): js.Any = js.native
  }
  
  @js.native
  object postcss extends js.Object {
    def apply(): js.Any = js.native
    def apply(options: typingsJapgolly.webpackBlocksPostcss.mod.Options): js.Any = js.native
  }
  
  @js.native
  object sass extends js.Object {
    def apply(): js.Any = js.native
    def apply(options: typingsJapgolly.webpackBlocksSass.mod.Options): js.Any = js.native
  }
  
  @js.native
  object typescript extends js.Object {
    def apply(): js.Any = js.native
    def apply(options: typingsJapgolly.webpackBlocksTypescript.mod.Options): js.Any = js.native
  }
  
  @js.native
  object uglify extends js.Object {
    def apply(): js.Any = js.native
    def apply(options: typingsJapgolly.webpackBlocksUglify.mod.Options): js.Any = js.native
  }
  
}

