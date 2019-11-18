package typingsJapgolly.jquery.JQuery

import typingsJapgolly.jquery.JQuery.Ajax.TextStatus
import typingsJapgolly.jquery.JQuery.Transport.SuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  def abort(): Unit
  def send(headers: PlainObject[_], completeCallback: SuccessCallback): Unit
}

@JSGlobal("JQuery.Transport")
@js.native
object Transport extends js.Object {
  type SuccessCallback = js.Function4[
    /* status */ Double, 
    /* statusText */ TextStatus, 
    /* responses */ js.UndefOr[PlainObject[js.Any]], 
    /* headers */ js.UndefOr[String], 
    Unit
  ]
}

