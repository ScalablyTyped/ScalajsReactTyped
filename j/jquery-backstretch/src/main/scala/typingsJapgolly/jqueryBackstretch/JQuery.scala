package typingsJapgolly.jqueryBackstretch

import typingsJapgolly.jqueryBackstretch.JQueryBackStretch.BackStretch
import typingsJapgolly.jqueryBackstretch.JQueryBackStretch.BackStretchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def backstretch(images: js.Array[String]): BackStretch = js.native
  def backstretch(images: js.Array[String], config: BackStretchOptions): BackStretch = js.native
  def backstretch(method: String): JQuery = js.native
}

