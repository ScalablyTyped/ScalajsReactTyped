package typingsJapgolly.pako.mod

import typingsJapgolly.pako.pakoNumbers.`-1`
import typingsJapgolly.pako.pakoNumbers.`0`
import typingsJapgolly.pako.pakoNumbers.`1`
import typingsJapgolly.pako.pakoNumbers.`2`
import typingsJapgolly.pako.pakoNumbers.`3`
import typingsJapgolly.pako.pakoNumbers.`4`
import typingsJapgolly.pako.pakoNumbers.`5`
import typingsJapgolly.pako.pakoNumbers.`6`
import typingsJapgolly.pako.pakoNumbers.`7`
import typingsJapgolly.pako.pakoNumbers.`8`
import typingsJapgolly.pako.pakoNumbers.`9`
import typingsJapgolly.pako.pakoStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeflateFunctionOptions extends js.Object {
  var dictionary: js.UndefOr[js.Any] = js.undefined
  var level: js.UndefOr[`-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`] = js.undefined
  var memLevel: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var strategy: js.UndefOr[StrategyValues] = js.undefined
  var to: js.UndefOr[string] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object DeflateFunctionOptions {
  @scala.inline
  def apply(
    dictionary: js.Any = null,
    level: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` = null,
    memLevel: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    strategy: StrategyValues = null,
    to: string = null,
    windowBits: Int | Double = null
  ): DeflateFunctionOptions = {
    val __obj = js.Dynamic.literal()
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeflateFunctionOptions]
  }
}

