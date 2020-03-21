package typingsJapgolly.xmljs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlNode extends Node {
  var localName: String
  var name: String
  var ns: String
  var prefix: String
  var text: String
}

object XmlNode {
  @scala.inline
  def apply(
    getAttribute: (String, Boolean) => CallbackTo[XmlAttribute],
    localName: String,
    name: String,
    ns: String,
    path: (js.Array[String], Boolean) => CallbackTo[js.Array[XmlNode]],
    prefix: String,
    text: String,
    visit: js.Function1[XmlNode, Unit] => Callback
  ): XmlNode = {
    val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => getAttribute(t0, t1).runNow()))
    __obj.updateDynamic("path")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: scala.Boolean) => path(t0, t1).runNow()))
    __obj.updateDynamic("visit")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.xmljs.mod.XmlNode, scala.Unit]) => visit(t0).runNow()))
    __obj.asInstanceOf[XmlNode]
  }
}

