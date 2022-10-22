package typingsJapgolly.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SphereDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance SphereDirectedParticleEmitter
  * @param radius the radius of the emission sphere (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
open class SphereDirectedParticleEmitter ()
  extends typingsJapgolly.babylonjs.legacyLegacyMod.SphereDirectedParticleEmitter {
  def this(radius: Double) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    radius: Unit,
    /**
    * The min limit of the emission direction.
    */
  direction1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: Unit,
    /**
    * The max limit of the emission direction.
    */
  direction2: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    radius: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    radius: Unit,
    /**
    * The min limit of the emission direction.
    */
  direction1: Unit,
    /**
    * The max limit of the emission direction.
    */
  direction2: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    radius: Unit,
    /**
    * The min limit of the emission direction.
    */
  direction1: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
}
