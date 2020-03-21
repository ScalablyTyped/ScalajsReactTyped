package typingsJapgolly.graphqlCompose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object enumTypeComposerMod {
  type ComposeEnumType = typingsJapgolly.graphqlCompose.enumTypeComposerMod.EnumTypeComposer[js.Any] | typingsJapgolly.graphqlCompose.graphqlMod.GraphQLEnumType | typingsJapgolly.graphqlCompose.typeMapperMod.TypeDefinitionString | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
  type ComposeEnumValueConfigMap = typingsJapgolly.graphqlCompose.definitionsMod.ObjMap[typingsJapgolly.graphqlCompose.enumTypeComposerMod.ComposeEnumValueConfig]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
    - typingsJapgolly.graphqlCompose.enumTypeComposerMod.ComposeEnumTypeConfig
    - typingsJapgolly.graphqlCompose.graphqlMod.GraphQLEnumType
  */
  type EnumTypeComposeDefinition = typingsJapgolly.graphqlCompose.enumTypeComposerMod._EnumTypeComposeDefinition | typingsJapgolly.graphqlCompose.typeMapperMod.TypeAsString
}
