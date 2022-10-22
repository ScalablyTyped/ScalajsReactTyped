package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesComposerHeaderMod.ComposerHeaderProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComposerHeader {
  
  @JSImport("wix-style-react", "ComposerHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.ComposerHeader] {
    
    inline def backButtonValue(value: VdomNode): this.type = set("backButtonValue", value.rawNode.asInstanceOf[js.Any])
    
    inline def backButtonValueNull: this.type = set("backButtonValue", null)
    
    inline def backButtonValueVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("backButtonValue", js.Array(value*))
    
    inline def backButtonValueVdomElement(value: VdomElement): this.type = set("backButtonValue", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def dropShadow(value: Boolean): this.type = set("dropShadow", value.asInstanceOf[js.Any])
    
    inline def onBackClick(value: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): this.type = set("onBackClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def size(value: small | medium): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ComposerHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ComposerHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
