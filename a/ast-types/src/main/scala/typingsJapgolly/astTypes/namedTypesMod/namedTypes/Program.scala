package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DirectiveKind
import typingsJapgolly.astTypes.kindsMod.InterpreterDirectiveKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait Program
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.undefined
  var interpreter: js.UndefOr[InterpreterDirectiveKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.Program
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Program")
@js.native
object Program extends TopLevel[Type[Program]]

