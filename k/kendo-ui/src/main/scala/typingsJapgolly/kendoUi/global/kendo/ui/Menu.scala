package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.MenuOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Menu")
@js.native
open class Menu protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Menu {
  def this(element: Element) = this()
  def this(element: Element, options: MenuOptions) = this()
}
object Menu {
  
  @JSGlobal("kendo.ui.Menu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Menu = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Menu]
  
  /* static member */
  @JSGlobal("kendo.ui.Menu.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Menu = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Menu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
