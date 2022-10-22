package typingsJapgolly.reactNativeWindows

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object librariesComponentsFlyoutFlyoutPropsMod {
  
  trait IFlyoutProps
    extends StObject
       with ViewProps {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var horizontalOffset: js.UndefOr[Double] = js.undefined
    
    var isLightDismissEnabled: js.UndefOr[Boolean] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether the area outside the flyout is darkened
      */
    var isOverlayEnabled: js.UndefOr[Boolean] = js.undefined
    
    var onDismiss: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var shouldConstrainToRootBounds: js.UndefOr[Boolean] = js.undefined
    
    var showMode: js.UndefOr[ShowMode] = js.undefined
    
    var target: js.UndefOr[Node] = js.undefined
    
    var verticalOffset: js.UndefOr[Double] = js.undefined
  }
  object IFlyoutProps {
    
    inline def apply(): IFlyoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFlyoutProps]
    }
    
    extension [Self <: IFlyoutProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setIsLightDismissEnabled(value: Boolean): Self = StObject.set(x, "isLightDismissEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsLightDismissEnabledUndefined: Self = StObject.set(x, "isLightDismissEnabled", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setIsOverlayEnabled(value: Boolean): Self = StObject.set(x, "isOverlayEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsOverlayEnabledUndefined: Self = StObject.set(x, "isOverlayEnabled", js.undefined)
      
      inline def setOnDismiss(value: /* isOpen */ Boolean => Callback): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
      
      inline def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShouldConstrainToRootBounds(value: Boolean): Self = StObject.set(x, "shouldConstrainToRootBounds", value.asInstanceOf[js.Any])
      
      inline def setShouldConstrainToRootBoundsUndefined: Self = StObject.set(x, "shouldConstrainToRootBounds", js.undefined)
      
      inline def setShowMode(value: ShowMode): Self = StObject.set(x, "showMode", value.asInstanceOf[js.Any])
      
      inline def setShowModeUndefined: Self = StObject.set(x, "showMode", js.undefined)
      
      inline def setTarget(value: VdomNode): Self = StObject.set(x, "target", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTargetNull: Self = StObject.set(x, "target", null)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTargetVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "target", js.Array(value*))
      
      inline def setTargetVdomElement(value: VdomElement): Self = StObject.set(x, "target", value.rawElement.asInstanceOf[js.Any])
      
      inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.top
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.bottom
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.left
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.right
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.full
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left`
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right`
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left`
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right`
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top`
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top`
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom`
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom`
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.bottom]
    
    inline def `bottom-edge-aligned-left`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left` = "bottom-edge-aligned-left".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-left`]
    
    inline def `bottom-edge-aligned-right`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right` = "bottom-edge-aligned-right".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`bottom-edge-aligned-right`]
    
    inline def full: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.full = "full".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.full]
    
    inline def left: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.left = "left".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.left]
    
    inline def `left-edge-aligned-bottom`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom` = "left-edge-aligned-bottom".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-bottom`]
    
    inline def `left-edge-aligned-top`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top` = "left-edge-aligned-top".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`left-edge-aligned-top`]
    
    inline def right: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.right = "right".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.right]
    
    inline def `right-edge-aligned-bottom`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom` = "right-edge-aligned-bottom".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-bottom`]
    
    inline def `right-edge-aligned-top`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top` = "right-edge-aligned-top".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`right-edge-aligned-top`]
    
    inline def top: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.top = "top".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.top]
    
    inline def `top-edge-aligned-left`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left` = "top-edge-aligned-left".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-left`]
    
    inline def `top-edge-aligned-right`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right` = "top-edge-aligned-right".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`top-edge-aligned-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.standard
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.transient
    - typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`transient-with-dismiss-on-pointer-move-away`
  */
  trait ShowMode extends StObject
  object ShowMode {
    
    inline def auto: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto = "auto".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto]
    
    inline def standard: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.standard = "standard".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.standard]
    
    inline def transient: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.transient = "transient".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.transient]
    
    inline def `transient-with-dismiss-on-pointer-move-away`: typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`transient-with-dismiss-on-pointer-move-away` = "transient-with-dismiss-on-pointer-move-away".asInstanceOf[typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`transient-with-dismiss-on-pointer-move-away`]
  }
}
