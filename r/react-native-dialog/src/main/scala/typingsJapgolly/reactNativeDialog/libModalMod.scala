package typingsJapgolly.reactNativeDialog

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeDialog.anon.PartialModalProps
import typingsJapgolly.reactNativeDialog.reactNativeDialogStrings.in
import typingsJapgolly.reactNativeDialog.reactNativeDialogStrings.none
import typingsJapgolly.reactNativeDialog.reactNativeDialogStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalMod {
  
  @JSImport("react-native-dialog/lib/Modal", JSImport.Default)
  @js.native
  open class default protected () extends Modal {
    def this(props: ModalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-native-dialog/lib/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-dialog/lib/Modal", "default.defaultProps")
    @js.native
    def defaultProps: PartialModalProps = js.native
    inline def defaultProps_=(x: PartialModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-dialog/lib/Modal", "Modal")
  @js.native
  open class Modal protected () extends Component[ModalProps, ModalState, Any] {
    def this(props: ModalProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ModalProps, context: Any) = this()
    
    var _isMounted: Boolean = js.native
    
    var animVal: Value = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MModal(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MModal(prevProps: ModalProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MModal(): Unit = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
  /* static members */
  object Modal {
    
    @JSImport("react-native-dialog/lib/Modal", "Modal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-dialog/lib/Modal", "Modal.defaultProps")
    @js.native
    def defaultProps: PartialModalProps = js.native
    inline def defaultProps_=(x: PartialModalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait ModalProps
    extends StObject
       with typingsJapgolly.reactNative.mod.ModalProps {
    
    var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  }
  object ModalProps {
    
    inline def apply(): ModalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalProps]
    }
    
    extension [Self <: ModalProps](x: Self) {
      
      inline def setContentStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleNull: Self = StObject.set(x, "contentStyle", null)
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setOnBackdropPress(value: Callback): Self = StObject.set(x, "onBackdropPress", value.toJsFn)
      
      inline def setOnBackdropPressUndefined: Self = StObject.set(x, "onBackdropPress", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
  
  trait ModalState extends StObject {
    
    var currentAnimation: none | in | out
    
    var visible: Boolean
  }
  object ModalState {
    
    inline def apply(currentAnimation: none | in | out, visible: Boolean): ModalState = {
      val __obj = js.Dynamic.literal(currentAnimation = currentAnimation.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalState]
    }
    
    extension [Self <: ModalState](x: Self) {
      
      inline def setCurrentAnimation(value: none | in | out): Self = StObject.set(x, "currentAnimation", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
