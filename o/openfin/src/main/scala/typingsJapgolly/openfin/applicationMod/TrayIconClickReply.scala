package typingsJapgolly.openfin.applicationMod

import typingsJapgolly.openfin.baseMod.Reply
import typingsJapgolly.openfin.monitorMod.MonitorInfo
import typingsJapgolly.openfin.openfinStrings.`tray-icon-clicked`
import typingsJapgolly.openfin.openfinStrings.application
import typingsJapgolly.openfin.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrayIconClickReply
  extends Reply[application, `tray-icon-clicked`]
     with Point {
  var button: Double = js.native
  var monitorInfo: MonitorInfo = js.native
}

