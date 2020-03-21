package typingsJapgolly.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldConfigMap
import typingsJapgolly.graphql.definitionMod.GraphQLInputFieldConfigMap
import typingsJapgolly.graphql.definitionMod.GraphQLResolveInfo
import typingsJapgolly.graphql.definitionMod.Thunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationConfig extends js.Object {
  var deprecationReason: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var inputFields: Thunk[GraphQLInputFieldConfigMap] = js.native
  @JSName("mutateAndGetPayload")
  var mutateAndGetPayload_Original: mutationFn = js.native
  var name: String = js.native
  var outputFields: Thunk[GraphQLFieldConfigMap[_, _, StringDictionary[_]]] = js.native
  def mutateAndGetPayload(`object`: js.Any, ctx: js.Any, info: GraphQLResolveInfo): js.Promise[_] | js.Any = js.native
}

