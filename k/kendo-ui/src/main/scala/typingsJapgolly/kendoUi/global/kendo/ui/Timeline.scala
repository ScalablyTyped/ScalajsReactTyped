package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.TimelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Timeline")
@js.native
open class Timeline protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Timeline {
  def this(element: Element) = this()
  def this(element: Element, options: TimelineOptions) = this()
}
object Timeline {
  
  @JSGlobal("kendo.ui.Timeline")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Timeline = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Timeline]
  
  /* static member */
  @JSGlobal("kendo.ui.Timeline.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Timeline = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Timeline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
