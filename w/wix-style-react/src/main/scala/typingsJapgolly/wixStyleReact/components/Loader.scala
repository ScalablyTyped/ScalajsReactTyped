package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesLoaderMod.LoaderColor
import typingsJapgolly.wixStyleReact.distTypesLoaderMod.LoaderProps
import typingsJapgolly.wixStyleReact.distTypesLoaderMod.LoaderSize
import typingsJapgolly.wixStyleReact.distTypesLoaderMod.LoaderStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Loader {
  
  @JSImport("wix-style-react", "Loader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Loader] {
    
    inline def color(value: LoaderColor): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def size(value: LoaderSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: LoaderStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: String): this.type = set("statusMessage", value.asInstanceOf[js.Any])
    
    inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Loader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
