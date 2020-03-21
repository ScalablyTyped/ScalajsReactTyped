package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentLine
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typingsJapgolly.astTypes.astTypesStrings.CommentLine
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.CommentLine")
@js.native
object CommentLine extends TopLevel[Type[CommentLine]]

