package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.astTypesStrings.`private`
import typingsJapgolly.astTypes.astTypesStrings.`protected`
import typingsJapgolly.astTypes.astTypesStrings.minus
import typingsJapgolly.astTypes.astTypesStrings.plus
import typingsJapgolly.astTypes.astTypesStrings.public
import typingsJapgolly.astTypes.kindsMod.ClassPropertyKind
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.PrivateNameKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.TSTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.TypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.VarianceKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ClassProperty, 'type' | 'key' | 'value'> */
trait ClassPrivateProperty
  extends ASTNode
     with ClassPropertyKind
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: PrivateNameKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.ClassPrivateProperty
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind] = js.undefined
  var value: js.UndefOr[ExpressionKind | Null] = js.undefined
  var variance: js.UndefOr[VarianceKind | plus | minus] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPrivateProperty")
@js.native
object ClassPrivateProperty extends TopLevel[Type[ClassPrivateProperty]]

