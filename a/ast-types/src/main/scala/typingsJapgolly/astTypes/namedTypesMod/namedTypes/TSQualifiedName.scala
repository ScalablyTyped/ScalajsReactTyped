package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait TSQualifiedName
  extends ASTNode
     with NodeKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: IdentifierKind | TSQualifiedNameKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: IdentifierKind | TSQualifiedNameKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSQualifiedName
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSQualifiedName")
@js.native
object TSQualifiedName extends TopLevel[Type[TSQualifiedName]]

