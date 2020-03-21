package typingsJapgolly.bumpRegex.mod

import typingsJapgolly.bumpRegex.bumpRegexStrings.major
import typingsJapgolly.bumpRegex.bumpRegexStrings.minor
import typingsJapgolly.bumpRegex.bumpRegexStrings.patch
import typingsJapgolly.bumpRegex.bumpRegexStrings.prerelease
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var `case`: js.UndefOr[Boolean] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  var preid: js.UndefOr[String] = js.undefined
  var regex: js.UndefOr[js.RegExp] = js.undefined
  var str: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[major | minor | patch | prerelease] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `case`: js.UndefOr[Boolean] = js.undefined,
    global: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    keys: js.Array[String] = null,
    preid: String = null,
    regex: js.RegExp = null,
    str: String = null,
    `type`: major | minor | patch | prerelease = null,
    version: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`case`)) __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (preid != null) __obj.updateDynamic("preid")(preid.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (str != null) __obj.updateDynamic("str")(str.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

