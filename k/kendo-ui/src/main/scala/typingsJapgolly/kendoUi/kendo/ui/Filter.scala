package typingsJapgolly.kendoUi.kendo.ui

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter
  extends StObject
     with Widget {
  
  def applyFilter(): Unit = js.native
  
  var dataSource: DataSource = js.native
  
  @JSName("options")
  var options_Filter: FilterOptions = js.native
  
  var wrapper: JQuery = js.native
}
