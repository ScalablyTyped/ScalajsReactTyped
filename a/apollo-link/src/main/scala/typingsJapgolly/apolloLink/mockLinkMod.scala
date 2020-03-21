package typingsJapgolly.apolloLink

import typingsJapgolly.apolloLink.linkMod.ApolloLink
import typingsJapgolly.apolloLink.typesMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/test-utils/mockLink", JSImport.Namespace)
@js.native
object mockLinkMod extends js.Object {
  @js.native
  trait MockLink extends ApolloLink
  
  @js.native
  class default () extends MockLink {
    def this(handleRequest: RequestHandler) = this()
  }
  
}

