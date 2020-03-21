package typingsJapgolly.gatsby.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
import typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
import typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig
import typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig
import typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
import typingsJapgolly.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePluginSchema extends js.Object {
  def buildEnumType(config: ComposeEnumTypeConfig): GatsbyGraphQLEnumType
  def buildInputObjectType(config: ComposeInputObjectTypeConfig): GatsbyGraphQLInputObjectType
  def buildInterfaceType(config: ComposeInterfaceTypeConfig[_, _]): GatsbyGraphQLInterfaceType
  def buildObjectType(config: ComposeObjectTypeConfig[_, _]): GatsbyGraphQLObjectType
  def buildScalarType(config: ComposeScalarTypeConfig): GatsbyGraphQLScalarType
  def buildUnionType(config: ComposeUnionTypeConfig[_, _]): GatsbyGraphQLUnionType
}

object NodePluginSchema {
  @scala.inline
  def apply(
    buildEnumType: ComposeEnumTypeConfig => CallbackTo[GatsbyGraphQLEnumType],
    buildInputObjectType: ComposeInputObjectTypeConfig => CallbackTo[GatsbyGraphQLInputObjectType],
    buildInterfaceType: ComposeInterfaceTypeConfig[js.Any, js.Any] => CallbackTo[GatsbyGraphQLInterfaceType],
    buildObjectType: ComposeObjectTypeConfig[js.Any, js.Any] => CallbackTo[GatsbyGraphQLObjectType],
    buildScalarType: ComposeScalarTypeConfig => CallbackTo[GatsbyGraphQLScalarType],
    buildUnionType: ComposeUnionTypeConfig[js.Any, js.Any] => CallbackTo[GatsbyGraphQLUnionType]
  ): NodePluginSchema = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildEnumType")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig) => buildEnumType(t0).runNow()))
    __obj.updateDynamic("buildInputObjectType")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig) => buildInputObjectType(t0).runNow()))
    __obj.updateDynamic("buildInterfaceType")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceTypeConfig[js.Any, js.Any]) => buildInterfaceType(t0).runNow()))
    __obj.updateDynamic("buildObjectType")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlCompose.objectTypeComposerMod.ComposeObjectTypeConfig[js.Any, js.Any]) => buildObjectType(t0).runNow()))
    __obj.updateDynamic("buildScalarType")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig) => buildScalarType(t0).runNow()))
    __obj.updateDynamic("buildUnionType")(js.Any.fromFunction1((t0: typingsJapgolly.graphqlCompose.unionTypeComposerMod.ComposeUnionTypeConfig[js.Any, js.Any]) => buildUnionType(t0).runNow()))
    __obj.asInstanceOf[NodePluginSchema]
  }
}

