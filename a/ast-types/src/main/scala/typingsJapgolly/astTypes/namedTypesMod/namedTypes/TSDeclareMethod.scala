package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.astTypesStrings.`private`
import typingsJapgolly.astTypes.astTypesStrings.`protected`
import typingsJapgolly.astTypes.astTypesStrings.constructor
import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.method
import typingsJapgolly.astTypes.astTypesStrings.public
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.DecoratorKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.NoopKind
import typingsJapgolly.astTypes.kindsMod.NumericLiteralKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TSHasOptionalTypeParametersKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeParameters */
trait TSDeclareMethod
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeParametersKind {
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var params: js.Array[PatternKind]
  var returnType: js.UndefOr[TSTypeAnnotationKind | NoopKind | Null] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSDeclareMethod
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSDeclareMethod")
@js.native
object TSDeclareMethod extends TopLevel[Type[TSDeclareMethod]]

