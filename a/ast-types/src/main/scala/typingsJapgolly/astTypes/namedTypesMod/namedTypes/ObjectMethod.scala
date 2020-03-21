package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.method
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DecoratorKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.FunctionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.LiteralKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'params' | 'body' | 'generator' | 'async'> */
trait ObjectMethod
  extends ASTNode
     with FunctionKind
     with NodeKind
     with PrintableKind {
  var accessibility: js.UndefOr[LiteralKind | Null] = js.undefined
  var async: js.UndefOr[Boolean] = js.undefined
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.undefined
  var expression: js.UndefOr[Boolean] = js.undefined
  var generator: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[IdentifierKind] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var kind: method | get | set
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var params: js.Array[PatternKind]
  var rest: js.UndefOr[IdentifierKind] = js.undefined
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ObjectMethod
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectMethod")
@js.native
object ObjectMethod extends TopLevel[Type[ObjectMethod]]

