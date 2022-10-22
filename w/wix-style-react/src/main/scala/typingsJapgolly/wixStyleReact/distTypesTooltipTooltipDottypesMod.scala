package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import typingsJapgolly.csstype.mod.Property.MaxWidth
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCoreUtilsGetModifiersMod.MoveBy
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTooltipTooltipDottypesMod {
  
  trait TooltipActions extends StObject {
    
    def close(): Unit
    
    def open(): Unit
  }
  object TooltipActions {
    
    inline def apply(close: Callback, open: Callback): TooltipActions = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, open = open.toJsFn)
      __obj.asInstanceOf[TooltipActions]
    }
    
    extension [Self <: TooltipActions](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
    }
  }
  
  trait TooltipProps extends StObject {
    
    /**
      * Calculates tooltip’s position in relation to a DOM element.
      * Can be either: 'window', 'scrollParent', 'viewport', 'parent', element or
      * function based predicate. I.e., (elm) => elm.getAttribute('data-hook') === 'value
      */
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    /** Connects tooltip’s trigger element to tooltip’s content for assistive technologies */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** Defines tooltip’s trigger element */
    var children: Node
    
    /** Applies a CSS class to the component’s root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Defines the content to be shown inside a tooltip */
    var content: js.UndefOr[Node] = js.undefined
    
    /** Applies a data-hook HTML attribute to be used in the tests */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** Allows showing a tooltip when hovering on a disabled trigger element with mouse */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Sets time to wait before showing the tooltip (in milliseconds) */
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    /** Sets time to wait before hiding the tooltip (in milliseconds) */
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    /** Enables keeping a tooltip at its original placement even when it is being positioned outside the boundary */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** Flips a tooltip’s placement when it starts to overlap its trigger element */
    var flip: js.UndefOr[Boolean] = js.undefined
    
    /** Stretches the root element to the width of its container */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Defines max width of a tooltip in px. If content is wider than maxWidth allows, it wraps into multiple lines. */
    var maxWidth: js.UndefOr[MaxWidth[String | Double]] = js.undefined
    
    /** Moves a tooltip’s arrow by a defined amount */
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    /** Moves a tooltip in relation to its trigger element on x or y axis */
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    /** Defines a callback function on tooltip’s hide event */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Defines a callback function on tooltip’s show event */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Sets tooltip’s placement in relation to its trigger element */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /** Controls the size of a tooltip */
    var size: js.UndefOr[TooltipSize] = js.undefined
    
    /** Controls the alignment of tooltip’s content */
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    /** Controls the tooltip’s z-index */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
      
      inline def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setMaxWidth(value: MaxWidth[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setSize(value: TooltipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait TooltipSize extends StObject
  object TooltipSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
  */
  trait TooltipTextAlign extends StObject
  object TooltipTextAlign {
    
    inline def center: typingsJapgolly.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.center]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
}
