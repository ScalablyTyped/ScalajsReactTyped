package typingsJapgolly.storybookAddonKnobs.arrayMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookAddonKnobs.ReadonlyArrayTypeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType
  extends Component[ArrayTypeProps, js.Object, js.Any] {
  def handleChange(e: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MArrayType(nextProps: ReadonlyArrayTypeProps): Boolean = js.native
}

