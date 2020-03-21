package typingsJapgolly.domtagger.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Attr
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsJapgolly.domtagger.domtaggerStrings.svg
import typingsJapgolly.std.ChildNode
import typingsJapgolly.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGOptions extends Options {
  @JSName("type")
  var type_SVGOptions: svg
}

object SVGOptions {
  @scala.inline
  def apply(
    any: (Node, js.Array[ChildNode]) => CallbackTo[js.Function1[/* markup */ js.Any, Unit]],
    attribute: (Element, String, Attr) => CallbackTo[js.Function1[/* value */ js.Any, Unit]],
    text: Node => CallbackTo[js.Function1[/* textContent */ js.Any, Unit]],
    `type`: svg,
    convert: /* template */ TemplateStringsArray => CallbackTo[String] = null,
    transform: /* markup */ String => CallbackTo[String] = null
  ): SVGOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("any")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Node, t1: js.Array[typingsJapgolly.std.ChildNode]) => any(t0, t1).runNow()))
    __obj.updateDynamic("attribute")(js.Any.fromFunction3((t0: org.scalajs.dom.raw.Element, t1: java.lang.String, t2: org.scalajs.dom.raw.Attr) => attribute(t0, t1, t2).runNow()))
    __obj.updateDynamic("text")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.Node) => text(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (convert != null) __obj.updateDynamic("convert")(js.Any.fromFunction1((t0: /* template */ typingsJapgolly.std.TemplateStringsArray) => convert(t0).runNow()))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* markup */ java.lang.String) => transform(t0).runNow()))
    __obj.asInstanceOf[SVGOptions]
  }
}

