package typingsJapgolly.datatablesNet

import typingsJapgolly.datatablesNet.DataTables.Api
import typingsJapgolly.datatablesNet.DataTables.JQueryDataTables
import typingsJapgolly.datatablesNet.DataTables.Settings
import typingsJapgolly.datatablesNet.DataTables.StaticFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def DataTable(): Api = js.native
  def DataTable(opts: Settings): Api = js.native
  
  /**
    * Returns JQuery object
    *
    * Usage:
    * $( selector ).dataTable();
    */
  def dataTable(): JQueryDataTables = js.native
  @JSName("dataTable")
  var dataTable_Original: StaticFunctions = js.native
}
