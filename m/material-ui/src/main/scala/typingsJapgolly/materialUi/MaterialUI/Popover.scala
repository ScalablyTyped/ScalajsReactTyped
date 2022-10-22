package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUi.MaterialUI.propTypes.origin
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  type Popover = Component[PopoverProps & js.Object, js.Object]
  
  type PopoverAnimationDefault = Component[PopoverAnimationDefaultProps & js.Object, js.Object]
  
  trait PopoverAnimationDefaultProps
    extends StObject
       with PopoverAnimationProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var targetOrigin: js.UndefOr[origin] = js.undefined
    
    var zDepth: js.UndefOr[Double] = js.undefined
  }
  object PopoverAnimationDefaultProps {
    
    inline def apply(open: Boolean): PopoverAnimationDefaultProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverAnimationDefaultProps]
    }
    
    extension [Self <: PopoverAnimationDefaultProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
      
      inline def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
    }
  }
  
  trait PopoverAnimationProps extends StObject {
    
    var open: Boolean
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PopoverAnimationProps {
    
    inline def apply(open: Boolean): PopoverAnimationProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverAnimationProps]
    }
    
    extension [Self <: PopoverAnimationProps](x: Self) {
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type PopoverAnimationVertical = Component[PopoverAnimationVerticalProps & js.Object, js.Object]
  
  trait PopoverAnimationVerticalProps
    extends StObject
       with PopoverAnimationProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var targetOrigin: js.UndefOr[origin] = js.undefined
    
    var zDepth: js.UndefOr[Double] = js.undefined
  }
  object PopoverAnimationVerticalProps {
    
    inline def apply(open: Boolean): PopoverAnimationVerticalProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverAnimationVerticalProps]
    }
    
    extension [Self <: PopoverAnimationVerticalProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
      
      inline def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
    }
  }
  
  trait PopoverProps extends StObject {
    
    var anchorEl: js.UndefOr[ReactInstance] = js.undefined
    
    var anchorOrigin: js.UndefOr[origin] = js.undefined
    
    var animated: js.UndefOr[Boolean] = js.undefined
    
    var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps & js.Object]] = js.undefined
    
    var autoCloseWhenOffScreen: js.UndefOr[Boolean] = js.undefined
    
    var canAutoPosition: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var onRequestClose: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var targetOrigin: js.UndefOr[origin] = js.undefined
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
    
    var zDepth: js.UndefOr[Double] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    extension [Self <: PopoverProps](x: Self) {
      
      inline def setAnchorEl(value: ReactInstance): Self = StObject.set(x, "anchorEl", value.asInstanceOf[js.Any])
      
      inline def setAnchorElUndefined: Self = StObject.set(x, "anchorEl", js.undefined)
      
      inline def setAnchorOrigin(value: origin): Self = StObject.set(x, "anchorOrigin", value.asInstanceOf[js.Any])
      
      inline def setAnchorOriginUndefined: Self = StObject.set(x, "anchorOrigin", js.undefined)
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setAnimation(value: ComponentClassP[PopoverAnimationProps & js.Object]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAutoCloseWhenOffScreen(value: Boolean): Self = StObject.set(x, "autoCloseWhenOffScreen", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseWhenOffScreenUndefined: Self = StObject.set(x, "autoCloseWhenOffScreen", js.undefined)
      
      inline def setCanAutoPosition(value: Boolean): Self = StObject.set(x, "canAutoPosition", value.asInstanceOf[js.Any])
      
      inline def setCanAutoPositionUndefined: Self = StObject.set(x, "canAutoPosition", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnRequestClose(value: /* reason */ String => Callback): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1((t0: /* reason */ String) => value(t0).runNow()))
      
      inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTargetOrigin(value: origin): Self = StObject.set(x, "targetOrigin", value.asInstanceOf[js.Any])
      
      inline def setTargetOriginUndefined: Self = StObject.set(x, "targetOrigin", js.undefined)
      
      inline def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
      
      inline def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
      
      inline def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
    }
  }
}
