package typingsJapgolly.formik

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(e: ChangeEvent[_]): Unit = js.native
  def apply[T](field: T): (js.Function1[/* e */ js.Any | ReactEventFrom[Element], Unit]) | Unit = js.native
}

