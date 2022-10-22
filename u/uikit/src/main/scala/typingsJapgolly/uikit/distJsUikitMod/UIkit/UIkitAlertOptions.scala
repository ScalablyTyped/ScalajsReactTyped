package typingsJapgolly.uikit.distJsUikitMod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitAlertOptions extends StObject {
  
  var animation: js.UndefOr[Boolean | String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var `sel-close`: js.UndefOr[String] = js.undefined
}
object UIkitAlertOptions {
  
  inline def apply(): UIkitAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitAlertOptions]
  }
  
  extension [Self <: UIkitAlertOptions](x: Self) {
    
    inline def setAnimation(value: Boolean | String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def `setSel-close`(value: String): Self = StObject.set(x, "sel-close", value.asInstanceOf[js.Any])
    
    inline def `setSel-closeUndefined`: Self = StObject.set(x, "sel-close", js.undefined)
  }
}
