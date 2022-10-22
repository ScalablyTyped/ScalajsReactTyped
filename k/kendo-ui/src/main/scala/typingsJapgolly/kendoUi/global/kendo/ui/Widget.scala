package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Widget")
@js.native
open class Widget protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(selector: String) = this()
  def this(element: Element, options: js.Object) = this()
  def this(element: JQuery, options: js.Object) = this()
  def this(selector: String, options: js.Object) = this()
}
object Widget {
  
  @JSGlobal("kendo.ui.Widget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(prototype: js.Object): typingsJapgolly.kendoUi.kendo.ui.Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Widget]
  
  /* static member */
  @JSGlobal("kendo.ui.Widget.fn")
  @js.native
  def fn: Any = js.native
  inline def fn_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
