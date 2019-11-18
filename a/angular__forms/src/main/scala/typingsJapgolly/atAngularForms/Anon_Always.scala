package typingsJapgolly.atAngularForms

import typingsJapgolly.atAngularForms.atAngularFormsStrings.always
import typingsJapgolly.atAngularForms.atAngularFormsStrings.never
import typingsJapgolly.atAngularForms.atAngularFormsStrings.once
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Always extends js.Object {
  /** @deprecated as of v6 */ var warnOnDeprecatedNgFormSelector: js.UndefOr[never | once | always] = js.undefined
}

object Anon_Always {
  @scala.inline
  def apply(warnOnDeprecatedNgFormSelector: never | once | always = null): Anon_Always = {
    val __obj = js.Dynamic.literal()
    if (warnOnDeprecatedNgFormSelector != null) __obj.updateDynamic("warnOnDeprecatedNgFormSelector")(warnOnDeprecatedNgFormSelector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Always]
  }
}

