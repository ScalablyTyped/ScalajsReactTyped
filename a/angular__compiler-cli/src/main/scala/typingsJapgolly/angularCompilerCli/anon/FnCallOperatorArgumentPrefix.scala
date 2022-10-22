package typingsJapgolly.angularCompilerCli.anon

import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.Exclamationmark
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.Plussign
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.Tilde
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.`-_`
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.`throw`
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.delete
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.typeof
import typingsJapgolly.angularCompilerCli.angularCompilerCliStrings.void
import typingsJapgolly.babelTypes.mod.Expression
import typingsJapgolly.babelTypes.mod.UnaryExpression_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallOperatorArgumentPrefix extends StObject {
  
  def apply(
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    argument: Expression
  ): UnaryExpression_ = js.native
  def apply(
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    argument: Expression,
    prefix: Boolean
  ): UnaryExpression_ = js.native
}
