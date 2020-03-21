package typingsJapgolly.apolloClient

import typingsJapgolly.apolloClient.observableMod.Subscription
import typingsJapgolly.apolloClient.observableQueryMod.ObservableQuery
import typingsJapgolly.apolloClient.typesMod.ApolloQueryResult
import typingsJapgolly.apolloClient.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/util/subscribeAndCount", JSImport.Namespace)
@js.native
object subscribeAndCountMod extends js.Object {
  def default(
    done: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ js.Any,
    observable: ObservableQuery[_, OperationVariables],
    cb: js.Function2[/* handleCount */ Double, /* result */ ApolloQueryResult[_], _]
  ): Subscription = js.native
}

