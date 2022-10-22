package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.SliderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Slider")
@js.native
open class Slider protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Slider {
  def this(element: Element) = this()
  def this(element: Element, options: SliderOptions) = this()
}
object Slider {
  
  @JSGlobal("kendo.ui.Slider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Slider = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Slider]
  
  /* static member */
  @JSGlobal("kendo.ui.Slider.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Slider = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Slider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
