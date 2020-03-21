package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsJapgolly.instagramPrivateApi.loginRequiredResponseMod.LoginRequiredResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-login-required.error", JSImport.Namespace)
@js.native
object igLoginRequiredErrorMod extends js.Object {
  @js.native
  class IgLoginRequiredError () extends IgResponseError[LoginRequiredResponse]
  
}

