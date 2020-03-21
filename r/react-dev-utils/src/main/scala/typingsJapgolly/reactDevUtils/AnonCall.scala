package typingsJapgolly.reactDevUtils

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
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
trait AnonCall extends js.Object {
  /**
    * Plugins
    */
  var BannerPlugin: Instantiable1[/* options */ String, typingsJapgolly.webpack.mod.BannerPlugin] = js.native
  var Compiler: Instantiable0[Compiler_] with TypeofCompiler = js.native
  var ContextReplacementPlugin: Instantiable1[/* resourceRegExp */ js.Any, typingsJapgolly.webpack.mod.ContextReplacementPlugin] = js.native
  var DefinePlugin: TypeofDefinePlugin with TypeofDefinePluginRuntimeValue = js.native
  var DllPlugin: Instantiable1[
    /* options */ typingsJapgolly.webpack.mod.DllPlugin.Options, 
    typingsJapgolly.webpack.mod.DllPlugin
  ] = js.native
  var DllReferencePlugin: Instantiable1[
    /* options */ typingsJapgolly.webpack.mod.DllReferencePlugin.Options, 
    typingsJapgolly.webpack.mod.DllReferencePlugin
  ] = js.native
  var EnvironmentPlugin: Instantiable1[/* envs */ js.Array[String], typingsJapgolly.webpack.mod.EnvironmentPlugin] = js.native
  var EvalSourceMapDevToolPlugin: Instantiable0[typingsJapgolly.webpack.mod.EvalSourceMapDevToolPlugin] = js.native
  var ExtendedAPIPlugin: Instantiable0[typingsJapgolly.webpack.mod.ExtendedAPIPlugin] = js.native
  var HashedModuleIdsPlugin: Instantiable0[typingsJapgolly.webpack.mod.HashedModuleIdsPlugin] = js.native
  var HotModuleReplacementPlugin: Instantiable0[typingsJapgolly.webpack.mod.HotModuleReplacementPlugin] = js.native
  val ICompiler: js.Any = js.native
  var IgnorePlugin: Instantiable1[/* requestRegExp */ js.Any, typingsJapgolly.webpack.mod.IgnorePlugin] = js.native
  var LoaderOptionsPlugin: Instantiable1[/* options */ js.Any, typingsJapgolly.webpack.mod.LoaderOptionsPlugin] = js.native
  var MultiCompiler: Instantiable0[typingsJapgolly.webpack.mod.MultiCompiler] = js.native
  var MultiWatching: Instantiable0[typingsJapgolly.webpack.mod.MultiWatching] = js.native
  var NamedChunksPlugin: Instantiable0[typingsJapgolly.webpack.mod.NamedChunksPlugin] = js.native
  /** @deprecated use config.optimization.namedModules */
  var NamedModulesPlugin: Instantiable0[typingsJapgolly.webpack.mod.NamedModulesPlugin] = js.native
  /** @deprecated use config.optimization.noEmitOnErrors */
  var NoEmitOnErrorsPlugin: Instantiable0[typingsJapgolly.webpack.mod.NoEmitOnErrorsPlugin] = js.native
  var NormalModuleReplacementPlugin: Instantiable2[
    /* resourceRegExp */ js.Any, 
    /* newResource */ js.Any, 
    typingsJapgolly.webpack.mod.NormalModuleReplacementPlugin
  ] = js.native
  val Options: js.Any = js.native
  var Plugin: Instantiable0[typingsJapgolly.webpack.mod.Plugin] = js.native
  var PrefetchPlugin: Instantiable2[
    /* context */ js.Any, 
    /* request */ js.Any, 
    typingsJapgolly.webpack.mod.PrefetchPlugin
  ] = js.native
  var ProgressPlugin: Instantiable0[typingsJapgolly.webpack.mod.ProgressPlugin] = js.native
  var ProvidePlugin: Instantiable1[
    /* definitions */ StringDictionary[js.Any], 
    typingsJapgolly.webpack.mod.ProvidePlugin
  ] = js.native
  var ResolvePlugin: Instantiable0[typingsJapgolly.webpack.mod.ResolvePlugin] = js.native
  var SingleEntryPlugin: Instantiable3[
    /* context */ String, 
    /* entry */ String, 
    /* name */ String, 
    typingsJapgolly.webpack.mod.SingleEntryPlugin
  ] = js.native
  var SourceMapDevToolPlugin: Instantiable0[typingsJapgolly.webpack.mod.SourceMapDevToolPlugin] = js.native
  var SplitChunksPlugin: Instantiable0[typingsJapgolly.webpack.mod.SplitChunksPlugin] = js.native
  var Stats: TypeofStats = js.native
  val Template: TypeofTemplate = js.native
  var WatchIgnorePlugin: Instantiable1[
    /* paths */ js.Array[String | js.RegExp], 
    typingsJapgolly.webpack.mod.WatchIgnorePlugin
  ] = js.native
  val compilation: Typeofcompilation = js.native
  /** @deprecated */
  val compiler: js.Any = js.native
  val debug: Typeofdebug = js.native
  val dependencies: js.Any = js.native
  val loader: js.Any = js.native
  val optimize: Typeofoptimize = js.native
  /** Webpack package version. */
  val version: js.UndefOr[String] = js.native
  def apply(): Compiler_ = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typingsJapgolly.webpack.mod.Compiler_.Handler
  ): MultiWatching | MultiCompiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler_ = js.native
  def apply(options: Configuration, handler: typingsJapgolly.webpack.mod.Compiler_.Handler): Watching | Compiler_ = js.native
}

