package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.PagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Pager")
@js.native
open class Pager protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Pager {
  def this(element: Element) = this()
  def this(element: Element, options: PagerOptions) = this()
}
object Pager {
  
  @JSGlobal("kendo.ui.Pager")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Pager = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Pager]
  
  /* static member */
  @JSGlobal("kendo.ui.Pager.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Pager = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Pager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
