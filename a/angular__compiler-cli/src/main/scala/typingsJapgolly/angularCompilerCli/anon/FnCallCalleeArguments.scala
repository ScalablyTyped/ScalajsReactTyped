package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.babelTypes.mod.ArgumentPlaceholder_
import typingsJapgolly.babelTypes.mod.Expression
import typingsJapgolly.babelTypes.mod.JSXNamespacedName_
import typingsJapgolly.babelTypes.mod.NewExpression_
import typingsJapgolly.babelTypes.mod.SpreadElement_
import typingsJapgolly.babelTypes.mod.Super_
import typingsJapgolly.babelTypes.mod.V8IntrinsicIdentifier_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallCalleeArguments extends StObject {
  
  def apply(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ): NewExpression_ = js.native
  def apply(
    callee: Super_,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ): NewExpression_ = js.native
  def apply(
    callee: V8IntrinsicIdentifier_,
    _arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_]
  ): NewExpression_ = js.native
}
