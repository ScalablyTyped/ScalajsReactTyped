package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.renderingPrePassEffectConfigurationMod.PrePassEffectConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingSsao2ConfigurationMod {
  
  @JSImport("babylonjs/Rendering/ssao2Configuration", "SSAO2Configuration")
  @js.native
  open class SSAO2Configuration ()
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
