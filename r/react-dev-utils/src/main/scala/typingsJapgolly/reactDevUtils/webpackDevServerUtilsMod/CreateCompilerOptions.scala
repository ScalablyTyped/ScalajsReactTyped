package typingsJapgolly.reactDevUtils.webpackDevServerUtilsMod

import typingsJapgolly.reactDevUtils.AnonCall
import typingsJapgolly.webpack.mod.Compiler_
import typingsJapgolly.webpack.mod.Compiler_.Watching
import typingsJapgolly.webpack.mod.Configuration
import typingsJapgolly.webpack.mod.ConfigurationFactory
import typingsJapgolly.webpack.mod.MultiCompiler
import typingsJapgolly.webpack.mod.MultiCompiler.Handler
import typingsJapgolly.webpack.mod.MultiConfigurationFactory
import typingsJapgolly.webpack.mod.MultiWatching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilerOptions extends js.Object {
  /**
    * The name that will be printed to the terminal.
    */
  var appName: String = js.native
  /**
    * The webpack configuration options to be provided to the webpack constructor.
    */
  var config: Configuration = js.native
  /**
    * To provide the `urls` argument, use `prepareUrls()` described below.
    */
  var urls: Urls = js.native
  /**
    * If `true`; yarn instructions will be emitted in the terminal instead of npm.
    */
  var useYarn: js.UndefOr[Boolean] = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  @JSName("webpack")
  var webpack_Original: AnonCall = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(): Compiler_ = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typingsJapgolly.webpack.mod.Compiler_.Handler
  ): MultiWatching | MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: js.Array[Configuration]): MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: js.Array[Configuration], handler: Handler): MultiWatching | MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: Configuration): Compiler_ = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: Configuration, handler: typingsJapgolly.webpack.mod.Compiler_.Handler): Watching | Compiler_ = js.native
}

