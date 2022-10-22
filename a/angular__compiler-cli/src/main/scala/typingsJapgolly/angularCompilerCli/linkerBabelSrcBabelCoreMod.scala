package typingsJapgolly.angularCompilerCli

import typingsJapgolly.babelCore.mod.BabelFileResult
import typingsJapgolly.babelCore.mod.FileParseCallback
import typingsJapgolly.babelCore.mod.ParseResult
import typingsJapgolly.babelCore.mod.PluginPass
import typingsJapgolly.babelCore.mod.TransformOptions
import typingsJapgolly.babelTraverse.anon.Container
import typingsJapgolly.babelTraverse.mod.Hub
import typingsJapgolly.babelTypes.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerBabelSrcBabelCoreMod {
  
  @JSImport("@angular/compiler-cli/linker/babel/src/babel_core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object NodePath {
    
    @JSImport("@angular/compiler-cli/linker/babel/src/babel_core", "NodePath")
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
  @JSImport("@angular/compiler-cli/linker/babel/src/babel_core", "NodePath")
  @js.native
  open class NodePathCls[T] protected ()
    extends typingsJapgolly.babelCore.mod.NodePath[T] {
    def this(hub: Hub, parent: Node) = this()
  }
  
  inline def parse(code: String): ParseResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any]).asInstanceOf[ParseResult | Null]
  inline def parse(code: String, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(code: String, options: Unit, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(code: String, options: TransformOptions): ParseResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParseResult | Null]
  inline def parse(code: String, options: TransformOptions, callback: FileParseCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transformSync(code: String): BabelFileResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any]).asInstanceOf[BabelFileResult | Null]
  inline def transformSync(code: String, opts: TransformOptions): BabelFileResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("transformSync")(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[BabelFileResult | Null]
  
  type BabelFile = typingsJapgolly.babelCore.mod.BabelFile
  
  type ConfigAPI = typingsJapgolly.babelCore.mod.ConfigAPI
  
  type PluginObj = typingsJapgolly.babelCore.mod.PluginObj[PluginPass]
}
