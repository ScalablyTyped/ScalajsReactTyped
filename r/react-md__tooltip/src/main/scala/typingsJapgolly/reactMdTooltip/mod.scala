package typingsJapgolly.reactMdTooltip

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdTooltip.typesTooltipMod.TooltipProps
import typingsJapgolly.reactMdTooltip.typesTooltippedMod.TooltippedProps
import typingsJapgolly.reactMdTooltip.typesUseTooltipMod.TooltipHookOptions
import typingsJapgolly.reactMdTooltip.typesUseTooltipMod.TooltipHookReturnValue
import typingsJapgolly.reactMdTooltip.typesUseTooltipPositionMod.TooltipPositionHookOptions
import typingsJapgolly.reactMdTooltip.typesUseTooltipPositionMod.TooltipPositionHookReturnValue
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_CLASSNAMES")
  @js.native
  val DEFAULT_TOOLTIP_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_DELAY")
  @js.native
  val DEFAULT_TOOLTIP_DELAY: /* 1000 */ Double = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_DENSE_SPACING")
  @js.native
  val DEFAULT_TOOLTIP_DENSE_SPACING: /* "0.875rem" */ String = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_MARGIN")
  @js.native
  val DEFAULT_TOOLTIP_MARGIN: /* 16 */ Double = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_POSITION")
  @js.native
  val DEFAULT_TOOLTIP_POSITION: /* "below" */ String = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_SPACING")
  @js.native
  val DEFAULT_TOOLTIP_SPACING: /* "1.5rem" */ String = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_THRESHOLD")
  @js.native
  val DEFAULT_TOOLTIP_THRESHOLD: /* 0.75 */ Double = js.native
  
  @JSImport("@react-md/tooltip", "DEFAULT_TOOLTIP_TIMEOUT")
  @js.native
  val DEFAULT_TOOLTIP_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/tooltip", "TOOLTIP_SPACING_VAR")
  @js.native
  val TOOLTIP_SPACING_VAR: /* "--rmd-tooltip-spacing" */ String = js.native
  
  @JSImport("@react-md/tooltip", "Tooltip")
  @js.native
  val Tooltip: ForwardRefExoticComponent[TooltipProps & RefAttributes[HTMLSpanElement]] = js.native
  
  inline def Tooltipped(
    hasIdStyleChildrenTooltipChildrenDenseVhMarginVwMarginSpacingDenseSpacingPropPositionThresholdOnClickOnMouseEnterOnMouseLeaveOnTouchStartOnContextMenuOnBlurOnFocusOnKeyDownDescribedByDefaultPositionTemporaryDisableSwappingDisableHoverModeDisableAutoSpacingProps: TooltippedProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Tooltipped")(hasIdStyleChildrenTooltipChildrenDenseVhMarginVwMarginSpacingDenseSpacingPropPositionThresholdOnClickOnMouseEnterOnMouseLeaveOnTouchStartOnContextMenuOnBlurOnFocusOnKeyDownDescribedByDefaultPositionTemporaryDisableSwappingDisableHoverModeDisableAutoSpacingProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useTooltip[E /* <: HTMLElement */](
    hasBaseIdPropStyleDescribedByDenseSpacingDenseSpacingDeterminedPositionDefaultPositionVwMarginVhMarginThresholdTouchTimeFocusTimePropOnFocusPropOnBlurPropOnKeyDownOnClickOnMouseEnterOnMouseLeavePropOnTouchStartPropOnContextMenuOnEnterOnEnteringOnEnteredOnExitedDisabledDisableSwappingPropDisableHoverModeDisableAutoSpacing: TooltipHookOptions[E]
  ): TooltipHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltip")(hasBaseIdPropStyleDescribedByDenseSpacingDenseSpacingDeterminedPositionDefaultPositionVwMarginVhMarginThresholdTouchTimeFocusTimePropOnFocusPropOnBlurPropOnKeyDownOnClickOnMouseEnterOnMouseLeavePropOnTouchStartPropOnContextMenuOnEnterOnEnteringOnEnteredOnExitedDisabledDisableSwappingPropDisableHoverModeDisableAutoSpacing.asInstanceOf[js.Any]).asInstanceOf[TooltipHookReturnValue[E]]
  
  inline def useTooltipPosition(hasDeterminedPositionDefaultPositionThreshold: TooltipPositionHookOptions): TooltipPositionHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useTooltipPosition")(hasDeterminedPositionDefaultPositionThreshold.asInstanceOf[js.Any]).asInstanceOf[TooltipPositionHookReturnValue]
}
