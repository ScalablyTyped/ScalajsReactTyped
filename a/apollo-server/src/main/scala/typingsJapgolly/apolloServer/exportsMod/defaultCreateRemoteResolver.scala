package typingsJapgolly.apolloServer.exportsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphqlTools.makeRemoteExecutableSchemaMod.Fetcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "defaultCreateRemoteResolver")
@js.native
object defaultCreateRemoteResolver extends js.Object {
  def apply(fetcher: Fetcher): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

