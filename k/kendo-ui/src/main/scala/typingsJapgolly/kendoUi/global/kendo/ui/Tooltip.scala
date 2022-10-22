package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.TooltipOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Tooltip")
@js.native
open class Tooltip protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Tooltip {
  def this(element: Element) = this()
  def this(element: Element, options: TooltipOptions) = this()
}
object Tooltip {
  
  @JSGlobal("kendo.ui.Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Tooltip]
  
  /* static member */
  @JSGlobal("kendo.ui.Tooltip.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Tooltip = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
