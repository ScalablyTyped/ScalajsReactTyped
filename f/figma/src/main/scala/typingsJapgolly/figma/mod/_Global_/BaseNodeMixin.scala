package typingsJapgolly.figma.mod._Global_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////
// Mixins
trait BaseNodeMixin extends js.Object {
  val id: String
  var name: String
  val parent: (BaseNode with ChildrenMixin) | Null
   // Note: setting this also sets \`autoRename\` to false on TextNodes
  val removed: Boolean
  def getPluginData(key: String): String
  // Namespace is a string that must be at least 3 alphanumeric characters, and should
  // be a name related to your plugin. Other plugins will be able to read this data.
  def getSharedPluginData(namespace: String, key: String): String
  def remove(): Unit
  def setPluginData(key: String, value: String): Unit
  def setSharedPluginData(namespace: String, key: String, value: String): Unit
}

object BaseNodeMixin {
  @scala.inline
  def apply(
    getPluginData: String => CallbackTo[String],
    getSharedPluginData: (String, String) => CallbackTo[String],
    id: String,
    name: String,
    remove: Callback,
    removed: Boolean,
    setPluginData: (String, String) => Callback,
    setSharedPluginData: (String, String, String) => Callback,
    parent: BaseNode with ChildrenMixin = null
  ): BaseNodeMixin = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.updateDynamic("getPluginData")(js.Any.fromFunction1((t0: java.lang.String) => getPluginData(t0).runNow()))
    __obj.updateDynamic("getSharedPluginData")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getSharedPluginData(t0, t1).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setPluginData")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setPluginData(t0, t1).runNow()))
    __obj.updateDynamic("setSharedPluginData")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => setSharedPluginData(t0, t1, t2).runNow()))
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseNodeMixin]
  }
}

