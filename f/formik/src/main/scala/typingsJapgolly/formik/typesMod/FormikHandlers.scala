package typingsJapgolly.formik.typesMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLFormElement
import typingsJapgolly.react.mod.ChangeEvent
import typingsJapgolly.react.mod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikHandlers extends js.Object {
  def handleBlur(e: FocusEvent[_]): Unit = js.native
  def handleBlur[T](fieldOrEvent: T): Unit | (js.Function1[/* e */ js.Any, Unit]) = js.native
  def handleChange(e: ChangeEvent[_]): Unit = js.native
  def handleChange[T](field: T): (js.Function1[/* e */ js.Any | ReactEventFrom[Element], Unit]) | Unit = js.native
  def handleReset(): Unit = js.native
  def handleSubmit(): Unit = js.native
  def handleSubmit(e: ReactEventFrom[HTMLFormElement]): Unit = js.native
}

