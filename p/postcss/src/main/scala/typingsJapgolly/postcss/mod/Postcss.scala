package typingsJapgolly.postcss.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable6
import typingsJapgolly.postcss.anon.PickProcessOptionsmapfrom
import typingsJapgolly.postcss.anon.ToString
import typingsJapgolly.postcss.libAtRuleMod.AtRuleProps
import typingsJapgolly.postcss.libCommentMod.CommentProps
import typingsJapgolly.postcss.libCssSyntaxErrorMod.RangePosition
import typingsJapgolly.postcss.libDeclarationMod.DeclarationProps
import typingsJapgolly.postcss.libDocumentMod.DocumentProps
import typingsJapgolly.postcss.libNodeMod.AnyNode
import typingsJapgolly.postcss.libResultMod.ResultOptions
import typingsJapgolly.postcss.libRootMod.RootProps
import typingsJapgolly.postcss.libRuleMod.RuleProps
import typingsJapgolly.postcss.libWarningMod.WarningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Postcss extends StObject {
  
  /**
    * Create a new `Processor` instance that will apply `plugins`
    * as CSS processors.
    *
    * ```js
    * let postcss = require('postcss')
    *
    * postcss(plugins).process(css, { from, to }).then(result => {
    *   console.log(result.css)
    * })
    * ```
    *
    * @param plugins PostCSS plugins.
    * @return Processor to process multiple CSS.
    */
  def apply(): typingsJapgolly.postcss.libProcessorMod.default = js.native
  def apply(plugins: AcceptedPlugin*): typingsJapgolly.postcss.libProcessorMod.default = js.native
  def apply(plugins: js.Array[AcceptedPlugin]): typingsJapgolly.postcss.libProcessorMod.default = js.native
  
  var AtRule: Instantiable1[
    /* defaults */ js.UndefOr[AtRuleProps], 
    typingsJapgolly.postcss.libAtRuleMod.default
  ] = js.native
  
  var Comment: Instantiable1[
    /* defaults */ js.UndefOr[CommentProps], 
    typingsJapgolly.postcss.libCommentMod.default
  ] = js.native
  
  var Container: Instantiable0[
    typingsJapgolly.postcss.libContainerMod.default[typingsJapgolly.postcss.libNodeMod.default]
  ] = js.native
  
  var CssSyntaxError: Instantiable6[
    /* message */ String, 
    /* lineOrStartPos */ js.UndefOr[Double | RangePosition], 
    /* columnOrEndPos */ js.UndefOr[Double | RangePosition], 
    /* source */ js.UndefOr[String], 
    /* file */ js.UndefOr[String], 
    /* plugin */ js.UndefOr[String], 
    typingsJapgolly.postcss.libCssSyntaxErrorMod.default
  ] = js.native
  
  var Declaration: Instantiable1[
    /* defaults */ js.UndefOr[DeclarationProps], 
    typingsJapgolly.postcss.libDeclarationMod.default
  ] = js.native
  
  var Input: Instantiable2[
    /* css */ String, 
    /* opts */ js.UndefOr[ProcessOptions], 
    typingsJapgolly.postcss.libInputMod.default
  ] = js.native
  
  var Node: Instantiable1[/* defaults */ js.UndefOr[js.Object], typingsJapgolly.postcss.libNodeMod.default] = js.native
  
  var Result: Instantiable3[
    /* processor */ typingsJapgolly.postcss.libProcessorMod.default, 
    /* root */ Root_ | Document, 
    /* opts */ ResultOptions, 
    typingsJapgolly.postcss.libResultMod.default
  ] = js.native
  
  var Root: Instantiable1[/* defaults */ js.UndefOr[RootProps], typingsJapgolly.postcss.libRootMod.default] = js.native
  
  var Rule: Instantiable1[/* defaults */ js.UndefOr[RuleProps], typingsJapgolly.postcss.libRuleMod.default] = js.native
  
  var Warning: Instantiable2[
    /* text */ String, 
    /* opts */ js.UndefOr[WarningOptions], 
    typingsJapgolly.postcss.libWarningMod.default
  ] = js.native
  
  /**
    * Creates a new `AtRule` node.
    *
    * @param defaults Properties for the new node.
    * @return New at-rule node.
    */
  def atRule(): typingsJapgolly.postcss.libAtRuleMod.default = js.native
  def atRule(defaults: AtRuleProps): typingsJapgolly.postcss.libAtRuleMod.default = js.native
  
  /**
    * Creates a new `Comment` node.
    *
    * @param defaults Properties for the new node.
    * @return New comment node
    */
  def comment(): typingsJapgolly.postcss.libCommentMod.default = js.native
  def comment(defaults: CommentProps): typingsJapgolly.postcss.libCommentMod.default = js.native
  
  /**
    * Creates a new `Declaration` node.
    *
    * @param defaults Properties for the new node.
    * @return New declaration node.
    */
  def decl(): typingsJapgolly.postcss.libDeclarationMod.default = js.native
  def decl(defaults: DeclarationProps): typingsJapgolly.postcss.libDeclarationMod.default = js.native
  
  /**
    * Creates a new `Document` node.
    *
    * @param defaults Properties for the new node.
    * @return New document node.
    */
  def document(): typingsJapgolly.postcss.libDocumentMod.default = js.native
  def document(defaults: DocumentProps): typingsJapgolly.postcss.libDocumentMod.default = js.native
  
  /**
    * Rehydrate a JSON AST (from `Node#toJSON`) back into the AST classes.
    *
    * ```js
    * const json = root.toJSON()
    * // save to file, send by network, etc
    * const root2  = postcss.fromJSON(json)
    * ```
    */
  def fromJSON(data: js.Array[js.Object]): js.Array[typingsJapgolly.postcss.libNodeMod.default] = js.native
  /**
    * Rehydrate a JSON AST (from `Node#toJSON`) back into the AST classes.
    *
    * ```js
    * const json = root.toJSON()
    * // save to file, send by network, etc
    * const root2  = postcss.fromJSON(json)
    * ```
    */
  def fromJSON(data: js.Object): typingsJapgolly.postcss.libNodeMod.default = js.native
  /**
    * Rehydrate a JSON AST (from `Node#toJSON`) back into the AST classes.
    *
    * ```js
    * const json = root.toJSON()
    * // save to file, send by network, etc
    * const root2  = postcss.fromJSON(json)
    * ```
    */
  @JSName("fromJSON")
  var fromJSON_Original: JSONHydrator = js.native
  
  /**
    * Contains the `list` module.
    */
  var list: typingsJapgolly.postcss.libListMod.List = js.native
  
  /**
    * Parses source css and returns a new `Root` or `Document` node,
    * which contains the source CSS nodes.
    *
    * ```js
    * // Simple CSS concatenation with source map support
    * const root1 = postcss.parse(css1, { from: file1 })
    * const root2 = postcss.parse(css2, { from: file2 })
    * root1.append(root2).toResult().css
    * ```
    */
  def parse(css: String): typingsJapgolly.postcss.libRootMod.default = js.native
  def parse(css: String, opts: PickProcessOptionsmapfrom): typingsJapgolly.postcss.libRootMod.default = js.native
  def parse(css: ToString): typingsJapgolly.postcss.libRootMod.default = js.native
  def parse(css: ToString, opts: PickProcessOptionsmapfrom): typingsJapgolly.postcss.libRootMod.default = js.native
  /**
    * Parses source css and returns a new `Root` or `Document` node,
    * which contains the source CSS nodes.
    *
    * ```js
    * // Simple CSS concatenation with source map support
    * const root1 = postcss.parse(css1, { from: file1 })
    * const root2 = postcss.parse(css2, { from: file2 })
    * root1.append(root2).toResult().css
    * ```
    */
  @JSName("parse")
  var parse_Original: Parser[typingsJapgolly.postcss.libRootMod.default] = js.native
  
  /**
    * Creates a new `Root` node.
    *
    * @param defaults Properties for the new node.
    * @return New root node.
    */
  def root(): typingsJapgolly.postcss.libRootMod.default = js.native
  def root(defaults: RootProps): typingsJapgolly.postcss.libRootMod.default = js.native
  
  /**
    * Creates a new `Rule` node.
    *
    * @param default Properties for the new node.
    * @return New rule node.
    */
  def rule(): typingsJapgolly.postcss.libRuleMod.default = js.native
  def rule(defaults: RuleProps): typingsJapgolly.postcss.libRuleMod.default = js.native
  
  /**
    * Default function to convert a node tree into a CSS string.
    */
  def stringify(node: AnyNode, builder: Builder): Unit = js.native
  /**
    * Default function to convert a node tree into a CSS string.
    */
  @JSName("stringify")
  var stringify_Original: Stringifier = js.native
}
