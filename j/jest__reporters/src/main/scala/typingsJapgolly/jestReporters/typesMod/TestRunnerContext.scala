package typingsJapgolly.jestReporters.typesMod

import typingsJapgolly.jestTypes.configMod.Path
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunnerContext extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
}

object TestRunnerContext {
  @scala.inline
  def apply(changedFiles: Set[Path] = null): TestRunnerContext = {
    val __obj = js.Dynamic.literal()
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunnerContext]
  }
}

