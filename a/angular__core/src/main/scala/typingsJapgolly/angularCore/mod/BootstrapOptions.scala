package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreStrings.noop
import typingsJapgolly.angularCore.angularCoreStrings.zoneDotjs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides additional options to the bootstraping process.
  *
  *
  */
trait BootstrapOptions extends js.Object {
  /**
    * Optionally specify which `NgZone` should be used.
    *
    * - Provide your own `NgZone` instance.
    * - `zone.js` - Use default `NgZone` which requires `Zone.js`.
    * - `noop` - Use `NoopNgZone` which does nothing.
    */
  var ngZone: js.UndefOr[NgZone | zoneDotjs | noop] = js.undefined
}

object BootstrapOptions {
  @scala.inline
  def apply(ngZone: NgZone | zoneDotjs | noop = null): BootstrapOptions = {
    val __obj = js.Dynamic.literal()
    if (ngZone != null) __obj.updateDynamic("ngZone")(ngZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapOptions]
  }
}

