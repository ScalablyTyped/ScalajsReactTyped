package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.SchedulerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Scheduler")
@js.native
open class Scheduler protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Scheduler {
  def this(element: Element) = this()
  def this(element: Element, options: SchedulerOptions) = this()
}
object Scheduler {
  
  @JSGlobal("kendo.ui.Scheduler")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Scheduler = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Scheduler]
  
  /* static member */
  @JSGlobal("kendo.ui.Scheduler.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Scheduler = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Scheduler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
