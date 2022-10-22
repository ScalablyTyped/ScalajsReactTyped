package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogStepButtonMod.DialogStepButtonProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogStepMod.DialogStepId
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogMultistepDialogMod.IMultistepDialogProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogMultistepDialogMod.MultistepDialogNavPosition
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultistepDialog {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IMultistepDialogProps]))
  }
  
  @JSImport("@blueprintjs/core", "MultistepDialog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.MultistepDialog] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def backButtonProps(value: DialogStepButtonProps): this.type = set("backButtonProps", value.asInstanceOf[js.Any])
    
    inline def backdropClassName(value: String): this.type = set("backdropClassName", value.asInstanceOf[js.Any])
    
    inline def backdropProps(value: HTMLProps[HTMLDivElement]): this.type = set("backdropProps", value.asInstanceOf[js.Any])
    
    inline def canEscapeKeyClose(value: Boolean): this.type = set("canEscapeKeyClose", value.asInstanceOf[js.Any])
    
    inline def canOutsideClickClose(value: Boolean): this.type = set("canOutsideClickClose", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def closeButtonProps(value: DialogStepButtonProps): this.type = set("closeButtonProps", value.asInstanceOf[js.Any])
    
    inline def containerRef(value: Ref[HTMLDivElement]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    
    inline def containerRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("containerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def containerRefNull: this.type = set("containerRef", null)
    
    inline def enforceFocus(value: Boolean): this.type = set("enforceFocus", value.asInstanceOf[js.Any])
    
    inline def finalButtonProps(value: DialogStepButtonProps): this.type = set("finalButtonProps", value.asInstanceOf[js.Any])
    
    inline def hasBackdrop(value: Boolean): this.type = set("hasBackdrop", value.asInstanceOf[js.Any])
    
    inline def icon(value: BlueprintIcons16Id | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def initialStepIndex(value: Double): this.type = set("initialStepIndex", value.asInstanceOf[js.Any])
    
    inline def isCloseButtonShown(value: Boolean): this.type = set("isCloseButtonShown", value.asInstanceOf[js.Any])
    
    inline def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def navigationPosition(value: MultistepDialogNavPosition): this.type = set("navigationPosition", value.asInstanceOf[js.Any])
    
    inline def nextButtonProps(value: DialogStepButtonProps): this.type = set("nextButtonProps", value.asInstanceOf[js.Any])
    
    inline def onChange(
      value: (/* newDialogStepId */ DialogStepId, /* prevDialogStepId */ js.UndefOr[DialogStepId], /* event */ ReactMouseEventFrom[HTMLElement]) => Callback
    ): this.type = set("onChange", js.Any.fromFunction3((t0: /* newDialogStepId */ DialogStepId, t1: /* prevDialogStepId */ js.UndefOr[DialogStepId], t2: /* event */ ReactMouseEventFrom[HTMLElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onClose(value: /* event */ ReactEventFrom[HTMLElement] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onClosed(value: /* node */ HTMLElement => Callback): this.type = set("onClosed", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onClosing(value: /* node */ HTMLElement => Callback): this.type = set("onClosing", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onOpened(value: /* node */ HTMLElement => Callback): this.type = set("onOpened", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onOpening(value: /* node */ HTMLElement => Callback): this.type = set("onOpening", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def portalClassName(value: String): this.type = set("portalClassName", value.asInstanceOf[js.Any])
    
    inline def portalContainer(value: HTMLElement): this.type = set("portalContainer", value.asInstanceOf[js.Any])
    
    inline def resetOnClose(value: Boolean): this.type = set("resetOnClose", value.asInstanceOf[js.Any])
    
    inline def shouldReturnFocusOnClose(value: Boolean): this.type = set("shouldReturnFocusOnClose", value.asInstanceOf[js.Any])
    
    inline def showCloseButtonInFooter(value: Boolean): this.type = set("showCloseButtonInFooter", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    inline def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IMultistepDialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
