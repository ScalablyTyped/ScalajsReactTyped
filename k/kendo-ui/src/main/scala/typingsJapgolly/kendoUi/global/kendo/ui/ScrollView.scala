package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.ScrollViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ScrollView")
@js.native
open class ScrollView protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.ScrollView {
  def this(element: Element) = this()
  def this(element: Element, options: ScrollViewOptions) = this()
}
object ScrollView {
  
  @JSGlobal("kendo.ui.ScrollView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.ScrollView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.ScrollView]
  
  /* static member */
  @JSGlobal("kendo.ui.ScrollView.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.ScrollView = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.ScrollView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
