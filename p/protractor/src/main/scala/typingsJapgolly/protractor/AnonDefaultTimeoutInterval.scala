package typingsJapgolly.protractor

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultTimeoutInterval
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Default time to wait in ms before a test fails.
    */
  var defaultTimeoutInterval: js.UndefOr[Double] = js.undefined
  /**
    * If set, only execute specs whose names match the pattern, which is
    * internally compiled to a RegExp.
    */
  var grep: js.UndefOr[String] = js.undefined
  /**
    * Inverts 'grep' matches
    */
  var invertGrep: js.UndefOr[Boolean] = js.undefined
  /**
    * Function called to print jasmine results.
    */
  var print: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If true, run specs in semi-random order
    */
  var random: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the randomization seed if randomization is turned on
    */
  var seed: js.UndefOr[String] = js.undefined
  /**
    * If true, print colors to the terminal.
    */
  var showColors: js.UndefOr[Boolean] = js.undefined
}

object AnonDefaultTimeoutInterval {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    defaultTimeoutInterval: Int | Double = null,
    grep: String = null,
    invertGrep: js.UndefOr[Boolean] = js.undefined,
    print: js.UndefOr[Callback] = js.undefined,
    random: js.UndefOr[Boolean] = js.undefined,
    seed: String = null,
    showColors: js.UndefOr[Boolean] = js.undefined
  ): AnonDefaultTimeoutInterval = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (defaultTimeoutInterval != null) __obj.updateDynamic("defaultTimeoutInterval")(defaultTimeoutInterval.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (!js.isUndefined(invertGrep)) __obj.updateDynamic("invertGrep")(invertGrep.asInstanceOf[js.Any])
    print.foreach(p => __obj.updateDynamic("print")(p.toJsFn))
    if (!js.isUndefined(random)) __obj.updateDynamic("random")(random.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (!js.isUndefined(showColors)) __obj.updateDynamic("showColors")(showColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultTimeoutInterval]
  }
}

