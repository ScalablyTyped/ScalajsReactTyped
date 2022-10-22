package typingsJapgolly.rcDrawer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDrawerPopupMod {
  
  @JSImport("rc-drawer/es/DrawerPopup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DrawerPopupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait DrawerPopupProps extends StObject {
    
    var afterOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentWrapperStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var maskClassName: js.UndefOr[String] = js.undefined
    
    var maskClosable: js.UndefOr[Boolean] = js.undefined
    
    var maskMotion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var maskStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])] = js.undefined
    
    var onClose: js.UndefOr[
        js.Function1[
          /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var prefixCls: String
    
    var push: js.UndefOr[Boolean | PushConfig] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var rootStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DrawerPopupProps {
    
    inline def apply(prefixCls: String): DrawerPopupProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerPopupProps]
    }
    
    extension [Self <: DrawerPopupProps](x: Self) {
      
      inline def setAfterOpenChange(value: /* open */ Boolean => Callback): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentWrapperStyle(value: CSSProperties): Self = StObject.set(x, "contentWrapperStyle", value.asInstanceOf[js.Any])
      
      inline def setContentWrapperStyleUndefined: Self = StObject.set(x, "contentWrapperStyle", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskClosable(value: Boolean): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setMaskClosableUndefined: Self = StObject.set(x, "maskClosable", js.undefined)
      
      inline def setMaskMotion(value: CSSMotionProps): Self = StObject.set(x, "maskMotion", value.asInstanceOf[js.Any])
      
      inline def setMaskMotionUndefined: Self = StObject.set(x, "maskMotion", js.undefined)
      
      inline def setMaskStyle(value: CSSProperties): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMotion(value: CSSMotionProps | (js.Function1[/* placement */ Placement, CSSMotionProps])): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionFunction1(value: /* placement */ Placement => CSSMotionProps): Self = StObject.set(x, "motion", js.Any.fromFunction1(value))
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setOnClose(
        value: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement] => Callback
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPush(value: Boolean | PushConfig): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      inline def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      inline def setRootStyle(value: CSSProperties): Self = StObject.set(x, "rootStyle", value.asInstanceOf[js.Any])
      
      inline def setRootStyleUndefined: Self = StObject.set(x, "rootStyle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcDrawer.rcDrawerStrings.left
    - typingsJapgolly.rcDrawer.rcDrawerStrings.right
    - typingsJapgolly.rcDrawer.rcDrawerStrings.top
    - typingsJapgolly.rcDrawer.rcDrawerStrings.bottom
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typingsJapgolly.rcDrawer.rcDrawerStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.rcDrawer.rcDrawerStrings.bottom]
    
    inline def left: typingsJapgolly.rcDrawer.rcDrawerStrings.left = "left".asInstanceOf[typingsJapgolly.rcDrawer.rcDrawerStrings.left]
    
    inline def right: typingsJapgolly.rcDrawer.rcDrawerStrings.right = "right".asInstanceOf[typingsJapgolly.rcDrawer.rcDrawerStrings.right]
    
    inline def top: typingsJapgolly.rcDrawer.rcDrawerStrings.top = "top".asInstanceOf[typingsJapgolly.rcDrawer.rcDrawerStrings.top]
  }
  
  trait PushConfig extends StObject {
    
    var distance: js.UndefOr[Double | String] = js.undefined
  }
  object PushConfig {
    
    inline def apply(): PushConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PushConfig]
    }
    
    extension [Self <: PushConfig](x: Self) {
      
      inline def setDistance(value: Double | String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    }
  }
}
