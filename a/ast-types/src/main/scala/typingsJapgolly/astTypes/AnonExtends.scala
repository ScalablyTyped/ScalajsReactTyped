package typingsJapgolly.astTypes

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.InterfaceExtendsKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtends extends js.Object {
  var body: ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var `extends`: js.UndefOr[js.Array[InterfaceExtendsKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonExtends {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    `extends`: js.Array[InterfaceExtendsKind] = null,
    loc: SourceLocationKind = null
  ): AnonExtends = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtends]
  }
}

