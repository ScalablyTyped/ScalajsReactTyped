package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.AppBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.AppBar")
@js.native
open class AppBar protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.AppBar {
  def this(element: Element) = this()
  def this(element: Element, options: AppBarOptions) = this()
}
object AppBar {
  
  @JSGlobal("kendo.ui.AppBar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.AppBar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.AppBar]
  
  /* static member */
  @JSGlobal("kendo.ui.AppBar.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.AppBar = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.AppBar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
