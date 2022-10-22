package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.anon.Delay
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.contextMenu
import typingsJapgolly.antd.antdStrings.hover
import typingsJapgolly.antd.antdStrings.text_
import typingsJapgolly.antd.libButtonButtonGroupMod.ButtonGroupProps
import typingsJapgolly.antd.libButtonButtonMod.ButtonHTMLType
import typingsJapgolly.antd.libDropdownDropdownMod.Align
import typingsJapgolly.antd.libDropdownDropdownMod.DropdownArrowOptions
import typingsJapgolly.antd.libDropdownDropdownMod.OverlayFunc
import typingsJapgolly.antd.libDropdownDropdownMod.Placement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDropdownDropdownButtonMod extends Shortcut {
  
  @JSImport("antd/lib/dropdown/dropdown-button", JSImport.Default)
  @js.native
  val default: DropdownButtonInterface = js.native
  
  type DropdownButtonInterface = FC[DropdownButtonProps]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.antd.libDropdownDropdownMod.DropdownProps because var conflicts: children, className, prefixCls. Inlined autoFocus, arrow, trigger, overlay, onVisibleChange, onOpenChange, visible, open, disabled, destroyPopupOnHide, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ trait DropdownButtonProps
    extends StObject
       with ButtonGroupProps {
    
    var align: js.UndefOr[Align] = js.undefined
    
    var arrow: js.UndefOr[Boolean | DropdownArrowOptions] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var buttonsRender: js.UndefOr[js.Function1[/* buttons */ js.Array[Node], js.Array[Node]]] = js.undefined
    
    var danger: js.UndefOr[Boolean] = js.undefined
    
    var destroyPopupOnHide: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var htmlType: js.UndefOr[ButtonHTMLType] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var loading: js.UndefOr[Boolean | Delay] = js.undefined
    
    var mouseEnterDelay: js.UndefOr[Double] = js.undefined
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    /**
      * @deprecated `onVisibleChange` is deprecated which will be removed in next major version. Please
      *   use `onOpenChange` instead.
      */
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var openClassName: js.UndefOr[String] = js.undefined
    
    var overlay: Element | OverlayFunc
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[js.Array[click | hover | contextMenu]] = js.undefined
    
    var `type`: js.UndefOr[DropdownButtonType] = js.undefined
    
    /**
      * @deprecated `visible` is deprecated which will be removed in next major version. Please use
      *   `open` instead.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownButtonProps {
    
    inline def apply(overlay: Element | OverlayFunc): DropdownButtonProps = {
      val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownButtonProps]
    }
    
    extension [Self <: DropdownButtonProps](x: Self) {
      
      inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setArrow(value: Boolean | DropdownArrowOptions): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setButtonsRender(value: /* buttons */ js.Array[Node] => js.Array[Node]): Self = StObject.set(x, "buttonsRender", js.Any.fromFunction1(value))
      
      inline def setButtonsRenderUndefined: Self = StObject.set(x, "buttonsRender", js.undefined)
      
      inline def setDanger(value: Boolean): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setDangerUndefined: Self = StObject.set(x, "danger", js.undefined)
      
      inline def setDestroyPopupOnHide(value: Boolean): Self = StObject.set(x, "destroyPopupOnHide", value.asInstanceOf[js.Any])
      
      inline def setDestroyPopupOnHideUndefined: Self = StObject.set(x, "destroyPopupOnHide", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setHtmlType(value: ButtonHTMLType): Self = StObject.set(x, "htmlType", value.asInstanceOf[js.Any])
      
      inline def setHtmlTypeUndefined: Self = StObject.set(x, "htmlType", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean | Delay): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      inline def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      inline def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnOpenChange(value: /* open */ Boolean => Callback): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1((t0: /* open */ Boolean) => value(t0).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      inline def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOverlay(value: Element | OverlayFunc): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayCallbackTo(value: CallbackTo[Element]): Self = StObject.set(x, "overlay", value.toJsFn)
      
      inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      inline def setOverlayVdomElement(value: VdomElement): Self = StObject.set(x, "overlay", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setTrigger(value: js.Array[click | hover | contextMenu]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setTriggerVarargs(value: (click | hover | contextMenu)*): Self = StObject.set(x, "trigger", js.Array(value*))
      
      inline def setType(value: DropdownButtonType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.default
    - typingsJapgolly.antd.antdStrings.primary
    - typingsJapgolly.antd.antdStrings.ghost
    - typingsJapgolly.antd.antdStrings.dashed
    - typingsJapgolly.antd.antdStrings.link
    - typingsJapgolly.antd.antdStrings.text_
  */
  trait DropdownButtonType extends StObject
  object DropdownButtonType {
    
    inline def default: typingsJapgolly.antd.antdStrings.default = "default".asInstanceOf[typingsJapgolly.antd.antdStrings.default]
    
    inline def dashed: typingsJapgolly.antd.antdStrings.dashed = "dashed".asInstanceOf[typingsJapgolly.antd.antdStrings.dashed]
    
    inline def ghost: typingsJapgolly.antd.antdStrings.ghost = "ghost".asInstanceOf[typingsJapgolly.antd.antdStrings.ghost]
    
    inline def link: typingsJapgolly.antd.antdStrings.link = "link".asInstanceOf[typingsJapgolly.antd.antdStrings.link]
    
    inline def primary: typingsJapgolly.antd.antdStrings.primary = "primary".asInstanceOf[typingsJapgolly.antd.antdStrings.primary]
    
    inline def text: text_ = "text".asInstanceOf[text_]
  }
  
  type _To = DropdownButtonInterface
  
  /* This means you don't have to write `default`, but can instead just say `libDropdownDropdownButtonMod.foo` */
  override def _to: DropdownButtonInterface = default
}
