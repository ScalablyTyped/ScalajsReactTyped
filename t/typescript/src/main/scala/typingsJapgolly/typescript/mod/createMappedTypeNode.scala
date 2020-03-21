package typingsJapgolly.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createMappedTypeNode")
@js.native
object createMappedTypeNode extends js.Object {
  def apply(
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration
  ): MappedTypeNode = js.native
  def apply(
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken
  ): MappedTypeNode = js.native
  def apply(
    readonlyToken: js.UndefOr[ReadonlyToken | PlusToken | MinusToken],
    typeParameter: TypeParameterDeclaration,
    questionToken: QuestionToken | PlusToken | MinusToken,
    `type`: TypeNode
  ): MappedTypeNode = js.native
}

