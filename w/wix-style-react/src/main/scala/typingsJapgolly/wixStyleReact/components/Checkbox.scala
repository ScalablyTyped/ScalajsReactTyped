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
import typingsJapgolly.csstype.mod.Property.Padding
import typingsJapgolly.wixStyleReact.distTypesCheckboxMod.CheckboxLabelSize
import typingsJapgolly.wixStyleReact.distTypesCheckboxMod.CheckboxProps
import typingsJapgolly.wixStyleReact.distTypesCheckboxMod.CheckboxSelectionArea
import typingsJapgolly.wixStyleReact.distTypesCheckboxMod.CheckboxSelectionAreaSkin
import typingsJapgolly.wixStyleReact.distTypesCheckboxMod.CheckboxVAlign
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @JSImport("wix-style-react", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Checkbox] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def hasError(value: Boolean): this.type = set("hasError", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def indeterminate(value: Boolean): this.type = set("indeterminate", value.asInstanceOf[js.Any])
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
    
    inline def selectionArea(value: CheckboxSelectionArea): this.type = set("selectionArea", value.asInstanceOf[js.Any])
    
    inline def selectionAreaPadding(value: Padding[String | Double]): this.type = set("selectionAreaPadding", value.asInstanceOf[js.Any])
    
    inline def selectionAreaSkin(value: CheckboxSelectionAreaSkin): this.type = set("selectionAreaSkin", value.asInstanceOf[js.Any])
    
    inline def size(value: CheckboxLabelSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def tooltipContent(value: VdomNode): this.type = set("tooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def tooltipContentNull: this.type = set("tooltipContent", null)
    
    inline def tooltipContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("tooltipContent", js.Array(value*))
    
    inline def tooltipContentVdomElement(value: VdomElement): this.type = set("tooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltipProps(value: TooltipCommonProps): this.type = set("tooltipProps", value.asInstanceOf[js.Any])
    
    inline def vAlign(value: CheckboxVAlign): this.type = set("vAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Checkbox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CheckboxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
