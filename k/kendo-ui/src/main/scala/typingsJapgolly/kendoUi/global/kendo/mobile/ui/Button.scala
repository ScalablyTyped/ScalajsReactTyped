package typingsJapgolly.kendoUi.global.kendo.mobile.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.mobile.ui.ButtonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.mobile.ui.Button")
@js.native
open class Button protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.mobile.ui.Button {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonOptions) = this()
}
object Button {
  
  @JSGlobal("kendo.mobile.ui.Button")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.mobile.ui.Button = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.mobile.ui.Button]
  
  /* static member */
  @JSGlobal("kendo.mobile.ui.Button.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.mobile.ui.Button = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.mobile.ui.Button): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
