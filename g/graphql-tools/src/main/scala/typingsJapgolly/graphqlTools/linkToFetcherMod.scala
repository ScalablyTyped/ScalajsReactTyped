package typingsJapgolly.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloLink.mod.ApolloLink
import typingsJapgolly.apolloLink.typesMod.FetchResult
import typingsJapgolly.apolloLink.typesMod.GraphQLRequest
import typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import typingsJapgolly.std.Record
import typingsJapgolly.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/linkToFetcher", JSImport.Namespace)
@js.native
object linkToFetcherMod extends js.Object {
  def default(link: ApolloLink): Fetcher = js.native
  def execute(link: typingsJapgolly.apolloLink.linkMod.ApolloLink, operation: GraphQLRequest): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

