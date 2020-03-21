package typingsJapgolly.jquerySortable

import typingsJapgolly.jquerySortable.JQuerySortable.Options
import typingsJapgolly.jquerySortable.jquerySortableStrings.destroy
import typingsJapgolly.jquerySortable.jquerySortableStrings.disable
import typingsJapgolly.jquerySortable.jquerySortableStrings.enable
import typingsJapgolly.jquerySortable.jquerySortableStrings.refresh
import typingsJapgolly.jquerySortable.jquerySortableStrings.serialize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def sortable(): JQuery = js.native
  def sortable(methodName: String): JQuery = js.native
  def sortable(options: Options): JQuery = js.native
  @JSName("sortable")
  def sortable_destroy(methodName: destroy): JQuery = js.native
  @JSName("sortable")
  def sortable_disable(methodName: disable): JQuery = js.native
  @JSName("sortable")
  def sortable_enable(methodName: enable): JQuery = js.native
  @JSName("sortable")
  def sortable_refresh(methodName: refresh): JQuery = js.native
  @JSName("sortable")
  def sortable_serialize(methodName: serialize): JQuery = js.native
}

