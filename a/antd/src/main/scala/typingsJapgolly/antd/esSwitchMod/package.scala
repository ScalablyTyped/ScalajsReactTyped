package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esSwitchMod {
  import org.scalajs.dom.raw.MouseEvent

  type SwitchChangeEventHandler = js.Function2[/* checked */ Boolean, /* event */ MouseEvent, Unit]
  type SwitchClickEventHandler = SwitchChangeEventHandler
}
