package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends Comment
     with ASTNode
     with CommentKind
     with PrintableKind {
  var `type`: typingsJapgolly.astTypes.astTypesStrings.Block
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.Block")
@js.native
object Block extends TopLevel[Type[Block]]

