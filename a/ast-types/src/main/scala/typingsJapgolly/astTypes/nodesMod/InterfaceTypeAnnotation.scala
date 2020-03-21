package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.InterfaceExtendsKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.FlowType, 'type'> */
trait InterfaceTypeAnnotation extends ASTNode {
  var body: ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var `extends`: js.Array[InterfaceExtendsKind] | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.InterfaceTypeAnnotation
}

object InterfaceTypeAnnotation {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotationKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.InterfaceTypeAnnotation,
    comments: js.Array[CommentKind] = null,
    `extends`: js.Array[InterfaceExtendsKind] = null,
    loc: SourceLocationKind = null
  ): InterfaceTypeAnnotation = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeAnnotation]
  }
}

