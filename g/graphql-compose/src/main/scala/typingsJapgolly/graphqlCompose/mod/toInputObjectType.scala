package typingsJapgolly.graphqlCompose.mod

import typingsJapgolly.graphqlCompose.toInputObjectTypeMod.ToInputObjectTypeOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "toInputObjectType")
@js.native
object toInputObjectType extends js.Object {
  def apply[TContext](tc: typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]): typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.InterfaceTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](tc: typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[_, TContext]): typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def apply[TContext](
    tc: typingsJapgolly.graphqlCompose.objectTypeComposerMod.ObjectTypeComposer[_, TContext],
    opts: ToInputObjectTypeOpts
  ): typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[TContext] = js.native
}

