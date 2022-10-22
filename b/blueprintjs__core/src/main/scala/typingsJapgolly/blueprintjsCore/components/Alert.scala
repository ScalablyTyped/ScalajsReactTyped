package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsAlertAlertMod.IAlertProps
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Alert {
  
  inline def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IAlertProps]))
  }
  
  @JSImport("@blueprintjs/core", "Alert")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.Alert] {
    
    inline def canEscapeKeyCancel(value: Boolean): this.type = set("canEscapeKeyCancel", value.asInstanceOf[js.Any])
    
    inline def canOutsideClickCancel(value: Boolean): this.type = set("canOutsideClickCancel", value.asInstanceOf[js.Any])
    
    inline def cancelButtonText(value: String): this.type = set("cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def confirmButtonText(value: String): this.type = set("confirmButtonText", value.asInstanceOf[js.Any])
    
    inline def icon(value: BlueprintIcons16Id | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]] => Callback): this.type = set("onCancel", js.Any.fromFunction1((t0: /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def onClose(value: (/* confirmed */ Boolean, /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]]) => Callback): this.type = set("onClose", js.Any.fromFunction2((t0: /* confirmed */ Boolean, t1: /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]]) => (value(t0, t1)).runNow()))
    
    inline def onClosed(value: /* node */ HTMLElement => Callback): this.type = set("onClosed", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onClosing(value: /* node */ HTMLElement => Callback): this.type = set("onClosing", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onConfirm(value: /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]] => Callback): this.type = set("onConfirm", js.Any.fromFunction1((t0: /* evt */ js.UndefOr[ReactEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def onOpened(value: /* node */ HTMLElement => Callback): this.type = set("onOpened", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onOpening(value: /* node */ HTMLElement => Callback): this.type = set("onOpening", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def portalContainer(value: HTMLElement): this.type = set("portalContainer", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IAlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
