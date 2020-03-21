package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait ComprehensionBlock
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var each: Boolean
  var left: PatternKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ComprehensionBlock
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ComprehensionBlock")
@js.native
object ComprehensionBlock extends TopLevel[Type[ComprehensionBlock]]

