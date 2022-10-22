package typingsJapgolly.figma.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////////////////////////
// Mixins
trait BaseNodeMixin extends StObject {
  
  def getPluginData(key: String): String
  
  // Namespace is a string that must be at least 3 alphanumeric characters, and should
  // be a name related to your plugin. Other plugins will be able to read this data.
  def getSharedPluginData(namespace: String, key: String): String
  
  val id: String
  
  var name: String
  
  val parent: (BaseNode & ChildrenMixin) | Null
  
  def remove(): Unit
  
  // Note: setting this also sets `autoRename` to false on TextNodes
  val removed: Boolean
  
  def setPluginData(key: String, value: String): Unit
  
  def setRelaunchData(data: StringDictionary[/* description */ String]): Unit
  
  def setSharedPluginData(namespace: String, key: String, value: String): Unit
}
object BaseNodeMixin {
  
  inline def apply(
    getPluginData: String => String,
    getSharedPluginData: (String, String) => String,
    id: String,
    name: String,
    remove: Callback,
    removed: Boolean,
    setPluginData: (String, String) => Callback,
    setRelaunchData: StringDictionary[/* description */ String] => Callback,
    setSharedPluginData: (String, String, String) => Callback
  ): BaseNodeMixin = {
    val __obj = js.Dynamic.literal(getPluginData = js.Any.fromFunction1(getPluginData), getSharedPluginData = js.Any.fromFunction2(getSharedPluginData), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = remove.toJsFn, removed = removed.asInstanceOf[js.Any], setPluginData = js.Any.fromFunction2((t0: String, t1: String) => (setPluginData(t0, t1)).runNow()), setRelaunchData = js.Any.fromFunction1((t0: StringDictionary[/* description */ String]) => setRelaunchData(t0).runNow()), setSharedPluginData = js.Any.fromFunction3((t0: String, t1: String, t2: String) => (setSharedPluginData(t0, t1, t2)).runNow()), parent = null)
    __obj.asInstanceOf[BaseNodeMixin]
  }
  
  extension [Self <: BaseNodeMixin](x: Self) {
    
    inline def setGetPluginData(value: String => String): Self = StObject.set(x, "getPluginData", js.Any.fromFunction1(value))
    
    inline def setGetSharedPluginData(value: (String, String) => String): Self = StObject.set(x, "getSharedPluginData", js.Any.fromFunction2(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: BaseNode & ChildrenMixin): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setSetPluginData(value: (String, String) => Callback): Self = StObject.set(x, "setPluginData", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetRelaunchData(value: StringDictionary[/* description */ String] => Callback): Self = StObject.set(x, "setRelaunchData", js.Any.fromFunction1((t0: StringDictionary[/* description */ String]) => value(t0).runNow()))
    
    inline def setSetSharedPluginData(value: (String, String, String) => Callback): Self = StObject.set(x, "setSharedPluginData", js.Any.fromFunction3((t0: String, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
  }
}
