package typingsJapgolly.typescript.mod

import typingsJapgolly.typescript.mod.SyntaxKind.ConstructorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstructorTypeNode
  extends FunctionOrConstructorTypeNodeBase
     with FunctionOrConstructorTypeNode
     with SignatureDeclaration
     with _HasJSDoc {
  @JSName("kind")
  var kind_ConstructorTypeNode: ConstructorType = js.native
}

