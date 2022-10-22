package typingsJapgolly.kendoUi.global.kendo.data

import typingsJapgolly.kendoUi.kendo.data.BinderOptions
import typingsJapgolly.kendoUi.kendo.data.Bindings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.Binder")
@js.native
open class Binder protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.data.Binder {
  def this(element: Any, bindings: Bindings) = this()
  def this(element: Any, bindings: Bindings, options: BinderOptions) = this()
}
object Binder {
  
  @JSGlobal("kendo.data.Binder")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(prototype: js.Object): typingsJapgolly.kendoUi.kendo.data.Binder = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(prototype.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.data.Binder]
  
  /* static member */
  @JSGlobal("kendo.data.Binder.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.data.Binder = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.data.Binder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
