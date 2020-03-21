package typingsJapgolly.storybookAddonKnobs.numberMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberType
  extends Component[NumberTypeProps, js.Object, js.Any] {
  def handleChange(event: ReactEventFrom[HTMLInputElement]): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MNumberType(nextProps: NumberTypeProps): Boolean = js.native
}

