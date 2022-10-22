package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.ToolBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ToolBar")
@js.native
open class ToolBar protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.ToolBar {
  def this(element: Element) = this()
  def this(element: Element, options: ToolBarOptions) = this()
}
object ToolBar {
  
  @JSGlobal("kendo.ui.ToolBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.ToolBar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.ToolBar]
  
  /* static member */
  @JSGlobal("kendo.ui.ToolBar.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.ToolBar = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.ToolBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
