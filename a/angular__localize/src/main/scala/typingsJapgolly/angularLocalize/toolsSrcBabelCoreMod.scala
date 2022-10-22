package typingsJapgolly.angularLocalize

import typingsJapgolly.babelCore.mod.BabelFileResult
import typingsJapgolly.babelCore.mod.ParseResult
import typingsJapgolly.babelCore.mod.PluginPass
import typingsJapgolly.babelTraverse.anon.Container
import typingsJapgolly.babelTraverse.mod.Hub
import typingsJapgolly.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcBabelCoreMod {
  
  @JSImport("@angular/localize/tools/src/babel_core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object NodePath {
    
    @JSImport("@angular/localize/tools/src/babel_core", "NodePath")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get[C /* <: Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typingsJapgolly.babelTraverse.mod.NodePath[
        /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babelTraverse.mod.NodePath[
        /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
      ]]
  }
  type NodePath[T] = typingsJapgolly.babelCore.mod.NodePath[T]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/localize/tools/src/babel_core", "NodePath")
  @js.native
  open class NodePathCls[T] protected ()
    extends typingsJapgolly.babelCore.mod.NodePath[T] {
    def this(hub: Hub, parent: Node) = this()
  }
  
  inline def parseSync(code: String): ParseResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any]).asInstanceOf[ParseResult | Null]
  inline def parseSync(code: String, options: typingsJapgolly.babelCore.mod.TransformOptions): ParseResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult | Null]
  
  inline def transformFromAstSync(ast: typingsJapgolly.babelCore.mod.Node): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
  inline def transformFromAstSync(ast: typingsJapgolly.babelCore.mod.Node, code: String): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  inline def transformFromAstSync(
    ast: typingsJapgolly.babelCore.mod.Node,
    code: String,
    opts: typingsJapgolly.babelCore.mod.TransformOptions
  ): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  inline def transformFromAstSync(
    ast: typingsJapgolly.babelCore.mod.Node,
    code: Unit,
    opts: typingsJapgolly.babelCore.mod.TransformOptions
  ): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformFromAstSync")(ast.asInstanceOf[js.Any], code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  
  inline def transformSync(code: String): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
  inline def transformSync(code: String, opts: typingsJapgolly.babelCore.mod.TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  
  type ConfigAPI = typingsJapgolly.babelCore.mod.ConfigAPI
  
  type PluginObj = typingsJapgolly.babelCore.mod.PluginObj[PluginPass]
  
  type TransformOptions = typingsJapgolly.babelCore.mod.TransformOptions
}
