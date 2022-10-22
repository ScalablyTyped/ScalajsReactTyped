package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.TimePickerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TimePicker")
@js.native
open class TimePicker protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.TimePicker {
  def this(element: Element) = this()
  def this(element: Element, options: TimePickerOptions) = this()
}
object TimePicker {
  
  @JSGlobal("kendo.ui.TimePicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.TimePicker = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.TimePicker]
  
  /* static member */
  @JSGlobal("kendo.ui.TimePicker.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.TimePicker = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.TimePicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
