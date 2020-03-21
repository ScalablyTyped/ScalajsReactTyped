package typingsJapgolly.antdMobile.switchMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Switch
  extends Component[SwitchProps, js.Any, js.Any] {
  def onChange(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def onClick(e: js.Any): Unit = js.native
}

