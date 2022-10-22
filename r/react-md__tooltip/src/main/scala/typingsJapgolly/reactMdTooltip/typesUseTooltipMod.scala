package typingsJapgolly.reactMdTooltip

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.react.mod.TouchEventHandler
import typingsJapgolly.reactMdTooltip.typesUseTooltipPositionMod.TooltipPositionHookOptions
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionCallbacks
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionEnterHandler
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionExitHandler
import typingsJapgolly.reactMdUtils.typesModeTypesMod.UserInteractionMode
import typingsJapgolly.reactMdUtils.typesPositioningTypesMod.SimplePosition
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseTooltipMod {
  
  @JSImport("@react-md/tooltip/types/useTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTooltip[E /* <: HTMLElement */](
    hasBaseIdPropStyleDescribedByDenseSpacingDenseSpacingDeterminedPositionDefaultPositionVwMarginVhMarginThresholdTouchTimeFocusTimePropOnFocusPropOnBlurPropOnKeyDownOnClickOnMouseEnterOnMouseLeavePropOnTouchStartPropOnContextMenuOnEnterOnEnteringOnEnteredOnExitedDisabledDisableSwappingPropDisableHoverModeDisableAutoSpacing: TooltipHookOptions[E]
  ): TooltipHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")(hasBaseIdPropStyleDescribedByDenseSpacingDenseSpacingDeterminedPositionDefaultPositionVwMarginVhMarginThresholdTouchTimeFocusTimePropOnFocusPropOnBlurPropOnKeyDownOnClickOnMouseEnterOnMouseLeavePropOnTouchStartPropOnContextMenuOnEnterOnEnteringOnEnteredOnExitedDisabledDisableSwappingPropDisableHoverModeDisableAutoSpacing.asInstanceOf[js.Any]).asInstanceOf[TooltipHookReturnValue[E]]
  
  trait BaseTooltipHookOptions[E /* <: HTMLElement */]
    extends StObject
       with TransitionCallbacks
       with TooltipPositionHookOptions
       with TooltipPositioningOptions
       with TooltippedElementEventHandlers[E] {
    
    /**
      * Boolean if the hover mode functionality should be disabled for this
      * instance instead of inheriting the value from the
      * {@link HoverModeProvider}.
      */
    var disableHoverMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the event handlers should no longer attempt to show a tooltip. This
      * should be set to `true` when your component might not have a tooltip associated
      * with it.
      *
      * @example
      * Real World Example
      * ```tsx
      * import type { ReactElement, ReactNode } from "react";
      * import { Button, ButtonProps } from "@react-md/button";
      * import { Tooltip, useTooltip } from "@react-md/tooltip":
      *
      * export interface TooltippedButtonProps extends ButtonProps {
      *   id: string;
      *   tooltip?: ReactNode;
      * }
      *
      * export function TooltippedButton({
      *   id,
      *   tooltip,
      *   children,
      *   onClick,
      *   onBlur,
      *   onFocus,
      *   onKeyDown,
      *   onMouseEnter,
      *   onMouseLeave,
      *   onTouchStart,
      *   onContextMenu,
      *   ...props
      * }: TooltippedButtonProps): ReactElement {
      *   const { elementProps, tooltipProps } = useTooltip({
      *     disabled: !tooltip,
      *     baseId: id,
      *     onClick,
      *     onBlur,
      *     onFocus,
      *     onKeyDown,
      *     onMouseEnter,
      *     onMouseLeave,
      *     onTouchStart,
      *     onContextMenu,
      *   });
      *
      *   return (
      *     <>
      *       <Button {...props} {...elementProps}>
      *         {children}
      *       </Button>
      *       <Tooltip {...tooltipProps}>{tooltip}</Tooltip>
      *     </>
      *   );
      * }
      * ```
      *
      * @defaultValue `false`
      * @remarks \@since 5.1.0
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of time to wait (in ms) before showing the tooltip after a
      * keyboard user has triggered a `focus` event. You _probably_ won't ever need
      * to change this value.
      */
    var focusTime: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time to wait (in ms) before showing the tooltip after
      * triggering a `touchstart` event. You _probably_ won't ever need to change
      * this value.
      *
      * The default time is about the same it takes to display the context menu
      * with a "long touch" and cancel displaying the context menu.
      */
    var touchTime: js.UndefOr[Double] = js.undefined
  }
  object BaseTooltipHookOptions {
    
    inline def apply[E /* <: HTMLElement */](): BaseTooltipHookOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseTooltipHookOptions[E]]
    }
    
    extension [Self <: BaseTooltipHookOptions[?], E /* <: HTMLElement */](x: Self & BaseTooltipHookOptions[E]) {
      
      inline def setDisableHoverMode(value: Boolean): Self = StObject.set(x, "disableHoverMode", value.asInstanceOf[js.Any])
      
      inline def setDisableHoverModeUndefined: Self = StObject.set(x, "disableHoverMode", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusTime(value: Double): Self = StObject.set(x, "focusTime", value.asInstanceOf[js.Any])
      
      inline def setFocusTimeUndefined: Self = StObject.set(x, "focusTime", js.undefined)
      
      inline def setTouchTime(value: Double): Self = StObject.set(x, "touchTime", value.asInstanceOf[js.Any])
      
      inline def setTouchTimeUndefined: Self = StObject.set(x, "touchTime", js.undefined)
    }
  }
  
  trait TooltipHookOptions[E /* <: HTMLElement */]
    extends StObject
       with BaseTooltipHookOptions[E] {
    
    /**
      * This is the DOM `id` to use for the tooltipped element and is used to
      * generate an `id` for the `Tooltip` component as:
      *
      * ```ts
      * const tooltipId = `${baseId}-tooltip`
      * ```
      */
    var baseId: String
    
    /**
      * An optional `aria-describedby` DOM `id` string to merge with the returned
      * `aria-describedby` string since it only exists when the tooltip is visible.
      */
    var describedBy: js.UndefOr[String] = js.undefined
  }
  object TooltipHookOptions {
    
    inline def apply[E /* <: HTMLElement */](baseId: String): TooltipHookOptions[E] = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHookOptions[E]]
    }
    
    extension [Self <: TooltipHookOptions[?], E /* <: HTMLElement */](x: Self & TooltipHookOptions[E]) {
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      inline def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
    }
  }
  
  /* Inlined parent std.Required<@react-md/tooltip.@react-md/tooltip/types/useTooltip.TooltippedElementEventHandlers<E>> */
  trait TooltipHookProvidedElementProps[E /* <: HTMLElement */] extends StObject {
    
    /**
      * An optional `aria-describedby` that will be provided only while the tooltip
      * is visible or the {@link TooltipHookOptions.describedBy} is provided.
      */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /**
      * The DOM `id` required for a11y that is based off of the
      * {@link TooltipHookOptions.baseId}.
      */
    var id: String
    
    var onBlur: FocusEventHandler[E]
    
    var onClick: MouseEventHandler[E]
    
    var onContextMenu: MouseEventHandler[E]
    
    var onFocus: FocusEventHandler[E]
    
    var onKeyDown: KeyboardEventHandler[E]
    
    var onMouseEnter: MouseEventHandler[E]
    
    var onMouseLeave: MouseEventHandler[E]
    
    var onTouchStart: TouchEventHandler[E]
  }
  object TooltipHookProvidedElementProps {
    
    inline def apply[E /* <: HTMLElement */](
      id: String,
      onBlur: ReactFocusEventFrom[E & Element] => Callback,
      onClick: ReactMouseEventFrom[E & Element] => Callback,
      onContextMenu: ReactMouseEventFrom[E & Element] => Callback,
      onFocus: ReactFocusEventFrom[E & Element] => Callback,
      onKeyDown: ReactKeyboardEventFrom[E & Element] => Callback,
      onMouseEnter: ReactMouseEventFrom[E & Element] => Callback,
      onMouseLeave: ReactMouseEventFrom[E & Element] => Callback,
      onTouchStart: ReactTouchEventFrom[E & Element] => Callback
    ): TooltipHookProvidedElementProps[E] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => onBlur(t0).runNow()), onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => onClick(t0).runNow()), onContextMenu = js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => onContextMenu(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => onFocus(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => onKeyDown(t0).runNow()), onMouseEnter = js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => onMouseLeave(t0).runNow()), onTouchStart = js.Any.fromFunction1((t0: ReactTouchEventFrom[E & Element]) => onTouchStart(t0).runNow()))
      __obj.asInstanceOf[TooltipHookProvidedElementProps[E]]
    }
    
    extension [Self <: TooltipHookProvidedElementProps[?], E /* <: HTMLElement */](x: Self & TooltipHookProvidedElementProps[E]) {
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnClick(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnFocus(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[E & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[E & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[E & Element]) => value(t0).runNow()))
    }
  }
  
  /* Inlined std.Pick<@react-md/tooltip.@react-md/tooltip/types/Tooltip.TooltipProps, 'style'> & std.Required<@react-md/transition.@react-md/transition.FixedPositioningTransitionCallbacks> & std.Required<std.Pick<@react-md/tooltip.@react-md/tooltip/types/Tooltip.TooltipProps, 'id' | 'dense' | 'position' | 'visible'>> & {  ref :react.react.Ref<std.HTMLSpanElement>} */
  trait TooltipHookProvidedTooltipProps extends StObject {
    
    var dense: Boolean
    
    var id: String
    
    var onEnter: TransitionEnterHandler
    
    var onEntered: TransitionEnterHandler
    
    var onEntering: TransitionEnterHandler
    
    var onExited: TransitionExitHandler
    
    var position: SimplePosition
    
    var ref: Ref[HTMLSpanElement]
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var visible: Boolean
  }
  object TooltipHookProvidedTooltipProps {
    
    inline def apply(
      dense: Boolean,
      id: String,
      onEnter: /* appearing */ Boolean => Callback,
      onEntered: /* appearing */ Boolean => Callback,
      onEntering: /* appearing */ Boolean => Callback,
      onExited: Callback,
      position: SimplePosition,
      visible: Boolean
    ): TooltipHookProvidedTooltipProps = {
      val __obj = js.Dynamic.literal(dense = dense.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onEnter = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEnter(t0).runNow()), onEntered = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntered(t0).runNow()), onEntering = js.Any.fromFunction1((t0: /* appearing */ Boolean) => onEntering(t0).runNow()), onExited = onExited.toJsFn, position = position.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], ref = null)
      __obj.asInstanceOf[TooltipHookProvidedTooltipProps]
    }
    
    extension [Self <: TooltipHookProvidedTooltipProps](x: Self) {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnEnter(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def setOnEntered(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntered", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def setOnEntering(value: /* appearing */ Boolean => Callback): Self = StObject.set(x, "onEntering", js.Any.fromFunction1((t0: /* appearing */ Boolean) => value(t0).runNow()))
      
      inline def setOnExited(value: Callback): Self = StObject.set(x, "onExited", value.toJsFn)
      
      inline def setPosition(value: SimplePosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Ref[HTMLSpanElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLSpanElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLSpanElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<@react-md/utils.@react-md/utils.HoverModeHookReturnValue, 'handlers' | 'hoverHandlers'> */
  trait TooltipHookReturnValue[E /* <: HTMLElement */] extends StObject {
    
    var active: Boolean
    
    var clearHoverTimeout: js.Function0[Unit]
    
    var disableHoverMode: js.Function0[Unit]
    
    /**
      * These are the props that should be provided to the element the tooltip is
      * attached to.
      */
    var elementProps: TooltipHookProvidedElementProps[E]
    
    var enableHoverMode: js.Function0[Unit]
    
    /** {@inheritDoc TooltippedElementEventHandlers} */
    var handlers: Required[TooltippedElementEventHandlers[E]]
    
    var onClick: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
    
    var onMouseEnter: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
    
    var onMouseLeave: js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]
    
    var setVisible: Dispatch[SetStateAction[Boolean]]
    
    var startDisableTimer: js.Function0[Unit]
    
    var stuck: Boolean
    
    /**
      * These props should be provided to the {@link Tooltip} component.
      */
    var tooltipProps: TooltipHookProvidedTooltipProps
    
    var visible: Boolean
  }
  object TooltipHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](
      active: Boolean,
      clearHoverTimeout: Callback,
      disableHoverMode: Callback,
      elementProps: TooltipHookProvidedElementProps[E],
      enableHoverMode: Callback,
      handlers: Required[TooltippedElementEventHandlers[E]],
      onClick: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
      onMouseEnter: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
      onMouseLeave: /* event */ ReactMouseEventFrom[HTMLElement] => Callback,
      setVisible: SetStateAction[Boolean] => Callback,
      startDisableTimer: Callback,
      stuck: Boolean,
      tooltipProps: TooltipHookProvidedTooltipProps,
      visible: Boolean
    ): TooltipHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clearHoverTimeout = clearHoverTimeout.toJsFn, disableHoverMode = disableHoverMode.toJsFn, elementProps = elementProps.asInstanceOf[js.Any], enableHoverMode = enableHoverMode.toJsFn, handlers = handlers.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onClick(t0).runNow()), onMouseEnter = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onMouseEnter(t0).runNow()), onMouseLeave = js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => onMouseLeave(t0).runNow()), setVisible = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setVisible(t0).runNow()), startDisableTimer = startDisableTimer.toJsFn, stuck = stuck.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipHookReturnValue[E]]
    }
    
    extension [Self <: TooltipHookReturnValue[?], E /* <: HTMLElement */](x: Self & TooltipHookReturnValue[E]) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setClearHoverTimeout(value: Callback): Self = StObject.set(x, "clearHoverTimeout", value.toJsFn)
      
      inline def setDisableHoverMode(value: Callback): Self = StObject.set(x, "disableHoverMode", value.toJsFn)
      
      inline def setElementProps(value: TooltipHookProvidedElementProps[E]): Self = StObject.set(x, "elementProps", value.asInstanceOf[js.Any])
      
      inline def setEnableHoverMode(value: Callback): Self = StObject.set(x, "enableHoverMode", value.toJsFn)
      
      inline def setHandlers(value: Required[TooltippedElementEventHandlers[E]]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnMouseEnter(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnMouseLeave(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setSetVisible(value: SetStateAction[Boolean] => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: SetStateAction[Boolean]) => value(t0).runNow()))
      
      inline def setStartDisableTimer(value: Callback): Self = StObject.set(x, "startDisableTimer", value.toJsFn)
      
      inline def setStuck(value: Boolean): Self = StObject.set(x, "stuck", value.asInstanceOf[js.Any])
      
      inline def setTooltipProps(value: TooltipHookProvidedTooltipProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  type TooltipInitiatedBy = UserInteractionMode | Null
  
  /* Inlined std.Pick<react.react.HTMLAttributes<E>, 'onBlur' | 'onFocus' | 'onKeyDown'> */
  trait TooltipKeyboardEventHandlers[E /* <: HTMLElement */] extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[E]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[E]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
  }
  object TooltipKeyboardEventHandlers {
    
    inline def apply[E /* <: HTMLElement */](): TooltipKeyboardEventHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipKeyboardEventHandlers[E]]
    }
    
    extension [Self <: TooltipKeyboardEventHandlers[?], E /* <: HTMLElement */](x: Self & TooltipKeyboardEventHandlers[E]) {
      
      inline def setOnBlur(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[E & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    }
  }
  
  trait TooltipPositioningOptions extends StObject {
    
    /**
      * Boolean if the tooltip is using the dense spec. This will reduce the
      * padding, margin and font size for the tooltip and is usually used for
      * desktop displays.
      */
    var dense: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of spacing to use for a dense tooltip. This is the distance
      * between the container element and the tooltip.
      */
    var denseSpacing: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Since `react-md` provides mixins to automatically apply a dense spec
      * through mixins via media queries, the dense spec might be applied in css
      * instead of in JS. This component will actually check the current spacing
      * amount that has been applied when the tooltip becomes visible.
      *
      * If this behavior is not desired, you can enable this prop and it will only
      * use the provided `spacing` or `denseSpacing` props based on the `dense`
      * prop.
      *
      * Note: This will be defaulted to `true` when the
      * `process.env.NODE_ENV === 'test'` since test environments normally don't
      * have a default `window.getComputedStyle` value that is not `NaN`
      * which will display errors in your tests.
      */
    var disableAutoSpacing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the auto-swapping behavior should be disabled. When this value
      * is `undefined`, it'll be treated as `true` when the `position` prop is
      * defined, otherwise `false`.
      */
    var disableSwapping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The amount of spacing to use for a non-dense tooltip. This is the distance
      * between the container element and the tooltip.
      */
    var spacing: js.UndefOr[Double | String] = js.undefined
    
    /**
      * An optional style object to merge and override the generated fixed
      * positioning styles.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * This is the viewport height margin to use in the positioning calculation.
      * This is just used so that the tooltip can be placed with some spacing
      * between the top and bottom edges of the viewport if desired.
      */
    var vhMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * This is the viewport width margin to use in the positioning calculation.
      * This is just used so that the tooltip can be placed with some spacing
      * between the left and right edges of the viewport if desired.
      */
    var vwMargin: js.UndefOr[Double] = js.undefined
  }
  object TooltipPositioningOptions {
    
    inline def apply(): TooltipPositioningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPositioningOptions]
    }
    
    extension [Self <: TooltipPositioningOptions](x: Self) {
      
      inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setDenseSpacing(value: Double | String): Self = StObject.set(x, "denseSpacing", value.asInstanceOf[js.Any])
      
      inline def setDenseSpacingUndefined: Self = StObject.set(x, "denseSpacing", js.undefined)
      
      inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
      
      inline def setDisableAutoSpacing(value: Boolean): Self = StObject.set(x, "disableAutoSpacing", value.asInstanceOf[js.Any])
      
      inline def setDisableAutoSpacingUndefined: Self = StObject.set(x, "disableAutoSpacing", js.undefined)
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setDisableSwappingUndefined: Self = StObject.set(x, "disableSwapping", js.undefined)
      
      inline def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      inline def setVhMarginUndefined: Self = StObject.set(x, "vhMargin", js.undefined)
      
      inline def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      inline def setVwMarginUndefined: Self = StObject.set(x, "vwMargin", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react.react.HTMLAttributes<E>, 'onTouchStart' | 'onContextMenu'> */
  trait TooltipTouchEventHandlers[E /* <: HTMLElement */] extends StObject {
    
    var onContextMenu: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[E]] = js.undefined
  }
  object TooltipTouchEventHandlers {
    
    inline def apply[E /* <: HTMLElement */](): TooltipTouchEventHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipTouchEventHandlers[E]]
    }
    
    extension [Self <: TooltipTouchEventHandlers[?], E /* <: HTMLElement */](x: Self & TooltipTouchEventHandlers[E]) {
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[E & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  /* Inlined @react-md/tooltip.@react-md/tooltip/types/useTooltip.TooltipTouchEventHandlers<E> & @react-md/tooltip.@react-md/tooltip/types/useTooltip.TooltipKeyboardEventHandlers<E> & std.Pick<react.react.HTMLAttributes<E>, keyof @react-md/utils.@react-md/utils.HoverModeEventHandlers> */
  trait TooltippedElementEventHandlers[E /* <: HTMLElement */] extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[E]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onContextMenu: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[E]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[E]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[E]] = js.undefined
    
    var onTouchStart: js.UndefOr[TouchEventHandler[E]] = js.undefined
  }
  object TooltippedElementEventHandlers {
    
    inline def apply[E /* <: HTMLElement */](): TooltippedElementEventHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltippedElementEventHandlers[E]]
    }
    
    extension [Self <: TooltippedElementEventHandlers[?], E /* <: HTMLElement */](x: Self & TooltippedElementEventHandlers[E]) {
      
      inline def setOnBlur(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnContextMenu(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: ReactKeyboardEventFrom[E & Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnMouseEnter(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: ReactMouseEventFrom[E & Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnTouchStart(value: ReactTouchEventFrom[E & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
}
