package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenSpaceReflectionPostProcess
  extends StObject
     with PostProcess {
  
  /* private */ var _enableSmoothReflections: Any = js.native
  
  /* private */ var _forceGeometryBuffer: Any = js.native
  
  /* private */ def _geometryBufferRenderer: Any = js.native
  
  /* private */ var _isSceneRightHanded: Any = js.native
  
  /* private */ def _prePassRenderer: Any = js.native
  
  /* private */ var _reflectionSamples: Any = js.native
  
  /* private */ var _smoothSteps: Any = js.native
  
  /* private */ var _updateEffectDefines: Any = js.native
  
  /**
    * Gets whether or not smoothing reflections is enabled.
    * Enabling smoothing will require more GPU power and can generate a drop in FPS.
    */
  def enableSmoothReflections: Boolean = js.native
  /**
    * Sets whether or not smoothing reflections is enabled.
    * Enabling smoothing will require more GPU power and can generate a drop in FPS.
    */
  def enableSmoothReflections_=(enabled: Boolean): Unit = js.native
  
  /**
    * Gets the number of samples taken while computing reflections. More samples count is high,
    * more the post-process wil require GPU power and can generate a drop in FPS. Basically in interval [25, 100].
    */
  def reflectionSamples: Double = js.native
  /**
    * Sets the number of samples taken while computing reflections. More samples count is high,
    * more the post-process wil require GPU power and can generate a drop in FPS. Basically in interval [25, 100].
    */
  def reflectionSamples_=(samples: Double): Unit = js.native
  
  /**
    * Gets or sets the falloff exponent used while computing fresnel. More the exponent is high, more the reflections will be discrete.
    */
  var reflectionSpecularFalloffExponent: Double = js.native
  
  /**
    * Gets or sets the factor applied when computing roughness. Default value is 0.2.
    */
  var roughnessFactor: Double = js.native
  
  /**
    * Gets the number of samples taken while smoothing reflections. More samples count is high,
    * more the post-process will require GPU power and can generate a drop in FPS.
    * Default value (5.0) work pretty well in all cases but can be adjusted.
    */
  def smoothSteps: Double = js.native
  def smoothSteps_=(steps: Double): Unit = js.native
  
  /**
    * Gets or sets the step size used to iterate until the effect finds the color of the reflection's pixel. Typically in interval [0.1, 1.0]
    */
  var step: Double = js.native
  
  /**
    * Gets or sets the current reflection strength. 1.0 is an ideal value but can be increased/decreased for particular results.
    */
  var strength: Double = js.native
  
  /**
    * Gets or sets a reflection threshold mainly used to adjust the reflection's height.
    */
  var threshold: Double = js.native
}
