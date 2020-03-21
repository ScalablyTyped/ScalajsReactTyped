package typingsJapgolly.i18next.mod

import typingsJapgolly.i18next.i18nextStrings.`3rdParty`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyModule extends Module {
  @JSName("type")
  var type_ThirdPartyModule: `3rdParty`
  def init(i18next: i18n): Unit
}

object ThirdPartyModule {
  @scala.inline
  def apply(init: i18n => japgolly.scalajs.react.Callback, `type`: `3rdParty`): ThirdPartyModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init")(js.Any.fromFunction1((t0: typingsJapgolly.i18next.mod.i18n) => init(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartyModule]
  }
}

