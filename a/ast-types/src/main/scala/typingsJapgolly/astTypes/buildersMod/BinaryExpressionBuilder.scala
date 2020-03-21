package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonRight
import typingsJapgolly.astTypes.astTypesStrings.Ampersand
import typingsJapgolly.astTypes.astTypesStrings.Asterisk
import typingsJapgolly.astTypes.astTypesStrings.AsteriskAsterisk
import typingsJapgolly.astTypes.astTypesStrings.EqualssignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.EqualssignEqualssignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.ExclamationmarkEqualssign
import typingsJapgolly.astTypes.astTypesStrings.ExclamationmarkEqualssignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.Greaterthansign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignGreaterthansign
import typingsJapgolly.astTypes.astTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typingsJapgolly.astTypes.astTypesStrings.Lessthansign
import typingsJapgolly.astTypes.astTypesStrings.LessthansignEqualssign
import typingsJapgolly.astTypes.astTypesStrings.LessthansignLessthansign
import typingsJapgolly.astTypes.astTypesStrings.Percentsign
import typingsJapgolly.astTypes.astTypesStrings.Plussign
import typingsJapgolly.astTypes.astTypesStrings.Slash
import typingsJapgolly.astTypes.astTypesStrings.Verticalline
import typingsJapgolly.astTypes.astTypesStrings.^
import typingsJapgolly.astTypes.astTypesStrings.`-_`
import typingsJapgolly.astTypes.astTypesStrings.in
import typingsJapgolly.astTypes.astTypesStrings.instanceof
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.BinaryExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExpressionBuilder extends js.Object {
  def apply(
    operator: EqualssignEqualssign | ExclamationmarkEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | LessthansignLessthansign | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | Plussign | `-_` | Asterisk | Slash | Percentsign | AsteriskAsterisk | Ampersand | Verticalline | ^  | in | instanceof,
    left: ExpressionKind,
    right: ExpressionKind
  ): BinaryExpression = js.native
  def from(params: AnonRight): BinaryExpression = js.native
}

