package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typingsJapgolly.wixStyleReact.distTypesSwatchesMod.SwatchesProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swatches {
  
  @JSImport("wix-style-react", "Swatches")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Swatches] {
    
    inline def addButtonIconSize(value: small | medium): this.type = set("addButtonIconSize", value.asInstanceOf[js.Any])
    
    inline def addButtonMessage(value: String): this.type = set("addButtonMessage", value.asInstanceOf[js.Any])
    
    inline def colors(value: js.Array[js.Object | String]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsVarargs(value: (js.Object | String)*): this.type = set("colors", js.Array(value*))
    
    inline def columns(value: Double): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def gap(value: Double): this.type = set("gap", value.asInstanceOf[js.Any])
    
    inline def onAdd(value: js.Function): this.type = set("onAdd", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: js.Function): this.type = set("onCancel", value.asInstanceOf[js.Any])
    
    inline def onChange(value: js.Function): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    inline def onClick(value: String | js.Object): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    inline def popoverProps(value: PopoverCommonProps): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    inline def selected(value: String): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def showAddButton(value: Boolean): this.type = set("showAddButton", value.asInstanceOf[js.Any])
    
    inline def showClear(value: Boolean): this.type = set("showClear", value.asInstanceOf[js.Any])
    
    inline def showClearMessage(value: VdomNode): this.type = set("showClearMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def showClearMessageNull: this.type = set("showClearMessage", null)
    
    inline def showClearMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("showClearMessage", js.Array(value*))
    
    inline def showClearMessageVdomElement(value: VdomElement): this.type = set("showClearMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Swatches.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwatchesProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
