package typingsJapgolly.graphqlSubscriptions

import typingsJapgolly.graphqlSubscriptions.pubsubMod.PubSubOptions
import typingsJapgolly.graphqlSubscriptions.withFilterMod.FilterFn
import typingsJapgolly.graphqlSubscriptions.withFilterMod.ResolverFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-subscriptions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class PubSub ()
    extends typingsJapgolly.graphqlSubscriptions.pubsubMod.PubSub {
    def this(options: PubSubOptions) = this()
  }
  
  @js.native
  abstract class PubSubEngine ()
    extends typingsJapgolly.graphqlSubscriptions.pubsubEngineMod.PubSubEngine
  
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
}

