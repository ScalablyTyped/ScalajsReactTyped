package typingsJapgolly.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.ClientOptions")
@js.native
object ClientOptions extends js.Object {
  @js.native
  class Configuration protected ()
    extends typingsJapgolly.postmark.modelsMod.ClientOptions.Configuration {
    def this(useHttps: Boolean, requestHost: String, timeout: Double) = this()
  }
  
  @js.native
  object DefaultHeaderNames extends js.Object {
    /* "X-Postmark-Account-Token" */ val ACCOUNT_TOKEN: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.ACCOUNT_TOKEN with String = js.native
    /* "X-Postmark-Server-Token" */ val SERVER_TOKEN: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames.SERVER_TOKEN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.postmark.clientOptionsMod.ClientOptions.DefaultHeaderNames with String
      ] = js.native
  }
  
  @js.native
  object HttpMethod extends js.Object {
    /* "DELETE" */ val DELETE: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod.DELETE with String = js.native
    /* "GET" */ val GET: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod.GET with String = js.native
    /* "HEAD" */ val HEAD: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod.HEAD with String = js.native
    /* "OPTIONS" */ val OPTIONS: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod.OPTIONS with String = js.native
    /* "POST" */ val POST: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod.POST with String = js.native
    /* "PUT" */ val PUT: typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod.PUT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.postmark.clientOptionsMod.ClientOptions.HttpMethod with String] = js.native
  }
  
}

