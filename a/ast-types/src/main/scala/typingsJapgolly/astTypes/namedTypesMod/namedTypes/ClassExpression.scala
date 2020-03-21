package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.ClassBodyKind
import typingsJapgolly.astTypes.kindsMod.ClassImplementsKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait ClassExpression
  extends ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  var body: ClassBodyKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ClassExpression
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassExpression")
@js.native
object ClassExpression extends TopLevel[Type[ClassExpression]]

