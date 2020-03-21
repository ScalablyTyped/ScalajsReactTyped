package typingsJapgolly.apolloLink.mod

import typingsJapgolly.apolloLink.typesMod.Operation
import typingsJapgolly.apolloLink.typesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link", "split")
@js.native
object split extends js.Object {
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsJapgolly.apolloLink.linkMod.ApolloLink
  ): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsJapgolly.apolloLink.linkMod.ApolloLink,
    right: typingsJapgolly.apolloLink.linkMod.ApolloLink
  ): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: typingsJapgolly.apolloLink.linkMod.ApolloLink,
    right: RequestHandler
  ): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(
    test: js.Function1[/* op */ Operation, Boolean],
    left: RequestHandler,
    right: typingsJapgolly.apolloLink.linkMod.ApolloLink
  ): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
  def apply(test: js.Function1[/* op */ Operation, Boolean], left: RequestHandler, right: RequestHandler): typingsJapgolly.apolloLink.linkMod.ApolloLink = js.native
}

