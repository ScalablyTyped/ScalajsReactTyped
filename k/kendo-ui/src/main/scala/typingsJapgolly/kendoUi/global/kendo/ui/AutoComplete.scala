package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.AutoCompleteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.AutoComplete")
@js.native
open class AutoComplete protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.AutoComplete {
  def this(element: Element) = this()
  def this(element: Element, options: AutoCompleteOptions) = this()
}
object AutoComplete {
  
  @JSGlobal("kendo.ui.AutoComplete")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.AutoComplete = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.AutoComplete]
  
  /* static member */
  @JSGlobal("kendo.ui.AutoComplete.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.AutoComplete = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.AutoComplete): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
