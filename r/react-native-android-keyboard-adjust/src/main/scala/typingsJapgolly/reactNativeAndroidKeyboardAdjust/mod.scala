package typingsJapgolly.reactNativeAndroidKeyboardAdjust

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-android-keyboard-adjust", JSImport.Default)
  @js.native
  val default: AndroidKeyboardAdjust = js.native
  
  trait AndroidKeyboardAdjust extends StObject {
    
    def setAdjustNothing(): Unit
    
    def setAdjustPan(): Unit
    
    def setAdjustResize(): Unit
    
    def setAdjustUnspecified(): Unit
    
    def setAlwaysHidden(): Unit
    
    def setAlwaysVisible(): Unit
    
    def setHidden(): Unit
    
    def setStateUnspecified(): Unit
    
    def setUnchanged(): Unit
    
    def setVisible(): Unit
  }
  object AndroidKeyboardAdjust {
    
    inline def apply(
      setAdjustNothing: Callback,
      setAdjustPan: Callback,
      setAdjustResize: Callback,
      setAdjustUnspecified: Callback,
      setAlwaysHidden: Callback,
      setAlwaysVisible: Callback,
      setHidden: Callback,
      setStateUnspecified: Callback,
      setUnchanged: Callback,
      setVisible: Callback
    ): AndroidKeyboardAdjust = {
      val __obj = js.Dynamic.literal(setAdjustNothing = setAdjustNothing.toJsFn, setAdjustPan = setAdjustPan.toJsFn, setAdjustResize = setAdjustResize.toJsFn, setAdjustUnspecified = setAdjustUnspecified.toJsFn, setAlwaysHidden = setAlwaysHidden.toJsFn, setAlwaysVisible = setAlwaysVisible.toJsFn, setHidden = setHidden.toJsFn, setStateUnspecified = setStateUnspecified.toJsFn, setUnchanged = setUnchanged.toJsFn, setVisible = setVisible.toJsFn)
      __obj.asInstanceOf[AndroidKeyboardAdjust]
    }
    
    extension [Self <: AndroidKeyboardAdjust](x: Self) {
      
      inline def setSetAdjustNothing(value: Callback): Self = StObject.set(x, "setAdjustNothing", value.toJsFn)
      
      inline def setSetAdjustPan(value: Callback): Self = StObject.set(x, "setAdjustPan", value.toJsFn)
      
      inline def setSetAdjustResize(value: Callback): Self = StObject.set(x, "setAdjustResize", value.toJsFn)
      
      inline def setSetAdjustUnspecified(value: Callback): Self = StObject.set(x, "setAdjustUnspecified", value.toJsFn)
      
      inline def setSetAlwaysHidden(value: Callback): Self = StObject.set(x, "setAlwaysHidden", value.toJsFn)
      
      inline def setSetAlwaysVisible(value: Callback): Self = StObject.set(x, "setAlwaysVisible", value.toJsFn)
      
      inline def setSetHidden(value: Callback): Self = StObject.set(x, "setHidden", value.toJsFn)
      
      inline def setSetStateUnspecified(value: Callback): Self = StObject.set(x, "setStateUnspecified", value.toJsFn)
      
      inline def setSetUnchanged(value: Callback): Self = StObject.set(x, "setUnchanged", value.toJsFn)
      
      inline def setSetVisible(value: Callback): Self = StObject.set(x, "setVisible", value.toJsFn)
    }
  }
  
  type _To = AndroidKeyboardAdjust
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: AndroidKeyboardAdjust = default
}
