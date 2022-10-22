package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _EmitterOpOnUpdateType extends StObject
object _EmitterOpOnUpdateType {
  
  inline def EmitterOpCustomUpdateConfig(
    onUpdate: (/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double) => Callback
  ): typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig = {
    val __obj = js.Dynamic.literal(onUpdate = js.Any.fromFunction4((t0: /* particle */ Particle, t1: /* key */ String, t2: /* t */ Double, t3: /* value */ Double) => (onUpdate(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig]
  }
  
  inline def EmitterOpEaseConfig(end: Double, start: Double): typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig]
  }
}
