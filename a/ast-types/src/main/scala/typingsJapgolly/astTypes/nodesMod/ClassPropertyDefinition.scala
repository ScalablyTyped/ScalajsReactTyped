package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.MethodDefinitionKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait ClassPropertyDefinition extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ClassPropertyDefinition
}

object ClassPropertyDefinition {
  @scala.inline
  def apply(
    definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.ClassPropertyDefinition,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ClassPropertyDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassPropertyDefinition]
  }
}

