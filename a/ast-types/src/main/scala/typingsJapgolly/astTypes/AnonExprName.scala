package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSImportTypeKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExprName extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonExprName {
  @scala.inline
  def apply(
    exprName: IdentifierKind | TSQualifiedNameKind | TSImportTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonExprName = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExprName]
  }
}

