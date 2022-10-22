package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsCalloutCalloutDottypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.libComponentsFocusTrapZoneFocusTrapZoneDottypesMod.IFocusTrapZoneProps
import typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.IImageProps
import typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubble
import typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubbleStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubbleStyles
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricReactHooks.libUseTargetMod.Target
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ITeachingBubbleProps1563295964[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
  
  inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
  
  inline def calloutProps(value: ICalloutProps): this.type = set("calloutProps", value.asInstanceOf[js.Any])
  
  inline def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
  
  inline def componentRef(value: IRefObject[ITeachingBubble]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  inline def componentRefFunction1(value: /* ref */ ITeachingBubble | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ ITeachingBubble | Null) => value(t0).runNow()))
  
  inline def elementToFocusOnDismiss(value: HTMLElement): this.type = set("elementToFocusOnDismiss", value.asInstanceOf[js.Any])
  
  inline def firstFocusableSelector(value: String | js.Function0[String]): this.type = set("firstFocusableSelector", value.asInstanceOf[js.Any])
  
  inline def firstFocusableSelectorCallbackTo(value: CallbackTo[String]): this.type = set("firstFocusableSelector", value.toJsFn)
  
  inline def focusTrapZoneProps(value: IFocusTrapZoneProps): this.type = set("focusTrapZoneProps", value.asInstanceOf[js.Any])
  
  inline def footerContent(value: String | Element): this.type = set("footerContent", value.asInstanceOf[js.Any])
  
  inline def footerContentVdomElement(value: VdomElement): this.type = set("footerContent", value.rawElement.asInstanceOf[js.Any])
  
  inline def forceFocusInsideTrap(value: Boolean): this.type = set("forceFocusInsideTrap", value.asInstanceOf[js.Any])
  
  inline def hasCloseButton(value: Boolean): this.type = set("hasCloseButton", value.asInstanceOf[js.Any])
  
  inline def hasCloseIcon(value: Boolean): this.type = set("hasCloseIcon", value.asInstanceOf[js.Any])
  
  inline def hasCondensedHeadline(value: Boolean): this.type = set("hasCondensedHeadline", value.asInstanceOf[js.Any])
  
  inline def hasSmallHeadline(value: Boolean): this.type = set("hasSmallHeadline", value.asInstanceOf[js.Any])
  
  inline def headline(value: String): this.type = set("headline", value.asInstanceOf[js.Any])
  
  inline def ignoreExternalFocusing(value: Boolean): this.type = set("ignoreExternalFocusing", value.asInstanceOf[js.Any])
  
  inline def illustrationImage(value: IImageProps): this.type = set("illustrationImage", value.asInstanceOf[js.Any])
  
  inline def isClickableOutsideFocusTrap(value: Boolean): this.type = set("isClickableOutsideFocusTrap", value.asInstanceOf[js.Any])
  
  inline def isWide(value: Boolean): this.type = set("isWide", value.asInstanceOf[js.Any])
  
  inline def onDismiss(value: /* ev */ js.UndefOr[Any] => Callback): this.type = set("onDismiss", js.Any.fromFunction1((t0: /* ev */ js.UndefOr[Any]) => value(t0).runNow()))
  
  inline def primaryButtonProps(value: IButtonProps): this.type = set("primaryButtonProps", value.asInstanceOf[js.Any])
  
  inline def secondaryButtonProps(value: IButtonProps): this.type = set("secondaryButtonProps", value.asInstanceOf[js.Any])
  
  inline def styles(value: IStyleFunctionOrObject[ITeachingBubbleStyleProps, ITeachingBubbleStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
  
  inline def stylesFunction1(value: ITeachingBubbleStyleProps => DeepPartial[ITeachingBubbleStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  
  inline def target(value: Target): this.type = set("target", value.asInstanceOf[js.Any])
  
  inline def targetElement(value: HTMLElement): this.type = set("targetElement", value.asInstanceOf[js.Any])
  
  inline def targetNull: this.type = set("target", null)
  
  inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
}
