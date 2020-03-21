package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.JSXAttributeKind
import typingsJapgolly.astTypes.kindsMod.JSXClosingElementKind
import typingsJapgolly.astTypes.kindsMod.JSXElementKind
import typingsJapgolly.astTypes.kindsMod.JSXExpressionContainerKind
import typingsJapgolly.astTypes.kindsMod.JSXFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXMemberExpressionKind
import typingsJapgolly.astTypes.kindsMod.JSXNamespacedNameKind
import typingsJapgolly.astTypes.kindsMod.JSXOpeningElementKind
import typingsJapgolly.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsJapgolly.astTypes.kindsMod.JSXTextKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait JSXElement
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.undefined
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.undefined
  var closingElement: js.UndefOr[JSXClosingElementKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: js.UndefOr[JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind] = js.undefined
  var openingElement: JSXOpeningElementKind
  var selfClosing: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXElement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXElement")
@js.native
object JSXElement extends TopLevel[Type[JSXElement]]

