package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.ButtonGroupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.ButtonGroup")
@js.native
open class ButtonGroup protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.ButtonGroup {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonGroupOptions) = this()
}
object ButtonGroup {
  
  @JSGlobal("kendo.ui.ButtonGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.ButtonGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.ButtonGroup]
  
  /* static member */
  @JSGlobal("kendo.ui.ButtonGroup.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.ButtonGroup = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.ButtonGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
