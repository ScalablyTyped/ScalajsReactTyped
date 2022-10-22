package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.SortableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Sortable")
@js.native
open class Sortable protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Sortable {
  def this(element: Element) = this()
  def this(element: Element, options: SortableOptions) = this()
}
object Sortable {
  
  @JSGlobal("kendo.ui.Sortable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Sortable = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Sortable]
  
  /* static member */
  @JSGlobal("kendo.ui.Sortable.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Sortable = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Sortable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
