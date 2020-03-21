package typingsJapgolly.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputTypeComposerMod {
  type ComposeInputFieldConfig = typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigAsObject | typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputType | (js.Function0[
    typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfigAsObject | typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputType
  ])
  type ComposeInputFieldConfigMap = typingsJapgolly.graphqlCompose.definitionsMod.ObjMap[typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputFieldConfig]
  type ComposeInputType = typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | typingsJapgolly.graphql.definitionMod.GraphQLInputType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString | (js.Array[
    typingsJapgolly.graphqlCompose.inputTypeComposerMod.InputTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.scalarTypeComposerMod.ScalarTypeComposer[js.Any] | typingsJapgolly.graphql.definitionMod.GraphQLInputType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
  ])
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
    - typingsJapgolly.graphqlCompose.inputTypeComposerMod.ComposeInputObjectTypeConfig
    - typingsJapgolly.graphqlCompose.graphqlMod.GraphQLInputObjectType
  */
  type InputTypeComposeDefinition = typingsJapgolly.graphqlCompose.inputTypeComposerMod._InputTypeComposeDefinition | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
}
