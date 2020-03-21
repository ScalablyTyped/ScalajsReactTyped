package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.igResponseErrorMod.IgResponseError
import typingsJapgolly.instagramPrivateApi.spamResponseMod.SpamResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/errors/ig-signup-block.error", JSImport.Namespace)
@js.native
object igSignupBlockErrorMod extends js.Object {
  @js.native
  class IgSignupBlockError () extends IgResponseError[SpamResponse]
  
}

