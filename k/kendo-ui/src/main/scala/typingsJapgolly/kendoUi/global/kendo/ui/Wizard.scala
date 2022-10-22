package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.WizardOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Wizard")
@js.native
open class Wizard protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Wizard {
  def this(element: Element) = this()
  def this(element: Element, options: WizardOptions) = this()
}
object Wizard {
  
  @JSGlobal("kendo.ui.Wizard")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Wizard = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Wizard]
  
  /* static member */
  @JSGlobal("kendo.ui.Wizard.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Wizard = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Wizard): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
