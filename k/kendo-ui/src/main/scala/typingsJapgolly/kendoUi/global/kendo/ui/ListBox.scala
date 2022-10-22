package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.ListBoxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ListBox")
@js.native
open class ListBox protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.ListBox {
  def this(element: Element) = this()
  def this(element: Element, options: ListBoxOptions) = this()
}
object ListBox {
  
  @JSGlobal("kendo.ui.ListBox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.ListBox = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.ListBox]
  
  /* static member */
  @JSGlobal("kendo.ui.ListBox.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.ListBox = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.ListBox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
