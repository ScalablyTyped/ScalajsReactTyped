package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.BadgeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Badge")
@js.native
open class Badge protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Badge {
  def this(element: Element) = this()
  def this(element: Element, options: BadgeOptions) = this()
}
object Badge {
  
  @JSGlobal("kendo.ui.Badge")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Badge = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Badge]
  
  /* static member */
  @JSGlobal("kendo.ui.Badge.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Badge = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Badge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
