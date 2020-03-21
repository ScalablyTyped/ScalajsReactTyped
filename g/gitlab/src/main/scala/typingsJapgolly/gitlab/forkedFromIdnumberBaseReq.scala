package typingsJapgolly.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  forkedFromId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait forkedFromIdnumberBaseReq
  extends /* key */ StringDictionary[js.Any] {
  var forkedFromId: js.UndefOr[Double] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object forkedFromIdnumberBaseReq {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    forkedFromId: Int | Double = null,
    sudo: String | Double = null
  ): forkedFromIdnumberBaseReq = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (forkedFromId != null) __obj.updateDynamic("forkedFromId")(forkedFromId.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[forkedFromIdnumberBaseReq]
  }
}

