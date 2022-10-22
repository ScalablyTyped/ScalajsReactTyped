package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.SwitchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Switch")
@js.native
open class Switch protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Switch {
  def this(element: Element) = this()
  def this(element: Element, options: SwitchOptions) = this()
}
object Switch {
  
  @JSGlobal("kendo.ui.Switch")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Switch = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Switch]
  
  /* static member */
  @JSGlobal("kendo.ui.Switch.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Switch = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Switch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
