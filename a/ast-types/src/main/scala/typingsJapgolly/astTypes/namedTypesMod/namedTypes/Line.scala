package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typingsJapgolly.astTypes.astTypesStrings.Line
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Line")
@js.native
object Line extends TopLevel[Type[Line]]

