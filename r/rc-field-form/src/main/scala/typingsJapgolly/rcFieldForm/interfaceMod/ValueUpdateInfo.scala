package typingsJapgolly.rcFieldForm.interfaceMod

import typingsJapgolly.rcFieldForm.rcFieldFormStrings.external
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.internal
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.valueUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueUpdateInfo extends NotifyInfo {
  var source: internal | external
  var `type`: valueUpdate
}

object ValueUpdateInfo {
  @scala.inline
  def apply(source: internal | external, `type`: valueUpdate): ValueUpdateInfo = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueUpdateInfo]
  }
}

