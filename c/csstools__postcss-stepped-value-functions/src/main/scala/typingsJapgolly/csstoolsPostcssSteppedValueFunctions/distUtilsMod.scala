package typingsJapgolly.csstoolsPostcssSteppedValueFunctions

import org.scalajs.dom.Node
import typingsJapgolly.csstoolsPostcssSteppedValueFunctions.mod.pluginOptions
import typingsJapgolly.postcss.mod.Declaration
import typingsJapgolly.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("@csstools/postcss-stepped-value-functions/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def functionNodeToWordNode(
    fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionNodeToWordNode")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isVarNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVarNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def optionallyWarn(decl: Declaration, result: Result, message: String, options: pluginOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("optionallyWarn")(decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateArgumentsAndTypes(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any,
    decl: Declaration,
    result: Result,
    options: pluginOptions
  ): js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valueParser.Dimension */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgumentsAndTypes")(node.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valueParser.Dimension */ Any
    ]
  ]]
}
