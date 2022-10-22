package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceList extends StObject {
  
  def delete(index: Any): Unit
  
  var opaqueMeshInstances: js.Array[Any]
  
  def prepare(index: Any): Unit
  
  var shadowCasters: js.Array[Any]
  
  var transparentMeshInstances: js.Array[Any]
  
  var visibleOpaque: js.Array[Any]
  
  var visibleTransparent: js.Array[Any]
}
object InstanceList {
  
  inline def apply(
    delete: Any => Callback,
    opaqueMeshInstances: js.Array[Any],
    prepare: Any => Callback,
    shadowCasters: js.Array[Any],
    transparentMeshInstances: js.Array[Any],
    visibleOpaque: js.Array[Any],
    visibleTransparent: js.Array[Any]
  ): InstanceList = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1((t0: Any) => delete(t0).runNow()), opaqueMeshInstances = opaqueMeshInstances.asInstanceOf[js.Any], prepare = js.Any.fromFunction1((t0: Any) => prepare(t0).runNow()), shadowCasters = shadowCasters.asInstanceOf[js.Any], transparentMeshInstances = transparentMeshInstances.asInstanceOf[js.Any], visibleOpaque = visibleOpaque.asInstanceOf[js.Any], visibleTransparent = visibleTransparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceList]
  }
  
  extension [Self <: InstanceList](x: Self) {
    
    inline def setDelete(value: Any => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOpaqueMeshInstances(value: js.Array[Any]): Self = StObject.set(x, "opaqueMeshInstances", value.asInstanceOf[js.Any])
    
    inline def setOpaqueMeshInstancesVarargs(value: Any*): Self = StObject.set(x, "opaqueMeshInstances", js.Array(value*))
    
    inline def setPrepare(value: Any => Callback): Self = StObject.set(x, "prepare", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setShadowCasters(value: js.Array[Any]): Self = StObject.set(x, "shadowCasters", value.asInstanceOf[js.Any])
    
    inline def setShadowCastersVarargs(value: Any*): Self = StObject.set(x, "shadowCasters", js.Array(value*))
    
    inline def setTransparentMeshInstances(value: js.Array[Any]): Self = StObject.set(x, "transparentMeshInstances", value.asInstanceOf[js.Any])
    
    inline def setTransparentMeshInstancesVarargs(value: Any*): Self = StObject.set(x, "transparentMeshInstances", js.Array(value*))
    
    inline def setVisibleOpaque(value: js.Array[Any]): Self = StObject.set(x, "visibleOpaque", value.asInstanceOf[js.Any])
    
    inline def setVisibleOpaqueVarargs(value: Any*): Self = StObject.set(x, "visibleOpaque", js.Array(value*))
    
    inline def setVisibleTransparent(value: js.Array[Any]): Self = StObject.set(x, "visibleTransparent", value.asInstanceOf[js.Any])
    
    inline def setVisibleTransparentVarargs(value: Any*): Self = StObject.set(x, "visibleTransparent", js.Array(value*))
  }
}
