package typingsJapgolly.jasmineNode.jasmine

import japgolly.scalajs.react.Callback
import typingsJapgolly.jasmine.jasmine.Runner
import typingsJapgolly.jasmineNode.AnonConsolidate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteSpecsOptions extends js.Object {
  var growl: js.UndefOr[Boolean] = js.undefined
  var includeStackTrace: js.UndefOr[Boolean] = js.undefined
  var isVerbose: js.UndefOr[Boolean] = js.undefined
  var junitreport: js.UndefOr[AnonConsolidate] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* runner */ Runner, Unit]] = js.undefined
  var regExpSpec: js.RegExp
  var showColors: js.UndefOr[Boolean] = js.undefined
  var specFolders: js.Array[String]
  var teamcity: js.UndefOr[String | Boolean] = js.undefined
  var useRequireJs: js.UndefOr[Boolean] = js.undefined
}

object ExecuteSpecsOptions {
  @scala.inline
  def apply(
    regExpSpec: js.RegExp,
    specFolders: js.Array[String],
    growl: js.UndefOr[Boolean] = js.undefined,
    includeStackTrace: js.UndefOr[Boolean] = js.undefined,
    isVerbose: js.UndefOr[Boolean] = js.undefined,
    junitreport: AnonConsolidate = null,
    onComplete: /* runner */ Runner => Callback = null,
    showColors: js.UndefOr[Boolean] = js.undefined,
    teamcity: String | Boolean = null,
    useRequireJs: js.UndefOr[Boolean] = js.undefined
  ): ExecuteSpecsOptions = {
    val __obj = js.Dynamic.literal(regExpSpec = regExpSpec.asInstanceOf[js.Any], specFolders = specFolders.asInstanceOf[js.Any])
    if (!js.isUndefined(growl)) __obj.updateDynamic("growl")(growl.asInstanceOf[js.Any])
    if (!js.isUndefined(includeStackTrace)) __obj.updateDynamic("includeStackTrace")(includeStackTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(isVerbose)) __obj.updateDynamic("isVerbose")(isVerbose.asInstanceOf[js.Any])
    if (junitreport != null) __obj.updateDynamic("junitreport")(junitreport.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* runner */ typingsJapgolly.jasmine.jasmine.Runner) => onComplete(t0).runNow()))
    if (!js.isUndefined(showColors)) __obj.updateDynamic("showColors")(showColors.asInstanceOf[js.Any])
    if (teamcity != null) __obj.updateDynamic("teamcity")(teamcity.asInstanceOf[js.Any])
    if (!js.isUndefined(useRequireJs)) __obj.updateDynamic("useRequireJs")(useRequireJs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSpecsOptions]
  }
}

