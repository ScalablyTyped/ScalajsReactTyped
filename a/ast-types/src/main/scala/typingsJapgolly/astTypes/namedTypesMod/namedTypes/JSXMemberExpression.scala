package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXMemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.MemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.MemberExpression, 'type' | 'object' | 'property' | 'computed'> */
trait JSXMemberExpression
  extends ASTNode
     with ExpressionKind
     with MemberExpressionKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `object`: JSXIdentifierKind | JSXMemberExpressionKind
  var property: JSXIdentifierKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXMemberExpression
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXMemberExpression")
@js.native
object JSXMemberExpression extends TopLevel[Type[JSXMemberExpression]]

