package typingsJapgolly.rcPicker.timePanelMod

import typingsJapgolly.rcPicker.interfaceMod.PanelSharedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePanelProps[DateType]
  extends SharedTimeProps[DateType]
     with PanelSharedProps[DateType] {
  var active: js.UndefOr[Boolean] = js.native
}

