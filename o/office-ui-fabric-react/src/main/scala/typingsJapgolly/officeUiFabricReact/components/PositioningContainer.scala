package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsJapgolly.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainer
import typingsJapgolly.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.IPositionedData
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.ipointMod.IPoint
import typingsJapgolly.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PositioningContainer {
  def apply(
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    backgroundColor: String = null,
    bounds: IRectangle = null,
    className: String = null,
    componentRef: IRefObject[IPositioningContainer] = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    finalHeight: Int | Double = null,
    minPagePadding: Int | Double = null,
    offsetFromTarget: Int | Double = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Callback = null,
    onLayerMounted: js.UndefOr[Callback] = js.undefined,
    onPositioned: /* positions */ js.UndefOr[IPositionedData] => Callback = null,
    positioningContainerMaxHeight: Int | Double = null,
    positioningContainerWidth: Int | Double = null,
    preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    setInitialFocus: js.UndefOr[Boolean] = js.undefined,
    target: HTMLElement | String | MouseEvent | IPoint = null,
    targetPoint: IPoint = null,
    useTargetPoint: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IPositioningContainerProps, 
    typingsJapgolly.officeUiFabricReact.positioningContainerPositioningContainerMod.PositioningContainer, 
    Unit, 
    IPositioningContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer.asInstanceOf[js.Any])
    if (finalHeight != null) __obj.updateDynamic("finalHeight")(finalHeight.asInstanceOf[js.Any])
    if (minPagePadding != null) __obj.updateDynamic("minPagePadding")(minPagePadding.asInstanceOf[js.Any])
    if (offsetFromTarget != null) __obj.updateDynamic("offsetFromTarget")(offsetFromTarget.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[js.Any]) => onDismiss(t0).runNow()))
    onLayerMounted.foreach(p => __obj.updateDynamic("onLayerMounted")(p.toJsFn))
    if (onPositioned != null) __obj.updateDynamic("onPositioned")(js.Any.fromFunction1((t0: /* positions */ js.UndefOr[typingsJapgolly.officeUiFabricReact.positioningTypesMod.IPositionedData]) => onPositioned(t0).runNow()))
    if (positioningContainerMaxHeight != null) __obj.updateDynamic("positioningContainerMaxHeight")(positioningContainerMaxHeight.asInstanceOf[js.Any])
    if (positioningContainerWidth != null) __obj.updateDynamic("positioningContainerWidth")(positioningContainerWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnScroll)) __obj.updateDynamic("preventDismissOnScroll")(preventDismissOnScroll.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(setInitialFocus)) __obj.updateDynamic("setInitialFocus")(setInitialFocus.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetPoint != null) __obj.updateDynamic("targetPoint")(targetPoint.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetPoint)) __obj.updateDynamic("useTargetPoint")(useTargetPoint.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.positioningContainerPositioningContainerMod.PositioningContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.positioningContainerTypesMod.IPositioningContainerProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/PositioningContainer/PositioningContainer", "PositioningContainer")
  @js.native
  object componentImport extends js.Object
  
}

