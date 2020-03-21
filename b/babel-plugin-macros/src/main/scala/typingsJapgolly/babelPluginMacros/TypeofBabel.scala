package typingsJapgolly.babelPluginMacros

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.babelCore.ReadonlyPartialConfig
import typingsJapgolly.babelCore.mod.BabelFileResult
import typingsJapgolly.babelCore.mod.ConfigItem
import typingsJapgolly.babelCore.mod.CreateConfigItemOptions
import typingsJapgolly.babelCore.mod.FileParseCallback
import typingsJapgolly.babelCore.mod.FileResultCallback
import typingsJapgolly.babelCore.mod.ParseResult
import typingsJapgolly.babelCore.mod.PluginOptions
import typingsJapgolly.babelCore.mod.PluginTarget
import typingsJapgolly.babelCore.mod.TransformOptions
import typingsJapgolly.babelPluginMacros.babelPluginMacrosStrings.Dotes
import typingsJapgolly.babelPluginMacros.babelPluginMacrosStrings.Dotes6
import typingsJapgolly.babelPluginMacros.babelPluginMacrosStrings.Dotjs
import typingsJapgolly.babelPluginMacros.babelPluginMacrosStrings.Dotjsx
import typingsJapgolly.babelPluginMacros.babelPluginMacrosStrings.Dotmjs
import typingsJapgolly.babelTemplate.mod.DefaultTemplateBuilder
import typingsJapgolly.babelTemplate.mod.PublicReplacements
import typingsJapgolly.babelTemplate.mod.TemplateBuilder
import typingsJapgolly.babelTemplate.mod.TemplateBuilderOptions
import typingsJapgolly.babelTraverse.mod.Hub
import typingsJapgolly.babelTraverse.mod.Node
import typingsJapgolly.babelTraverse.mod.NodePath
import typingsJapgolly.babelTraverse.mod.Scope
import typingsJapgolly.babelTraverse.mod.TraverseOptions
import typingsJapgolly.babelTypes.mod.Statement
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofBabel extends js.Object {
  val DEFAULT_EXTENSIONS: js.Tuple5[Dotjs, Dotjsx, Dotes6, Dotes, Dotmjs] = js.native
  var NodePath: Instantiable2[/* hub */ Hub, /* parent */ Node, typingsJapgolly.babelCore.mod.NodePath[js.Object]] = js.native
  @JSName("template")
  val template_Original: DefaultTemplateBuilder = js.native
  val types: Typeoftypes = js.native
  val version: String = js.native
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions]): ConfigItem = js.native
  def createConfigItem(value: js.Tuple2[PluginTarget, PluginOptions], options: CreateConfigItemOptions): ConfigItem = js.native
  def createConfigItem(value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]]): ConfigItem = js.native
  def createConfigItem(
    value: js.Tuple3[PluginTarget, PluginOptions, js.UndefOr[String]],
    options: CreateConfigItemOptions
  ): ConfigItem = js.native
  def createConfigItem(value: PluginTarget): ConfigItem = js.native
  def createConfigItem(value: PluginTarget, options: CreateConfigItemOptions): ConfigItem = js.native
  def loadOptions(): js.Object | Null = js.native
  def loadOptions(options: TransformOptions): js.Object | Null = js.native
  def loadPartialConfig(): ReadonlyPartialConfig | Null = js.native
  def loadPartialConfig(options: TransformOptions): ReadonlyPartialConfig | Null = js.native
  def parse(code: String): ParseResult | Null = js.native
  def parse(code: String, callback: FileParseCallback): Unit = js.native
  def parse(code: String, options: js.UndefOr[scala.Nothing], callback: FileParseCallback): Unit = js.native
  def parse(code: String, options: TransformOptions): ParseResult | Null = js.native
  def parse(code: String, options: TransformOptions, callback: FileParseCallback): Unit = js.native
  def parseAsync(code: String): js.Promise[ParseResult | Null] = js.native
  def parseAsync(code: String, options: TransformOptions): js.Promise[ParseResult | Null] = js.native
  def parseSync(code: String): ParseResult | Null = js.native
  def parseSync(code: String, options: TransformOptions): ParseResult | Null = js.native
  def resolvePlugin(name: String, dirname: String): String | Null = js.native
  def resolvePreset(name: String, dirname: String): String | Null = js.native
  /**
    * Building from a string produces an AST builder function by default.
    */
  def template(code: String): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  def template(code: String, opts: TemplateBuilderOptions): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  /**
    * Build a new builder, merging the given options with the previous ones.
    */
  def template(opts: TemplateBuilderOptions): TemplateBuilder[Statement | js.Array[Statement]] = js.native
  /**
    * Building from a template literal produces an AST builder function by default.
    */
  def template(tpl: TemplateStringsArray, args: js.Any*): js.Function1[/* arg */ js.UndefOr[PublicReplacements], Statement | js.Array[Statement]] = js.native
  def transform(code: String): BabelFileResult | Null = js.native
  def transform(code: String, callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transform(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transform(code: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformAsync(code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformAsync(code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFile(filename: String, callback: FileResultCallback): Unit = js.native
  def transformFile(filename: String, opts: js.UndefOr[scala.Nothing], callback: FileResultCallback): Unit = js.native
  def transformFile(filename: String, opts: TransformOptions, callback: FileResultCallback): Unit = js.native
  def transformFileAsync(filename: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFileAsync(filename: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFileSync(filename: String): BabelFileResult | Null = js.native
  def transformFileSync(filename: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformFromAst(
    ast: typingsJapgolly.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(
    ast: typingsJapgolly.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(
    ast: typingsJapgolly.babelCore.mod.Node,
    code: js.UndefOr[scala.Nothing],
    opts: TransformOptions,
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(ast: typingsJapgolly.babelCore.mod.Node, code: String, callback: FileResultCallback): Unit = js.native
  def transformFromAst(
    ast: typingsJapgolly.babelCore.mod.Node,
    code: String,
    opts: js.UndefOr[scala.Nothing],
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAst(
    ast: typingsJapgolly.babelCore.mod.Node,
    code: String,
    opts: TransformOptions,
    callback: FileResultCallback
  ): Unit = js.native
  def transformFromAstAsync(ast: typingsJapgolly.babelCore.mod.Node): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: typingsJapgolly.babelCore.mod.Node, code: String): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstAsync(ast: typingsJapgolly.babelCore.mod.Node, code: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
  def transformFromAstSync(ast: typingsJapgolly.babelCore.mod.Node): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: typingsJapgolly.babelCore.mod.Node, code: String): BabelFileResult | Null = js.native
  def transformFromAstSync(ast: typingsJapgolly.babelCore.mod.Node, code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def transformSync(code: String): BabelFileResult | Null = js.native
  def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node]): Unit = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def traverse(parent: js.Array[Node], opts: TraverseOptions[Node], scope: Scope, state: js.Any): Unit = js.native
  def traverse(
    parent: js.Array[Node],
    opts: TraverseOptions[Node],
    scope: Scope,
    state: js.Any,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node]): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: js.Any): Unit = js.native
  def traverse(parent: Node, opts: TraverseOptions[Node], scope: Scope, state: js.Any, parentPath: NodePath[Node]): Unit = js.native
  def traverse[S](parent: js.Array[Node], opts: TraverseOptions[S], scope: js.UndefOr[scala.Nothing], state: S): Unit = js.native
  def traverse[S](
    parent: js.Array[Node],
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse[S](parent: js.Array[Node], opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def traverse[S](
    parent: js.Array[Node],
    opts: TraverseOptions[S],
    scope: Scope,
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse[S](parent: Node, opts: TraverseOptions[S], scope: js.UndefOr[scala.Nothing], state: S): Unit = js.native
  def traverse[S](
    parent: Node,
    opts: TraverseOptions[S],
    scope: js.UndefOr[scala.Nothing],
    state: S,
    parentPath: NodePath[Node]
  ): Unit = js.native
  def traverse[S](parent: Node, opts: TraverseOptions[S], scope: Scope, state: S): Unit = js.native
  def traverse[S](parent: Node, opts: TraverseOptions[S], scope: Scope, state: S, parentPath: NodePath[Node]): Unit = js.native
}

