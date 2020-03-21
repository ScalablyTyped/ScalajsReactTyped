package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.accountRepositoryLoginErrorResponseMod.AccountRepositoryLoginErrorResponse
import typingsJapgolly.instagramPrivateApi.igResponseErrorMod.IgResponseError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-login-invalid-user.error", JSImport.Namespace)
@js.native
object igLoginInvalidUserErrorMod extends js.Object {
  @js.native
  class IgLoginInvalidUserError () extends IgResponseError[AccountRepositoryLoginErrorResponse]
  
}

