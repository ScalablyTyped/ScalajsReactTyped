package typingsJapgolly.kendoUi.global.kendo.mobile.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.ScrollView")
@js.native
open class ScrollView protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollView {
  def this(element: Element) = this()
  def this(element: Element, options: ScrollViewOptions) = this()
}
object ScrollView {
  
  @JSGlobal("kendo.mobile.ui.ScrollView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollView]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.ScrollView.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollView = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.mobile.ui.ScrollView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
