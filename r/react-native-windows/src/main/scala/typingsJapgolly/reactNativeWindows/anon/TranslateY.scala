package typingsJapgolly.reactNativeWindows.anon

import typingsJapgolly.reactNativeWindows.rntypesMod.Animated.AnimatedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateY extends StObject {
  
  var translateY: AnimatedValue
}
object TranslateY {
  
  inline def apply(translateY: AnimatedValue): TranslateY = {
    val __obj = js.Dynamic.literal(translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateY]
  }
  
  extension [Self <: TranslateY](x: Self) {
    
    inline def setTranslateY(value: AnimatedValue): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
