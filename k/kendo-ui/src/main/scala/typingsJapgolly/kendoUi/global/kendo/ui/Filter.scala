package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.FilterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Filter")
@js.native
open class Filter protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Filter {
  def this(element: Element) = this()
  def this(element: Element, options: FilterOptions) = this()
}
object Filter {
  
  @JSGlobal("kendo.ui.Filter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Filter = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Filter]
  
  /* static member */
  @JSGlobal("kendo.ui.Filter.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Filter = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Filter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
