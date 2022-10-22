package typingsJapgolly.reactMdIcon.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdIcon.typesIconProviderMod.IconProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconProvider {
  
  @JSImport("@react-md/icon", "IconProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def back(value: VdomNode): this.type = set("back", value.rawNode.asInstanceOf[js.Any])
    
    inline def backNull: this.type = set("back", null)
    
    inline def backVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("back", js.Array(value*))
    
    inline def backVdomElement(value: VdomElement): this.type = set("back", value.rawElement.asInstanceOf[js.Any])
    
    inline def checkbox(value: VdomNode): this.type = set("checkbox", value.rawNode.asInstanceOf[js.Any])
    
    inline def checkboxNull: this.type = set("checkbox", null)
    
    inline def checkboxVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("checkbox", js.Array(value*))
    
    inline def checkboxVdomElement(value: VdomElement): this.type = set("checkbox", value.rawElement.asInstanceOf[js.Any])
    
    inline def dropdown(value: VdomNode): this.type = set("dropdown", value.rawNode.asInstanceOf[js.Any])
    
    inline def dropdownNull: this.type = set("dropdown", null)
    
    inline def dropdownVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("dropdown", js.Array(value*))
    
    inline def dropdownVdomElement(value: VdomElement): this.type = set("dropdown", value.rawElement.asInstanceOf[js.Any])
    
    inline def error(value: VdomNode): this.type = set("error", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorNull: this.type = set("error", null)
    
    inline def errorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("error", js.Array(value*))
    
    inline def errorVdomElement(value: VdomElement): this.type = set("error", value.rawElement.asInstanceOf[js.Any])
    
    inline def expander(value: VdomNode): this.type = set("expander", value.rawNode.asInstanceOf[js.Any])
    
    inline def expanderNull: this.type = set("expander", null)
    
    inline def expanderVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("expander", js.Array(value*))
    
    inline def expanderVdomElement(value: VdomElement): this.type = set("expander", value.rawElement.asInstanceOf[js.Any])
    
    inline def forward(value: VdomNode): this.type = set("forward", value.rawNode.asInstanceOf[js.Any])
    
    inline def forwardNull: this.type = set("forward", null)
    
    inline def forwardVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("forward", js.Array(value*))
    
    inline def forwardVdomElement(value: VdomElement): this.type = set("forward", value.rawElement.asInstanceOf[js.Any])
    
    inline def menu(value: VdomNode): this.type = set("menu", value.rawNode.asInstanceOf[js.Any])
    
    inline def menuNull: this.type = set("menu", null)
    
    inline def menuVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("menu", js.Array(value*))
    
    inline def menuVdomElement(value: VdomElement): this.type = set("menu", value.rawElement.asInstanceOf[js.Any])
    
    inline def notification(value: VdomNode): this.type = set("notification", value.rawNode.asInstanceOf[js.Any])
    
    inline def notificationNull: this.type = set("notification", null)
    
    inline def notificationVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("notification", js.Array(value*))
    
    inline def notificationVdomElement(value: VdomElement): this.type = set("notification", value.rawElement.asInstanceOf[js.Any])
    
    inline def password(value: VdomNode): this.type = set("password", value.rawNode.asInstanceOf[js.Any])
    
    inline def passwordNull: this.type = set("password", null)
    
    inline def passwordVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("password", js.Array(value*))
    
    inline def passwordVdomElement(value: VdomElement): this.type = set("password", value.rawElement.asInstanceOf[js.Any])
    
    inline def radio(value: VdomNode): this.type = set("radio", value.rawNode.asInstanceOf[js.Any])
    
    inline def radioNull: this.type = set("radio", null)
    
    inline def radioVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("radio", js.Array(value*))
    
    inline def radioVdomElement(value: VdomElement): this.type = set("radio", value.rawElement.asInstanceOf[js.Any])
    
    inline def selected(value: VdomNode): this.type = set("selected", value.rawNode.asInstanceOf[js.Any])
    
    inline def selectedNull: this.type = set("selected", null)
    
    inline def selectedVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("selected", js.Array(value*))
    
    inline def selectedVdomElement(value: VdomElement): this.type = set("selected", value.rawElement.asInstanceOf[js.Any])
    
    inline def sort(value: VdomNode): this.type = set("sort", value.rawNode.asInstanceOf[js.Any])
    
    inline def sortNull: this.type = set("sort", null)
    
    inline def sortVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sort", js.Array(value*))
    
    inline def sortVdomElement(value: VdomElement): this.type = set("sort", value.rawElement.asInstanceOf[js.Any])
    
    inline def upload(value: VdomNode): this.type = set("upload", value.rawNode.asInstanceOf[js.Any])
    
    inline def uploadNull: this.type = set("upload", null)
    
    inline def uploadVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("upload", js.Array(value*))
    
    inline def uploadVdomElement(value: VdomElement): this.type = set("upload", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: IconProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IconProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
