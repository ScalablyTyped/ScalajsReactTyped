package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticleCPUUpdater extends StObject {
  
  var _emitter: Any
  
  def calcSpawnPosition(particleTex: Any, spawnMatrix: Any, extentsInnerRatioUniform: Any, emitterPos: Any, i: Any): Unit
  
  def update(
    data: Any,
    vbToSort: Any,
    particleTex: Any,
    spawnMatrix: Any,
    extentsInnerRatioUniform: Any,
    emitterPos: Any,
    delta: Any,
    isOnStop: Any
  ): Unit
}
object ParticleCPUUpdater {
  
  inline def apply(
    _emitter: Any,
    calcSpawnPosition: (Any, Any, Any, Any, Any) => Callback,
    update: (Any, Any, Any, Any, Any, Any, Any, Any) => Callback
  ): ParticleCPUUpdater = {
    val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], calcSpawnPosition = js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (calcSpawnPosition(t0, t1, t2, t3, t4)).runNow()), update = js.Any.fromFunction8((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any) => (update(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    __obj.asInstanceOf[ParticleCPUUpdater]
  }
  
  extension [Self <: ParticleCPUUpdater](x: Self) {
    
    inline def setCalcSpawnPosition(value: (Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "calcSpawnPosition", js.Any.fromFunction5((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setUpdate(value: (Any, Any, Any, Any, Any, Any, Any, Any) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction8((t0: Any, t1: Any, t2: Any, t3: Any, t4: Any, t5: Any, t6: Any, t7: Any) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def set_emitter(value: Any): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
  }
}
