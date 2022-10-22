package typingsJapgolly.kendoUi.global.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.kendo.ui.UploadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.ui.Upload")
@js.native
open class Upload protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Upload {
  def this(element: Element) = this()
  def this(element: Element, options: UploadOptions) = this()
}
object Upload {
  
  @JSGlobal("kendo.ui.Upload")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def extend(proto: js.Object): typingsJapgolly.kendoUi.kendo.ui.Upload = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(proto.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.ui.Upload]
  
  /* static member */
  @JSGlobal("kendo.ui.Upload.fn")
  @js.native
  def fn: typingsJapgolly.kendoUi.kendo.ui.Upload = js.native
  inline def fn_=(x: typingsJapgolly.kendoUi.kendo.ui.Upload): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
