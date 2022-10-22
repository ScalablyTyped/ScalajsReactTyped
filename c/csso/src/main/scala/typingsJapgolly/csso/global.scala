package typingsJapgolly.csso

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.cssTree.mod.CssNode
import typingsJapgolly.cssTree.mod.CssNodePlain
import typingsJapgolly.cssTree.mod.DefinitionSyntax_
import typingsJapgolly.cssTree.mod.EnterOrLeaveFn
import typingsJapgolly.cssTree.mod.FindFn
import typingsJapgolly.cssTree.mod.GenerateOptions
import typingsJapgolly.cssTree.mod.Keyword_
import typingsJapgolly.cssTree.mod.ParseOptions
import typingsJapgolly.cssTree.mod.Property_
import typingsJapgolly.cssTree.mod.WalkOptions
import typingsJapgolly.csso.anon.Ast
import typingsJapgolly.csso.anon.Typeofident
import typingsJapgolly.csso.anon.Typeofstring
import typingsJapgolly.csso.anon.Typeofurl
import typingsJapgolly.csso.mod.CompressOptions
import typingsJapgolly.csso.mod.MinifyOptions
import typingsJapgolly.csso.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object csso {
    
    @JSGlobal("csso")
    @js.native
    val ^ : js.Any = js.native
    
    inline def minify(source: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(source.asInstanceOf[js.Any]).asInstanceOf[Result]
    inline def minify(source: String, options: MinifyOptions & CompressOptions): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
    
    inline def minifyBlock(source: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("minifyBlock")(source.asInstanceOf[js.Any]).asInstanceOf[Result]
    inline def minifyBlock(source: String, options: MinifyOptions & CompressOptions): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("minifyBlock")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
    
    /* Inlined {readonly findAll (ast : css-tree.css-tree.CssNode, fn : css-tree.css-tree.FindFn): std.Array<css-tree.css-tree.CssNode>,  readonly url :{readonly decode (input : string): string, readonly encode (input : string): string},  readonly ident :{readonly decode (input : string): string, readonly encode (input : string): string}, readonly clone (node : css-tree.css-tree.CssNode): css-tree.css-tree.CssNode, readonly walk (ast : css-tree.css-tree.CssNode, options : css-tree.css-tree.EnterOrLeaveFn<css-tree.css-tree.CssNode>): void, readonly walk (ast : css-tree.css-tree.CssNode, options : css-tree.css-tree.WalkOptions): void,  readonly string :{readonly encode (input : string): string, readonly encode (input : string, apostrophe : boolean): string, readonly decode (input : string): string}, readonly find (ast : css-tree.css-tree.CssNode, fn : css-tree.css-tree.FindFn): css-tree.css-tree.CssNode, readonly findLast (ast : css-tree.css-tree.CssNode, fn : css-tree.css-tree.FindFn): css-tree.css-tree.CssNode,   List :new <TData>(): css-tree.css-tree.List<TData>, readonly keyword (value : string): css-tree.css-tree.Keyword, readonly generate (ast : css-tree.css-tree.CssNode): string, readonly generate (ast : css-tree.css-tree.CssNode, options : css-tree.css-tree.GenerateOptions): string,  readonly definitionSyntax :css-tree.css-tree.DefinitionSyntax, readonly property (value : string): css-tree.css-tree.Property, readonly fromPlainObject (node : css-tree.css-tree.CssNodePlain): css-tree.css-tree.CssNode, readonly toPlainObject (node : css-tree.css-tree.CssNode): css-tree.css-tree.CssNodePlain, readonly parse (text : string): css-tree.css-tree.CssNode, readonly parse (text : string, options : css-tree.css-tree.ParseOptions): css-tree.css-tree.CssNode} & {compress (ast : css-tree.css-tree.CssNode, options : csso.csso.CompressOptions | undefined): {  ast :css-tree.css-tree.CssNode}} */
    object syntax {
      
      @JSGlobal("csso.syntax")
      @js.native
      val ^ : js.Any = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("csso.syntax.List")
      @js.native
      open class List[TData] ()
        extends typingsJapgolly.cssTree.mod.List[TData]
      @JSGlobal("csso.syntax.List")
      @js.native
      def List: Instantiable0[typingsJapgolly.cssTree.mod.List[js.Object]] = js.native
      inline def List_=(x: Instantiable0[typingsJapgolly.cssTree.mod.List[js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("List")(x.asInstanceOf[js.Any])
      
      inline def clone_(node: CssNode): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(node.asInstanceOf[js.Any]).asInstanceOf[CssNode]
      
      /**
        * Does the main task – compress an AST.
        */
      inline def compress(ast: CssNode): Ast = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(ast.asInstanceOf[js.Any]).asInstanceOf[Ast]
      inline def compress(ast: CssNode, options: CompressOptions): Ast = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Ast]
      
      @JSGlobal("csso.syntax.definitionSyntax")
      @js.native
      val definitionSyntax: DefinitionSyntax_ = js.native
      
      inline def find(ast: CssNode, fn: FindFn): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[CssNode]
      
      inline def findAll(ast: CssNode, fn: FindFn): js.Array[CssNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[CssNode]]
      
      inline def findLast(ast: CssNode, fn: FindFn): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("findLast")(ast.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[CssNode]
      
      inline def fromPlainObject(node: CssNodePlain): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[CssNode]
      
      inline def generate(ast: CssNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def generate(ast: CssNode, options: GenerateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
      
      @JSGlobal("csso.syntax.ident")
      @js.native
      val ident: Typeofident = js.native
      
      inline def keyword(value: String): Keyword_ = ^.asInstanceOf[js.Dynamic].applyDynamic("keyword")(value.asInstanceOf[js.Any]).asInstanceOf[Keyword_]
      
      inline def parse(text: String): CssNode = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[CssNode]
      inline def parse(text: String, options: ParseOptions): CssNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CssNode]
      
      inline def property(value: String): Property_ = ^.asInstanceOf[js.Dynamic].applyDynamic("property")(value.asInstanceOf[js.Any]).asInstanceOf[Property_]
      
      @JSGlobal("csso.syntax.string")
      @js.native
      val string: Typeofstring = js.native
      
      inline def toPlainObject(node: CssNode): CssNodePlain = ^.asInstanceOf[js.Dynamic].applyDynamic("toPlainObject")(node.asInstanceOf[js.Any]).asInstanceOf[CssNodePlain]
      
      @JSGlobal("csso.syntax.url")
      @js.native
      val url: Typeofurl = js.native
      
      inline def walk(ast: CssNode, options: EnterOrLeaveFn[CssNode]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def walk(ast: CssNode, options: WalkOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    @JSGlobal("csso.version")
    @js.native
    val version: String = js.native
  }
}
