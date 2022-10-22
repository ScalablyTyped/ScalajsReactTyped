package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.ContextMenuOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ContextMenu")
@js.native
open class ContextMenu protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.ContextMenu {
  def this(element: Element) = this()
  def this(element: Element, options: ContextMenuOptions) = this()
}
object ContextMenu {
  
  @JSGlobal("kendo.ui.ContextMenu")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.ContextMenu = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.ContextMenu]
  
  /* static member */
  @JSGlobal("kendo.ui.ContextMenu.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.ContextMenu = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.ContextMenu): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
