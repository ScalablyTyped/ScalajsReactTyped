package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCheckToggleMod.CheckToggleProps
import typingsJapgolly.wixStyleReact.distTypesCheckToggleMod.CheckToggleSize
import typingsJapgolly.wixStyleReact.distTypesCheckToggleMod.CheckToggleSkin
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckToggle {
  
  @JSImport("wix-style-react", "CheckToggle")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.CheckToggle] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def size(value: CheckToggleSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def skin(value: CheckToggleSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    inline def tooltipContent(value: VdomNode): this.type = set("tooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def tooltipContentNull: this.type = set("tooltipContent", null)
    
    inline def tooltipContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("tooltipContent", js.Array(value*))
    
    inline def tooltipContentVdomElement(value: VdomElement): this.type = set("tooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltipProps(value: TooltipCommonProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: CheckToggle.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckToggleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
