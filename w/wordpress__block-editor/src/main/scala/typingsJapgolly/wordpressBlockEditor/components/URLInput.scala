package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.componentsUrlInputMod.URLInput.PostType
import typingsJapgolly.wordpressBlockEditor.componentsUrlInputMod.URLInput.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLInput {
  
  inline def apply(onChange: (String, js.UndefOr[PostType]) => Callback, value: String): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: String, t1: js.UndefOr[PostType]) => (onChange(t0, t1)).runNow()), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "URLInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableSuggestions(value: Boolean): this.type = set("disableSuggestions", value.asInstanceOf[js.Any])
    
    inline def hasBorder(value: Boolean): this.type = set("hasBorder", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def isFullWidth(value: Boolean): this.type = set("isFullWidth", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
