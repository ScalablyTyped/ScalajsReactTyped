package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.InterfaceExtendsKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.InterfaceDeclaration, 'type'> */
trait DeclareClass extends ASTNode {
  var body: ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var `extends`: js.Array[InterfaceExtendsKind]
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.DeclareClass
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind] = js.undefined
}

object DeclareClass {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typingsJapgolly.astTypes.astTypesStrings.DeclareClass,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareClass]
  }
}

