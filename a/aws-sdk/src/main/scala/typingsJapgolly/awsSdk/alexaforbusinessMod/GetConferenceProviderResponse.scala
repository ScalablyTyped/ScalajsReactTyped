package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConferenceProviderResponse extends js.Object {
  /**
    * The conference provider.
    */
  var ConferenceProvider: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.ConferenceProvider] = js.native
}

object GetConferenceProviderResponse {
  @scala.inline
  def apply(ConferenceProvider: ConferenceProvider = null): GetConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (ConferenceProvider != null) __obj.updateDynamic("ConferenceProvider")(ConferenceProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConferenceProviderResponse]
  }
}

