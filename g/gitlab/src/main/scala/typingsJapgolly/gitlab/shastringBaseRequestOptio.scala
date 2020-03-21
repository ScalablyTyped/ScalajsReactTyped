package typingsJapgolly.gitlab

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  sha ? :string} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait shastringBaseRequestOptio
  extends /* key */ StringDictionary[js.Any] {
  var sha: js.UndefOr[String] = js.undefined
  var sudo: js.UndefOr[String | Double] = js.undefined
}

object shastringBaseRequestOptio {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    sha: String = null,
    sudo: String | Double = null
  ): shastringBaseRequestOptio = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (sha != null) __obj.updateDynamic("sha")(sha.asInstanceOf[js.Any])
    if (sudo != null) __obj.updateDynamic("sudo")(sudo.asInstanceOf[js.Any])
    __obj.asInstanceOf[shastringBaseRequestOptio]
  }
}

