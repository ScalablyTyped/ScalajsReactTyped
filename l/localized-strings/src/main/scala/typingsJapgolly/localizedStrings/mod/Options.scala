package typingsJapgolly.localizedStrings.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var customLanguageInterface: js.UndefOr[GetInterfaceLanguageCallback] = js.undefined
  var logsEnabled: js.UndefOr[Boolean] = js.undefined
  var pseudo: js.UndefOr[Boolean] = js.undefined
  var pseudoMultipleLanguages: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    customLanguageInterface: js.UndefOr[CallbackTo[String]] = js.undefined,
    logsEnabled: js.UndefOr[Boolean] = js.undefined,
    pseudo: js.UndefOr[Boolean] = js.undefined,
    pseudoMultipleLanguages: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    customLanguageInterface.foreach(p => __obj.updateDynamic("customLanguageInterface")(p.toJsFn))
    if (!js.isUndefined(logsEnabled)) __obj.updateDynamic("logsEnabled")(logsEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(pseudo)) __obj.updateDynamic("pseudo")(pseudo.asInstanceOf[js.Any])
    if (!js.isUndefined(pseudoMultipleLanguages)) __obj.updateDynamic("pseudoMultipleLanguages")(pseudoMultipleLanguages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

