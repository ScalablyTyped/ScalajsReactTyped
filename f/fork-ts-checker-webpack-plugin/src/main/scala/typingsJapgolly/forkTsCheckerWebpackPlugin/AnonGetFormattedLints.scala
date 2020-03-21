package typingsJapgolly.forkTsCheckerWebpackPlugin

import typingsJapgolly.eslint.mod.CLIEngine.LintReport
import typingsJapgolly.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetFormattedLints extends js.Object {
  def getFormattedLints(lintReports: js.Array[LintReport]): js.Array[NormalizedMessage] = js.native
  def getFormattedLints(lintReports: IterableIterator[LintReport]): js.Array[NormalizedMessage] = js.native
  def getLints(filepath: String): js.UndefOr[LintReport] = js.native
}

