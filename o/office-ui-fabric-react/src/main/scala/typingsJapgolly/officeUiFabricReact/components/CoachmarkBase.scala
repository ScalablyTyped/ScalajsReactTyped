package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyleProps
import typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmarkStyles
import typingsJapgolly.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CoachmarkBase {
  def apply(
    ariaAlertText: String = null,
    ariaDescribedBy: String = null,
    ariaDescribedByText: String = null,
    ariaLabelledBy: String = null,
    ariaLabelledByText: String = null,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    beakHeight: Int | Double = null,
    beakWidth: Int | Double = null,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    componentRef: IRefObject[ICoachmark] = null,
    delayBeforeCoachmarkAnimation: Int | Double = null,
    delayBeforeMouseOpen: Int | Double = null,
    height: Int | Double = null,
    isCollapsed: js.UndefOr[Boolean] = js.undefined,
    isPositionForced: js.UndefOr[Boolean] = js.undefined,
    mouseProximityOffset: Int | Double = null,
    onAnimationOpenEnd: js.UndefOr[Callback] = js.undefined,
    onAnimationOpenStart: js.UndefOr[Callback] = js.undefined,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Callback = null,
    onMouseMove: /* e */ MouseEvent => Callback = null,
    persistentBeak: js.UndefOr[Boolean] = js.undefined,
    positioningContainerProps: IPositioningContainerProps = null,
    preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    preventFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[ICoachmarkStyleProps, ICoachmarkStyles] = null,
    target: HTMLElement | String = null,
    teachingBubbleRef: ITeachingBubble = null,
    theme: ITheme = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICoachmarkProps, 
    typingsJapgolly.officeUiFabricReact.mod.CoachmarkBase, 
    Unit, 
    ICoachmarkProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaAlertText != null) __obj.updateDynamic("ariaAlertText")(ariaAlertText.asInstanceOf[js.Any])
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaDescribedByText != null) __obj.updateDynamic("ariaDescribedByText")(ariaDescribedByText.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (ariaLabelledByText != null) __obj.updateDynamic("ariaLabelledByText")(ariaLabelledByText.asInstanceOf[js.Any])
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne.asInstanceOf[js.Any])
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo.asInstanceOf[js.Any])
    if (beakHeight != null) __obj.updateDynamic("beakHeight")(beakHeight.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (delayBeforeCoachmarkAnimation != null) __obj.updateDynamic("delayBeforeCoachmarkAnimation")(delayBeforeCoachmarkAnimation.asInstanceOf[js.Any])
    if (delayBeforeMouseOpen != null) __obj.updateDynamic("delayBeforeMouseOpen")(delayBeforeMouseOpen.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsed)) __obj.updateDynamic("isCollapsed")(isCollapsed.asInstanceOf[js.Any])
    if (!js.isUndefined(isPositionForced)) __obj.updateDynamic("isPositionForced")(isPositionForced.asInstanceOf[js.Any])
    if (mouseProximityOffset != null) __obj.updateDynamic("mouseProximityOffset")(mouseProximityOffset.asInstanceOf[js.Any])
    onAnimationOpenEnd.foreach(p => __obj.updateDynamic("onAnimationOpenEnd")(p.toJsFn))
    onAnimationOpenStart.foreach(p => __obj.updateDynamic("onAnimationOpenStart")(p.toJsFn))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[js.Any]) => onDismiss(t0).runNow()))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1((t0: /* e */ org.scalajs.dom.raw.MouseEvent) => onMouseMove(t0).runNow()))
    if (!js.isUndefined(persistentBeak)) __obj.updateDynamic("persistentBeak")(persistentBeak.asInstanceOf[js.Any])
    if (positioningContainerProps != null) __obj.updateDynamic("positioningContainerProps")(positioningContainerProps.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnLostFocus)) __obj.updateDynamic("preventDismissOnLostFocus")(preventDismissOnLostFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(preventFocusOnMount)) __obj.updateDynamic("preventFocusOnMount")(preventFocusOnMount.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (teachingBubbleRef != null) __obj.updateDynamic("teachingBubbleRef")(teachingBubbleRef.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.CoachmarkBase](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "CoachmarkBase")
  @js.native
  object componentImport extends js.Object
  
}

