package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrePassEffectConfiguration extends StObject {
  
  /**
    * Creates the associated post process
    */
  var createPostProcess: js.UndefOr[js.Function0[PostProcess]] = js.undefined
  
  /**
    * Disposes the effect configuration
    */
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Is the effect enabled
    */
  var enabled: Boolean
  
  /**
    * Name of the effect
    */
  var name: String
  
  /**
    * Does the output of this prepass need to go through imageprocessing
    */
  var needsImageProcessing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Post process to attach for this effect
    */
  var postProcess: js.UndefOr[PostProcess] = js.undefined
  
  /**
    * Textures required in the MRT
    */
  var texturesRequired: js.Array[Double]
}
object PrePassEffectConfiguration {
  
  inline def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): PrePassEffectConfiguration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrePassEffectConfiguration]
  }
  
  extension [Self <: PrePassEffectConfiguration](x: Self) {
    
    inline def setCreatePostProcess(value: CallbackTo[PostProcess]): Self = StObject.set(x, "createPostProcess", value.toJsFn)
    
    inline def setCreatePostProcessUndefined: Self = StObject.set(x, "createPostProcess", js.undefined)
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNeedsImageProcessing(value: Boolean): Self = StObject.set(x, "needsImageProcessing", value.asInstanceOf[js.Any])
    
    inline def setNeedsImageProcessingUndefined: Self = StObject.set(x, "needsImageProcessing", js.undefined)
    
    inline def setPostProcess(value: PostProcess): Self = StObject.set(x, "postProcess", value.asInstanceOf[js.Any])
    
    inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    inline def setTexturesRequired(value: js.Array[Double]): Self = StObject.set(x, "texturesRequired", value.asInstanceOf[js.Any])
    
    inline def setTexturesRequiredVarargs(value: Double*): Self = StObject.set(x, "texturesRequired", js.Array(value*))
  }
}
