package typingsJapgolly.kendoUi.kendo.mobile.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopOver
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Widget {
  
  def close(): Unit = js.native
  
  def open(target: JQuery): Unit = js.native
  
  @JSName("options")
  var options_PopOver: PopOverOptions = js.native
  
  var wrapper: JQuery = js.native
}
