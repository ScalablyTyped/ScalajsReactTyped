package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.anon.HTMLAttributesidclassName
import typingsJapgolly.reactOnsenui.anon.InputId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchInput {
  
  @JSImport("react-onsenui", "SearchInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactOnsenui.mod.SearchInput] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    inline def modifier(value: String): this.type = set("modifier", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* e */ ReactEventFrom[Any & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def onInput(value: /* e */ ReactEventFrom[Any & Element] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Any & Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SearchInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HTMLAttributesidclassName & InputId): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
