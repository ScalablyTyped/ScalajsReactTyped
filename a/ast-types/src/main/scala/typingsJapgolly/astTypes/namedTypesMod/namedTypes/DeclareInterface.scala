package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.InterfaceDeclarationKind
import typingsJapgolly.astTypes.kindsMod.InterfaceExtendsKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> */
trait DeclareInterface
  extends ASTNode
     with DeclarationKind
     with InterfaceDeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var `extends`: js.Array[InterfaceExtendsKind]
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsJapgolly.astTypes.astTypesStrings.DeclareInterface
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareInterface")
@js.native
object DeclareInterface extends TopLevel[Type[DeclareInterface]]

