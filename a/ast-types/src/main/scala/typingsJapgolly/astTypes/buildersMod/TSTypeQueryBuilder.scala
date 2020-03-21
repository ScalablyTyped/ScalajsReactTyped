package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonExprName
import typingsJapgolly.astTypes.kindsMod.IdentifierKind
import typingsJapgolly.astTypes.kindsMod.TSImportTypeKind
import typingsJapgolly.astTypes.kindsMod.TSQualifiedNameKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.TSTypeQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeQueryBuilder extends js.Object {
  def apply(exprName: IdentifierKind): TSTypeQuery = js.native
  def apply(exprName: TSImportTypeKind): TSTypeQuery = js.native
  def apply(exprName: TSQualifiedNameKind): TSTypeQuery = js.native
  def from(params: AnonExprName): TSTypeQuery = js.native
}

