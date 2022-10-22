package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardMaterialOptionsBuilder extends StObject {
  
  def _collectLights(lType: Any, lights: Any, lightsFiltered: Any, mask: Any, staticLightList: Any): Unit
  
  def _getMapTransformID(xform: Any, uv: Any): Any
  
  var _mapXForms: js.Array[Any]
  
  def _updateEnvOptions(options: Any, stdMat: Any, scene: Any): Unit
  
  def _updateLightOptions(options: Any, stdMat: Any, objDefs: Any, sortedLights: Any, staticLightList: Any): Unit
  
  def _updateMaterialOptions(options: Any, stdMat: Any): Unit
  
  def _updateMinOptions(options: Any, stdMat: Any): Unit
  
  def _updateSharedOptions(options: Any, scene: Any, stdMat: Any, objDefs: Any, pass: Any): Unit
  
  def _updateTexOptions(
    options: Any,
    stdMat: Any,
    p: Any,
    hasUv0: Any,
    hasUv1: Any,
    hasVcolor: Any,
    minimalOptions: Any,
    uniqueTextureMap: Any
  ): Unit
  
  def _updateUVOptions(options: Any, stdMat: Any, objDefs: Any, minimalOptions: Any): Unit
  
  def updateMinRef(
    options: Any,
    scene: Any,
    stdMat: Any,
    objDefs: Any,
    staticLightList: Any,
    pass: Any,
    sortedLights: Any
  ): Unit
  
  def updateRef(
    options: Any,
    scene: Any,
    stdMat: Any,
    objDefs: Any,
    staticLightList: Any,
    pass: Any,
    sortedLights: Any
  ): Unit
}
object StandardMaterialOptionsBuilder {
  
  inline def apply(
    _collectLights: (Any, Any, Any, Any, Any) => Callback,
    _getMapTransformID: (Any, Any) => Any,
    _mapXForms: js.Array[Any],
    _updateEnvOptions: (Any, Any, Any) => Callback,
    _updateLightOptions: (Any, Any, Any, Any, Any) => Callback,
    _updateMaterialOptions: (Any, Any) => Callback,
    _updateMinOptions: (Any, Any) => Callback,
    _updateSharedOptions: (Any, Any, Any, Any, Any) => Callback,
    _updateTexOptions: (Any, Any, Any, Any, Any, Any, Any, Any) => Callback,
    _updateUVOptions: (Any, Any, Any, Any) => Callback,
    updateMinRef: (Any, Any, Any, Any, Any, Any, Any) => Callback,
    updateRef: (Any, Any, Any, Any, Any, Any, Any) => Callback
  ): StandardMaterialOptionsBuilder = {
    val __obj = js.Dynamic.literal(_collectLights = js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (_collectLights(t0, t1, t2, t3, t4)).runNow()), _getMapTransformID = js.Any.fromFunction2(_getMapTransformID), _mapXForms = _mapXForms.asInstanceOf[js.Any], _updateEnvOptions = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (_updateEnvOptions(t0, t1, t2)).runNow()), _updateLightOptions = js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (_updateLightOptions(t0, t1, t2, t3, t4)).runNow()), _updateMaterialOptions = js.Any.fromFunction2((t0: Any, t1: Any) => (_updateMaterialOptions(t0, t1)).runNow()), _updateMinOptions = js.Any.fromFunction2((t0: Any, t1: Any) => (_updateMinOptions(t0, t1)).runNow()), _updateSharedOptions = js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (_updateSharedOptions(t0, t1, t2, t3, t4)).runNow()), _updateTexOptions = js.Any.fromFunction8((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any) => (_updateTexOptions(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), _updateUVOptions = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (_updateUVOptions(t0, t1, t2, t3)).runNow()), updateMinRef = js.Any.fromFunction7((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any) => (updateMinRef(t0, t1, t2, t3, t4, t5, t6)).runNow()), updateRef = js.Any.fromFunction7((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any) => (updateRef(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    __obj.asInstanceOf[StandardMaterialOptionsBuilder]
  }
  
  extension [Self <: StandardMaterialOptionsBuilder](x: Self) {
    
    inline def setUpdateMinRef(value: (Any, Any, Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "updateMinRef", js.Any.fromFunction7((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setUpdateRef(value: (Any, Any, Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "updateRef", js.Any.fromFunction7((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def set_collectLights(value: (Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "_collectLights", js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def set_getMapTransformID(value: (Any, Any) => Any): Self = StObject.set(x, "_getMapTransformID", js.Any.fromFunction2(value))
    
    inline def set_mapXForms(value: js.Array[Any]): Self = StObject.set(x, "_mapXForms", value.asInstanceOf[js.Any])
    
    inline def set_mapXFormsVarargs(value: Any*): Self = StObject.set(x, "_mapXForms", js.Array(value*))
    
    inline def set_updateEnvOptions(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "_updateEnvOptions", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def set_updateLightOptions(value: (Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "_updateLightOptions", js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def set_updateMaterialOptions(value: (Any, Any) => Callback): Self = StObject.set(x, "_updateMaterialOptions", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def set_updateMinOptions(value: (Any, Any) => Callback): Self = StObject.set(x, "_updateMinOptions", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def set_updateSharedOptions(value: (Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "_updateSharedOptions", js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def set_updateTexOptions(value: (Any, Any, Any, Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "_updateTexOptions", js.Any.fromFunction8((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def set_updateUVOptions(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "_updateUVOptions", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
  }
}
