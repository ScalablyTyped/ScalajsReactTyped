package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonQualifier
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.StringLiteralKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSImportType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSImportTypeBuilder extends js.Object {
  def apply(argument: StringLiteralKind): TSImportType = js.native
  def apply(
    argument: StringLiteralKind,
    qualifier: js.UndefOr[scala.Nothing],
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def apply(argument: StringLiteralKind, qualifier: IdentifierKind): TSImportType = js.native
  def apply(
    argument: StringLiteralKind,
    qualifier: IdentifierKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def apply(argument: StringLiteralKind, qualifier: TSQualifiedNameKind): TSImportType = js.native
  def apply(
    argument: StringLiteralKind,
    qualifier: TSQualifiedNameKind,
    typeParameters: TSTypeParameterInstantiationKind
  ): TSImportType = js.native
  def from(params: AnonQualifier): TSImportType = js.native
}

