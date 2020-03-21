package typingsJapgolly.babelify.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babelCore.babelCoreStrings.`inline`
import typingsJapgolly.babelCore.babelCoreStrings.auto
import typingsJapgolly.babelCore.babelCoreStrings.both
import typingsJapgolly.babelCore.babelCoreStrings.enter
import typingsJapgolly.babelCore.babelCoreStrings.exit
import typingsJapgolly.babelCore.babelCoreStrings.module
import typingsJapgolly.babelCore.babelCoreStrings.script
import typingsJapgolly.babelCore.mod.TransformOptions
import typingsJapgolly.babelGenerator.mod.GeneratorOptions
import typingsJapgolly.babelTraverse.mod.Node
import typingsJapgolly.babelTraverse.mod.NodePath
import typingsJapgolly.babylon.mod.BabylonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelifyOptions extends TransformOptions {
  /** These are passed to babel.util.canCompile() for each filename
    * default: null
    */
  var extensions: js.UndefOr[String | js.Array[String]] = js.undefined
  /** if true, a 'sourceFileName' property with a value equal to the current file being transformed is included with the options passed to babel.transform()
    * default: false
    */
  var sourceMapsAbsolute: js.UndefOr[Boolean] = js.undefined
}

object BabelifyOptions {
  @scala.inline
  def apply(
    ast: js.UndefOr[Boolean] = js.undefined,
    auxiliaryCommentAfter: String = null,
    auxiliaryCommentBefore: String = null,
    babelrc: js.UndefOr[Boolean] = js.undefined,
    code: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    compact: Boolean | auto = null,
    env: js.Object = null,
    `extends`: String = null,
    extensions: String | js.Array[String] = null,
    filename: String = null,
    filenameRelative: String = null,
    generatorOpts: GeneratorOptions = null,
    getModuleId: /* moduleName */ String => CallbackTo[String] = null,
    highlightCode: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[String] = null,
    inputSourceMap: js.Object = null,
    minified: js.UndefOr[Boolean] = js.undefined,
    moduleId: String = null,
    moduleIds: js.UndefOr[Boolean] = js.undefined,
    moduleRoot: String = null,
    only: String | js.RegExp | (js.Array[String | js.RegExp]) = null,
    parserOpts: BabylonOptions = null,
    plugins: js.Array[_] = null,
    presets: js.Array[_] = null,
    resolveModuleSource: (/* source */ String, /* filename */ String) => CallbackTo[String] = null,
    retainLines: js.UndefOr[Boolean] = js.undefined,
    shouldPrintComment: /* comment */ String => CallbackTo[Boolean] = null,
    sourceFileName: String = null,
    sourceMapTarget: String = null,
    sourceMaps: Boolean | `inline` | both = null,
    sourceMapsAbsolute: js.UndefOr[Boolean] = js.undefined,
    sourceRoot: String = null,
    sourceType: script | module = null,
    wrapPluginVisitorMethod: (/* pluginAlias */ String, /* visitorType */ enter | exit, /* callback */ js.Function2[/* path */ NodePath[Node], /* state */ js.Any, Unit]) => CallbackTo[js.Function2[/* path */ NodePath[Node], js.Any, Unit]] = null
  ): BabelifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ast)) __obj.updateDynamic("ast")(ast.asInstanceOf[js.Any])
    if (auxiliaryCommentAfter != null) __obj.updateDynamic("auxiliaryCommentAfter")(auxiliaryCommentAfter.asInstanceOf[js.Any])
    if (auxiliaryCommentBefore != null) __obj.updateDynamic("auxiliaryCommentBefore")(auxiliaryCommentBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(babelrc)) __obj.updateDynamic("babelrc")(babelrc.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filenameRelative != null) __obj.updateDynamic("filenameRelative")(filenameRelative.asInstanceOf[js.Any])
    if (generatorOpts != null) __obj.updateDynamic("generatorOpts")(generatorOpts.asInstanceOf[js.Any])
    if (getModuleId != null) __obj.updateDynamic("getModuleId")(js.Any.fromFunction1((t0: /* moduleName */ java.lang.String) => getModuleId(t0).runNow()))
    if (!js.isUndefined(highlightCode)) __obj.updateDynamic("highlightCode")(highlightCode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (inputSourceMap != null) __obj.updateDynamic("inputSourceMap")(inputSourceMap.asInstanceOf[js.Any])
    if (!js.isUndefined(minified)) __obj.updateDynamic("minified")(minified.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (!js.isUndefined(moduleIds)) __obj.updateDynamic("moduleIds")(moduleIds.asInstanceOf[js.Any])
    if (moduleRoot != null) __obj.updateDynamic("moduleRoot")(moduleRoot.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (parserOpts != null) __obj.updateDynamic("parserOpts")(parserOpts.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (presets != null) __obj.updateDynamic("presets")(presets.asInstanceOf[js.Any])
    if (resolveModuleSource != null) __obj.updateDynamic("resolveModuleSource")(js.Any.fromFunction2((t0: /* source */ java.lang.String, t1: /* filename */ java.lang.String) => resolveModuleSource(t0, t1).runNow()))
    if (!js.isUndefined(retainLines)) __obj.updateDynamic("retainLines")(retainLines.asInstanceOf[js.Any])
    if (shouldPrintComment != null) __obj.updateDynamic("shouldPrintComment")(js.Any.fromFunction1((t0: /* comment */ java.lang.String) => shouldPrintComment(t0).runNow()))
    if (sourceFileName != null) __obj.updateDynamic("sourceFileName")(sourceFileName.asInstanceOf[js.Any])
    if (sourceMapTarget != null) __obj.updateDynamic("sourceMapTarget")(sourceMapTarget.asInstanceOf[js.Any])
    if (sourceMaps != null) __obj.updateDynamic("sourceMaps")(sourceMaps.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceMapsAbsolute)) __obj.updateDynamic("sourceMapsAbsolute")(sourceMapsAbsolute.asInstanceOf[js.Any])
    if (sourceRoot != null) __obj.updateDynamic("sourceRoot")(sourceRoot.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (wrapPluginVisitorMethod != null) __obj.updateDynamic("wrapPluginVisitorMethod")(js.Any.fromFunction3((t0: /* pluginAlias */ java.lang.String, t1: /* visitorType */ typingsJapgolly.babelCore.babelCoreStrings.enter | typingsJapgolly.babelCore.babelCoreStrings.exit, t2: /* callback */ js.Function2[
  /* path */ typingsJapgolly.babelTraverse.mod.NodePath[typingsJapgolly.babelTraverse.mod.Node], 
  /* state */ js.Any, 
  scala.Unit]) => wrapPluginVisitorMethod(t0, t1, t2).runNow()))
    __obj.asInstanceOf[BabelifyOptions]
  }
}

