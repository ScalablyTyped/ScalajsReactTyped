package typingsJapgolly.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Particle")
@js.native
open class Particle protected ()
  extends typingsJapgolly.babylonjs.indexMod.Particle {
  /**
    * Creates a new instance Particle
    * @param particleSystem the particle system the particle belongs to
    */
  def this(/**
    * The particle system the particle belongs to.
    */
  particleSystem: typingsJapgolly.babylonjs.particlesParticleSystemMod.ParticleSystem) = this()
}
/* static members */
object Particle {
  
  @JSImport("babylonjs/Legacy/legacy", "Particle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Legacy/legacy", "Particle._Count")
  @js.native
  def _Count: Any = js.native
  inline def _Count_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Count")(x.asInstanceOf[js.Any])
}
