package typingsJapgolly.astTypes.buildersMod

import typingsJapgolly.astTypes.AnonDefinition
import typingsJapgolly.astTypes.kindsMod.ClassPropertyDefinitionKind
import typingsJapgolly.astTypes.kindsMod.ClassPropertyKind
import typingsJapgolly.astTypes.kindsMod.MethodDefinitionKind
import typingsJapgolly.astTypes.kindsMod.VariableDeclaratorKind
import typingsJapgolly.astTypes.namedTypesMod.namedTypes.ClassPropertyDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassPropertyDefinitionBuilder extends js.Object {
  def apply(definition: ClassPropertyDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: ClassPropertyKind): ClassPropertyDefinition = js.native
  def apply(definition: MethodDefinitionKind): ClassPropertyDefinition = js.native
  def apply(definition: VariableDeclaratorKind): ClassPropertyDefinition = js.native
  def from(params: AnonDefinition): ClassPropertyDefinition = js.native
}

