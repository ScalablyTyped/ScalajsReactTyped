package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.AnonFlags
import typingsJapgolly.astTypes.AnonRawString
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Literal, 'type' | 'value'> */
trait BigIntLiteral
  extends ASTNode
     with ExpressionKind
     with LiteralKind
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var extra: js.UndefOr[AnonRawString] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var regex: js.UndefOr[AnonFlags] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.BigIntLiteral
  var value: String | Double
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.BigIntLiteral")
@js.native
object BigIntLiteral extends TopLevel[Type[BigIntLiteral]]

