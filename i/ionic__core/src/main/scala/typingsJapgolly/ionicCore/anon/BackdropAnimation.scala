package typingsJapgolly.ionicCore.anon

import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.Animation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackdropAnimation extends StObject {
  
  var backdropAnimation: Animation
  
  var wrapperAnimation: Animation
}
object BackdropAnimation {
  
  inline def apply(backdropAnimation: Animation, wrapperAnimation: Animation): BackdropAnimation = {
    val __obj = js.Dynamic.literal(backdropAnimation = backdropAnimation.asInstanceOf[js.Any], wrapperAnimation = wrapperAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackdropAnimation]
  }
  
  extension [Self <: BackdropAnimation](x: Self) {
    
    inline def setBackdropAnimation(value: Animation): Self = StObject.set(x, "backdropAnimation", value.asInstanceOf[js.Any])
    
    inline def setWrapperAnimation(value: Animation): Self = StObject.set(x, "wrapperAnimation", value.asInstanceOf[js.Any])
  }
}
