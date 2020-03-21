package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.JSXClosingFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXElementKind
import typingsJapgolly.astTypes.kindsMod.JSXExpressionContainerKind
import typingsJapgolly.astTypes.kindsMod.JSXFragmentKind
import typingsJapgolly.astTypes.kindsMod.JSXOpeningFragmentKind
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
trait JSXFragment
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var children: js.UndefOr[
    js.Array[
      JSXElementKind | JSXExpressionContainerKind | JSXFragmentKind | JSXTextKind | LiteralKind
    ]
  ] = js.undefined
  var closingElement: JSXClosingFragmentKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var openingElement: JSXOpeningFragmentKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXFragment
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXFragment")
@js.native
object JSXFragment extends TopLevel[Type[JSXFragment]]

