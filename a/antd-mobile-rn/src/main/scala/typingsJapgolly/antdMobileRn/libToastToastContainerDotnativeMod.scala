package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.anon.Duration
import typingsJapgolly.antdMobileRn.libToastStyleIndexDotnativeMod.IToastStyle
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.Animated.CompositeAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToastToastContainerDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", JSImport.Default)
  @js.native
  open class default protected () extends ToastContainer {
    def this(props: ToastProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/toast/ToastContainer.native", "default.defaultProps")
    @js.native
    def defaultProps: Duration = js.native
    inline def defaultProps_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ToastContainer extends Component[ToastProps, Any, Any] {
    
    var anim: CompositeAnimation | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToastContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastContainer(): Unit = js.native
  }
  
  trait ToastProps extends StObject {
    
    var content: String
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var styles: js.UndefOr[IToastStyle] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToastProps {
    
    inline def apply(content: String): ToastProps = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastProps]
    }
    
    extension [Self <: ToastProps](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnAnimationEnd(value: Callback): Self = StObject.set(x, "onAnimationEnd", value.toJsFn)
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setStyles(value: IToastStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
