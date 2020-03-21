package typingsJapgolly.apolloServer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.graphql.definitionMod.GraphQLFieldResolver
import typingsJapgolly.graphqlTools.interfacesMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "decorateWithLogger")
@js.native
object decorateWithLogger extends js.Object {
  def apply(fn: js.UndefOr[scala.Nothing], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def apply(fn: GraphQLFieldResolver[_, _, StringDictionary[_]], logger: ILogger, hint: String): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
}

