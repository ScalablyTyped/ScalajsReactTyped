package typingsJapgolly.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationAnimateChildMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
}
object AnimationAnimateChildMetadata {
  
  inline def apply(`type`: AnimationMetadataType): AnimationAnimateChildMetadata = {
    val __obj = js.Dynamic.literal(options = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateChildMetadata]
  }
  
  extension [Self <: AnimationAnimateChildMetadata](x: Self) {
    
    inline def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
