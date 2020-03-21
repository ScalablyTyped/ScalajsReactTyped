package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Identifier, 'type' | 'name'> */
trait TSTypeParameter
  extends ASTNode
     with ExpressionKind
     with IdentifierKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var constraint: js.UndefOr[TSTypeKind] = js.undefined
  var default: js.UndefOr[TSTypeKind] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSTypeParameter
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeParameter")
@js.native
object TSTypeParameter extends TopLevel[Type[TSTypeParameter]]

