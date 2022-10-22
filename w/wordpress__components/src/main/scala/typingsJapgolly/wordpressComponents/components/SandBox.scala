package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.sandboxMod.SandBox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SandBox {
  
  @JSImport("@wordpress/components", "SandBox")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def html(value: String): this.type = set("html", value.asInstanceOf[js.Any])
    
    inline def onFocus(value: ReactFocusEventFrom[Element & Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
    
    inline def scripts(value: js.Array[String]): this.type = set("scripts", value.asInstanceOf[js.Any])
    
    inline def scriptsVarargs(value: String*): this.type = set("scripts", js.Array(value*))
    
    inline def styles(value: js.Array[String]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesVarargs(value: String*): this.type = set("styles", js.Array(value*))
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SandBox.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
