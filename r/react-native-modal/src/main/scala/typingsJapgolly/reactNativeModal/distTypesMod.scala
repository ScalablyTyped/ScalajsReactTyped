package typingsJapgolly.reactNativeModal

import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.NativeTouchEvent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeAnimatable.mod.Animation
import typingsJapgolly.reactNativeAnimatable.mod.CustomAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @js.native
  trait AnimationEvent extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait Animations extends StObject {
    
    var animationIn: String
    
    var animationOut: String
  }
  object Animations {
    
    inline def apply(animationIn: String, animationOut: String): Animations = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animations]
    }
    
    extension [Self <: Animations](x: Self) {
      
      inline def setAnimationIn(value: String): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      inline def setAnimationOut(value: String): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.up
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.down
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.left
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.right
  */
  trait Direction extends StObject
  object Direction {
    
    inline def down: typingsJapgolly.reactNativeModal.reactNativeModalStrings.down = "down".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.down]
    
    inline def left: typingsJapgolly.reactNativeModal.reactNativeModalStrings.left = "left".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.left]
    
    inline def right: typingsJapgolly.reactNativeModal.reactNativeModalStrings.right = "right".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.right]
    
    inline def up: typingsJapgolly.reactNativeModal.reactNativeModalStrings.up = "up".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.up]
  }
  
  type GestureResponderEvent = NativeSyntheticEvent[NativeTouchEvent]
  
  type OnOrientationChange = js.Function1[/* orientation */ NativeSyntheticEvent[Any], Unit]
  
  type OrNull[T] = Null | T
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.portrait
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.landscape
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-left`
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-right`
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def landscape: typingsJapgolly.reactNativeModal.reactNativeModalStrings.landscape = "landscape".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.landscape]
    
    inline def `landscape-left`: typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-left` = "landscape-left".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-left`]
    
    inline def `landscape-right`: typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-right` = "landscape-right".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.`landscape-right`]
    
    inline def portrait: typingsJapgolly.reactNativeModal.reactNativeModalStrings.portrait = "portrait".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.portrait]
    
    inline def `portrait-upside-down`: typingsJapgolly.reactNativeModal.reactNativeModalStrings.`portrait-upside-down` = "portrait-upside-down".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.fullScreen
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.pageSheet
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.formSheet
    - typingsJapgolly.reactNativeModal.reactNativeModalStrings.overFullScreen
  */
  trait PresentationStyle extends StObject
  object PresentationStyle {
    
    inline def formSheet: typingsJapgolly.reactNativeModal.reactNativeModalStrings.formSheet = "formSheet".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.formSheet]
    
    inline def fullScreen: typingsJapgolly.reactNativeModal.reactNativeModalStrings.fullScreen = "fullScreen".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.fullScreen]
    
    inline def overFullScreen: typingsJapgolly.reactNativeModal.reactNativeModalStrings.overFullScreen = "overFullScreen".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.overFullScreen]
    
    inline def pageSheet: typingsJapgolly.reactNativeModal.reactNativeModalStrings.pageSheet = "pageSheet".asInstanceOf[typingsJapgolly.reactNativeModal.reactNativeModalStrings.pageSheet]
  }
  
  type SupportedAnimation = Animation | (CustomAnimation[TextStyle & ViewStyle & ImageStyle])
}
