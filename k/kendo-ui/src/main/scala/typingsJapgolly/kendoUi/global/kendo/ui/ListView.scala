package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.ListViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ListView")
@js.native
open class ListView protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.ListView {
  def this(element: Element) = this()
  def this(element: Element, options: ListViewOptions) = this()
}
object ListView {
  
  @JSGlobal("kendo.ui.ListView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.ListView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.ListView]
  
  /* static member */
  @JSGlobal("kendo.ui.ListView.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.ListView = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.ListView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
