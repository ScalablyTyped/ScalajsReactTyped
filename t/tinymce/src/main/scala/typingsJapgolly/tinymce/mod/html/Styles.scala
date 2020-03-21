package typingsJapgolly.tinymce.mod.html

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styles extends js.Object {
  def parse(css: String): js.Object
  def serialize(styles: js.Object, elementName: String): String
  def toHex(color: String): String
}

object Styles {
  @scala.inline
  def apply(
    parse: String => CallbackTo[js.Object],
    serialize: (js.Object, String) => CallbackTo[String],
    toHex: String => CallbackTo[String]
  ): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction2((t0: js.Object, t1: java.lang.String) => serialize(t0, t1).runNow()))
    __obj.updateDynamic("toHex")(js.Any.fromFunction1((t0: java.lang.String) => toHex(t0).runNow()))
    __obj.asInstanceOf[Styles]
  }
}

