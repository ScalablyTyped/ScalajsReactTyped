package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.TreeListOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TreeList")
@js.native
open class TreeList protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.TreeList {
  def this(element: Element) = this()
  def this(element: Element, options: TreeListOptions) = this()
}
object TreeList {
  
  @JSGlobal("kendo.ui.TreeList")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.TreeList = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.TreeList]
  
  /* static member */
  @JSGlobal("kendo.ui.TreeList.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.TreeList = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.TreeList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
