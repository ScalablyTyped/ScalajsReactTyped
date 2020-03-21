package typingsJapgolly.jqueryLivestampjs.mod._Global_

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def livestamp(date: Date): JQuery = js.native
  def livestamp(moment: Moment): JQuery = js.native
  def livestamp(timestamp: String): JQuery = js.native
  def livestamp(timestamp: Double): JQuery = js.native
}

