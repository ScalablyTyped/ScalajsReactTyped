package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumDeclaration
  extends DeclarationStatement
     with JSDocContainer
     with _HasJSDoc {
  @JSName("kind")
  var kind_EnumDeclaration: typingsJapgolly.typescript.mod.SyntaxKind.EnumDeclaration = js.native
  var members: NodeArray[EnumMember] = js.native
  @JSName("name")
  var name_EnumDeclaration: Identifier = js.native
}

