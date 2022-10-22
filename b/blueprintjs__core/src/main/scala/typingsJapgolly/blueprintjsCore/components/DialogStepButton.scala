package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.button
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.reset
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.submit
import typingsJapgolly.blueprintjsCore.libEsmCommonAlignmentMod.Alignment
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.MaybeElement
import typingsJapgolly.blueprintjsCore.libEsmComponentsDialogDialogStepButtonMod.DialogStepButtonProps
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogStepButton {
  
  @JSImport("@blueprintjs/core/lib/esm/components/dialog/dialogStepButton", "DialogStepButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def alignText(value: Alignment): this.type = set("alignText", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def fill(value: Boolean): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def icon(value: BlueprintIcons16Id | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def large(value: Boolean): this.type = set("large", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def minimal(value: Boolean): this.type = set("minimal", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def outlined(value: Boolean): this.type = set("outlined", value.asInstanceOf[js.Any])
    
    inline def rightIcon(value: BlueprintIcons16Id | MaybeElement): this.type = set("rightIcon", value.asInstanceOf[js.Any])
    
    inline def rightIconNull: this.type = set("rightIcon", null)
    
    inline def rightIconVdomElement(value: VdomElement): this.type = set("rightIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    
    inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltipContent(value: typingsJapgolly.react.mod.global.JSX.Element | String): this.type = set("tooltipContent", value.asInstanceOf[js.Any])
    
    inline def tooltipContentVdomElement(value: VdomElement): this.type = set("tooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: submit | reset | button): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DialogStepButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DialogStepButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
