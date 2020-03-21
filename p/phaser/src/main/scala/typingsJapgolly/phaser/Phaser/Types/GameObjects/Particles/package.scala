package typingsJapgolly.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Particles {
  type DeathZoneSourceCallback = js.Function2[/* x */ scala.Double, /* y */ scala.Double, scala.Unit]
  type EdgeZoneSourceCallback = js.Function2[
    /* quantity */ typingsJapgolly.phaser.integer, 
    /* stepRate */ js.UndefOr[scala.Double], 
    scala.Unit
  ]
  /**
    * The returned value sets what the property will be at the START of the particle's life, on emit.
    */
  type EmitterOpOnEmitCallback = js.Function3[
    /* particle */ typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle, 
    /* key */ java.lang.String, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - js.Array[scala.Double]
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomConfig
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomMinMaxConfig
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpRandomStartEndConfig
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpSteppedConfig
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomEmitConfig
  */
  type EmitterOpOnEmitType = typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles._EmitterOpOnEmitType | js.Array[scala.Double] | scala.Double | typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnEmitCallback
  /**
    * The returned value updates the property for the duration of the particle's life.
    */
  type EmitterOpOnUpdateCallback = js.Function4[
    /* particle */ typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle, 
    /* key */ java.lang.String, 
    /* t */ scala.Double, 
    /* value */ scala.Double, 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig
    - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig
  */
  type EmitterOpOnUpdateType = typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles._EmitterOpOnUpdateType | typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
  type ParticleDeathCallback = js.Function1[
    /* particle */ typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle, 
    scala.Unit
  ]
  type ParticleEmitterCallback = js.Function2[
    /* particle */ typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle, 
    /* emitter */ typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitter, 
    scala.Unit
  ]
  type RandomZoneSourceCallback = js.Function1[/* point */ typingsJapgolly.phaser.Phaser.Math.Vector2, scala.Unit]
}
