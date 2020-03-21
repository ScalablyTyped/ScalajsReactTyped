package typingsJapgolly.titanium.Titanium.XML

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A key-value paired map that maps String objects to <Titanium.XML.Node> objects.
		 * Implements the [DOM Level 2 API](https://www.w3.org/TR/DOM-Level-2-Core/core.html#ID-1780488922) on Android and iOS.
		 */
trait NamedNodeMap extends Proxy {
  /**
  			 * The number of nodes in the map. The valid range of child node indices is 0-`length`-1, inclusive.
  			 */
  val length: Double
  /**
  			 * Gets the value of the <Titanium.XML.NamedNodeMap.length> property.
  			 */
  def getLength(): Double
  /**
  			 * Retrieves a node specified by name.
  			 */
  def getNamedItem(name: String): Node
  /**
  			 * Retrieves a node specified by name and namespace. Returns `null` if no matching node is in the map.
  			 */
  def getNamedItemNS(namespaceURI: String, localName: String): Node
  /**
  			 * Retrieves the node at the specified index of the map. Note that NamedNodeMaps are not ordered.
  			 */
  def item(index: Double): Node
  /**
  			 * Removes a node from the map specified by name. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value.
  			 */
  def removeNamedItem(name: String): Node
  /**
  			 * Removes a node from the map specified by local name and namespace URI. When this map contains attributes attached to an element, if the removed attribtue is known to have a default, it is replaced with that value. Returns the node removed from the map, or `null` if there is no corresponding node.
  			 */
  def removeNamedItemNS(namespaceURI: String, localName: String): Node
  /**
  			 * Adds a node using its `nodeName` attribute. If a node with that name is already present, it is replaced. Throws an exception if the argument is from a different document, the map is read-only, or the argument is an attribute of another element.
  			 */
  def setNamedItem(node: Node): Node
  /**
  			 * Adds a node using its `namespaceURI` and `localName` attributes. If a node with that name is already present, it is replaced. Throws an exception if the argument is from a different document, the map is read-only, or the argument is an attribute of another element.
  			 */
  def setNamedItemNS(node: Node): Node
}

object NamedNodeMap {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    fireEvent: (String, js.Any) => Callback,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getLength: CallbackTo[Double],
    getNamedItem: String => CallbackTo[Node],
    getNamedItemNS: (String, String) => CallbackTo[Node],
    item: Double => CallbackTo[Node],
    length: Double,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    removeNamedItem: String => CallbackTo[Node],
    removeNamedItemNS: (String, String) => CallbackTo[Node],
    setBubbleParent: Boolean => Callback,
    setNamedItem: Node => CallbackTo[Node],
    setNamedItemNS: Node => CallbackTo[Node],
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): NamedNodeMap = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getNamedItem")(js.Any.fromFunction1((t0: java.lang.String) => getNamedItem(t0).runNow()))
    __obj.updateDynamic("getNamedItemNS")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getNamedItemNS(t0, t1).runNow()))
    __obj.updateDynamic("item")(js.Any.fromFunction1((t0: scala.Double) => item(t0).runNow()))
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("removeNamedItem")(js.Any.fromFunction1((t0: java.lang.String) => removeNamedItem(t0).runNow()))
    __obj.updateDynamic("removeNamedItemNS")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => removeNamedItemNS(t0, t1).runNow()))
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setNamedItem")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.XML.Node) => setNamedItem(t0).runNow()))
    __obj.updateDynamic("setNamedItemNS")(js.Any.fromFunction1((t0: typingsJapgolly.titanium.Titanium.XML.Node) => setNamedItemNS(t0).runNow()))
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedNodeMap]
  }
}

