package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitterOpCustomUpdateConfig
  extends StObject
     with _EmitterOpOnUpdateType {
  
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  var onEmit: js.UndefOr[EmitterOpOnEmitCallback] = js.undefined
  
  /**
    * A callback that is invoked each time the emitter updates.
    */
  def onUpdate(particle: Particle, key: String, t: Double, value: Double): Unit
  /**
    * A callback that is invoked each time the emitter updates.
    */
  @JSName("onUpdate")
  var onUpdate_Original: EmitterOpOnUpdateCallback
}
object EmitterOpCustomUpdateConfig {
  
  inline def apply(
    onUpdate: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Callback
  ): EmitterOpCustomUpdateConfig = {
    val __obj = js.Dynamic.literal(onUpdate = js.Any.fromFunction4((t0: /* particle */ Particle, t1: /* key */ String, t2: /* t */ Double, t3: /* value */ Double) => (onUpdate(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[EmitterOpCustomUpdateConfig]
  }
  
  extension [Self <: EmitterOpCustomUpdateConfig](x: Self) {
    
    inline def setOnEmit(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Callback): Self = StObject.set(x, "onEmit", js.Any.fromFunction3((t0: /* particle */ Particle, t1: /* key */ String, t2: /* value */ Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnEmitUndefined: Self = StObject.set(x, "onEmit", js.undefined)
    
    inline def setOnUpdate(value: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction4((t0: /* particle */ Particle, t1: /* key */ String, t2: /* t */ Double, t3: /* value */ Double) => (value(t0, t1, t2, t3)).runNow()))
  }
}
