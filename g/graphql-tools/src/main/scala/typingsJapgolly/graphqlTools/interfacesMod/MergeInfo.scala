package typingsJapgolly.graphqlTools.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphqlTools.AnonField
import typingsJapgolly.graphqlTools.graphqlToolsStrings.mutation_
import typingsJapgolly.graphqlTools.graphqlToolsStrings.query_
import typingsJapgolly.graphqlTools.graphqlToolsStrings.subscription_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeInfo extends js.Object {
  var fragments: js.Array[AnonField] = js.native
  def delegateToSchema[TContext](options: IDelegateToSchemaOptions[TContext]): js.Any = js.native
  @JSName("delegate")
  def delegate_mutation(
    `type`: mutation_,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_mutation(
    `type`: mutation_,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_query(
    `type`: query_,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_query(
    `type`: query_,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_subscription(
    `type`: subscription_,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_subscription(
    `type`: subscription_,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
}

