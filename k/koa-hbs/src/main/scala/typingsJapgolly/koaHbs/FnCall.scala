package typingsJapgolly.koaHbs

import typingsJapgolly.handlebars.Handlebars.HelperDeclareSpec
import typingsJapgolly.handlebars.Handlebars.HelperDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(name: String, fn: HelperDelegate): Unit = js.native
  def apply(name: HelperDeclareSpec): Unit = js.native
}

