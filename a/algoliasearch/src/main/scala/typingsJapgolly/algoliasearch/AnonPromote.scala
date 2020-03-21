package typingsJapgolly.algoliasearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromote extends js.Object {
  var params: js.UndefOr[AnonAutomaticFacetFilters] = js.undefined
  /**
    * Objects to promote as hits. Each object must contain the following fields
    */
  var promote: js.UndefOr[js.Array[AnonObjectID]] = js.undefined
  /**
    *  Custom JSON object that will be appended to the userData array in the response.
    * This object is not interpreted by the API. It is limited to 1kB of minified JSON.
    */
  var userData: js.UndefOr[js.Object] = js.undefined
}

object AnonPromote {
  @scala.inline
  def apply(
    params: AnonAutomaticFacetFilters = null,
    promote: js.Array[AnonObjectID] = null,
    userData: js.Object = null
  ): AnonPromote = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (promote != null) __obj.updateDynamic("promote")(promote.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPromote]
  }
}

