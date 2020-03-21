package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.init
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DecoratorKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait Property extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var decorators: js.Array[DecoratorKind] | Null
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: init | get | set
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var method: Boolean
  var shorthand: Boolean
  var `type`: typingsJapgolly.astTypes.astTypesStrings.Property
  var value: ExpressionKind | PatternKind
}

object Property {
  @scala.inline
  def apply(
    computed: Boolean,
    key: LiteralKind | IdentifierKind | ExpressionKind,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    `type`: typingsJapgolly.astTypes.astTypesStrings.Property,
    value: ExpressionKind | PatternKind,
    comments: js.Array[CommentKind] = null,
    decorators: js.Array[DecoratorKind] = null,
    loc: SourceLocationKind = null
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
}

