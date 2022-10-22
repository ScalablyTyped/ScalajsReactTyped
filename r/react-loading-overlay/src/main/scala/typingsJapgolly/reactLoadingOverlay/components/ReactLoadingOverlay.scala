package typingsJapgolly.reactLoadingOverlay.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLoadingOverlay.anon.Content
import typingsJapgolly.reactLoadingOverlay.mod.LoadingOverlayProps
import typingsJapgolly.reactLoadingOverlay.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLoadingOverlay {
  
  @JSImport("react-loading-overlay", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNamePrefix(value: String): this.type = set("classNamePrefix", value.asInstanceOf[js.Any])
    
    inline def fadeSpeed(value: Double): this.type = set("fadeSpeed", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
    
    inline def spinner(value: Boolean | Node): this.type = set("spinner", value.asInstanceOf[js.Any])
    
    inline def spinnerNull: this.type = set("spinner", null)
    
    inline def spinnerVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("spinner", js.Array(value*))
    
    inline def spinnerVdomElement(value: VdomElement): this.type = set("spinner", value.rawElement.asInstanceOf[js.Any])
    
    inline def styles(value: Content): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactLoadingOverlay.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoadingOverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
