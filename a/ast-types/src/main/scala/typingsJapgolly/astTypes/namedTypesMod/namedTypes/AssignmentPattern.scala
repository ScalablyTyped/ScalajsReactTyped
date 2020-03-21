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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
trait AssignmentPattern
  extends ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: PatternKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.AssignmentPattern
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.AssignmentPattern")
@js.native
object AssignmentPattern extends TopLevel[Type[AssignmentPattern]]

