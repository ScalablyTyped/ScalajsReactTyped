package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.PopupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Popup")
@js.native
open class Popup protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Popup {
  def this(element: Element) = this()
  def this(element: Element, options: PopupOptions) = this()
}
object Popup {
  
  @JSGlobal("kendo.ui.Popup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("kendo.ui.Popup.TabKeyTrap")
  @js.native
  def TabKeyTrap: Any = js.native
  inline def TabKeyTrap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabKeyTrap")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Popup = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Popup]
  
  /* static member */
  @JSGlobal("kendo.ui.Popup.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Popup = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Popup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
