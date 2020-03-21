package typingsJapgolly.xmljs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  /**
    * Gets an node attribute by name
    * @param attrName  Name of the attribute
    * @param ignoreCase  whenever or not to ignore the name casing
    */
  def getAttribute(attrName: String, ignoreCase: Boolean): XmlAttribute
  /**
    * Traverses the XML Nodes and iterates through specified path
    * @param path  Node names to traverse down
    * @param ignoreCase  Ignore the casing of the path / node names
    */
  def path(path: js.Array[String], ignoreCase: Boolean): js.Array[XmlNode]
  /**
    * Recursively traverses the nodes and calls the given function in-order
    * @param fn Function to call for each node
    */
  def visit(fn: js.Function1[/* n */ this.type, Unit]): Unit
}

object Node {
  @scala.inline
  def apply(
    getAttribute: (String, Boolean) => CallbackTo[XmlAttribute],
    path: (js.Array[String], Boolean) => CallbackTo[js.Array[XmlNode]],
    visit: js.Function1[Node, Unit] => Callback
  ): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => getAttribute(t0, t1).runNow()))
    __obj.updateDynamic("path")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: scala.Boolean) => path(t0, t1).runNow()))
    __obj.updateDynamic("visit")(js.Any.fromFunction1((t0: js.Function1[typingsJapgolly.xmljs.mod.Node, scala.Unit]) => visit(t0).runNow()))
    __obj.asInstanceOf[Node]
  }
}

