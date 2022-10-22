package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.CalendarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Calendar")
@js.native
open class Calendar protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Calendar {
  def this(element: Element) = this()
  def this(element: Element, options: CalendarOptions) = this()
}
object Calendar {
  
  @JSGlobal("kendo.ui.Calendar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Calendar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Calendar]
  
  /* static member */
  @JSGlobal("kendo.ui.Calendar.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Calendar = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Calendar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
