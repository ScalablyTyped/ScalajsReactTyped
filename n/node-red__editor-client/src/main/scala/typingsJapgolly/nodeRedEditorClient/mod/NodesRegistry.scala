package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesRegistry extends StObject {
  
  def addNodeSet(ns: js.Object): Unit
  
  def disableNodeSet(id: String): Unit
  
  def enableNodeSet(id: String): Unit
  
  def getIconSets(): Record[String, js.Array[String]]
  
  def getModule(module: String): js.Object
  
  def getModuleList(): js.Object
  
  def getNodeList(): js.Array[js.Object]
  
  def getNodeSet(id: String): js.Object
  
  def getNodeSetForType(nodeType: String): js.Object
  
  def getNodeType(nt: String): NodeDef[NodeProperties, Unit, NodeProperties]
  
  def getNodeTypes(): js.Array[String]
  
  /**
    * Registers a node with the editor.     *
    * @param nt The node type is used throughout the editor to identify the node. It must
    * match the value used by the call to RED.nodes.registerType in the corresponding runtime
    * script.
    * @param def The node definition contains all of the information about the node
    * needed by the editor.
    */
  def registerNodeType[TProps /* <: NodeProperties */, TCreds, TInstProps /* <: TProps */](nt: String, `def`: NodeDef[TProps, TCreds, TInstProps]): Unit
  
  def removeNodeSet[T /* <: js.Object */](ns: T): T
  
  def removeNodeType(nt: String): Unit
  
  def setIconSets(sets: Record[String, js.Array[String]]): Unit
  
  def setModulePendingUpdated(module: String, version: String): Unit
  
  def setNodeList(list: js.Array[js.Object]): Unit
}
object NodesRegistry {
  
  inline def apply(
    addNodeSet: js.Object => Callback,
    disableNodeSet: String => Callback,
    enableNodeSet: String => Callback,
    getIconSets: CallbackTo[Record[String, js.Array[String]]],
    getModule: String => js.Object,
    getModuleList: CallbackTo[js.Object],
    getNodeList: CallbackTo[js.Array[js.Object]],
    getNodeSet: String => js.Object,
    getNodeSetForType: String => js.Object,
    getNodeType: String => NodeDef[NodeProperties, Unit, NodeProperties],
    getNodeTypes: CallbackTo[js.Array[String]],
    registerNodeType: (String, NodeDef[Any, Any, Any]) => Callback,
    removeNodeSet: Any => Any,
    removeNodeType: String => Callback,
    setIconSets: Record[String, js.Array[String]] => Callback,
    setModulePendingUpdated: (String, String) => Callback,
    setNodeList: js.Array[js.Object] => Callback
  ): NodesRegistry = {
    val __obj = js.Dynamic.literal(addNodeSet = js.Any.fromFunction1((t0: js.Object) => addNodeSet(t0).runNow()), disableNodeSet = js.Any.fromFunction1((t0: String) => disableNodeSet(t0).runNow()), enableNodeSet = js.Any.fromFunction1((t0: String) => enableNodeSet(t0).runNow()), getIconSets = getIconSets.toJsFn, getModule = js.Any.fromFunction1(getModule), getModuleList = getModuleList.toJsFn, getNodeList = getNodeList.toJsFn, getNodeSet = js.Any.fromFunction1(getNodeSet), getNodeSetForType = js.Any.fromFunction1(getNodeSetForType), getNodeType = js.Any.fromFunction1(getNodeType), getNodeTypes = getNodeTypes.toJsFn, registerNodeType = js.Any.fromFunction2((t0: String, t1: NodeDef[Any, Any, Any]) => (registerNodeType(t0, t1)).runNow()), removeNodeSet = js.Any.fromFunction1(removeNodeSet), removeNodeType = js.Any.fromFunction1((t0: String) => removeNodeType(t0).runNow()), setIconSets = js.Any.fromFunction1((t0: Record[String, js.Array[String]]) => setIconSets(t0).runNow()), setModulePendingUpdated = js.Any.fromFunction2((t0: String, t1: String) => (setModulePendingUpdated(t0, t1)).runNow()), setNodeList = js.Any.fromFunction1((t0: js.Array[js.Object]) => setNodeList(t0).runNow()))
    __obj.asInstanceOf[NodesRegistry]
  }
  
  extension [Self <: NodesRegistry](x: Self) {
    
    inline def setAddNodeSet(value: js.Object => Callback): Self = StObject.set(x, "addNodeSet", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDisableNodeSet(value: String => Callback): Self = StObject.set(x, "disableNodeSet", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEnableNodeSet(value: String => Callback): Self = StObject.set(x, "enableNodeSet", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetIconSets(value: CallbackTo[Record[String, js.Array[String]]]): Self = StObject.set(x, "getIconSets", value.toJsFn)
    
    inline def setGetModule(value: String => js.Object): Self = StObject.set(x, "getModule", js.Any.fromFunction1(value))
    
    inline def setGetModuleList(value: CallbackTo[js.Object]): Self = StObject.set(x, "getModuleList", value.toJsFn)
    
    inline def setGetNodeList(value: CallbackTo[js.Array[js.Object]]): Self = StObject.set(x, "getNodeList", value.toJsFn)
    
    inline def setGetNodeSet(value: String => js.Object): Self = StObject.set(x, "getNodeSet", js.Any.fromFunction1(value))
    
    inline def setGetNodeSetForType(value: String => js.Object): Self = StObject.set(x, "getNodeSetForType", js.Any.fromFunction1(value))
    
    inline def setGetNodeType(value: String => NodeDef[NodeProperties, Unit, NodeProperties]): Self = StObject.set(x, "getNodeType", js.Any.fromFunction1(value))
    
    inline def setGetNodeTypes(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getNodeTypes", value.toJsFn)
    
    inline def setRegisterNodeType(value: (String, NodeDef[Any, Any, Any]) => Callback): Self = StObject.set(x, "registerNodeType", js.Any.fromFunction2((t0: String, t1: NodeDef[Any, Any, Any]) => (value(t0, t1)).runNow()))
    
    inline def setRemoveNodeSet(value: Any => Any): Self = StObject.set(x, "removeNodeSet", js.Any.fromFunction1(value))
    
    inline def setRemoveNodeType(value: String => Callback): Self = StObject.set(x, "removeNodeType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetIconSets(value: Record[String, js.Array[String]] => Callback): Self = StObject.set(x, "setIconSets", js.Any.fromFunction1((t0: Record[String, js.Array[String]]) => value(t0).runNow()))
    
    inline def setSetModulePendingUpdated(value: (String, String) => Callback): Self = StObject.set(x, "setModulePendingUpdated", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSetNodeList(value: js.Array[js.Object] => Callback): Self = StObject.set(x, "setNodeList", js.Any.fromFunction1((t0: js.Array[js.Object]) => value(t0).runNow()))
  }
}
