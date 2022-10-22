package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.circle
import typingsJapgolly.gestalt.gestaltStrings.default
import typingsJapgolly.gestalt.gestaltStrings.error
import typingsJapgolly.gestalt.gestaltStrings.rectangle
import typingsJapgolly.gestalt.gestaltStrings.square
import typingsJapgolly.gestalt.mod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("gestalt", "Toast")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def button(value: VdomNode): this.type = set("button", value.rawNode.asInstanceOf[js.Any])
    
    inline def buttonNull: this.type = set("button", null)
    
    inline def buttonVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("button", js.Array(value*))
    
    inline def buttonVdomElement(value: VdomElement): this.type = set("button", value.rawElement.asInstanceOf[js.Any])
    
    inline def text(value: String | Node): this.type = set("text", value.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
    
    inline def thumbnail(value: VdomNode): this.type = set("thumbnail", value.rawNode.asInstanceOf[js.Any])
    
    inline def thumbnailNull: this.type = set("thumbnail", null)
    
    inline def thumbnailShape(value: circle | rectangle | square): this.type = set("thumbnailShape", value.asInstanceOf[js.Any])
    
    inline def thumbnailVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("thumbnail", js.Array(value*))
    
    inline def thumbnailVdomElement(value: VdomElement): this.type = set("thumbnail", value.rawElement.asInstanceOf[js.Any])
    
    inline def variant(value: default | error): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Toast.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
