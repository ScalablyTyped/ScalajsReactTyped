package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFMetadata extends js.Object {
  def get(name: String): String
  def has(name: String): Boolean
  def parse(): Unit
}

object PDFMetadata {
  @scala.inline
  def apply(get: String => CallbackTo[String], has: String => CallbackTo[Boolean], parse: Callback): PDFMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("parse")(parse.toJsFn)
    __obj.asInstanceOf[PDFMetadata]
  }
}

