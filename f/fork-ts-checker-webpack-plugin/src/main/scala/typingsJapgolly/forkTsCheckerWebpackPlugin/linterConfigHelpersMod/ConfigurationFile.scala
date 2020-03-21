package typingsJapgolly.forkTsCheckerWebpackPlugin.linterConfigHelpersMod

import typingsJapgolly.forkTsCheckerWebpackPlugin.AnonExclude
import typingsJapgolly.std.Map
import typingsJapgolly.tslint.PartialIOptions
import typingsJapgolly.tslint.configurationMod.IConfigurationFile
import typingsJapgolly.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationFile extends IConfigurationFile {
  @JSName("linterOptions")
  var linterOptions_ConfigurationFile: js.UndefOr[AnonExclude] = js.undefined
}

object ConfigurationFile {
  @scala.inline
  def apply(
    `extends`: js.Array[String],
    jsRules: Map[String, PartialIOptions],
    rules: Map[String, PartialIOptions],
    rulesDirectory: js.Array[String],
    defaultSeverity: RuleSeverity = null,
    linterOptions: AnonExclude = null
  ): ConfigurationFile = {
    val __obj = js.Dynamic.literal(jsRules = jsRules.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], rulesDirectory = rulesDirectory.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (defaultSeverity != null) __obj.updateDynamic("defaultSeverity")(defaultSeverity.asInstanceOf[js.Any])
    if (linterOptions != null) __obj.updateDynamic("linterOptions")(linterOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationFile]
  }
}

