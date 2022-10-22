package typingsJapgolly.cssMinimizerWebpackPlugin

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.EventListenerOptions
import typingsJapgolly.cssMinimizerWebpackPlugin.anon.Code
import typingsJapgolly.cssMinimizerWebpackPlugin.anon.Errorpluginstringundefine
import typingsJapgolly.cssMinimizerWebpackPlugin.anon.From
import typingsJapgolly.cssMinimizerWebpackPlugin.anon.Implementation
import typingsJapgolly.jestWorker.mod.Worker
import typingsJapgolly.postcss.libRootMod.default
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @template [T=CssNanoOptionsExtended]
    */
  @JSImport("css-minimizer-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * @param {BasePluginOptions & DefinedDefaultMinimizerAndOptions<T>} [options]
    */
  open class ^[T] ()
    extends StObject
       with CssMinimizerPlugin[T] {
    def this(options: BasePluginOptions & DefinedDefaultMinimizerAndOptions[T]) = this()
    
    /**
      * @param {Compiler} compiler
      * @returns {void}
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Record<string, import("webpack").sources.Source>} assets
      * @param {{availableNumberOfCores: number}} optimizeOptions
      * @returns {Promise<void>}
      */
    /* private */ /* CompleteClass */
    var optimize: Any = js.native
    
    /**
      * @private
      * @type {InternalPluginOptions<T>}
      */
    /* private */ /* CompleteClass */
    var options: Any = js.native
  }
  @JSImport("css-minimizer-webpack-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @private
    * @param {Error | ErrorObject | string} error
    * @param {string} file
    * @param {SourceMapConsumer} [sourceMap]
    * @param {Compilation["requestShortener"]} [requestShortener]
    * @returns {Error}
    */
  /* static member */
  @JSImport("css-minimizer-webpack-plugin", "buildError")
  @js.native
  def buildError: Any = js.native
  inline def buildError_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildError")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {Warning | WarningObject | string} warning
    * @param {string} file
    * @param {WarningsFilter} [warningsFilter]
    * @param {SourceMapConsumer} [sourceMap]
    * @param {Compilation["requestShortener"]} [requestShortener]
    * @returns {Error & { hideStack?: boolean, file?: string } | undefined}
    */
  /* static member */
  @JSImport("css-minimizer-webpack-plugin", "buildWarning")
  @js.native
  def buildWarning: Any = js.native
  inline def buildWarning_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildWarning")(x.asInstanceOf[js.Any])
  
  inline def cleanCssMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: Unit,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def cleanCssMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  
  inline def cssnanoMinify(input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def cssnanoMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: Unit,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def cssnanoMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def cssnanoMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssnanoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  
  inline def cssoMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: Unit,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def cssoMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("cssoMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  
  inline def esbuildMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: Unit,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("esbuildMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def esbuildMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("esbuildMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  
  /**
    * @private
    * @param {Parallel} parallel
    * @returns {number}
    */
  /* static member */
  @JSImport("css-minimizer-webpack-plugin", "getAvailableNumberOfCores")
  @js.native
  def getAvailableNumberOfCores: Any = js.native
  inline def getAvailableNumberOfCores_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAvailableNumberOfCores")(x.asInstanceOf[js.Any])
  
  /**
    * @private
    * @param {any} input
    * @returns {boolean}
    */
  /* static member */
  @JSImport("css-minimizer-webpack-plugin", "isSourceMap")
  @js.native
  def isSourceMap: Any = js.native
  inline def isSourceMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSourceMap")(x.asInstanceOf[js.Any])
  
  inline def lightningCssMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: Unit,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("lightningCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def lightningCssMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("lightningCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  
  inline def parcelCssMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: Unit,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("parcelCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def parcelCssMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("parcelCssMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  
  inline def swcMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: Unit,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("swcMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  inline def swcMinify(
    input: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.Input,
    sourceMap: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.RawSourceMap,
    minimizerOptions: typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.CustomOptions
  ): js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("swcMinify")(input.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any], minimizerOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.cssMinimizerWebpackPlugin.typesUtilsMod.MinimizedResult]]
  
  type Asset = typingsJapgolly.webpack.mod.Asset
  
  trait BasePluginOptions extends StObject {
    
    var exclude: js.UndefOr[Rules] = js.undefined
    
    var include: js.UndefOr[Rules] = js.undefined
    
    var parallel: js.UndefOr[Parallel] = js.undefined
    
    var test: js.UndefOr[Rules] = js.undefined
    
    var warningsFilter: js.UndefOr[WarningsFilter] = js.undefined
  }
  object BasePluginOptions {
    
    inline def apply(): BasePluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePluginOptions]
    }
    
    extension [Self <: BasePluginOptions](x: Self) {
      
      inline def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setParallel(value: Parallel): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setParallelUndefined: Self = StObject.set(x, "parallel", js.undefined)
      
      inline def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setWarningsFilter(
        value: (/* warning */ Warning | WarningObject | String, /* file */ String, /* source */ js.UndefOr[String]) => Boolean
      ): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction3(value))
      
      inline def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    }
  }
  
  type BasicMinimizerImplementation[T] = js.Function3[
    /* input */ Input, 
    /* sourceMap */ js.UndefOr[RawSourceMap], 
    /* minifyOptions */ InferDefaultType[T], 
    js.Promise[MinimizedResult]
  ]
  
  type Compilation = typingsJapgolly.webpack.mod.Compilation
  
  type Compiler = typingsJapgolly.webpack.mod.Compiler
  
  /**
    * @template [T=CssNanoOptionsExtended]
    */
  trait CssMinimizerPlugin[T] extends StObject {
    
    /**
      * @param {Compiler} compiler
      * @returns {void}
      */
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Record<string, import("webpack").sources.Source>} assets
      * @param {{availableNumberOfCores: number}} optimizeOptions
      * @returns {Promise<void>}
      */
    /* private */ var optimize: Any
    
    /**
      * @private
      * @type {InternalPluginOptions<T>}
      */
    /* private */ var options: Any
  }
  object CssMinimizerPlugin {
    
    inline def apply[T](apply: Compiler => Callback, optimize: Any, options: Any): CssMinimizerPlugin[T] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()), optimize = optimize.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssMinimizerPlugin[T]]
    }
    
    extension [Self <: CssMinimizerPlugin[?], T](x: Self & CssMinimizerPlugin[T]) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
      
      inline def setOptimize(value: Any): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait CssNanoOptions extends StObject {
    
    var configFile: js.UndefOr[String] = js.undefined
    
    var preset: js.UndefOr[(js.Tuple2[String, js.Object]) | String] = js.undefined
  }
  object CssNanoOptions {
    
    inline def apply(): CssNanoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssNanoOptions]
    }
    
    extension [Self <: CssNanoOptions](x: Self) {
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setPreset(value: (js.Tuple2[String, js.Object]) | String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    }
  }
  
  trait CssNanoOptionsExtended
    extends StObject
       with CssNanoOptions {
    
    var processorOptions: js.UndefOr[ProcessOptionsExtender] = js.undefined
  }
  object CssNanoOptionsExtended {
    
    inline def apply(): CssNanoOptionsExtended = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssNanoOptionsExtended]
    }
    
    extension [Self <: CssNanoOptionsExtended](x: Self) {
      
      inline def setProcessorOptions(value: ProcessOptionsExtender): Self = StObject.set(x, "processorOptions", value.asInstanceOf[js.Any])
      
      inline def setProcessorOptionsUndefined: Self = StObject.set(x, "processorOptions", js.undefined)
    }
  }
  
  type CustomOptions = StringDictionary[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.CssNanoOptionsExtended ? {  minify :css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.MinimizerImplementation<T> | undefined,   minimizerOptions :css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.MinimizerOptions<T> | undefined} : {  minify :css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.MinimizerImplementation<T>,   minimizerOptions :css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.MinimizerOptions<T> | undefined}
    }}}
    */
  @js.native
  trait DefinedDefaultMinimizerAndOptions[T] extends StObject
  
  trait ErrorObject extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var message: String
    
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorObject {
    
    inline def apply(message: String): ErrorObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorObject]
    }
    
    extension [Self <: ErrorObject](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends infer U ? U : css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.CustomOptions
    }}}
    */
  @js.native
  trait InferDefaultType[T] extends StObject
  
  type Input = StringDictionary[String]
  
  trait InternalOptions[T] extends StObject {
    
    var input: String
    
    var inputSourceMap: js.UndefOr[RawSourceMap] = js.undefined
    
    var minimizer: Implementation[T]
    
    var name: String
  }
  object InternalOptions {
    
    inline def apply[T](input: String, minimizer: Implementation[T], name: String): InternalOptions[T] = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], minimizer = minimizer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalOptions[T]]
    }
    
    extension [Self <: InternalOptions[?], T](x: Self & InternalOptions[T]) {
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMap(value: RawSourceMap): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      inline def setMinimizer(value: Implementation[T]): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalPluginOptions[T]
    extends StObject
       with BasePluginOptions {
    
    var minimizer: Implementation[T]
  }
  object InternalPluginOptions {
    
    inline def apply[T](minimizer: Implementation[T]): InternalPluginOptions[T] = {
      val __obj = js.Dynamic.literal(minimizer = minimizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalPluginOptions[T]]
    }
    
    extension [Self <: InternalPluginOptions[?], T](x: Self & InternalPluginOptions[T]) {
      
      inline def setMinimizer(value: Implementation[T]): Self = StObject.set(x, "minimizer", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalResult extends StObject {
    
    var errors: js.Array[js.Error | ErrorObject | String]
    
    var outputs: js.Array[Code]
    
    var warnings: js.Array[Warning | WarningObject | String]
  }
  object InternalResult {
    
    inline def apply(
      errors: js.Array[js.Error | ErrorObject | String],
      outputs: js.Array[Code],
      warnings: js.Array[Warning | WarningObject | String]
    ): InternalResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalResult]
    }
    
    extension [Self <: InternalResult](x: Self) {
      
      inline def setErrors(value: js.Array[js.Error | ErrorObject | String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: (js.Error | ErrorObject | String)*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setOutputs(value: js.Array[Code]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsVarargs(value: Code*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setWarnings(value: js.Array[Warning | WarningObject | String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: (Warning | WarningObject | String)*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  type JestWorker = Worker
  
  trait MinimizedResult extends StObject {
    
    var code: String
    
    var errors: js.UndefOr[js.Array[String | js.Error | ErrorObject]] = js.undefined
    
    var map: js.UndefOr[typingsJapgolly.sourceMap.mod.RawSourceMap] = js.undefined
    
    var warnings: js.UndefOr[js.Array[Warning | WarningObject]] = js.undefined
  }
  object MinimizedResult {
    
    inline def apply(code: String): MinimizedResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinimizedResult]
    }
    
    extension [Self <: MinimizedResult](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String | js.Error | ErrorObject]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: (String | js.Error | ErrorObject)*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setMap(value: typingsJapgolly.sourceMap.mod.RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setWarnings(value: js.Array[Warning | WarningObject]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: (Warning | WarningObject)*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<any> ? T extends infer T_1 ? {[ P in keyof T_1 ]: css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.BasicMinimizerImplementation<T[P]>} : never : css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.BasicMinimizerImplementation<T>
    }}}
    */
  @js.native
  trait MinimizerImplementation[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<any> ? T extends infer T_1 ? {[ P in keyof T_1 ]:? css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.InferDefaultType<T[P]> | undefined} : never : css-minimizer-webpack-plugin.css-minimizer-webpack-plugin.InferDefaultType<T>
    }}}
    */
  @js.native
  trait MinimizerOptions[T] extends StObject
  
  @js.native
  trait MinimizerWorker[T]
    extends StObject
       with typingsJapgolly.std.Worker {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    def minify(options: InternalOptions[T]): InternalResult = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    def transform(options: String): InternalResult = js.native
  }
  
  type Parallel = js.UndefOr[Boolean | Double]
  
  type Parser = typingsJapgolly.postcss.mod.Parser[default | typingsJapgolly.postcss.libDocumentMod.default]
  
  type ProcessOptions = typingsJapgolly.postcss.mod.ProcessOptions
  
  type ProcessOptionsExtender = ProcessOptions | From
  
  type RawSourceMap = typingsJapgolly.sourceMap.mod.RawSourceMap
  
  type Rule = js.RegExp | String
  
  type Rules = js.Array[Rule] | Rule
  
  type Schema = typingsJapgolly.schemaUtils.declarationsValidateMod.Schema
  
  type Stringifier = typingsJapgolly.postcss.mod.Stringifier
  
  type Syntax = typingsJapgolly.postcss.mod.Syntax
  
  type Warning = Errorpluginstringundefine | String
  
  trait WarningObject extends StObject {
    
    var column: js.UndefOr[Double] = js.undefined
    
    var line: js.UndefOr[Double] = js.undefined
    
    var message: String
    
    var plugin: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object WarningObject {
    
    inline def apply(message: String): WarningObject = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[WarningObject]
    }
    
    extension [Self <: WarningObject](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type WarningsFilter = js.Function3[
    /* warning */ Warning | WarningObject | String, 
    /* file */ String, 
    /* source */ js.UndefOr[String], 
    Boolean
  ]
  
  type WebpackError = typingsJapgolly.webpack.mod.WebpackError
}
