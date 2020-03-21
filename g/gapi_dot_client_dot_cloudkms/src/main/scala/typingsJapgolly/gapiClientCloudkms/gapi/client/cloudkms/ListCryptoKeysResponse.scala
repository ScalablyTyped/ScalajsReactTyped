package typingsJapgolly.gapiClientCloudkms.gapi.client.cloudkms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCryptoKeysResponse extends js.Object {
  /** The list of CryptoKeys. */
  var cryptoKeys: js.UndefOr[js.Array[CryptoKey]] = js.undefined
  /**
    * A token to retrieve next page of results. Pass this value in
    * ListCryptoKeysRequest.page_token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The total number of CryptoKeys that matched the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListCryptoKeysResponse {
  @scala.inline
  def apply(
    cryptoKeys: js.Array[CryptoKey] = null,
    nextPageToken: String = null,
    totalSize: Int | Double = null
  ): ListCryptoKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (cryptoKeys != null) __obj.updateDynamic("cryptoKeys")(cryptoKeys.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCryptoKeysResponse]
  }
}

