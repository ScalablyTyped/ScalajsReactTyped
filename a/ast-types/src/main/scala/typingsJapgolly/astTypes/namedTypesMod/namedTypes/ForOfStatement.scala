package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclarationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait ForOfStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: VariableDeclarationKind | PatternKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: ExpressionKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ForOfStatement
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ForOfStatement")
@js.native
object ForOfStatement extends TopLevel[Type[ForOfStatement]]

