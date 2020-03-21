package typingsJapgolly.baseui.paginationMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.baseui.AnonValue
import typingsJapgolly.dateFns.Locale
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/pagination", "Pagination")
@js.native
class Pagination ()
  extends Component[PaginationProps, js.Object, js.Any] {
  def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
  def getMenuOptions(numPages: Double): js.Array[js.Any] = js.native
  def onMenuItemSelect(data: AnonValue): Unit = js.native
  def onNextClick(event: ReactEventFrom[Element]): Unit = js.native
  def onPrevClick(event: ReactEventFrom[Element]): Unit = js.native
}

