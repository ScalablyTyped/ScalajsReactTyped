package typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles

import typingsJapgolly.phaser.Phaser.GameObjects.Particles.Particle
import typingsJapgolly.phaser.Phaser.GameObjects.Particles.ParticleEmitter
import typingsJapgolly.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DeathZoneSourceCallback = js.Function2[/* x */ Double, /* y */ Double, Unit]

type EdgeZoneSourceCallback = js.Function2[/* quantity */ Double, /* stepRate */ js.UndefOr[Double], Unit]

/**
  * The returned value sets what the property will be at the START of the particle's life, on emit.
  */
type EmitterOpOnEmitCallback = js.Function3[/* particle */ Particle, /* key */ String, /* value */ Double, Unit]

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
type EmitterOpOnEmitType = _EmitterOpOnEmitType | js.Array[Double] | Double | EmitterOpOnEmitCallback

/**
  * The returned value updates the property for the duration of the particle's life.
  */
type EmitterOpOnUpdateCallback = js.Function4[/* particle */ Particle, /* key */ String, /* t */ Double, /* value */ Double, Unit]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpOnUpdateCallback
  - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpEaseConfig
  - typingsJapgolly.phaser.Phaser.Types.GameObjects.Particles.EmitterOpCustomUpdateConfig
*/
type EmitterOpOnUpdateType = _EmitterOpOnUpdateType | EmitterOpOnUpdateCallback

type ParticleDeathCallback = js.Function1[/* particle */ Particle, Unit]

type ParticleEmitterCallback = js.Function2[/* particle */ Particle, /* emitter */ ParticleEmitter, Unit]

type RandomZoneSourceCallback = js.Function1[/* point */ Vector2Like, Unit]
