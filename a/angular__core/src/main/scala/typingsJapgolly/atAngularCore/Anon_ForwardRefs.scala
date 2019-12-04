package typingsJapgolly.atAngularCore

import typingsJapgolly.std.Set
import typingsJapgolly.typescript.typescriptMod.AsExpression
import typingsJapgolly.typescript.typescriptMod.CallExpression
import typingsJapgolly.typescript.typescriptMod.Identifier
import typingsJapgolly.typescript.typescriptMod.ParameterDeclaration
import typingsJapgolly.typescript.typescriptMod.PropertyDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ForwardRefs extends js.Object {
  var forwardRefs: Set[Identifier]
  var methodCalls: Set[CallExpression]
  var typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
}

object Anon_ForwardRefs {
  @scala.inline
  def apply(
    forwardRefs: Set[Identifier],
    methodCalls: Set[CallExpression],
    typedNodes: Set[ParameterDeclaration | PropertyDeclaration | AsExpression]
  ): Anon_ForwardRefs = {
    val __obj = js.Dynamic.literal(forwardRefs = forwardRefs.asInstanceOf[js.Any], methodCalls = methodCalls.asInstanceOf[js.Any], typedNodes = typedNodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ForwardRefs]
  }
}

