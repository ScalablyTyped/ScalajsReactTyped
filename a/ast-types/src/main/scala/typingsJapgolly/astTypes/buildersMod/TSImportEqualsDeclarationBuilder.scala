package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonIsExport
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportEqualsDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSImportEqualsDeclarationBuilder extends js.Object {
  def apply(id: IdentifierKind, moduleReference: IdentifierKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSExternalModuleReferenceKind): TSImportEqualsDeclaration = js.native
  def apply(id: IdentifierKind, moduleReference: TSQualifiedNameKind): TSImportEqualsDeclaration = js.native
  def from(params: AnonIsExport): TSImportEqualsDeclaration = js.native
}

