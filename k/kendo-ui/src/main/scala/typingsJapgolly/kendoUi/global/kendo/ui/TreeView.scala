package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.TreeViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.TreeView")
@js.native
open class TreeView protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.TreeView {
  def this(element: Element) = this()
  def this(element: Element, options: TreeViewOptions) = this()
}
object TreeView {
  
  @JSGlobal("kendo.ui.TreeView")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.TreeView = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.TreeView]
  
  /* static member */
  @JSGlobal("kendo.ui.TreeView.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.TreeView = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.TreeView): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
