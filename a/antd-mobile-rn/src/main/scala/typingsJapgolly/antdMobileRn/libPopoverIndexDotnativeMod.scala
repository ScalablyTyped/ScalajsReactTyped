package typingsJapgolly.antdMobileRn

import typingsJapgolly.antdMobileRn.anon.OnSelect
import typingsJapgolly.antdMobileRn.libPopoverPropsTypeMod.PopoverPropsType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/popover/index.native", JSImport.Default)
  @js.native
  open class default () extends Popover
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/popover/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/popover/index.native", "default.Item")
    @js.native
    def Item: Any = js.native
    inline def Item_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/popover/index.native", "default.defaultProps")
    @js.native
    def defaultProps: OnSelect = js.native
    inline def defaultProps_=(x: OnSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Popover extends Component[PopoverProps, Any, Any] {
    
    var menuContextRef: Any = js.native
  }
  
  trait PopoverProps
    extends StObject
       with PopoverPropsType {
    
    var contextStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var renderOverlayComponent: js.UndefOr[js.Function1[/* values */ Any, Element]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var triggerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal(overlay = null)
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setContextStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contextStyle", value.asInstanceOf[js.Any])
      
      inline def setContextStyleNull: Self = StObject.set(x, "contextStyle", null)
      
      inline def setContextStyleUndefined: Self = StObject.set(x, "contextStyle", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOverlayStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleNull: Self = StObject.set(x, "overlayStyle", null)
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setRenderOverlayComponent(value: /* values */ Any => Element): Self = StObject.set(x, "renderOverlayComponent", js.Any.fromFunction1(value))
      
      inline def setRenderOverlayComponentUndefined: Self = StObject.set(x, "renderOverlayComponent", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTriggerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "triggerStyle", value.asInstanceOf[js.Any])
      
      inline def setTriggerStyleNull: Self = StObject.set(x, "triggerStyle", null)
      
      inline def setTriggerStyleUndefined: Self = StObject.set(x, "triggerStyle", js.undefined)
    }
  }
}
