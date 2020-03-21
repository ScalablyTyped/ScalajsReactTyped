package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.TSHasOptionalTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeAnnotation */
trait TSPropertySignature
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeAnnotationKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var initializer: js.UndefOr[ExpressionKind | Null] = js.undefined
  var key: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSPropertySignature
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSPropertySignature")
@js.native
object TSPropertySignature extends TopLevel[Type[TSPropertySignature]]

