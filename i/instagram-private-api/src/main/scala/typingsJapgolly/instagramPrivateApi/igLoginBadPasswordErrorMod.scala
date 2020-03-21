package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typingsJapgolly.instagramPrivateApi.igResponseErrorMod.IgResponseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-login-bad-password.error", JSImport.Namespace)
@js.native
object igLoginBadPasswordErrorMod extends js.Object {
  @js.native
  class IgLoginBadPasswordError () extends IgResponseError[AccountRepositoryLoginErrorResponse]
  
}

