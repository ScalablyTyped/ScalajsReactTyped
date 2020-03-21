package typingsJapgolly.datatablesNet.DataTables

import typingsJapgolly.datatablesNet.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryDataTables extends JQuery {
  /**
    * Returns DataTables API instance
    * Usage:
    * $( selector ).dataTable().api();
    */
  def api(): Api = js.native
}

