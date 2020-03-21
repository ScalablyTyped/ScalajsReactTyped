package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformTypesListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#platformTypesListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Platform type collection. */
  var platformTypes: js.UndefOr[js.Array[PlatformType]] = js.undefined
}

object PlatformTypesListResponse {
  @scala.inline
  def apply(kind: String = null, platformTypes: js.Array[PlatformType] = null): PlatformTypesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformTypesListResponse]
  }
}

