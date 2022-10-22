package typingsJapgolly.rcTooltip

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

object esTooltipMod extends Shortcut {
  
  @JSImport("rc-tooltip/es/Tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]] = js.native
  
  /* Inlined parent std.Pick<rc-trigger.rc-trigger.TriggerProps, 'onPopupAlign' | 'builtinPlacements'> */
  trait TooltipProps extends StObject {
    
    var afterVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var align: js.UndefOr[AlignType] = js.undefined
    
    /** @deprecated Use `motion` instead */
    var animation: js.UndefOr[AnimationType] = js.undefined
    
    var arrowContent: js.UndefOr[Node] = js.undefined
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.undefined
    
    var children: js.UndefOr[Element] = js.undefined
    
    var defaultVisible: js.UndefOr[Boolean] = js.undefined
    
    var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.undefined
    
    var getTooltipContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    /** Config popup motion */
    var motion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.undefined
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var overlay: js.Function0[Node] | Node
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayInnerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated Use `motion` instead */
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal(overlay = null)
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
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
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      
      inline def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Callback): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2((t0: /* element */ HTMLElement, t1: /* align */ AlignType) => (value(t0, t1)).runNow()))
      
      inline def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOverlay(value: js.Function0[Node] | Node): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "overlay", value.toJsFn)
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayInnerStyle(value: CSSProperties): Self = StObject.set(x, "overlayInnerStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayInnerStyleUndefined: Self = StObject.set(x, "overlayInnerStyle", js.undefined)
      
      inline def setOverlayNull: Self = StObject.set(x, "overlay", null)
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
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
  
  type _To = ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `esTooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]] = default
}
