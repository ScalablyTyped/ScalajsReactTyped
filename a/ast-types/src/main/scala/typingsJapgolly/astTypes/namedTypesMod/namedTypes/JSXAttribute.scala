package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.JSXExpressionContainerKind
import typingsJapgolly.astTypes.kindsMod.JSXIdentifierKind
import typingsJapgolly.astTypes.kindsMod.JSXNamespacedNameKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait JSXAttribute
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: JSXIdentifierKind | JSXNamespacedNameKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.JSXAttribute
  var value: js.UndefOr[LiteralKind | JSXExpressionContainerKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.JSXAttribute")
@js.native
object JSXAttribute extends TopLevel[Type[JSXAttribute]]

