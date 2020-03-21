package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.DeclareClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclareClass_
  extends Node
     with Declaration
     with Flow
     with FlowDeclaration
     with Statement {
  var body: ObjectTypeAnnotation_
  var `extends`: js.Array[InterfaceExtends_]
  var id: Identifier_
  var typeParameters: TypeParameterDeclaration_
  @JSName("type")
  var type_DeclareClass_ : DeclareClass
}

object DeclareClass_ {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: DeclareClass,
    typeParameters: TypeParameterDeclaration_,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareClass_]
  }
}

