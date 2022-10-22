package typingsJapgolly.kendoUi.kendo.mobile.ui

import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionSheet
  extends StObject
     with typingsJapgolly.kendoUi.kendo.ui.Widget {
  
  def close(): Unit = js.native
  
  def open(target: JQuery, context: Any): Unit = js.native
  
  @JSName("options")
  var options_ActionSheet: ActionSheetOptions = js.native
  
  var wrapper: JQuery = js.native
}
