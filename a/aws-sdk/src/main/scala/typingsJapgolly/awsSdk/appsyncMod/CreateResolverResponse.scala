package typingsJapgolly.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResolverResponse extends js.Object {
  /**
    * The Resolver object.
    */
  var resolver: js.UndefOr[Resolver] = js.native
}

object CreateResolverResponse {
  @scala.inline
  def apply(resolver: Resolver = null): CreateResolverResponse = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResolverResponse]
  }
}

