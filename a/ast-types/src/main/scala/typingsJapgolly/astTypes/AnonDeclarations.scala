package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.astTypesStrings.`var`
import typingsJapgolly.astTypes.astTypesStrings.const
import typingsJapgolly.astTypes.astTypesStrings.let
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeclarations extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declarations: js.Array[VariableDeclaratorKind | IdentifierKind]
  var kind: `var` | let | const
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonDeclarations {
  @scala.inline
  def apply(
    declarations: js.Array[VariableDeclaratorKind | IdentifierKind],
    kind: `var` | let | const,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonDeclarations = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeclarations]
  }
}

