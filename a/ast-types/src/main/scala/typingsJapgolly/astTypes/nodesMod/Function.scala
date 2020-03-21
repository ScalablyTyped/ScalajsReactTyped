package typingsJapgolly.astTypes.nodesMod

import typingsJapgolly.astTypes.kindsMod.BlockStatementKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.PatternKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Function extends Node {
  var async: Boolean = js.native
  var body: BlockStatementKind = js.native
  var defaults: js.Array[ExpressionKind | Null] = js.native
  var expression: Boolean = js.native
  var generator: Boolean = js.native
  var id: IdentifierKind | Null = js.native
  var params: js.Array[PatternKind] = js.native
  var rest: IdentifierKind | Null = js.native
  var returnType: TypeAnnotationKind | TSTypeAnnotationKind | Null = js.native
  var typeParameters: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null = js.native
}

