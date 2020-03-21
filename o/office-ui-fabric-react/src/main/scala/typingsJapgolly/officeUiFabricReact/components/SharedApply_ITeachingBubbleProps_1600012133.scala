package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.Target
import typingsJapgolly.officeUiFabricReact.imageTypesMod.IImageProps
import typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubble
import typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleStyleProps
import typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleStyles
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ITeachingBubbleProps_1600012133 () {
  val componentImport: js.Any
  def apply(
    ariaDescribedBy: String = null,
    ariaLabelledBy: String = null,
    calloutProps: ICalloutProps = null,
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[ITeachingBubble] = null,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String | js.Function0[String] = null,
    footerContent: String | Element = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    hasCloseIcon: js.UndefOr[Boolean] = js.undefined,
    hasCondensedHeadline: js.UndefOr[Boolean] = js.undefined,
    hasSmallHeadline: js.UndefOr[Boolean] = js.undefined,
    headline: String = null,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    illustrationImage: IImageProps = null,
    isClickableOutsideFocusTrap: js.UndefOr[Boolean] = js.undefined,
    isWide: js.UndefOr[Boolean] = js.undefined,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Callback = null,
    primaryButtonProps: IButtonProps = null,
    secondaryButtonProps: IButtonProps = null,
    styles: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles] = null,
    target: Target = null,
    targetElement: HTMLElement = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITeachingBubbleProps, 
    LegacyRef[
      typingsJapgolly.officeUiFabricReact.teachingBubbleBaseMod.TeachingBubbleBase | typingsJapgolly.officeUiFabricReact.teachingBubbleContentBaseMod.TeachingBubbleContentBase
    ], 
    Unit, 
    ITeachingBubbleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (footerContent != null) __obj.updateDynamic("footerContent")(footerContent.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseIcon)) __obj.updateDynamic("hasCloseIcon")(hasCloseIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCondensedHeadline)) __obj.updateDynamic("hasCondensedHeadline")(hasCondensedHeadline.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSmallHeadline)) __obj.updateDynamic("hasSmallHeadline")(hasSmallHeadline.asInstanceOf[js.Any])
    if (headline != null) __obj.updateDynamic("headline")(headline.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (illustrationImage != null) __obj.updateDynamic("illustrationImage")(illustrationImage.asInstanceOf[js.Any])
    if (!js.isUndefined(isClickableOutsideFocusTrap)) __obj.updateDynamic("isClickableOutsideFocusTrap")(isClickableOutsideFocusTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(isWide)) __obj.updateDynamic("isWide")(isWide.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: /* ev */ js.UndefOr[js.Any]) => onDismiss(t0).runNow()))
    if (primaryButtonProps != null) __obj.updateDynamic("primaryButtonProps")(primaryButtonProps.asInstanceOf[js.Any])
    if (secondaryButtonProps != null) __obj.updateDynamic("secondaryButtonProps")(secondaryButtonProps.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetElement != null) __obj.updateDynamic("targetElement")(targetElement.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[
    typingsJapgolly.officeUiFabricReact.teachingBubbleBaseMod.TeachingBubbleBase | typingsJapgolly.officeUiFabricReact.teachingBubbleContentBaseMod.TeachingBubbleContentBase
  ]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps])(children: _*)
  }
}

