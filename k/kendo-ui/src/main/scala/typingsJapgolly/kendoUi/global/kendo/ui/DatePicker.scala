package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.DatePickerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DatePicker")
@js.native
open class DatePicker protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.DatePicker {
  def this(element: Element) = this()
  def this(element: Element, options: DatePickerOptions) = this()
}
object DatePicker {
  
  @JSGlobal("kendo.ui.DatePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.DatePicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.DatePicker]
  
  /* static member */
  @JSGlobal("kendo.ui.DatePicker.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.DatePicker = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.DatePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
