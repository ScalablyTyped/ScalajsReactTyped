package typingsJapgolly.eslint.mod.Linter

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.eslint.AnonDictkey
import typingsJapgolly.eslint.eslintNumbers.`10`
import typingsJapgolly.eslint.eslintNumbers.`11`
import typingsJapgolly.eslint.eslintNumbers.`2015`
import typingsJapgolly.eslint.eslintNumbers.`2016`
import typingsJapgolly.eslint.eslintNumbers.`2017`
import typingsJapgolly.eslint.eslintNumbers.`2018`
import typingsJapgolly.eslint.eslintNumbers.`2019`
import typingsJapgolly.eslint.eslintNumbers.`2020`
import typingsJapgolly.eslint.eslintNumbers.`3`
import typingsJapgolly.eslint.eslintNumbers.`5`
import typingsJapgolly.eslint.eslintNumbers.`6`
import typingsJapgolly.eslint.eslintNumbers.`7`
import typingsJapgolly.eslint.eslintNumbers.`8`
import typingsJapgolly.eslint.eslintNumbers.`9`
import typingsJapgolly.eslint.eslintStrings.module
import typingsJapgolly.eslint.eslintStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions
  extends /* key */ StringDictionary[js.Any] {
  var ecmaFeatures: js.UndefOr[AnonDictkey] = js.undefined
  var ecmaVersion: js.UndefOr[
    `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020`
  ] = js.undefined
  var sourceType: js.UndefOr[script | module] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    ecmaFeatures: AnonDictkey = null,
    ecmaVersion: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `2015` | `2016` | `2017` | `2018` | `2019` | `2020` = null,
    sourceType: script | module = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ecmaFeatures != null) __obj.updateDynamic("ecmaFeatures")(ecmaFeatures.asInstanceOf[js.Any])
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

