package typingsJapgolly.apolloServer.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "ApolloError")
@js.native
class ApolloError protected ()
  extends typingsJapgolly.apolloServer.exportsMod.ApolloError {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, extensions: Record[String, _]) = this()
}

