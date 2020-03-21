package typingsJapgolly.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.astTypes.kindsMod.CommentKind
import typingsJapgolly.astTypes.kindsMod.DeclarationKind
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.NodeKind
import typingsJapgolly.astTypes.kindsMod.PrintableKind
import typingsJapgolly.astTypes.kindsMod.SourceLocationKind
import typingsJapgolly.astTypes.kindsMod.StatementKind
import typingsJapgolly.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
trait TSImportEqualsDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind
  var isExport: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind
  var `type`: typingsJapgolly.astTypes.astTypesStrings.TSImportEqualsDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSImportEqualsDeclaration")
@js.native
object TSImportEqualsDeclaration extends TopLevel[Type[TSImportEqualsDeclaration]]

