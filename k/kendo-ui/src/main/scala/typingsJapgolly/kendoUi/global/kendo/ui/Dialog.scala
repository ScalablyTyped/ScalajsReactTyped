package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.DialogOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Dialog")
@js.native
open class Dialog protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Dialog {
  def this(element: Element) = this()
  def this(element: Element, options: DialogOptions) = this()
}
object Dialog {
  
  @JSGlobal("kendo.ui.Dialog")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Dialog = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Dialog]
  
  /* static member */
  @JSGlobal("kendo.ui.Dialog.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Dialog = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Dialog): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
