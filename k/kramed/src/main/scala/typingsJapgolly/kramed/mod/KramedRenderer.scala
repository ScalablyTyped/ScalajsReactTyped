package typingsJapgolly.kramed.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kramed.AnonAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KramedRenderer extends js.Object {
  def blockquote(quote: String): String
  def br(): String
  def code(code: String, language: String): String
  def codespan(code: String): String
  def del(text: String): String
  def em(text: String): String
  def heading(text: String, level: Double, raw: String): String
  def hr(): String
  def html(html: String): String
  def image(href: String, title: String, text: String): String
  def link(href: String, title: String, text: String): String
  def list(body: String, ordered: Boolean): String
  def listitem(text: String): String
  def paragraph(text: String): String
  def strong(text: String): String
  def table(header: String, body: String): String
  def tablecell(content: String, flags: AnonAlign): String
  def tablerow(content: String): String
  def text(text: String): String
}

object KramedRenderer {
  @scala.inline
  def apply(
    blockquote: String => CallbackTo[String],
    br: CallbackTo[String],
    code: (String, String) => CallbackTo[String],
    codespan: String => CallbackTo[String],
    del: String => CallbackTo[String],
    em: String => CallbackTo[String],
    heading: (String, Double, String) => CallbackTo[String],
    hr: CallbackTo[String],
    html: String => CallbackTo[String],
    image: (String, String, String) => CallbackTo[String],
    link: (String, String, String) => CallbackTo[String],
    list: (String, Boolean) => CallbackTo[String],
    listitem: String => CallbackTo[String],
    paragraph: String => CallbackTo[String],
    strong: String => CallbackTo[String],
    table: (String, String) => CallbackTo[String],
    tablecell: (String, AnonAlign) => CallbackTo[String],
    tablerow: String => CallbackTo[String],
    text: String => CallbackTo[String]
  ): KramedRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockquote")(js.Any.fromFunction1((t0: java.lang.String) => blockquote(t0).runNow()))
    __obj.updateDynamic("br")(br.toJsFn)
    __obj.updateDynamic("code")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => code(t0, t1).runNow()))
    __obj.updateDynamic("codespan")(js.Any.fromFunction1((t0: java.lang.String) => codespan(t0).runNow()))
    __obj.updateDynamic("del")(js.Any.fromFunction1((t0: java.lang.String) => del(t0).runNow()))
    __obj.updateDynamic("em")(js.Any.fromFunction1((t0: java.lang.String) => em(t0).runNow()))
    __obj.updateDynamic("heading")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: java.lang.String) => heading(t0, t1, t2).runNow()))
    __obj.updateDynamic("hr")(hr.toJsFn)
    __obj.updateDynamic("html")(js.Any.fromFunction1((t0: java.lang.String) => html(t0).runNow()))
    __obj.updateDynamic("image")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => image(t0, t1, t2).runNow()))
    __obj.updateDynamic("link")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => link(t0, t1, t2).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => list(t0, t1).runNow()))
    __obj.updateDynamic("listitem")(js.Any.fromFunction1((t0: java.lang.String) => listitem(t0).runNow()))
    __obj.updateDynamic("paragraph")(js.Any.fromFunction1((t0: java.lang.String) => paragraph(t0).runNow()))
    __obj.updateDynamic("strong")(js.Any.fromFunction1((t0: java.lang.String) => strong(t0).runNow()))
    __obj.updateDynamic("table")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => table(t0, t1).runNow()))
    __obj.updateDynamic("tablecell")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.kramed.AnonAlign) => tablecell(t0, t1).runNow()))
    __obj.updateDynamic("tablerow")(js.Any.fromFunction1((t0: java.lang.String) => tablerow(t0).runNow()))
    __obj.updateDynamic("text")(js.Any.fromFunction1((t0: java.lang.String) => text(t0).runNow()))
    __obj.asInstanceOf[KramedRenderer]
  }
}

