package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.DropTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.DropTarget")
@js.native
open class DropTarget protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.DropTarget {
  def this(element: Element) = this()
  def this(element: Element, options: DropTargetOptions) = this()
}
object DropTarget {
  
  @JSGlobal("kendo.ui.DropTarget")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def destroyGroup(groupName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
