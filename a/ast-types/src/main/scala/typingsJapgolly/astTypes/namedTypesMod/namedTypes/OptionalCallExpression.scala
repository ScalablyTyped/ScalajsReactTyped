package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CallExpressionKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.SpreadElementKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.CallExpression, 'type'> */
trait OptionalCallExpression
  extends ASTNode
     with CallExpressionKind
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  var callee: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.OptionalCallExpression
  var typeArguments: js.UndefOr[TypeParameterInstantiationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.OptionalCallExpression")
@js.native
object OptionalCallExpression extends TopLevel[Type[OptionalCallExpression]]

