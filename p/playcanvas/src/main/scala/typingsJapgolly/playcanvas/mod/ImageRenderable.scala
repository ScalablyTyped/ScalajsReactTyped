package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRenderable extends StObject {
  
  var _element: Any
  
  var _entity: Any
  
  var _meshDirty: Boolean
  
  def deleteParameter(name: Any): Unit
  
  def destroy(): Unit
  
  def forceUpdateAabb(mask: Any): Unit
  
  var mesh: Any
  
  var meshInstance: MeshInstance
  
  var model: Model
  
  var node: GraphNode
  
  def setAabbFunc(fn: Any): Unit
  
  def setCull(cull: Any): Unit
  
  def setDrawOrder(drawOrder: Any): Unit
  
  def setLayer(layer: Any): Unit
  
  def setMask(mask: Any): Unit
  
  def setMaterial(material: Any): Unit
  
  def setMesh(mesh: Any): Unit
  
  def setParameter(name: Any, value: Any): Unit
  
  def setScreenSpace(screenSpace: Any): Unit
  
  def setUnmaskDrawOrder(): Unit
  
  var unmaskMeshInstance: MeshInstance
}
object ImageRenderable {
  
  inline def apply(
    _element: Any,
    _entity: Any,
    _meshDirty: Boolean,
    deleteParameter: Any => Callback,
    destroy: Callback,
    forceUpdateAabb: Any => Callback,
    mesh: Any,
    meshInstance: MeshInstance,
    model: Model,
    node: GraphNode,
    setAabbFunc: Any => Callback,
    setCull: Any => Callback,
    setDrawOrder: Any => Callback,
    setLayer: Any => Callback,
    setMask: Any => Callback,
    setMaterial: Any => Callback,
    setMesh: Any => Callback,
    setParameter: (Any, Any) => Callback,
    setScreenSpace: Any => Callback,
    setUnmaskDrawOrder: Callback,
    unmaskMeshInstance: MeshInstance
  ): ImageRenderable = {
    val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _entity = _entity.asInstanceOf[js.Any], _meshDirty = _meshDirty.asInstanceOf[js.Any], deleteParameter = js.Any.fromFunction1((t0: Any) => deleteParameter(t0).runNow()), destroy = destroy.toJsFn, forceUpdateAabb = js.Any.fromFunction1((t0: Any) => forceUpdateAabb(t0).runNow()), mesh = mesh.asInstanceOf[js.Any], meshInstance = meshInstance.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], setAabbFunc = js.Any.fromFunction1((t0: Any) => setAabbFunc(t0).runNow()), setCull = js.Any.fromFunction1((t0: Any) => setCull(t0).runNow()), setDrawOrder = js.Any.fromFunction1((t0: Any) => setDrawOrder(t0).runNow()), setLayer = js.Any.fromFunction1((t0: Any) => setLayer(t0).runNow()), setMask = js.Any.fromFunction1((t0: Any) => setMask(t0).runNow()), setMaterial = js.Any.fromFunction1((t0: Any) => setMaterial(t0).runNow()), setMesh = js.Any.fromFunction1((t0: Any) => setMesh(t0).runNow()), setParameter = js.Any.fromFunction2((t0: Any, t1: Any) => (setParameter(t0, t1)).runNow()), setScreenSpace = js.Any.fromFunction1((t0: Any) => setScreenSpace(t0).runNow()), setUnmaskDrawOrder = setUnmaskDrawOrder.toJsFn, unmaskMeshInstance = unmaskMeshInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRenderable]
  }
  
  extension [Self <: ImageRenderable](x: Self) {
    
    inline def setDeleteParameter(value: Any => Callback): Self = StObject.set(x, "deleteParameter", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setForceUpdateAabb(value: Any => Callback): Self = StObject.set(x, "forceUpdateAabb", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setMesh(value: Any): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshInstance(value: MeshInstance): Self = StObject.set(x, "meshInstance", value.asInstanceOf[js.Any])
    
    inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setNode(value: GraphNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSetAabbFunc(value: Any => Callback): Self = StObject.set(x, "setAabbFunc", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetCull(value: Any => Callback): Self = StObject.set(x, "setCull", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetDrawOrder(value: Any => Callback): Self = StObject.set(x, "setDrawOrder", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetLayer(value: Any => Callback): Self = StObject.set(x, "setLayer", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMask(value: Any => Callback): Self = StObject.set(x, "setMask", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMaterial(value: Any => Callback): Self = StObject.set(x, "setMaterial", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetMesh(value: Any => Callback): Self = StObject.set(x, "setMesh", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetParameter(value: (Any, Any) => Callback): Self = StObject.set(x, "setParameter", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSetScreenSpace(value: Any => Callback): Self = StObject.set(x, "setScreenSpace", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetUnmaskDrawOrder(value: Callback): Self = StObject.set(x, "setUnmaskDrawOrder", value.toJsFn)
    
    inline def setUnmaskMeshInstance(value: MeshInstance): Self = StObject.set(x, "unmaskMeshInstance", value.asInstanceOf[js.Any])
    
    inline def set_element(value: Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
    
    inline def set_entity(value: Any): Self = StObject.set(x, "_entity", value.asInstanceOf[js.Any])
    
    inline def set_meshDirty(value: Boolean): Self = StObject.set(x, "_meshDirty", value.asInstanceOf[js.Any])
  }
}
