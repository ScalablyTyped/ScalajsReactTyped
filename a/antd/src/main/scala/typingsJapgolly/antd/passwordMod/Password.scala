package typingsJapgolly.antd.passwordMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Password
  extends Component[PasswordProps, PasswordState, js.Any] {
  var input: HTMLInputElement = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getIcon(): FunctionComponentElement[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_AntdIcon.AntdIconProps */ js.Any) with RefAttributes[HTMLSpanElement]
  ] = js.native
  def onVisibleChange(): Unit = js.native
  def saveInput(instance: typingsJapgolly.antd.inputInputMod.default): Unit = js.native
  def select(): Unit = js.native
}

