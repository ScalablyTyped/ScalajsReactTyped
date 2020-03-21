package typingsJapgolly.tablesorter.eventMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tablesorter.tablesorterStrings.`tablesorter-initialized`
  - typingsJapgolly.tablesorter.tablesorterStrings.`tablesorter-ready`
  - typingsJapgolly.tablesorter.tablesorterStrings.refreshComplete
  - typingsJapgolly.tablesorter.tablesorterStrings.updateComplete
  - typingsJapgolly.tablesorter.tablesorterStrings.widgetRemoveEnd
  - typingsJapgolly.tablesorter.tablesorterStrings.sortStart
  - typingsJapgolly.tablesorter.tablesorterStrings.sortBegin
  - typingsJapgolly.tablesorter.tablesorterStrings.sortEnd
*/
trait EventMap extends js.Object

object EventMap {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def refreshComplete: typingsJapgolly.tablesorter.tablesorterStrings.refreshComplete = this.cast("refreshComplete")
  @scala.inline
  def sortBegin: typingsJapgolly.tablesorter.tablesorterStrings.sortBegin = this.cast("sortBegin")
  @scala.inline
  def sortEnd: typingsJapgolly.tablesorter.tablesorterStrings.sortEnd = this.cast("sortEnd")
  @scala.inline
  def sortStart: typingsJapgolly.tablesorter.tablesorterStrings.sortStart = this.cast("sortStart")
  @scala.inline
  def `tablesorter-initialized`: typingsJapgolly.tablesorter.tablesorterStrings.`tablesorter-initialized` = this.cast("tablesorter-initialized")
  @scala.inline
  def `tablesorter-ready`: typingsJapgolly.tablesorter.tablesorterStrings.`tablesorter-ready` = this.cast("tablesorter-ready")
  @scala.inline
  def updateComplete: typingsJapgolly.tablesorter.tablesorterStrings.updateComplete = this.cast("updateComplete")
  @scala.inline
  def widgetRemoveEnd: typingsJapgolly.tablesorter.tablesorterStrings.widgetRemoveEnd = this.cast("widgetRemoveEnd")
}

