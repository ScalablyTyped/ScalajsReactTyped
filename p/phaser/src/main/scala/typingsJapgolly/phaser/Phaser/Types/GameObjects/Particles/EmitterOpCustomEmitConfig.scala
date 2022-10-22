package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmitterOpCustomEmitConfig
  extends StObject
     with _EmitterOpOnEmitType {
  
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  def onEmit(particle: Particle, key: String, value: Double): Unit
  /**
    * A callback that is invoked each time the emitter emits a particle.
    */
  @JSName("onEmit")
  var onEmit_Original: EmitterOpOnEmitCallback
}
object EmitterOpCustomEmitConfig {
  
  inline def apply(onEmit: (/* particle */ Particle, /* key */ String, /* value */ Double) => Callback): EmitterOpCustomEmitConfig = {
    val __obj = js.Dynamic.literal(onEmit = js.Any.fromFunction3((t0: /* particle */ Particle, t1: /* key */ String, t2: /* value */ Double) => (onEmit(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[EmitterOpCustomEmitConfig]
  }
  
  extension [Self <: EmitterOpCustomEmitConfig](x: Self) {
    
    inline def setOnEmit(value: (/* particle */ Particle, /* key */ String, /* value */ Double) => Callback): Self = StObject.set(x, "onEmit", js.Any.fromFunction3((t0: /* particle */ Particle, t1: /* key */ String, t2: /* value */ Double) => (value(t0, t1, t2)).runNow()))
  }
}
