package typingsJapgolly.apolloLink.mod

import typingsJapgolly.apolloLink.typesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "concat")
@js.native
object concat extends js.Object {
  def apply(
    first: typingsJapgolly.apolloLink.linkMod.ApolloLink,
    second: typingsJapgolly.apolloLink.linkMod.ApolloLink
  ): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: typingsJapgolly.apolloLink.linkMod.ApolloLink, second: RequestHandler): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: typingsJapgolly.apolloLink.linkMod.ApolloLink): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(first: RequestHandler, second: RequestHandler): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
}

