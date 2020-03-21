package typingsJapgolly.datatablesNetSelect

import typingsJapgolly.datatablesNetSelect.DataTables.Api
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.api
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.multi
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.os
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStyle extends js.Object {
  /*
    * Get the current selection style applied to the table
    */
  def style(): String = js.native
  /*
    * Set the table's selection style
    */
  @JSName("style")
  def style_api(s: api): Api = js.native
  @JSName("style")
  def style_multi(s: multi): Api = js.native
  @JSName("style")
  def style_os(s: os): Api = js.native
  @JSName("style")
  def style_single(s: single): Api = js.native
}

