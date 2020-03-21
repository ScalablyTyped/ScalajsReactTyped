package typingsJapgolly.tslint

import typingsJapgolly.tslint.ruleMod.RuleSeverity
import typingsJapgolly.tslint.tslintStrings.default
import typingsJapgolly.tslint.tslintStrings.none
import typingsJapgolly.tslint.tslintStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeverity extends js.Object {
  var options: js.UndefOr[js.Any] = js.undefined
  var severity: js.UndefOr[RuleSeverity | warn | none | default] = js.undefined
}

object AnonSeverity {
  @scala.inline
  def apply(options: js.Any = null, severity: RuleSeverity | warn | none | default = null): AnonSeverity = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeverity]
  }
}

