package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSThisTypeKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSTypeAnnotation, 'type' | 'typeAnnotation'> */
trait TSTypePredicate
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeAnnotationKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var parameterName: IdentifierKind | TSThisTypeKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSTypePredicate
  var typeAnnotation: TSTypeAnnotationKind
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypePredicate")
@js.native
object TSTypePredicate extends TopLevel[Type[TSTypePredicate]]

