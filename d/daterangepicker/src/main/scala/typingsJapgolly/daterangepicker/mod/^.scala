package typingsJapgolly.daterangepicker.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.daterangepicker.mod._Global_.JQuery
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("daterangepicker", JSImport.Namespace)
@js.native
class ^ protected () extends daterangepicker {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Options) = this()
  def this(element: HTMLElement, options: Options, callback: DataRangePickerCallback) = this()
  /* CompleteClass */
  override var container: JQuery = js.native
  /* CompleteClass */
  override var endDate: Moment = js.native
  /* CompleteClass */
  override var startDate: Moment = js.native
  /* CompleteClass */
  override def remove(): Unit = js.native
  /* CompleteClass */
  override def setEndDate(date: DateOrString): Unit = js.native
  /* CompleteClass */
  override def setStartDate(date: DateOrString): Unit = js.native
}

