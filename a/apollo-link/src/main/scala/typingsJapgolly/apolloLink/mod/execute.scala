package typingsJapgolly.apolloLink.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloLink.typesMod.FetchResult
import typingsJapgolly.apolloLink.typesMod.GraphQLRequest
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "execute")
@js.native
object execute extends js.Object {
  def apply(link: typingsJapgolly.apolloLink.linkMod.ApolloLink, operation: GraphQLRequest): typingsJapgolly.zenObservableTs.zenObservableMod.Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

