package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.anon.AdjustXAdjustY
import typingsJapgolly.antd.libUtilColorsMod.PresetColorType
import typingsJapgolly.antd.libUtilPlacementsMod.AdjustOverflow
import typingsJapgolly.antd.libUtilTypeMod.LiteralUnion
import typingsJapgolly.rcMotion.esCssmotionMod.CSSMotionProps
import typingsJapgolly.rcTooltip.anon.KeepParent
import typingsJapgolly.rcTrigger.esInterfaceMod.ActionType
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.rcTrigger.esInterfaceMod.AnimationType
import typingsJapgolly.rcTrigger.esInterfaceMod.BuildInPlacements
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTooltipMod extends Shortcut {
  
  @JSImport("antd/lib/tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]] = js.native
  
  trait AbstractTooltipProps
    extends StObject
       with LegacyTooltipProps {
    
    var arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[LiteralUnion[PresetColorType, String]] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var openClassName: js.UndefOr[String] = js.undefined
    
    @JSName("placement")
    var placement_AbstractTooltipProps: js.UndefOr[TooltipPlacement] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AbstractTooltipProps {
    
    inline def apply(): AbstractTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractTooltipProps]
    }
    
    extension [Self <: AbstractTooltipProps](x: Self) {
      
      inline def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
      
      inline def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
      
      inline def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      inline def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: LiteralUnion[PresetColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      inline def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      inline def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<std.Omit<rc-tooltip.rc-tooltip/es/Tooltip.TooltipProps, 'children' | 'visible' | 'defaultVisible' | 'onVisibleChange' | 'afterVisibleChange'>> */
  trait LegacyTooltipProps extends StObject {
    
    var afterOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    /**
      * @deprecated `afterVisibleChange` is deprecated which will be removed in next major version.
      *   Please use `afterOpenChange` instead.
      */
    var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    var animation: js.UndefOr[AnimationType] = js.undefined
    
    var arrowContent: js.UndefOr[Node] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated `defaultVisible` is deprecated which will be removed in next major version. Please
      *   use `defaultOpen` instead.
      */
    var defaultVisible: js.UndefOr[Boolean] = js.undefined
    
    var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.undefined
    
    var getTooltipContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
    
    /**
      * @deprecated `onVisibleChange` is deprecated which will be removed in next major version. Please
      *   use `onOpenChange` instead.
      */
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var overlay: js.UndefOr[js.Function0[Node] | Node] = js.undefined
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayInnerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.undefined
    
    /**
      * @deprecated `visible` is deprecated which will be removed in next major version. Please use
      *   `open` instead.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object LegacyTooltipProps {
    
    inline def apply(): LegacyTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegacyTooltipProps]
    }
    
    extension [Self <: LegacyTooltipProps](x: Self) {
      
      inline def setAfterOpenChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "afterOpenChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setAfterOpenChangeUndefined: Self = StObject.set(x, "afterOpenChange", js.undefined)
      
      inline def setAfterVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      inline def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setArrowContent(value: VdomNode): Self = StObject.set(x, "arrowContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setArrowContentNull: Self = StObject.set(x, "arrowContent", null)
      
      inline def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
      
      inline def setArrowContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "arrowContent", js.Array(value*))
      
      inline def setArrowContentVdomElement(value: VdomElement): Self = StObject.set(x, "arrowContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      inline def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      inline def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      inline def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      inline def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      inline def setDestroyTooltipOnHide(value: Boolean | KeepParent): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
      
      inline def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
      
      inline def setGetTooltipContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction1(value))
      
      inline def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMotion(value: CSSMotionProps): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
      
      inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
      
      inline def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      inline def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      inline def setOnOpenChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Callback): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* align */ AlignType) => (value(t0, t1)).runNow()))
      
      inline def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverlay(value: js.Function0[Node] | Node): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "overlay", value.toJsFn)
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayInnerStyle(value: CSSProperties): Self = StObject.set(x, "overlayInnerStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayInnerStyleUndefined: Self = StObject.set(x, "overlayInnerStyle", js.undefined)
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setOverlayVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "overlay", js.Array(value*))
      
      inline def setOverlayVdomElement(value: VdomElement): Self = StObject.set(x, "overlay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTrigger(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: ActionType*): Self = StObject.set(x, "trigger", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type RenderFunction = js.Function0[Node]
  
  trait TooltipAlignConfig extends StObject {
    
    var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
    
    var overflow: js.UndefOr[AdjustXAdjustY] = js.undefined
    
    var points: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var targetOffset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.undefined
    
    var useCssBottom: js.UndefOr[Boolean] = js.undefined
    
    var useCssRight: js.UndefOr[Boolean] = js.undefined
    
    var useCssTransform: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipAlignConfig {
    
    inline def apply(): TooltipAlignConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipAlignConfig]
    }
    
    extension [Self <: TooltipAlignConfig](x: Self) {
      
      inline def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOverflow(value: AdjustXAdjustY): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPoints(value: js.Tuple2[String, String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setTargetOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      inline def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      inline def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      inline def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      inline def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      inline def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      inline def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      inline def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.top
    - typingsJapgolly.antd.antdStrings.left
    - typingsJapgolly.antd.antdStrings.right
    - typingsJapgolly.antd.antdStrings.bottom
    - typingsJapgolly.antd.antdStrings.topLeft
    - typingsJapgolly.antd.antdStrings.topRight
    - typingsJapgolly.antd.antdStrings.bottomLeft
    - typingsJapgolly.antd.antdStrings.bottomRight
    - typingsJapgolly.antd.antdStrings.leftTop
    - typingsJapgolly.antd.antdStrings.leftBottom
    - typingsJapgolly.antd.antdStrings.rightTop
    - typingsJapgolly.antd.antdStrings.rightBottom
  */
  trait TooltipPlacement extends StObject
  object TooltipPlacement {
    
    inline def bottom: typingsJapgolly.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.antd.antdStrings.bottom]
    
    inline def bottomLeft: typingsJapgolly.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.antd.antdStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.antd.antdStrings.bottomRight]
    
    inline def left: typingsJapgolly.antd.antdStrings.left = "left".asInstanceOf[typingsJapgolly.antd.antdStrings.left]
    
    inline def leftBottom: typingsJapgolly.antd.antdStrings.leftBottom = "leftBottom".asInstanceOf[typingsJapgolly.antd.antdStrings.leftBottom]
    
    inline def leftTop: typingsJapgolly.antd.antdStrings.leftTop = "leftTop".asInstanceOf[typingsJapgolly.antd.antdStrings.leftTop]
    
    inline def right: typingsJapgolly.antd.antdStrings.right = "right".asInstanceOf[typingsJapgolly.antd.antdStrings.right]
    
    inline def rightBottom: typingsJapgolly.antd.antdStrings.rightBottom = "rightBottom".asInstanceOf[typingsJapgolly.antd.antdStrings.rightBottom]
    
    inline def rightTop: typingsJapgolly.antd.antdStrings.rightTop = "rightTop".asInstanceOf[typingsJapgolly.antd.antdStrings.rightTop]
    
    inline def top: typingsJapgolly.antd.antdStrings.top = "top".asInstanceOf[typingsJapgolly.antd.antdStrings.top]
    
    inline def topLeft: typingsJapgolly.antd.antdStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.antd.antdStrings.topLeft]
    
    inline def topRight: typingsJapgolly.antd.antdStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.antd.antdStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.libTooltipMod.TooltipPropsWithTitle
    - typingsJapgolly.antd.libTooltipMod.TooltipPropsWithOverlay
  */
  trait TooltipProps extends StObject
  object TooltipProps {
    
    inline def TooltipPropsWithOverlay(): typingsJapgolly.antd.libTooltipMod.TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.antd.libTooltipMod.TooltipPropsWithOverlay]
    }
    
    inline def TooltipPropsWithTitle(): typingsJapgolly.antd.libTooltipMod.TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[typingsJapgolly.antd.libTooltipMod.TooltipPropsWithTitle]
    }
  }
  
  trait TooltipPropsWithOverlay
    extends StObject
       with AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithOverlay: js.UndefOr[Node | RenderFunction] = js.undefined
    
    var title: js.UndefOr[Node | RenderFunction] = js.undefined
  }
  object TooltipPropsWithOverlay {
    
    inline def apply(): TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPropsWithOverlay]
    }
    
    extension [Self <: TooltipPropsWithOverlay](x: Self) {
      
      inline def setOverlay(value: Node | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "overlay", value.toJsFn)
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setOverlayVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "overlay", js.Array(value*))
      
      inline def setOverlayVdomElement(value: VdomElement): Self = StObject.set(x, "overlay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: Node | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "title", value.toJsFn)
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipPropsWithTitle
    extends StObject
       with AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithTitle: js.UndefOr[Node | RenderFunction] = js.undefined
    
    var title: Node | RenderFunction
  }
  object TooltipPropsWithTitle {
    
    inline def apply(): TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[TooltipPropsWithTitle]
    }
    
    extension [Self <: TooltipPropsWithTitle](x: Self) {
      
      inline def setOverlay(value: Node | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "overlay", value.toJsFn)
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setOverlayVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "overlay", js.Array(value*))
      
      inline def setOverlayVdomElement(value: VdomElement): Self = StObject.set(x, "overlay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: Node | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "title", value.toJsFn)
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libTooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]] = default
}
