package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.wixStyleReact.anon.Exit
import typingsJapgolly.wixStyleReact.distTypesBoxMod._BoxCssSizingProperty
import typingsJapgolly.wixStyleReact.distTypesCommonScrollableContainerMod.ScrollAreaData
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverCoreUtilsGetModifiersMod.MoveBy
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipSize
import typingsJapgolly.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonMod {
  
  trait FocusOptionsPolyfill extends StObject {
    
    var preventScroll: js.UndefOr[Boolean] = js.undefined
  }
  object FocusOptionsPolyfill {
    
    inline def apply(): FocusOptionsPolyfill = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusOptionsPolyfill]
    }
    
    extension [Self <: FocusOptionsPolyfill](x: Self) {
      
      inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
      
      inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
    }
  }
  
  type IconElement = Element
  
  trait InjectedFocusableProps extends StObject {
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object InjectedFocusableProps {
    
    inline def apply(): InjectedFocusableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedFocusableProps]
    }
    
    extension [Self <: InjectedFocusableProps](x: Self) {
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  trait MoveByOffset extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object MoveByOffset {
    
    inline def apply(): MoveByOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveByOffset]
    }
    
    extension [Self <: MoveByOffset](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  type OmitPolyfill[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  trait PopoverCommonProps extends StObject {
    
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    var excludeClass: js.UndefOr[String] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var showDelay: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double | Exit] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PopoverCommonProps {
    
    inline def apply(): PopoverCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverCommonProps]
    }
    
    extension [Self <: PopoverCommonProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ org.scalajs.dom.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      inline def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      inline def setExcludeClass(value: String): Self = StObject.set(x, "excludeClass", value.asInstanceOf[js.Any])
      
      inline def setExcludeClassUndefined: Self = StObject.set(x, "excludeClass", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      inline def setTimeout(value: Double | Exit): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait ScrollableContainerCommonProps extends StObject {
    
    var onScrollAreaChanged: js.UndefOr[js.Function1[/* scrollChangedData */ ScrollAreaData, Unit]] = js.undefined
    
    var onScrollChanged: js.UndefOr[js.Function1[/* target */ HTMLElement, Unit]] = js.undefined
  }
  object ScrollableContainerCommonProps {
    
    inline def apply(): ScrollableContainerCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollableContainerCommonProps]
    }
    
    extension [Self <: ScrollableContainerCommonProps](x: Self) {
      
      inline def setOnScrollAreaChanged(value: /* scrollChangedData */ ScrollAreaData => Callback): Self = StObject.set(x, "onScrollAreaChanged", js.Any.fromFunction1((t0: /* scrollChangedData */ ScrollAreaData) => value(t0).runNow()))
      
      inline def setOnScrollAreaChangedUndefined: Self = StObject.set(x, "onScrollAreaChanged", js.undefined)
      
      inline def setOnScrollChanged(value: /* target */ HTMLElement => Callback): Self = StObject.set(x, "onScrollChanged", js.Any.fromFunction1((t0: /* target */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnScrollChangedUndefined: Self = StObject.set(x, "onScrollChanged", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP1
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP2
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP3
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP4
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP5
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP6
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP7
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP8
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP9
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP10
  */
  trait Spacing
    extends StObject
       with _BoxCssSizingProperty
  object Spacing {
    
    inline def SP1: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP1 = "SP1".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP1]
    
    inline def SP10: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP10 = "SP10".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP10]
    
    inline def SP2: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP2 = "SP2".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP2]
    
    inline def SP3: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP3 = "SP3".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP3]
    
    inline def SP4: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP4 = "SP4".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP4]
    
    inline def SP5: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP5 = "SP5".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP5]
    
    inline def SP6: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP6 = "SP6".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP6]
    
    inline def SP7: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP7 = "SP7".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP7]
    
    inline def SP8: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP8 = "SP8".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP8]
    
    inline def SP9: typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP9 = "SP9".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.SP9]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.error
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading
  */
  trait StatusIndications extends StObject
  object StatusIndications {
    
    inline def error: typingsJapgolly.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.warning]
  }
  
  trait TooltipCommonProps extends StObject {
    
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
      ] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var size: js.UndefOr[TooltipSize] = js.undefined
    
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TooltipCommonProps {
    
    inline def apply(): TooltipCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipCommonProps]
    }
    
    extension [Self <: TooltipCommonProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ org.scalajs.dom.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
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
      
      inline def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
      ): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
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
}
