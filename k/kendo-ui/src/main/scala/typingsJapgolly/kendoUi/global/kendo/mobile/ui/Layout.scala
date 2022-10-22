package typingsJapgolly.kendoUi.global.kendo.mobile.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.mobile.ui.LayoutOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Layout")
@js.native
open class Layout protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.mobile.ui.Layout {
  def this(element: Element) = this()
  def this(element: Element, options: LayoutOptions) = this()
}
object Layout {
  
  @JSGlobal("kendo.mobile.ui.Layout")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.mobile.ui.Layout = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.mobile.ui.Layout]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Layout.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.mobile.ui.Layout = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.mobile.ui.Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
