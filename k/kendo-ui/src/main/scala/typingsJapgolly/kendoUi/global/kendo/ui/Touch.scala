package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.TouchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Touch")
@js.native
open class Touch protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Touch {
  def this(element: Element) = this()
  def this(element: Element, options: TouchOptions) = this()
}
object Touch {
  
  @JSGlobal("kendo.ui.Touch")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Touch = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Touch]
  
  /* static member */
  @JSGlobal("kendo.ui.Touch.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Touch = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Touch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
