package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DecoratorKind
import typingsJapgolly.astTypes.kindsMod.ObjectPropertyKind
import typingsJapgolly.astTypes.kindsMod.PropertyKind
import typingsJapgolly.astTypes.kindsMod.PropertyPatternKind
import typingsJapgolly.astTypes.kindsMod.RestPropertyKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.SpreadPropertyKind
import typingsJapgolly.astTypes.kindsMod.SpreadPropertyPatternKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Pattern, 'type'> */
trait ObjectPattern extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var decorators: js.Array[DecoratorKind] | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var properties: js.Array[
    PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
  ]
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectPattern
  var typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind | Null
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectPattern,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null,
    typeAnnotation: TypeAnnotationKind | TSTypeAnnotationKind = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
}

