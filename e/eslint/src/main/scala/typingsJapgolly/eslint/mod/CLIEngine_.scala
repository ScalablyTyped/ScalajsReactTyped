package typingsJapgolly.eslint.mod

import typingsJapgolly.eslint.mod.CLIEngine.Formatter
import typingsJapgolly.eslint.mod.CLIEngine.LintReport
import typingsJapgolly.eslint.mod.CLIEngine.Options
import typingsJapgolly.eslint.mod.Linter.Config
import typingsJapgolly.eslint.mod.Rule.RuleModule
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "CLIEngine")
@js.native
class CLIEngine_ protected () extends js.Object {
  def this(options: Options) = this()
  var version: String = js.native
  def addPlugin(name: String, pluginObject: js.Any): Unit = js.native
  def executeOnFiles(patterns: js.Array[String]): LintReport = js.native
  def executeOnText(text: String): LintReport = js.native
  def executeOnText(text: String, filename: String): LintReport = js.native
  def getConfigForFile(filePath: String): Config = js.native
  def getFormatter(): Formatter = js.native
  def getFormatter(format: String): Formatter = js.native
  def getRules(): Map[String, RuleModule] = js.native
  def isPathIgnored(filePath: String): Boolean = js.native
  def resolveFileGlobPatterns(patterns: js.Array[String]): js.Array[String] = js.native
}

