package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentBlock
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typingsJapgolly.astTypes.astTypesStrings.CommentBlock
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentBlock")
@js.native
object CommentBlock extends TopLevel[Type[CommentBlock]]

