package typingsJapgolly.apolloServerErrors.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-errors", "ApolloError")
@js.native
class ApolloError protected ()
  extends GraphQLError
     with /* key */ StringDictionary[js.Any] {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, extensions: Record[String, _]) = this()
  @JSName("extensions")
  var extensions_ApolloError: Record[String, _] = js.native
}

