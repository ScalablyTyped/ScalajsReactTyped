package typingsJapgolly.apolloServer.exportsMod

import typingsJapgolly.graphqlSubscriptions.withFilterMod.FilterFn
import typingsJapgolly.graphqlSubscriptions.withFilterMod.ResolverFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "withFilter")
@js.native
object withFilter extends js.Object {
  def apply(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
}

