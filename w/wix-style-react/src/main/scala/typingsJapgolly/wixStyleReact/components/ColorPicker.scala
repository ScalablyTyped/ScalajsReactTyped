package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesColorPickerMod.ColorInstance
import typingsJapgolly.wixStyleReact.distTypesColorPickerMod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorPicker {
  
  inline def apply(value: String | ColorInstance): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ColorPickerProps]))
  }
  
  @JSImport("wix-style-react", "ColorPicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ColorPicker] {
    
    inline def addTooltipContent(value: VdomNode): this.type = set("addTooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def addTooltipContentNull: this.type = set("addTooltipContent", null)
    
    inline def addTooltipContentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("addTooltipContent", js.Array(value*))
    
    inline def addTooltipContentVdomElement(value: VdomElement): this.type = set("addTooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def allowEmpty(value: Boolean): this.type = set("allowEmpty", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def emptyPlaceholder(value: String): this.type = set("emptyPlaceholder", value.asInstanceOf[js.Any])
    
    inline def onAdd(value: /* color */ String | ColorInstance => Callback): this.type = set("onAdd", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
    
    inline def onCancel(value: /* color */ String | ColorInstance => Callback): this.type = set("onCancel", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
    
    inline def onChange(value: /* color */ String | ColorInstance => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
    
    inline def onConfirm(value: /* color */ String | ColorInstance => Callback): this.type = set("onConfirm", js.Any.fromFunction1((t0: /* color */ String | ColorInstance) => value(t0).runNow()))
    
    inline def showConverter(value: Boolean): this.type = set("showConverter", value.asInstanceOf[js.Any])
    
    inline def showHistory(value: Boolean): this.type = set("showHistory", value.asInstanceOf[js.Any])
    
    inline def showInput(value: Boolean): this.type = set("showInput", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ColorPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
