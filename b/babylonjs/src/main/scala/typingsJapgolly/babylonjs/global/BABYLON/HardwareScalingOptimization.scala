package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.HardwareScalingOptimization")
@js.native
/**
  * Creates the HardwareScalingOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param maximumScale defines the maximum scale to use (2 by default)
  * @param step defines the step to use between two passes (0.5 by default)
  */
open class HardwareScalingOptimization ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.HardwareScalingOptimization {
  def this(/**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Double,
    /**
    * Defines the step to use between two passes (0.5 by default)
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Unit,
    /**
    * Defines the step to use between two passes (0.5 by default)
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Double,
    /**
    * Defines the step to use between two passes (0.5 by default)
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum scale to use (2 by default)
    */
  maximumScale: Unit,
    /**
    * Defines the step to use between two passes (0.5 by default)
    */
  step: Double
  ) = this()
  
  /* private */ /* CompleteClass */
  var _currentScale: Any = js.native
  
  /* private */ /* CompleteClass */
  var _directionOffset: Any = js.native
  
  /**
    * This function will be called by the SceneOptimizer when its priority is reached in order to apply the change required by the current optimization
    * @param scene defines the current scene where to apply this optimization
    * @param optimizer defines the current optimizer
    * @returns true if everything that can be done was applied
    */
  /* CompleteClass */
  @JSName("apply")
  override def apply(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    optimizer: typingsJapgolly.babylonjs.BABYLON.SceneOptimizer
  ): Boolean = js.native
  
  /**
    * Gets a string describing the action executed by the current optimization
    * @returns description string
    */
  /* CompleteClass */
  override def getDescription(): String = js.native
  
  /**
    * Defines the maximum scale to use (2 by default)
    */
  /* CompleteClass */
  var maximumScale: Double = js.native
  
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  var priority: Double = js.native
  
  /**
    * Defines the step to use between two passes (0.5 by default)
    */
  /* CompleteClass */
  var step: Double = js.native
}
