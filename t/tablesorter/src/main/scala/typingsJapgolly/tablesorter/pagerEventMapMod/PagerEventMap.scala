package typingsJapgolly.tablesorter.pagerEventMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tablesorter.tablesorterStrings.pagerInitialized
  - typingsJapgolly.tablesorter.tablesorterStrings.pageMoved
  - typingsJapgolly.tablesorter.tablesorterStrings.pagerChange
  - typingsJapgolly.tablesorter.tablesorterStrings.pagerComplete
  - typingsJapgolly.tablesorter.tablesorterStrings.pagerBeforeInitialized
*/
trait PagerEventMap extends js.Object

object PagerEventMap {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pageMoved: typingsJapgolly.tablesorter.tablesorterStrings.pageMoved = this.cast("pageMoved")
  @scala.inline
  def pagerBeforeInitialized: typingsJapgolly.tablesorter.tablesorterStrings.pagerBeforeInitialized = this.cast("pagerBeforeInitialized")
  @scala.inline
  def pagerChange: typingsJapgolly.tablesorter.tablesorterStrings.pagerChange = this.cast("pagerChange")
  @scala.inline
  def pagerComplete: typingsJapgolly.tablesorter.tablesorterStrings.pagerComplete = this.cast("pagerComplete")
  @scala.inline
  def pagerInitialized: typingsJapgolly.tablesorter.tablesorterStrings.pagerInitialized = this.cast("pagerInitialized")
}

