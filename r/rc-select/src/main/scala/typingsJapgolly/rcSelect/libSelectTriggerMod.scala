package typingsJapgolly.rcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcSelect.libBaseSelectMod.Placement
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderDOMFunc
import typingsJapgolly.rcTrigger.esInterfaceMod.AlignType
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectTriggerMod extends Shortcut {
  
  @JSImport("rc-select/lib/SelectTrigger", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SelectTriggerProps & RefAttributes[RefTriggerProps]] = js.native
  
  trait RefTriggerProps extends StObject {
    
    def getPopupElement(): HTMLDivElement
  }
  object RefTriggerProps {
    
    inline def apply(getPopupElement: CallbackTo[HTMLDivElement]): RefTriggerProps = {
      val __obj = js.Dynamic.literal(getPopupElement = getPopupElement.toJsFn)
      __obj.asInstanceOf[RefTriggerProps]
    }
    
    extension [Self <: RefTriggerProps](x: Self) {
      
      inline def setGetPopupElement(value: CallbackTo[HTMLDivElement]): Self = StObject.set(x, "getPopupElement", value.toJsFn)
    }
  }
  
  trait SelectTriggerProps extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var children: Element
    
    var containerWidth: Double
    
    var direction: String
    
    var disabled: Boolean
    
    var dropdownAlign: AlignType
    
    var dropdownClassName: String
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.undefined
    
    var dropdownRender: js.UndefOr[js.Function1[/* menu */ Element, Element]] = js.undefined
    
    var dropdownStyle: CSSProperties
    
    var empty: Boolean
    
    var getPopupContainer: js.UndefOr[RenderDOMFunc] = js.undefined
    
    def getTriggerDOMNode(): HTMLElement
    
    def onPopupMouseEnter(): Unit
    
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var popupElement: Element
    
    var prefixCls: String
    
    var transitionName: js.UndefOr[String] = js.undefined
    
    var visible: Boolean
  }
  object SelectTriggerProps {
    
    inline def apply(
      children: VdomElement,
      containerWidth: Double,
      direction: String,
      disabled: Boolean,
      dropdownAlign: AlignType,
      dropdownClassName: String,
      dropdownStyle: CSSProperties,
      empty: Boolean,
      getTriggerDOMNode: CallbackTo[HTMLElement],
      onPopupMouseEnter: Callback,
      popupElement: VdomElement,
      prefixCls: String,
      visible: Boolean
    ): SelectTriggerProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], dropdownAlign = dropdownAlign.asInstanceOf[js.Any], dropdownClassName = dropdownClassName.asInstanceOf[js.Any], dropdownStyle = dropdownStyle.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], getTriggerDOMNode = getTriggerDOMNode.toJsFn, onPopupMouseEnter = onPopupMouseEnter.toJsFn, popupElement = popupElement.rawElement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectTriggerProps]
    }
    
    extension [Self <: SelectTriggerProps](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDropdownAlign(value: AlignType): Self = StObject.set(x, "dropdownAlign", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassName(value: String): Self = StObject.set(x, "dropdownClassName", value.asInstanceOf[js.Any])
      
      inline def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      inline def setDropdownRender(value: /* menu */ Element => Element): Self = StObject.set(x, "dropdownRender", js.Any.fromFunction1(value))
      
      inline def setDropdownRenderUndefined: Self = StObject.set(x, "dropdownRender", js.undefined)
      
      inline def setDropdownStyle(value: CSSProperties): Self = StObject.set(x, "dropdownStyle", value.asInstanceOf[js.Any])
      
      inline def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setGetPopupContainer(value: /* props */ Any => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      inline def setGetTriggerDOMNode(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getTriggerDOMNode", value.toJsFn)
      
      inline def setOnPopupMouseEnter(value: Callback): Self = StObject.set(x, "onPopupMouseEnter", value.toJsFn)
      
      inline def setOnPopupVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPopupElement(value: VdomElement): Self = StObject.set(x, "popupElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      inline def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[SelectTriggerProps & RefAttributes[RefTriggerProps]]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectTriggerMod.foo` */
  override def _to: ForwardRefExoticComponent[SelectTriggerProps & RefAttributes[RefTriggerProps]] = default
}
