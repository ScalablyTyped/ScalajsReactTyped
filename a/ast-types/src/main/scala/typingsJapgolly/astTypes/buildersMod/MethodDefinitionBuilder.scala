package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonKind
import typingsJapgolly.astTypes.astTypesStrings.constructor
import typingsJapgolly.astTypes.astTypesStrings.get
import typingsJapgolly.astTypes.astTypesStrings.method
import typingsJapgolly.astTypes.astTypesStrings.set
import typingsJapgolly.astTypes.kindsMod.ExpressionKind
import typingsJapgolly.astTypes.kindsMod.FunctionKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.MethodDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodDefinitionBuilder extends js.Object {
  def apply(kind: constructor, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: constructor, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: get, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: get, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: method, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: method, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def apply(kind: set, key: ExpressionKind, value: FunctionKind): MethodDefinition = js.native
  def apply(kind: set, key: ExpressionKind, value: FunctionKind, staticParam: Boolean): MethodDefinition = js.native
  def from(params: AnonKind): MethodDefinition = js.native
}

