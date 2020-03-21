package typingsJapgolly.babelCore.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babelCore.babelCoreBooleans.`false`
import typingsJapgolly.babelCore.babelCoreBooleans.`true`
import typingsJapgolly.babelCore.babelCoreStrings.`inline`
import typingsJapgolly.babelCore.babelCoreStrings.`upward-optional`
import typingsJapgolly.babelCore.babelCoreStrings.auto
import typingsJapgolly.babelCore.babelCoreStrings.both
import typingsJapgolly.babelCore.babelCoreStrings.enter
import typingsJapgolly.babelCore.babelCoreStrings.exit
import typingsJapgolly.babelCore.babelCoreStrings.module
import typingsJapgolly.babelCore.babelCoreStrings.root
import typingsJapgolly.babelCore.babelCoreStrings.script
import typingsJapgolly.babelCore.babelCoreStrings.unambiguous
import typingsJapgolly.babelCore.babelCoreStrings.upward
import typingsJapgolly.babelGenerator.mod.GeneratorOptions
import typingsJapgolly.babelParser.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends js.Object {
  /**
    * Include the AST in the returned object
    *
    * Default: `false`
    */
  var ast: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Attach a comment after all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentAfter: js.UndefOr[String | Null] = js.undefined
  /**
    * Attach a comment before all non-user injected code
    *
    * Default: `null`
    */
  var auxiliaryCommentBefore: js.UndefOr[String | Null] = js.undefined
  /**
    * Specify whether or not to use .babelrc and
    * .babelignore files.
    *
    * Default: `true`
    */
  var babelrc: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Specify which packages should be search for .babelrc files when they are being compiled. `true` to always search, or a path string or an array of paths to packages to search
    * inside of. Defaults to only searching the "root" package.
    *
    * Default: `(root)`
    */
  var babelrcRoots: js.UndefOr[`true` | String | js.Array[String] | Null] = js.undefined
  /**
    * Utilities may pass a caller object to identify themselves to Babel and
    * pass capability-related flags for use by configs, presets and plugins.
    *
    * @see https://babeljs.io/docs/en/next/options#caller
    */
  var caller: js.UndefOr[TransformCaller] = js.undefined
  /**
    * Enable code generation
    *
    * Default: `true`
    */
  var code: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Output comments in generated output
    *
    * Default: `true`
    */
  var comments: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Do not include superfluous whitespace characters and line terminators. When set to `"auto"` compact is set to `true` on input sizes of >500KB
    *
    * Default: `"auto"`
    */
  var compact: js.UndefOr[Boolean | auto | Null] = js.undefined
  /**
    * The config file to load Babel's config from. Defaults to searching for "babel.config.js" inside the "root" folder. `false` will disable searching for config files.
    *
    * Default: `undefined`
    */
  var configFile: js.UndefOr[String | `false` | Null] = js.undefined
  /**
    * The working directory that Babel's programmatic options are loaded relative to.
    *
    * Default: `"."`
    */
  var cwd: js.UndefOr[String | Null] = js.undefined
  /**
    * This is an object of keys that represent different environments. For example, you may have: `{ env: { production: { \/ * specific options *\/ } } }`
    * which will use those options when the `envName` is `production`
    *
    * Default: `{}`
    */
  var env: js.UndefOr[(StringDictionary[js.UndefOr[TransformOptions | Null]]) | Null] = js.undefined
  /**
    * Defaults to environment variable `BABEL_ENV` if set, or else `NODE_ENV` if set, or else it defaults to `"development"`
    *
    * Default: env vars
    */
  var envName: js.UndefOr[String] = js.undefined
  /**
    * If any of patterns match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var exclude: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  /**
    * A path to a `.babelrc` file to extend
    *
    * Default: `null`
    */
  var `extends`: js.UndefOr[String | Null] = js.undefined
  /**
    * Filename for use in errors etc
    *
    * Default: `"unknown"`
    */
  var filename: js.UndefOr[String | Null] = js.undefined
  /**
    * Filename relative to `sourceRoot`
    *
    * Default: `(filename)`
    */
  var filenameRelative: js.UndefOr[String | Null] = js.undefined
  /**
    * An object containing the options to be passed down to the babel code generator, @babel/generator
    *
    * Default: `{}`
    */
  var generatorOpts: js.UndefOr[GeneratorOptions | Null] = js.undefined
  /**
    * Specify a custom callback to generate a module id with. Called as `getModuleId(moduleName)`. If falsy value is returned then the generated module id is used
    *
    * Default: `null`
    */
  var getModuleId: js.UndefOr[(js.Function1[/* moduleName */ String, js.UndefOr[String | Null]]) | Null] = js.undefined
  /**
    * ANSI highlight syntax error code frames
    *
    * Default: `true`
    */
  var highlightCode: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Opposite to the `only` option. `ignore` is disregarded if `only` is specified
    *
    * Default: `null`
    */
  var ignore: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * This option is a synonym for "test"
    */
  var include: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  /**
    * A source map object that the output source map will be based on
    *
    * Default: `null`
    */
  var inputSourceMap: js.UndefOr[js.Object | Null] = js.undefined
  /**
    * Should the output be minified (not printing last semicolons in blocks, printing literal string values instead of escaped ones, stripping `()` from `new` when safe)
    *
    * Default: `false`
    */
  var minified: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Specify a custom name for module ids
    *
    * Default: `null`
    */
  var moduleId: js.UndefOr[String | Null] = js.undefined
  /**
    * If truthy, insert an explicit id for modules. By default, all modules are anonymous. (Not available for `common` modules)
    *
    * Default: `false`
    */
  var moduleIds: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Optional prefix for the AMD module formatter that will be prepend to the filename on module definitions
    *
    * Default: `(sourceRoot)`
    */
  var moduleRoot: js.UndefOr[String | Null] = js.undefined
  /**
    * A glob, regex, or mixed array of both, matching paths to **only** compile. Can also be an array of arrays containing paths to explicitly match. When attempting to compile
    * a non-matching file it's returned verbatim
    *
    * Default: `null`
    */
  var only: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp]) | Null] = js.undefined
  /**
    * Allows users to provide an array of options that will be merged into the current configuration one at a time.
    * This feature is best used alongside the "test"/"include"/"exclude" options to provide conditions for which an override should apply
    */
  var overrides: js.UndefOr[js.Array[TransformOptions]] = js.undefined
  /**
    * An object containing the options to be passed down to the babel parser, @babel/parser
    *
    * Default: `{}`
    */
  var parserOpts: js.UndefOr[ParserOptions | Null] = js.undefined
  /**
    * List of plugins to load and use
    *
    * Default: `[]`
    */
  var plugins: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
  /**
    * List of presets (a set of plugins) to load and use
    *
    * Default: `[]`
    */
  var presets: js.UndefOr[js.Array[PluginItem] | Null] = js.undefined
  /**
    * Retain line numbers. This will lead to wacky code but is handy for scenarios where you can't use source maps. (**NOTE**: This will not retain the columns)
    *
    * Default: `false`
    */
  var retainLines: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * Specify the "root" folder that defines the location to search for "babel.config.js", and the default folder to allow `.babelrc` files inside of.
    *
    * Default: `"."`
    */
  var root: js.UndefOr[String | Null] = js.undefined
  /**
    * This option, combined with the "root" value, defines how Babel chooses its project root.
    * The different modes define different ways that Babel can process the "root" value to get
    * the final project root.
    *
    * @see https://babeljs.io/docs/en/next/options#rootmode
    */
  var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.undefined
  /**
    * An optional callback that controls whether a comment should be output or not. Called as `shouldPrintComment(commentContents)`. **NOTE**: This overrides the `comment` option when used
    *
    * Default: `null`
    */
  var shouldPrintComment: js.UndefOr[(js.Function1[/* commentContents */ String, Boolean]) | Null] = js.undefined
  /**
    * Set `sources[0]` on returned source map
    *
    * Default: `(filenameRelative)`
    */
  var sourceFileName: js.UndefOr[String | Null] = js.undefined
  /**
    * If truthy, adds a `map` property to returned output. If set to `"inline"`, a comment with a sourceMappingURL directive is added to the bottom of the returned code. If set to `"both"`
    * then a `map` property is returned as well as a source map comment appended. **This does not emit sourcemap files by itself!**
    *
    * Default: `false`
    */
  var sourceMaps: js.UndefOr[Boolean | `inline` | both | Null] = js.undefined
  /**
    * The root from which all sources are relative
    *
    * Default: `(moduleRoot)`
    */
  var sourceRoot: js.UndefOr[String | Null] = js.undefined
  /**
    * Indicate the mode the code should be parsed in. Can be one of "script", "module", or "unambiguous". `"unambiguous"` will make Babel attempt to guess, based on the presence of ES6
    * `import` or `export` statements. Files with ES6 `import`s and `export`s are considered `"module"` and are otherwise `"script"`.
    *
    * Default: `("module")`
    */
  var sourceType: js.UndefOr[script | module | unambiguous | Null] = js.undefined
  /**
    * If all patterns fail to match, the current configuration object is considered inactive and is ignored during config processing.
    */
  var test: js.UndefOr[MatchPattern | js.Array[MatchPattern]] = js.undefined
  /**
    * An optional callback that can be used to wrap visitor methods. **NOTE**: This is useful for things like introspection, and not really needed for implementing anything. Called as
    * `wrapPluginVisitorMethod(pluginAlias, visitorType, callback)`.
    */
  var wrapPluginVisitorMethod: js.UndefOr[
    (js.Function3[
      /* pluginAlias */ String, 
      /* visitorType */ enter | exit, 
      /* callback */ js.Function2[
        /* path */ typingsJapgolly.babelTraverse.mod.NodePath[typingsJapgolly.babelTraverse.mod.Node], 
        /* state */ js.Any, 
        Unit
      ], 
      js.Function2[
        /* path */ typingsJapgolly.babelTraverse.mod.NodePath[typingsJapgolly.babelTraverse.mod.Node], 
        /* state */ _, 
        Unit
      ]
    ]) | Null
  ] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    ast: js.UndefOr[Boolean] = js.undefined,
    auxiliaryCommentAfter: String = null,
    auxiliaryCommentBefore: String = null,
    babelrc: js.UndefOr[Boolean] = js.undefined,
    babelrcRoots: `true` | String | js.Array[String] = null,
    caller: TransformCaller = null,
    code: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    compact: Boolean | auto = null,
    configFile: String | `false` = null,
    cwd: String = null,
    env: StringDictionary[js.UndefOr[TransformOptions | Null]] = null,
    envName: String = null,
    exclude: MatchPattern | js.Array[MatchPattern] = null,
    `extends`: String = null,
    filename: String = null,
    filenameRelative: String = null,
    generatorOpts: GeneratorOptions = null,
    getModuleId: /* moduleName */ String => CallbackTo[js.UndefOr[String | Null]] = null,
    highlightCode: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[String] = null,
    include: MatchPattern | js.Array[MatchPattern] = null,
    inputSourceMap: js.Object = null,
    minified: js.UndefOr[Boolean] = js.undefined,
    moduleId: String = null,
    moduleIds: js.UndefOr[Boolean] = js.undefined,
    moduleRoot: String = null,
    only: String | js.RegExp | (js.Array[String | js.RegExp]) = null,
    overrides: js.Array[TransformOptions] = null,
    parserOpts: ParserOptions = null,
    plugins: js.Array[PluginItem] = null,
    presets: js.Array[PluginItem] = null,
    retainLines: js.UndefOr[Boolean] = js.undefined,
    root: String = null,
    rootMode: root | upward | `upward-optional` = null,
    shouldPrintComment: /* commentContents */ String => CallbackTo[Boolean] = null,
    sourceFileName: String = null,
    sourceMaps: Boolean | `inline` | both = null,
    sourceRoot: String = null,
    sourceType: script | module | unambiguous = null,
    test: MatchPattern | js.Array[MatchPattern] = null,
    wrapPluginVisitorMethod: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[
      /* path */ typingsJapgolly.babelTraverse.mod.NodePath[typingsJapgolly.babelTraverse.mod.Node], 
      /* state */ js.Any, 
      Unit
    ]) => CallbackTo[
      js.Function2[
        /* path */ typingsJapgolly.babelTraverse.mod.NodePath[typingsJapgolly.babelTraverse.mod.Node], 
        js.Any, 
        Unit
      ]
    ] = null
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter.asInstanceOf[js.Any])
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(babelrc)) __obj.updateDynamic("babelrc")(babelrc.asInstanceOf[js.Any])
    if (babelrcRoots != null) __obj.updateDynamic("babelrcRoots")(babelrcRoots.asInstanceOf[js.Any])
    if (caller != null) __obj.updateDynamic("caller")(caller.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (configFile != null) __obj.updateDynamic("configFile")(configFile.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (envName != null) __obj.updateDynamic("envName")(envName.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filenameRelative != null) __obj.updateDynamic("filenameRelative")(filenameRelative.asInstanceOf[js.Any])
    if (generatorOpts != null) __obj.updateDynamic("generatorOpts")(generatorOpts.asInstanceOf[js.Any])
    if (getModuleId != null) __obj.updateDynamic("getModuleId")(js.Any.fromFunction1((t0: /* moduleName */ java.lang.String) => getModuleId(t0).runNow()))
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(minified)) __obj.updateDynamic("minified")(minified.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleIds)) __obj.updateDynamic("moduleIds")(moduleIds.asInstanceOf[js.Any])
    if (moduleRoot != null) __obj.updateDynamic("moduleRoot")(moduleRoot.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (parserOpts != null) __obj.updateDynamic("parserOpts")(parserOpts.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (rootMode != null) __obj.updateDynamic("rootMode")(rootMode.asInstanceOf[js.Any])
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(js.Any.fromFunction1((t0: /* commentContents */ java.lang.String) => shouldPrintComment(t0).runNow()))
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName.asInstanceOf[js.Any])
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (wrapPluginVisitorMethod != null) __obj.updateDynamic("wrapPluginVisitorMethod")(js.Any.fromFunction3((t0: /* pluginAlias */ java.lang.String, t1: /* visitorType */ typingsJapgolly.babelCore.babelCoreStrings.enter | typingsJapgolly.babelCore.babelCoreStrings.exit, t2: /* callback */ js.Function2[
  /* path */ typingsJapgolly.babelTraverse.mod.NodePath[typingsJapgolly.babelTraverse.mod.Node], 
  /* state */ js.Any, 
  scala.Unit]) => wrapPluginVisitorMethod(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TransformOptions]
  }
}

