package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.NotificationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Notification")
@js.native
open class Notification protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Notification {
  def this(element: Element) = this()
  def this(element: Element, options: NotificationOptions) = this()
}
object Notification {
  
  @JSGlobal("kendo.ui.Notification")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Notification = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Notification]
  
  /* static member */
  @JSGlobal("kendo.ui.Notification.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Notification = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Notification): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
