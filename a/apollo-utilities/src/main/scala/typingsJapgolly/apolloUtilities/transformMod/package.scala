package typingsJapgolly.apolloUtilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformMod {
  type GetDirectiveConfig = typingsJapgolly.apolloUtilities.transformMod.GetNodeConfig[typingsJapgolly.graphql.astMod.DirectiveNode]
  type GetFragmentSpreadConfig = typingsJapgolly.apolloUtilities.transformMod.GetNodeConfig[typingsJapgolly.graphql.astMod.FragmentSpreadNode]
  type RemoveArgumentsConfig = typingsJapgolly.apolloUtilities.transformMod.RemoveNodeConfig[typingsJapgolly.graphql.astMod.ArgumentNode]
  type RemoveDirectiveConfig = typingsJapgolly.apolloUtilities.transformMod.RemoveNodeConfig[typingsJapgolly.graphql.astMod.DirectiveNode]
  type RemoveFragmentDefinitionConfig = typingsJapgolly.apolloUtilities.transformMod.RemoveNodeConfig[typingsJapgolly.graphql.astMod.FragmentDefinitionNode]
  type RemoveFragmentSpreadConfig = typingsJapgolly.apolloUtilities.transformMod.RemoveNodeConfig[typingsJapgolly.graphql.astMod.FragmentSpreadNode]
  type RemoveVariableDefinitionConfig = typingsJapgolly.apolloUtilities.transformMod.RemoveNodeConfig[typingsJapgolly.graphql.astMod.VariableDefinitionNode]
}
