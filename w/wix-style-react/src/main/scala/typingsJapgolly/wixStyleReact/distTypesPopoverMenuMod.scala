package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.MoveByOffset
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.destructive
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverMenuMod {
  
  @JSImport("wix-style-react/dist/types/PopoverMenu", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[PopoverMenuProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/PopoverMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Divider(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")().asInstanceOf[Element]
    inline def Divider(props: PopoverMenuDividerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Divider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def MenuItem(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")().asInstanceOf[Element]
    inline def MenuItem(props: PopoverMenuItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  type PopoverMenu = PureComponent[PopoverMenuProps, js.Object, Any]
  
  trait PopoverMenuDividerProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
  }
  object PopoverMenuDividerProps {
    
    inline def apply(): PopoverMenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuDividerProps]
    }
    
    extension [Self <: PopoverMenuDividerProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    }
  }
  
  trait PopoverMenuItemProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var prefixIcon: js.UndefOr[Node] = js.undefined
    
    var skin: js.UndefOr[dark | destructive] = js.undefined
    
    var subtitle: js.UndefOr[String] = js.undefined
    
    var suffixIcon: js.UndefOr[Node] = js.undefined
    
    var text: js.UndefOr[Node] = js.undefined
  }
  object PopoverMenuItemProps {
    
    inline def apply(): PopoverMenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverMenuItemProps]
    }
    
    extension [Self <: PopoverMenuItemProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(value: CallbackTo[Any]): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrefixIcon(value: VdomNode): Self = StObject.set(x, "prefixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setPrefixIconNull: Self = StObject.set(x, "prefixIcon", null)
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setPrefixIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "prefixIcon", js.Array(value*))
      
      inline def setPrefixIconVdomElement(value: VdomElement): Self = StObject.set(x, "prefixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSkin(value: dark | destructive): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setSuffixIcon(value: VdomNode): Self = StObject.set(x, "suffixIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSuffixIconNull: Self = StObject.set(x, "suffixIcon", null)
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setSuffixIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffixIcon", js.Array(value*))
      
      inline def setSuffixIconVdomElement(value: VdomElement): Self = StObject.set(x, "suffixIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait PopoverMenuProps extends StObject {
    
    var appendTo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ Any
      ] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ] = js.undefined
    
    var minWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['minWidth'] */ js.Any
      ] = js.undefined
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
      ] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var textSize: js.UndefOr[small | medium] = js.undefined
    
    var triggerElement: Node | FC[PopoverTriggerElementProps]
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PopoverMenuProps {
    
    inline def apply(): PopoverMenuProps = {
      val __obj = js.Dynamic.literal(triggerElement = null)
      __obj.asInstanceOf[PopoverMenuProps]
    }
    
    extension [Self <: PopoverMenuProps](x: Self) {
      
      inline def setAppendTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ Any
      ): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['minWidth'] */ js.Any
      ): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setTextSize(value: small | medium): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      inline def setTriggerElement(value: Node | FC[PopoverTriggerElementProps]): Self = StObject.set(x, "triggerElement", value.asInstanceOf[js.Any])
      
      inline def setTriggerElementNull: Self = StObject.set(x, "triggerElement", null)
      
      inline def setTriggerElementVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "triggerElement", js.Array(value*))
      
      inline def setTriggerElementVdomElement(value: VdomElement): Self = StObject.set(x, "triggerElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PopoverTriggerElementProps extends StObject {
    
    def close(event: ReactEventFrom[org.scalajs.dom.Element]): Unit
    
    var isOpen: Boolean
    
    def onClick(): Unit
    
    def open(): Unit
    
    def toggle(): Unit
  }
  object PopoverTriggerElementProps {
    
    inline def apply(
      close: ReactEventFrom[org.scalajs.dom.Element] => Callback,
      isOpen: Boolean,
      onClick: Callback,
      open: Callback,
      toggle: Callback
    ): PopoverTriggerElementProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => close(t0).runNow()), isOpen = isOpen.asInstanceOf[js.Any], onClick = onClick.toJsFn, open = open.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[PopoverTriggerElementProps]
    }
    
    extension [Self <: PopoverTriggerElementProps](x: Self) {
      
      inline def setClose(value: ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
}
