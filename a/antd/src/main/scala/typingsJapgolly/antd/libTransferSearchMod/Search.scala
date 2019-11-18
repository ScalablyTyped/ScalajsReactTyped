package typingsJapgolly.antd.libTransferSearchMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[TransferSearchProps, js.Any, js.Any] {
  def handleChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleClear(e: ReactMouseEventFrom[HTMLAnchorElement]): Unit = js.native
}

