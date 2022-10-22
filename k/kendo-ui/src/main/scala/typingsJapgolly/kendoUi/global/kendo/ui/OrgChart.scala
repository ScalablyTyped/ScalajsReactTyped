package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.OrgChartOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.OrgChart")
@js.native
open class OrgChart protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.OrgChart {
  def this(element: Element) = this()
  def this(element: Element, options: OrgChartOptions) = this()
}
object OrgChart {
  
  @JSGlobal("kendo.ui.OrgChart")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.OrgChart = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.OrgChart]
  
  /* static member */
  @JSGlobal("kendo.ui.OrgChart.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.OrgChart = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.OrgChart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
