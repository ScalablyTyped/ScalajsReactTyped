package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.AvatarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Avatar")
@js.native
open class Avatar protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Avatar {
  def this(element: Element) = this()
  def this(element: Element, options: AvatarOptions) = this()
}
object Avatar {
  
  @JSGlobal("kendo.ui.Avatar")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Avatar = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Avatar]
  
  /* static member */
  @JSGlobal("kendo.ui.Avatar.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Avatar = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Avatar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
