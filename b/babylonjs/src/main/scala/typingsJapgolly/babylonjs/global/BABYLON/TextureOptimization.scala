package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TextureOptimization")
@js.native
/**
  * Creates the TextureOptimization object
  * @param priority defines the priority of this optimization (0 by default which means first in the list)
  * @param maximumSize defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
  * @param step defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
  */
open class TextureOptimization ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.TextureOptimization {
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
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Double,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Unit,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Double,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  def this(
    /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  priority: Unit,
    /**
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  maximumSize: Unit,
    /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  step: Double
  ) = this()
  
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
    * Defines the maximum sized allowed for textures (1024 is the default value). If a texture is bigger, it will be scaled down using a factor defined by the step parameter
    */
  /* CompleteClass */
  var maximumSize: Double = js.native
  
  /**
    * Defines the priority of this optimization (0 by default which means first in the list)
    */
  /* CompleteClass */
  var priority: Double = js.native
  
  /**
    * Defines the factor (0.5 by default) used to scale down textures bigger than maximum sized allowed.
    */
  /* CompleteClass */
  var step: Double = js.native
}
