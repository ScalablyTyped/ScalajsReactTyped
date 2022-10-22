package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeNavigation.anon.AnimationType
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.fade
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.none
import typingsJapgolly.reactNativeNavigation.reactNativeNavigationStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDistSrcComponentsModalMod {
  
  @JSImport("react-native-navigation/lib/dist/src/components/Modal", "Modal")
  @js.native
  open class Modal protected ()
    extends Component[RNNModalProps, js.Object, Any] {
    def this(props: RNNModalProps) = this()
    
    /* private */ var proccessProps: Any = js.native
  }
  /* static members */
  object Modal {
    
    @JSImport("react-native-navigation/lib/dist/src/components/Modal", "Modal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-navigation/lib/dist/src/components/Modal", "Modal.defaultProps")
    @js.native
    def defaultProps: AnimationType = js.native
    inline def defaultProps_=(x: AnimationType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait RNNModalProps
    extends StObject
       with ViewProps {
    
    var animationType: none | fade | slide
    
    var blurOnUnmount: Boolean
    
    def onRequestClose(): Any
    
    var onShow: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var transparent: Boolean
    
    var visible: Boolean
  }
  object RNNModalProps {
    
    inline def apply(
      animationType: none | fade | slide,
      blurOnUnmount: Boolean,
      onRequestClose: CallbackTo[Any],
      transparent: Boolean,
      visible: Boolean
    ): RNNModalProps = {
      val __obj = js.Dynamic.literal(animationType = animationType.asInstanceOf[js.Any], blurOnUnmount = blurOnUnmount.asInstanceOf[js.Any], onRequestClose = onRequestClose.toJsFn, transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[RNNModalProps]
    }
    
    extension [Self <: RNNModalProps](x: Self) {
      
      inline def setAnimationType(value: none | fade | slide): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      inline def setBlurOnUnmount(value: Boolean): Self = StObject.set(x, "blurOnUnmount", value.asInstanceOf[js.Any])
      
      inline def setOnRequestClose(value: CallbackTo[Any]): Self = StObject.set(x, "onRequestClose", value.toJsFn)
      
      inline def setOnShow(value: CallbackTo[Any]): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
