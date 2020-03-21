package typingsJapgolly.jqueryTipsy

import typingsJapgolly.jqueryTipsy.JQueryTipsy.Options
import typingsJapgolly.jqueryTipsy.JQueryTipsy.Tipsy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * initialize tipsy plugin
    */
  @JSName("tipsy")
  var tipsy_Original: Tipsy = js.native
  /**
    * initialize tipsy plugin
    */
  /**
    * initialize tipsy plugin
    */
  def tipsy(): JQuery = js.native
  def tipsy(options: Options): JQuery = js.native
}

