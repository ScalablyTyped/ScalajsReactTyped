package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.renderingPrePassEffectConfigurationMod.PrePassEffectConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingMotionBlurConfigurationMod {
  
  @JSImport("babylonjs/Rendering/motionBlurConfiguration", "MotionBlurConfiguration")
  @js.native
  open class MotionBlurConfiguration ()
    extends StObject
       with PrePassEffectConfiguration {
    
    /**
      * Is the effect enabled
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * Name of the effect
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Textures required in the MRT
      */
    /* CompleteClass */
    var texturesRequired: js.Array[Double] = js.native
  }
}
