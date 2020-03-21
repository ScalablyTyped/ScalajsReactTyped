package typingsJapgolly.pollyjsCore

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFs
  extends /* key */ StringDictionary[js.Any] {
  var fs: js.UndefOr[AnonRecordingsDir] = js.undefined
  var keepUnusedRequests: js.UndefOr[Boolean] = js.undefined
  var `local-storage`: js.UndefOr[AnonKey] = js.undefined
  var rest: js.UndefOr[AnonApiNamespace] = js.undefined
}

object AnonFs {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fs: AnonRecordingsDir = null,
    keepUnusedRequests: js.UndefOr[Boolean] = js.undefined,
    `local-storage`: AnonKey = null,
    rest: AnonApiNamespace = null
  ): AnonFs = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (!js.isUndefined(keepUnusedRequests)) __obj.updateDynamic("keepUnusedRequests")(keepUnusedRequests.asInstanceOf[js.Any])
    if (`local-storage` != null) __obj.updateDynamic("local-storage")(`local-storage`.asInstanceOf[js.Any])
    if (rest != null) __obj.updateDynamic("rest")(rest.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFs]
  }
}

