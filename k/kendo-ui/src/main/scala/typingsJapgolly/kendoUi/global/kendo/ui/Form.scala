package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.FormOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Form")
@js.native
open class Form protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Form {
  def this(element: Element) = this()
  def this(element: Element, options: FormOptions) = this()
}
object Form {
  
  @JSGlobal("kendo.ui.Form")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Form = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Form]
  
  /* static member */
  @JSGlobal("kendo.ui.Form.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Form = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Form): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
