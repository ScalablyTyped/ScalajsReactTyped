package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.ValidatorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Validator")
@js.native
open class Validator protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Validator {
  def this(element: Element) = this()
  def this(element: Element, options: ValidatorOptions) = this()
}
object Validator {
  
  @JSGlobal("kendo.ui.Validator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Validator]
  
  /* static member */
  @JSGlobal("kendo.ui.Validator.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Validator = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Validator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
